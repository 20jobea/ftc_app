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
        robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        telemetry.addData("Init: ", "Finish");
        waitForStart();;
    }
    public void land() {
        robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.setMotorPower(ImplHardware.Motor.LIFT, 0.3);
        //Change THIS NUMBER!!!!!!!!!!!!!!!!!!!!
        while (robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition() < 10000) {
            telemetry.addData("Lift Position", robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition());
        }
        robot.setMotorPower(ImplHardware.Motor.LIFT, 0);

    }
    public void move(double distance, double speed) {
        robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.setMotorPower(ImplHardware.Motor.LEFT, speed);
        robot.setMotorPower(ImplHardware.Motor.RIGHT, speed);
        distance *= ImplHardware.INCHES_TO_ENCODER;
        while ((robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition() < distance) && (robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition() < distance)) {
            telemetry.addData("Left Position", robot.getMotor(ImplHardware.Motor.LEFT).getCurrentPosition());
            telemetry.addData("Right Position", robot.getMotor(ImplHardware.Motor.RIGHT).getCurrentPosition());
        }
        robot.setMotorPower(ImplHardware.Motor.LEFT, 0);
        robot.setMotorPower(ImplHardware.Motor.RIGHT, 0);
    }
}