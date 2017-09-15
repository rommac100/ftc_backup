package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by rommac100 on 9/9/17.
 */
public class Hardware_Main {

    HardwareMap hardMap = null;
    private ElapsedTime period  = new ElapsedTime();

    //Drive Train Motors
    DcMotor leftDrive1 = null;
    DcMotor leftDrive2 = null;

    DcMotor rightDrive1 = null;
    DcMotor rightDrive2 = null;

    public Hardware_Main ()
    {

    }

    public void init(HardwareMap ahwp)
    {
        hardMap = ahwp;

        leftDrive1 = hardMap.dcMotor.get("leftDrive1");
        leftDrive1 = hardMap.dcMotor.get("leftDrive2");

        rightDrive1 = hardMap.dcMotor.get("rightDrive1");
        rightDrive2 = hardMap.dcMotor.get("rightDrive2");
        setPowerDrive(0,0);


    }

    public void setPowerDrive(double leftPow, double rightPow)
    {
        leftDrive1.setPower(leftPow);
        leftDrive2.setPower(leftPow);

        rightDrive1.setPower(rightPow);
        rightDrive2.setPower(rightPow);
    }

}
