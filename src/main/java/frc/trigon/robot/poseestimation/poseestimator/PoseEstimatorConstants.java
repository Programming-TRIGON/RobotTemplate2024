package frc.trigon.robot.poseestimation.poseestimator;

import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.Vector;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.numbers.N3;

public class PoseEstimatorConstants {
    /**
     * The vector represents how ambiguous each value is.
     * The first value represents how ambiguous is the x,
     * the second one for the y, and the third one is for the theta (rotation).
     * Increase these numbers to trust the estimate less.
     */
    static final Vector<N3>
            STATES_AMBIGUITY = VecBuilder.fill(0.005, 0.005, 555555555),
            VISION_CALCULATIONS_AMBIGUITY = VecBuilder.fill(0.1, 0.05, Math.toRadians(720));
    static final Pose2d DEFAULT_POSE = new Pose2d(5, 5, new Rotation2d());
}
