package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="SpecializedOpMode", group="Learning")
public class SpecializedTeleOp extends OpMode {
    DcMotor leftWheel;
    DcMotor rightWheel;

    Servo basicServo;

    double leftWheelPower;
    double rightWheelPower;

    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("left_wheel");
        rightWheel = hardwareMap.dcMotor.get("right_wheel");

        basicServo = hardwareMap.servo.get("servo");

        rightWheel.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;

        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);

        if (gamepad1.x) {
            basicServo.setPosition(1);
        } else {
            basicServo.setPosition(0);
        }
    }
}
