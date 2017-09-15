package ftc.vision;

/**
 * Created by rommac100 on 9/13/17.
 */

import org.opencv.core.Scalar;
public class BallColourResults {

    public enum BallColour{
         RED (ImageUtil.RED),
        GREEN (ImageUtil.GREEN),
        BLUE (ImageUtil.BLUE),
        UNKNOWN (ImageUtil.BLACK);

        public final Scalar colour;

        BallColour(Scalar colour)
        {
            this.colour = colour;
        }
    }

    private BallColour ballColourLeft, ballColourRight;

    public BallColourResults()
    {
        this.ballColourLeft = BallColour.UNKNOWN;
        this.ballColourRight = BallColour.UNKNOWN;
    }

    public BallColourResults(BallColour ballColourLeft, BallColour ballColourRight)
    {
        this.ballColourLeft = ballColourLeft;
        this.ballColourRight = ballColourRight;
    }

    public String toString() {return ballColourLeft +" " + ballColourRight;}

    public BallColour getBallColour1(){return ballColourLeft;}
    public BallColour getBallColour2(){return ballColourRight;}


}
