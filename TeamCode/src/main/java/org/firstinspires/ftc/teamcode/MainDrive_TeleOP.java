package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcontroller.external.samples.Hardware_Main;

/**
 * Created by rommac100 on 9/10/17.
 */
@TeleOp(name="MainDrive Teleop", group= "")
public class MainDrive_TeleOP extends OpMode {

    Hardware_Main robot = new Hardware_Main();

    double joyStickleft = 0;
    double joyStickRight = 0;

    @Override
    public void init() {
        //robot.init(hardwareMap);
        telemetry.addData("Say", "Hello World");
        telemetry.addData("Commence Teleop","");
       // robot.setPowerDrive(0,0);


    }

    @Override
    public void loop() {
        /*
        //weird pov Drive...
        joyStickleft = gamepad1.left_stick_y;
        joyStickRight = gamepad1.right_stick_x;
        double max;
        double leftPow;
        double rightPow;

        leftPow = joyStickleft+ joyStickRight;
        rightPow = joyStickleft-joyStickRight;


        max = Math.max(Math.abs(leftPow), Math.abs(rightPow));
        if (max > 1.0)
        {
            leftPow /= max;
            rightPow /= max;
        }

        robot.setPowerDrive(leftPow,rightPow);
*/
    }

    @Override
    public void stop()
    {
    }
}
