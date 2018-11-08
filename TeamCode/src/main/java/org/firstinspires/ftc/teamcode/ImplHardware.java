package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

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
      case RIGHT:
        right.setPower(trouble);
        break;
      case LEFT:
        left.setPower(trouble);
        break;
      case LIFT:
        lift.setPower(trouble);
        break;
    }
  }

  public DcMotor getMotor(Motor motor) {
    switch (motor) {
      case RIGHT:
        return right;
        break;
      case LEFT:
        return left;
        break;
      case LIFT:
        return lift;
        break;
    }
  }
}
