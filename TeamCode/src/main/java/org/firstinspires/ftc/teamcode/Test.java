package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Test", group="Test")
public class Test extends OpMode {
    public DcMotor motor  = hardwareMap.get(DcMotor.class, "Best");
    @Override
    public void init() {
        telemetry.addData("Does ", "this work?");
    }
    @Override
    public void loop() {
        telemetry.addData("Does ", "this work?");
        motor.setPower(0.1);
    }
}
