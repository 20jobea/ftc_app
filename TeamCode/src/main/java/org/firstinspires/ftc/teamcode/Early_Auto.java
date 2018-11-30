package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Early Auto", group = "Auto")
public class Early_Auto extends LinearOpMode {
    DcMotor right;
    DcMotor left;
    DcMotor lift;

    @Override
    public void runOpMode() {
        right = this.hardwareMap.get(DcMotor.class, "Right");
        left = this.hardwareMap.get(DcMotor.class, "Left");
        lift = this.hardwareMap.get(DcMotor.class, "Lift");
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();
        ;
        lift.setPower(0.3);
        //Change THIS NUMBER!!!!!!!!!!!!!!!!!!!!
        while (lift.getCurrentPosition() < 10000) {
            telemetry.addData("Lift Position", lift.getCurrentPosition());
        }
        lift.setPower(0);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        right.setPower(-0.5);
        left.setPower(0.5);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        right.setPower(0);
        left.setPower(0);
    }
}
