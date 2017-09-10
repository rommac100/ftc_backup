package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by rommac100 on 9/9/17.
 */

public class Hardware_Main {

    HardwareMap hardMap = null;
    private ElapsedTime period  = new ElapsedTime();

    public Hardware_Main ()
    {

    }

    public void init(HardwareMap ahwp)
    {
        hardMap = ahwp;
    }

}
