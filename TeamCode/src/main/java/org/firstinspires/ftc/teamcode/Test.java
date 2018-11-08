package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous(name="Test", group="Test")
public class Test extends OpMode {
    //public RevRobotics40HdHexMotor motor  = this.hardwareMap.get(RevRobotics40HdHexMotor.class, "Test");
    public DcMotor motor;
    @Override
    public void init() {
        telemetry.addData("Does ", "this work?");
        motor = this .hardwareMap.get(DcMotor.class, "Test");
    }
    @Override
    public void loop() {
        telemetry.addData("Does ", "this work?");
        motor.setPower(0.1);
         try {
             Thread.sleep(500);
         } catch (Exception e) {
              telemetry.addData("asdf", "asdf");
         }
         motor.setPower(0);
    }
}
