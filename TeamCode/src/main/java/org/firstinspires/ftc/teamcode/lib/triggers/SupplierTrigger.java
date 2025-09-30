package org.firstinspires.ftc.teamcode.lib.triggers;

import com.seattlesolvers.solverslib.command.button.Trigger;

import java.util.function.Supplier;

public class SupplierTrigger extends Trigger {
    private final Supplier<Boolean> getFn;
    public SupplierTrigger(Supplier<Boolean> booleanSupplier) {
        this.getFn = booleanSupplier;
    }

    @Override
    public boolean get() { return this.getFn.get(); }
}
