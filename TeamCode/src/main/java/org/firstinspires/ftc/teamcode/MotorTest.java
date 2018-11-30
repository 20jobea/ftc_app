package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "Motor Test", group = "Test")
public class MotorTest extends OpMode {
    DcMotor right;
    DcMotor left;
    DcMotor lift;
    CRServo servo;

    @Override
    public void init() {
        telemetry.addData("status", "init");
        right = this.hardwareMap.get(DcMotor.class, "Right");
        left = this.hardwareMap.get(DcMotor.class, "Left");
        lift = this.hardwareMap.get(DcMotor.class, "Lift");
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        servo = hardwareMap.get(CRServo.class, "Token");


        telemetry.addData("status", "finished");
    }

    @Override
    public void loop() {
        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Left Y", gamepad1.left_stick_y);
        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", gamepad1.right_stick_y);
        telemetry.addData("U", gamepad1.dpad_up);
        telemetry.addData("U", gamepad1.dpad_up);
        telemetry.addData("R", gamepad1.dpad_right);
        telemetry.addData("D", gamepad1.dpad_down);
        telemetry.addData("L", gamepad1.dpad_left);
        telemetry.addData("Encoder on lift", lift.getCurrentPosition());

        if (gamepad1.a) {
            lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        if (gamepad1.b) {
            servo.setPower(1);
        } else {
            servo.setPower(0);
        }
        right.setPower(-gamepad1.right_stick_y);
        left.setPower(gamepad1.left_stick_y);
        if (gamepad1.dpad_up) {
            lift.setPower(0.1);
        } else if (gamepad1.dpad_down) {
            lift.setPower(-0.1);
        } else {
            lift.setPower(0);
        }
    }
}
