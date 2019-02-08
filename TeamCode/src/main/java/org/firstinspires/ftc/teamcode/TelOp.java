package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Click Me!", group = "^^")
public class TelOp extends OpMode {
    ImplHardware robot = new ImplHardware();

    @Override
    public void init() {
        telemetry.addData("Init: ", "start");
        robot.init(this.hardwareMap);
        telemetry.addData("Init: ", "finish");
    }

    @Override
    public void loop() {
        telemetry.addData("Left Motor Power: ", robot.getMotor(ImplHardware.Motor.LEFT).getPower());
        telemetry.addData("Right Motor Power: ", robot.getMotor(ImplHardware.Motor.RIGHT).getPower());
        telemetry.addData("Arm Motor Power: ", robot.getMotor(ImplHardware.Motor.ARM).getPower());
        telemetry.addData("Extend Motor Power: ", robot.getMotor(ImplHardware.Motor.EXTEND).getPower());
        telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.ARM).getCurrentPosition());
        telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.EXTEND).getCurrentPosition());
        telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition());
        telemetry.addData("Encoder on left", robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition());
        telemetry.addData("Encoder on right", robot.getMotor(ImplHardware.Motor.RIGHT).getCurrentPosition());
        robot.setMotorPower(ImplHardware.Motor.RIGHT, -gamepad1.right_stick_y);
        robot.setMotorPower(ImplHardware.Motor.LEFT, gamepad1.left_stick_y);

        }

        {
            if (gamepad1.dpad_up) {
                robot.setMotorPower(ImplHardware.Motor.ARM, 0.1);
            } else if (gamepad1.dpad_down) {
                    robot.setMotorPower(ImplHardware.Motor.ARM, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.ARM, 0);
            }
            if (gamepad1.dpad_right) {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, 0.1);
            } else if (gamepad1.dpad_left) {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, 0);
            }

            if (gamepad1.a) {
                robot.setMotorPower(ImplHardware.Motor.LIFT, 0.1);
            } else if (gamepad1.b) {
                robot.setMotorPower(ImplHardware.Motor.LIFT, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.LIFT, 0);
            }

        }

    }