package org.firstinspires.ftc.teamcode;


@TeleOp(name="Click Me!", group="main")
public class TelOp extends OpMode {
  ImplHardware robot = new ImplHardware();
  @Override
  public void init() {
    telemetry.addData("Init: ", "start");
    robot.init(this.hardwareMap);
    robot.getMotor(robot.Motor.LIFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    telemetry.addData("Init: ", "finish");
  }

  @Override
  public void loop() {
    telemetry.addData("Encoder on lift", lift.getCurrentPosition());
    
    robot.setMotorPower(robot.Motor.RIGHT, -gamepad1.right_stick_y);
    robot.setMotorPower(robot.Motor.LEFT, gamepad1.left_stick_y);
    if (gamepad1.dpad_up {
      robot.setMotorPower(robot.Motor.LIFT, 0.1);
    } else if (gamepad1.dpad_down) {
      robot.setMotorPower(robot.Motor.LIFT, -0.1);
    } else {
      robot.setMotorPower(robot.Motor.LIFT, 0);
    }
  }
}
