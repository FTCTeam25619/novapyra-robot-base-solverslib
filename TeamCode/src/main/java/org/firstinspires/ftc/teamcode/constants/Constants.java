package org.firstinspires.ftc.teamcode.constants;

import com.seattlesolvers.solverslib.geometry.Translation2d;

import org.firstinspires.ftc.teamcode.constants.ConfigConstants;

public final class Constants {

    public static final class DebugModes {
        public static final boolean ENABLE_FTC_DASHBOARD = true;
        public static final boolean DEBUG_TELEMETRY = false;
    }

    public static final class HardwareMapping{
        public static final String motor1 = "motor1";
    }

    public static final class ConversionFactors {
        public static final double FEET_TO_METERS = 0.3048;
        public static final double METERS_TO_FEET = 1.0 / FEET_TO_METERS;
        public static final double DEGREES_TO_RADIANS = Math.PI / 180.0;
        public static final double RADIANS_TO_DEGREES = 180.0 / Math.PI;
    }

    public static final class OpModes{
        public enum OpModeType{
            TELEOP,
            AUTO;
        }
        
        public enum OpModeSelection{
            PEDRO_SAMPLE_TELEOP(OpModeType.TELEOP),
            PEDRO_SAMPLE_AUTO(OpModeType.TELEOP),
            EXPLORATION(OpModeType.TELEOP);

            private OpModeType opModeType;

            private OpModeSelection(OpModeType opmodeTypeSetting){
                opModeType = opmodeTypeSetting;
            }

            public OpModeType getOpModeType(){
                return opModeType;
            }
        }
    }
}