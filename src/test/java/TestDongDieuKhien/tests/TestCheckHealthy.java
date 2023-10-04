package TestDongDieuKhien.tests;

import org.junit.Test;

import TestChucNang.drivers.Driver;

import static org.junit.Assert.assertEquals;

public class TestCheckHealthy {
    private Driver driver = new Driver();

    @Test
    public void testInvalidBmi() {
        double bmi = -2.0;
        assertEquals("Invalid", driver.checkHealthy(bmi));
    }

    @Test
    public void testUnderweightBmi() {
        double bmi = 18;
        assertEquals("Underweight", driver.checkHealthy(bmi));
    }

    @Test
    public void testNormalBmi() {
        double bmi = 20.5;
        assertEquals("Normal", driver.checkHealthy(bmi));
    }

    @Test
    public void testOverweightBmi() {
        double bmi = 27.5;
        assertEquals("Overweight", driver.checkHealthy(bmi));
    }

    @Test
    public void testObesityBmi() {
        double bmi = 33;
        assertEquals("Obesity", driver.checkHealthy(bmi));
    }

}