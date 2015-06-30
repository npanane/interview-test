package com.nuwan.general.interview.tyler;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by nuwan on 6/29/15.
 */
public class GasCarTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void drive() {
        Car car = new GasCar();
        car.drive();
        Assert.assertTrue(car.isMoving());
    }

    @Test
    public void stop() {
        Car car = new GasCar();
        car.stop();
        Assert.assertFalse(car.isMoving());
    }

    @Test(expected = IllegalArgumentException.class)
    public void energizeByZero() {
        Car car = new GasCar();
        Assert.assertTrue(car.energize(0));
    }

    @Test
    public void energize() {
        Car car = new GasCar();
        Assert.assertTrue(car.energize(1L));
        Assert.assertTrue(car.energize(11L));
        Assert.assertEquals("92.30769%", car.getPowerLeft());
    }

    @Test
    public void energizeFull() {
        Car car = new GasCar();
        Assert.assertTrue(car.energize(10L));
        Assert.assertTrue(car.energize(3L));
        Assert.assertEquals("100.0%", car.getPowerLeft());
    }

}
