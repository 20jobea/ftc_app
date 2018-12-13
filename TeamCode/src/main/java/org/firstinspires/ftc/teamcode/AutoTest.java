package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Test Class", group = "Auto")
public class AutoTest extends Autonomous3058 {
    @Override
    public void runOpMode() {
        init(hardwareMap);
        runMotor(ImplHardware.Motor.RIGHT, 100, 1);
        runMotor(ImplHardware.Motor.LEFT, 100, 1);
    }
}
