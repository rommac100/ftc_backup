package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcontroller.internal.FtcRobotControllerActivity;

import ftc.vision.BallColourResults;
import ftc.vision.FrameGrabber;
import ftc.vision.ImageProcessorResult;

/**
 * Created by rommac100 on 9/13/17.
 */
@Autonomous(name="BallDetectionTesting")
public class BallColourTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {


        AutoTransitioner.transitionOnStop(this, "MainDrive Teleop");

        waitForStart();
        while(opModeIsActive()) {
            FrameGrabber frameGrabber = FtcRobotControllerActivity.frameGrabber;
            frameGrabber.grabSingleFrame();
            while (!frameGrabber.isResultReady()&&opModeIsActive()) {
                Thread.sleep(5);
            }

            //Get the result
            ImageProcessorResult imageProcessorResult = frameGrabber.getResult();
            BallColourResults result = (BallColourResults) imageProcessorResult.getResult();

            BallColourResults.BallColour ballColourLeft = result.getBallColour1();
            BallColourResults.BallColour ballColourRight = result.getBallColour2();

            telemetry.addData("Result", result); //Display it on telemetry
            telemetry.addData("LeftBall", ballColourLeft);
            telemetry.addData("rightBall", ballColourRight);
            telemetry.update();
            //wait before quitting (quitting clears telemetry)
            Thread.sleep(1000);
        }
    }
}
