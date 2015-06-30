package com.nuwan.general.interview.tyler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nuwan on 6/29/15.
 */
public class GasCar extends Car{

    private static final float DEFAULT_FUEL_CAPACITY = 13L;

    public GasCar() {
        super.DEFAULT_FUEL_CAPACITY = DEFAULT_FUEL_CAPACITY;
        super.getErrCodes().put("FULL", "Tank full.");
        super.getErrCodes().put("EMPTY", "Filling gallons cannot be 0.");
        super.getErrCodes().put("GT_CAPACITY", "Cannot fill more than ? gallons.");
    }

    @Override
    public boolean energize(float topUpAmount) {
        return super.energize(topUpAmount);
    }
}
