package com.nuwan.general.interview.tyler;

/**
 * Created by nuwan on 6/29/15.
 */
public interface Vehicle {
    public void drive();
    public void stop();
    public boolean energize(float fuel);
    public String getPowerLeft();
}
