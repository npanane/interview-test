package com.nuwan.general.interview.tyler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nuwan on 6/29/15.
 */
public abstract class Car implements Vehicle {

    protected float DEFAULT_FUEL_CAPACITY;
    private boolean isMoving;
    protected float fuelLevel = 0;
    private final static Map<String, String> errCodes = new HashMap<String, String>();

    @Override
    public void drive() {
        if (!isMoving) {
            isMoving = true;
        }
    }

    @Override
    public void stop() {
        if (isMoving) {
            isMoving = false;
        }
    }

    @Override
    public String getPowerLeft() {
        return ((fuelLevel / DEFAULT_FUEL_CAPACITY) * 100 ) + "%";
    }

    public boolean isMoving() {
        return isMoving;
    }

    protected Map<String, String> getErrCodes() {
        return errCodes;
    }

    @Override
    public boolean energize(float topUpAmount) {
        synchronized (this) {
            if (fuelLevel == DEFAULT_FUEL_CAPACITY) {
                throw new IllegalArgumentException(errCodes.get("FULL"));
            }
            if (topUpAmount == 0) {
                throw new IllegalArgumentException(errCodes.get("EMPTY"));
            }
            else if ((DEFAULT_FUEL_CAPACITY < topUpAmount)
                    || ((DEFAULT_FUEL_CAPACITY - fuelLevel) < topUpAmount)) {
                String err = errCodes.get("GT_CAPACITY").replace("?", String.valueOf(DEFAULT_FUEL_CAPACITY - fuelLevel));
                throw new IllegalArgumentException(err);
            } else {
                fuelLevel = fuelLevel + topUpAmount;
            }
        }
        return true;
    }
}
