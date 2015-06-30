package com.nuwan.general.interview.tyler;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by nuwan on 6/29/15.
 */
public class ElectricCarTest {

    @Test
    public void drive() {
        Car car = new ElectricCar();
        car.drive();
        Assert.assertTrue(car.isMoving());
    }

    @Test
    public void stop() {
        Car car = new ElectricCar();
        car.stop();
        Assert.assertFalse(car.isMoving());
    }

    @Test(expected = IllegalArgumentException.class)
    public void energizeByZero() {
        Car car = new ElectricCar();
        Assert.assertTrue(car.energize(0));
    }

    @Test
    public void energize() {
        Car car = new ElectricCar();
        Assert.assertTrue(car.energize(30L));
        Assert.assertTrue(car.energize(15L));
        Assert.assertEquals("75.0%", car.getPowerLeft());
    }

    @Test
    public void energizeFull() {
        Car car = new ElectricCar();
        Assert.assertTrue(car.energize(30L));
        Assert.assertTrue(car.energize(15L));
        Assert.assertTrue(car.energize(15L));
        Assert.assertEquals("100.0%", car.getPowerLeft());
    }

    @Test(expected = IllegalArgumentException.class)
    public void energizeException() {
        Car car = new ElectricCar();
        Assert.assertTrue(car.energize(30L));
        System.out.println(car.getPowerLeft());
        Assert.assertTrue(car.energize(15L));
        System.out.println(car.getPowerLeft());
        Assert.assertTrue(car.energize(15L));
        System.out.println(car.getPowerLeft());
        Assert.assertTrue(car.energize(15L));
        System.out.println(car.getPowerLeft());
    }
}
