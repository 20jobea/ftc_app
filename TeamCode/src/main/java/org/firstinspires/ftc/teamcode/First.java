package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Disabled
@Autonomous(name="First", group="First")
public class First extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Does ", "this work?");
    }
    @Override
    public void loop() {
        telemetry.addData("Does ", "this work?");
    }
}
