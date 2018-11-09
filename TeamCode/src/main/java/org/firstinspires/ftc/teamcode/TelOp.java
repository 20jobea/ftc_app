package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Click Me!", group="main")
public class TelOp extends OpMode {
  ImplHardware robot = new ImplHardware();
  @Override
  public void init() {
    telemetry.addData("Init: ", "start");
    robot.init(this.hardwareMap);
    robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    telemetry.addData("Init: ", "finish");
  }

  @Override
  public void loop() {
    telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition());
    telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.RIGHT).getCurrentPosition());
    robot.setMotorPower(ImplHardware.Motor.RIGHT, -gamepad1.right_stick_y);
    robot.setMotorPower(ImplHardware.Motor.LEFT, gamepad1.left_stick_y);
    if (gamepad1.dpad_up) {
      robot.setMotorPower(ImplHardware.Motor.LIFT, 0.1);
    } else if (gamepad1.dpad_down) {
      robot.setMotorPower(ImplHardware.Motor.LIFT, -0.1);
    } else {
      robot.setMotorPower(ImplHardware.Motor.LIFT, 0);
    }
  }
}
