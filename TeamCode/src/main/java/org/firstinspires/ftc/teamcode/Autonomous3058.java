package org.firstinspires.ftc.teamcode;

import android.provider.ContactsContract;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

abstract public class Autonomous3058 extends LinearOpMode {
    ImplHardware robot = new ImplHardware();

    public void rest(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            //yolo
        }
    }

    public void init(HardwareMap hwmap) {
        telemetry.addData("Init: ", "Begin");
        robot.init(hwmap);
        telemetry.addData("Init: ", "Finish");
        waitForStart();
    }

    public void land() {
        robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        if (opModeIsActive()) {
            robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.setMotorPower(ImplHardware.Motor.LIFT, -0.3);
            robot.getMotor(ImplHardware.Motor.LIFT).setTargetPosition(-1900);
            while (opModeIsActive() && robot.getMotor(ImplHardware.Motor.LIFT).isBusy()) {
                telemetry.addData("Lift Position", robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition());
            }
            robot.setMotorPower(ImplHardware.Motor.LIFT, 0);
            runLeft(-100, -0.5);
            move(100, 0.5);
        }

    }

    public void runMotor(ImplHardware.Motor motor, int distance, double speed) {
        DcMotor useMotor;
        int mult;
        switch (motor) {
            case RIGHT:
                useMotor = robot.getMotor(ImplHardware.Motor.RIGHT);
                mult = -1;
                break;
            case LEFT:
                useMotor = robot.getMotor(ImplHardware.Motor.LEFT);
                mult = 1;
                break;
            default:
                useMotor = robot.getMotor(ImplHardware.Motor.RIGHT);
                mult = -1;
        }
        useMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION.STOP_AND_RESET_ENCODER);
        if (opModeIsActive()) {
            useMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            useMotor.setPower(mult * speed);
            useMotor.setTargetPosition(mult * distance);
            while (opModeIsActive() && useMotor.isBusy()) {

            }
            useMotor.setPower(0);
        }
    }
    public void runRight(int distance, double speed) {
        robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        if (opModeIsActive()) {
            robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.setMotorPower(ImplHardware.Motor.RIGHT, -speed);
            robot.getMotor(ImplHardware.Motor.RIGHT).setTargetPosition(-distance);
            while (opModeIsActive() && robot.getMotor(ImplHardware.Motor.RIGHT).isBusy()) {
                telemetry.addData("Lift Position", robot.getMotor(ImplHardware.Motor.RIGHT).getCurrentPosition());
            }
            robot.setMotorPower(ImplHardware.Motor.RIGHT, 0);
        }
    }
    public void runLeft(int distance, double speed) {
        robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        if (opModeIsActive()) {
            robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.setMotorPower(ImplHardware.Motor.LEFT, speed);
            robot.getMotor(ImplHardware.Motor.LEFT).setTargetPosition(distance);
            while (opModeIsActive() && robot.getMotor(ImplHardware.Motor.LEFT).isBusy()) {
                telemetry.addData("Lift Position", robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition());
            }
            robot.setMotorPower(ImplHardware.Motor.LEFT, 0);
        }
    }
    public void move(int distance, double speed) {
        distance *= ImplHardware.INCHES_TO_ENCODER;
        robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        if (opModeIsActive()) {
            robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
            robot.setMotorPower(ImplHardware.Motor.LEFT, speed);
            robot.setMotorPower(ImplHardware.Motor.RIGHT, -speed);
            robot.getMotor(ImplHardware.Motor.RIGHT).setTargetPosition(-distance);
            robot.getMotor(ImplHardware.Motor.LEFT).setTargetPosition(distance);
            while (opModeIsActive() && robot.getMotor(ImplHardware.Motor.RIGHT).isBusy() && robot.getMotor(ImplHardware.Motor.RIGHT).isBusy()) {
                telemetry.addData("Left: ", robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition());
                telemetry.addData("Right: ", robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition());
            }
            robot.setMotorPower(ImplHardware.Motor.LEFT, 0);
            robot.setMotorPower(ImplHardware.Motor.RIGHT, 0);
            robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
    }
    public void drop() {
        robot.getServo().setPower(1);
        rest(1000);
        robot.getServo().setPower(0);
    }
}
