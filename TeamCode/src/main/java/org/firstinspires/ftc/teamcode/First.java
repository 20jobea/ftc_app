package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Test", group="Test")
public class First extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("Does ", "this work?");
    }
}
