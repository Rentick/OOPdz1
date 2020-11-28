package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
//    @Test
//    public void shouldCreate(){
//        Conditioner conditioner = new Conditioner();
//        assertNull(conditioner.name);
//        assertEquals(0,conditioner.maxTemperature);
//        assertEquals(0,conditioner.minTemperature);
//        assertEquals(0,conditioner.currentTemperature);
//        assertFalse(conditioner.on);
//
//        System.out.println("Hi!");
//    }
//
//    @Test
//    public void shouldChangeField() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(0,conditioner.currentTemperature);
//        conditioner.currentTemperature = -100;
//        assertEquals(-100, conditioner.currentTemperature);
//
//    }
    @Test
    public void increaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setIncreaseCurrentTemperature(3);
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(5);
        System.out.println(conditioner.getIncreaseCurrentTemperature());
    }
    @Test
    public void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setDecreaseCurrentTemperature(3);
        conditioner.setMinTemperature(1);
        conditioner.setMaxTemperature(5);
        System.out.println(conditioner.getDecreaseCurrentTemperature());
    }
}