package org.firstinspires.ftc.teamcode.lib.util;

import java.lang.Math;

public class MathUtils {
    public static double clamp(double value, double minLimit, double maxLimit) {
        return Math.min(maxLimit, Math.max(minLimit, value));
    }
}