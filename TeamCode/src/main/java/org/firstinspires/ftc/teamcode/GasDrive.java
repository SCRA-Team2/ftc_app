package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="GasDrive", group="learning")
public class GasDrive extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;

    double power;
    double difference;

    Servo servo;

    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("left_wheel");
        rightWheel = hardwareMap.dcMotor.get("right_wheel");

        servo = hardwareMap.servo.get("servo");

        rightWheel.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        power = gamepad1.left_stick_y;
        difference = gamepad1.left_stick_x * 0.5;

        leftWheel.setPower(power - difference);
        rightWheel.setPower(power + difference);

        if (gamepad1.x) {
            servo.setPosition(1);
        } else {
            servo.setPosition(0);
        }

    }
}
