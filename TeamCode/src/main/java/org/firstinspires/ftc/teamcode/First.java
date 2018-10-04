package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name="Test", group="Test")
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
