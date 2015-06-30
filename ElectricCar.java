package com.nuwan.general.interview.tyler;

/**
 * Created by nuwan on 6/29/15.
 */
public class ElectricCar extends Car {

    private static final float DEFAULT_FUEL_CAPACITY = 60L;

    public ElectricCar() {
        super.DEFAULT_FUEL_CAPACITY = DEFAULT_FUEL_CAPACITY;
        super.getErrCodes().put("FULL", "Fully charged.");
        super.getErrCodes().put("EMPTY", "Charging minutes cannot be 0.");
        super.getErrCodes().put("GT_CAPACITY", "Cannot charge more than ? minutes.");
    }

    @Override
    public boolean energize(float topUpAmount) {
        return super.energize(topUpAmount);
    }
}
