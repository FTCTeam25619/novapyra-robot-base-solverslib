package org.firstinspires.ftc.teamcode.lib.triggers;

import com.seattlesolvers.solverslib.command.button.Trigger;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import java.util.function.DoubleSupplier;

public class TriggerAxis extends Trigger implements DoubleSupplier {
    GamepadEx mGamepad;
    GamepadKeys.Trigger mTrigger;
    double dThreshold;
    public TriggerAxis(GamepadEx gamepad, GamepadKeys.Trigger trigger, double threshold)  {
        mGamepad = gamepad;
        mTrigger = trigger;
        dThreshold = threshold;
    }

    @Override
    public boolean get() {
        return (mGamepad.getTrigger(mTrigger) > dThreshold);
    }
    public double getAsDouble() {
        return mGamepad.getTrigger(mTrigger);
    }
}

