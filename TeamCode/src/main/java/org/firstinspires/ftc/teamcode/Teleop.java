/* package org.firstinspires.ftc.teamcode;


        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.Servo;

    @TeleOp(name="Click Me!", group="main")
    public class Teleop extends OpMode {
        ImplHardware robot = new ImplHardware();

        @Override
        public void init() {
            telemetry.addData("Init: ", "start");
            robot.init(this.hardwareMap);
            telemetry.addData("Init: ", "finish");
        }

        //ImplHardware = org.firstinspires.ftc.teamcode.ImplHardware.M
        @Override
        public void loop() {
            telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.LIFT).getCurrentPosition());
            telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.RIGHT).getCurrentPosition());
            telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.ARM).getCurrentPosition());
            telemetry.addData("Encoder on lift", robot.getMotor(ImplHardware.Motor.EXTEND).getCurrentPosition());
            robot.setMotorPower(ImplHardware.Motor.RIGHT, gamepad1.right_stick_y);
            robot.setMotorPower(ImplHardware.Motor.LEFT, gamepad1.left_stick_y);
            int truval =0;
            if (gamepad1.right_bumper){
                 truval = 1;
            }
            int truval1 =0;
            if (gamepad1.left_bumper){
                truval1 = 1;
            }
            robot.setMotorPower(ImplHardware.Motor.ARM, truval);
            robot.setMotorPower(ImplHardware.Motor.EXTEND, truval1);
        }

        {
            if (gamepad1.right_bumper) {
                robot.setMotorPower(ImplHardware.Motor.ARM, 0.1);
            } else if (gamepad1.right_trigger > 0) {
                robot.setMotorPower(ImplHardware.Motor.ARM, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.ARM, 0);
            }

            if (gamepad1.left_bumper) {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, 0.1);
            } else if (gamepad1.left_trigger > 0 ) {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.EXTEND, 0);
            }

            if (gamepad1.dpad_up) {
                robot.setMotorPower(ImplHardware.Motor.LIFT, 0.1);
            } else if (gamepad1.dpad_down) {
                robot.setMotorPower(ImplHardware.Motor.LIFT, -0.1);
            } else {
                robot.setMotorPower(ImplHardware.Motor.LIFT, 0);
            }
        }
    }
*/