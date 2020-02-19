package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name="SimpleDrive", group="Learning")
public class SimpleDriveOpMode extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;
    Double drivePower = 0.5;

    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("Left_Wheel");
        rightWheel = hardwareMap.dcMotor.get("Right_Motor");

        rightWheel.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftWheel.setPower(drivePower);
        rightWheel.setPower(drivePower);
    }
}
