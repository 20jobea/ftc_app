package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ImplHardware {
  //Constants
  public static final int INCHES_TO_ENCODER = 1;
  public static final String VUFORIA_KEY = ""; //shhhh
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
    robot.getMotor(ImplHardware.Motor.LIFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    robot.getMotor(ImplHardware.Motor.RIGHT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    robot.getMotor(ImplHardware.Motor.LEFT).setMode(DcMotor.RunMode.RUN_USING_ENCODER);
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
      case LEFT:
        return left;
      case LIFT:
        return lift;
      default:
        return null;
    }
  }
}
