/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final class OI {
        public static final int kDriverControllerPort = 0;
        public static final int kOperatorControllerPort = 1;
    }

    public final class CAN {
        public static final int kPDP = 0;
        public static final int kPCM = 0;
        public static final int kLeftDriveMotor_1 = 1;
        public static final int kRightDriveMotor_1 = 2;
        public static final int kLeftDriveMotor_2 = 3;
        public static final int kRightDriveMotor_2 = 4;
        public static final int kTurretMotor = 5;
        public static final int kFlyWheelMotor = 6;
    }

    public final class PCM {
        public static final int kChannel_0 = 0;
        public static final int kChannel_1 = 1;
        public static final int kChannel_2 = 2;
        public static final int kChannel_3 = 3;
        public static final int kChannel_4 = 4;
        public static final int kChannel_5 = 5;
        public static final int kChannel_6 = 6;
        public static final int kChannel_7 = 7;
    }

    public final class XboxControllerMap {
        public static final int kA = 1;
        public static final int kB = 1;
        public static final int kX = 1;
        public static final int kY = 1;

    }

    public final class Misc {
        public static final double kMaxDriveSpeed = 0.5;
    }
}