package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


public class ImplHardware {
  //Constants
  public static final int INCHES_TO_ENCODER = 1;
  //shh
  public static final String VUFORIA_KEY = "AdlbcgL/////AAAAGdkbbJ/FBUjTiZEHQ8wntkBBQpCOLmNv2PWfmvHsWabZ5lRtoGgchQDi9WmxChfQJPOhsKmZdkhWpAupCCzgrXgnUsg2r1Gedla37EHscGaT+fFMuYATkYfe1YBNZjzYKJWDYONYq/ntym+A7cV7Hc3SUf1XlNJ8nYzndDl9S1VvNkGBOocCqQvI7VAU5/Os+D3x/uGNlHWgCtxiDexuTYKENGXk7IUBbbh2ypujcmdzAVThoWFYZMdWNEVAamD1hZapjL5pVba7l8A27kCbGqe11UG2DylMjlQYCUS4f6j41GsSo85J6EzKQFValAzNABVV3pH5TdkqNbVjG9zi19TRHxNUWFVwoWUdI9Sl+P+q"; //shhhh
  //Hardware defined here
  private DcMotor right;
  private DcMotor left;
  private DcMotor lift;
  private DcMotor turn;

  public enum Motor {
    RIGHT, LEFT, LIFT, TURN
  }

  //Initialises the hardware
  public void init(HardwareMap hwMap) {
    right = hwMap.get(DcMotor.class, "Right");
    left = hwMap.get(DcMotor.class, "Left");
    lift = hwMap.get(DcMotor.class, "Lift");
    turn = hwMap.get(DcMotor.class, "Turn");
    lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    turn.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
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
      
   public void SetServo(Servo servo, double trouble) {
      case TURN:
      turn.setServo(trouble);
      }
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
      case TURN;
        return turn;
      default:
        return null;
    }
  }
}
