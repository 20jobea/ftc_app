package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Red Depot", group = "Auto")
public class AutoRedDepot extends Autonomous3058 {
    @Override
    public void runOpMode() {
        init(hardwareMap);

        land();

        drop();
    }
}
