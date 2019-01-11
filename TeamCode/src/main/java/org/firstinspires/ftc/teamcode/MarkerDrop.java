package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapesdTime;


@Autonomous(name="MarkerDrop", group="auto")
public class MarkerDrop extends Autonomous3058 {
    private ElapsedTime runtime = new ElapsedTime();
    Servo servo;
    double servoPosition = 0.0;
    //this number needs to be changed

    servo = hardwareMap.servo.get("servo");
    servo.setPosition.(servoPosition);
    sleep(2000);
    //needs to be changed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marker_drop);

        servoPosition = 1.0;
        servo.setPosition(servoPosition)
    }
}
