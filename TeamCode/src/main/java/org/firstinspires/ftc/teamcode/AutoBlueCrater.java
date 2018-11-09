package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Blue Crater", group="Auto")
public class AutoBlueCrater extends Autonomous3058 {
    @Override
    public void runOpMode() {
        init(hardwareMap);
        //land();
        move(100000, 0.6);
    }
}
