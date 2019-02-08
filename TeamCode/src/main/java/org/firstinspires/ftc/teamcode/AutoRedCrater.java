package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Red Crater", group = "Auto")
public class AutoRedCrater extends Autonomous3058 {
    @Override
    public void runOpMode() {
        init(hardwareMap);

        land();

        move(1225, 1);

    }
}
