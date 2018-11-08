package org.firstinspires.ftc.teamcode;

public class ImplHardware {
  //Hardware defined here
  private DcMotor right;
  private DcMotor left;
  private DcMotor lift;

  public enum Motor {
    RIGHT, LEFT, LIFT
  }

  //Initialises the hardware
  public void init(HardwareMap hwMap) {
    right = hwMap.get(DcMotor.class, "Right");
    left = hwMap.get(DcMotor.class, "Left");
    lift = hwMap.get(DcMotor.class, "Lift");
  }

  public void setMotorPower(Motor motor, double trouble) {
    switch (motor) {
      case Motor.RIGHT:
        right.setPower(trouble);
        break;
      case Motor.LEFT:
        left.setPower(trouble);
        break;
      case Motor.LIFT:
        lift.setPower(trouble);
        break;
    }
  }

  public DcMotor getMotor(Motor motor) {
    switch (motor) {
      case Motor.RIGHT:
        return right;
        break;
      case Motor.LEFT:
        return left;
        break;
      case Motor.LIFT:
        return lift;
        break;
    }
  }
}
