package TestDongDuLieu.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TestDongDuLieu.driver.Driver;

public class TestDriver {
    private Driver driver = new Driver();
    public int[] arr;

    @Test
    public void Test1() {
        arr = new int[] { 3 };
        assertEquals(3, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test2() {
        arr = new int[] { 4 };
        assertEquals(4, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test3() {
        arr = new int[] { 6 };
        assertEquals(6, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test4() {
        arr = new int[] { 7 };
        assertEquals(7, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test5() {
        arr = new int[] { 8 };
        assertEquals(8, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test6() {
        arr = new int[] { 9 };
        assertEquals(9, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test7() {
        arr = new int[] { 10 };
        assertEquals(10, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test8() {
        arr = new int[] { 11 };
        assertEquals(11, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test9() {
        arr = new int[] { 1, 2 };
        assertEquals(2, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test10() {
        arr = new int[] { 2, 2 };
        assertEquals(2, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test11() {
        arr = new int[] { 2, 3 };
        assertEquals(3, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test12() {
        arr = new int[] { 3, 4 };
        assertEquals(4, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test13() {
        arr = new int[] { 5, 5 };
        assertEquals(5, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test14() {
        arr = new int[] { 5, 6 };
        assertEquals(6, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test15() {
        arr = new int[] {};
        assertEquals(Integer.MIN_VALUE, driver.maxArr(arr, arr.length));
    }

    @Test
    public void Test16() {
        arr = new int[] { Integer.MIN_VALUE };
        assertEquals(Integer.MIN_VALUE, driver.maxArr(arr, arr.length));
    }

}
