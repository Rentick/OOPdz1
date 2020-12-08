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
//    @Test
//    public void increaseCurrentTemperature(){
//        Conditioner conditioner = new Conditioner();
//        conditioner.setCurrentTemperature(10);
//        System.out.println(conditioner.IncreaseCurrentTemperature());
//    }
//    @Test
//    public void decreaseCurrentTemperature(){
//        Conditioner conditioner = new Conditioner();
//        conditioner.setCurrentTemperature(1);
//        System.out.println(conditioner.DecreaseCurrentTemperature());
//    }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int newMaxTemperature = conditioner.getMaxTemperature() - 1;
        conditioner.setCurrentTemperature(newMaxTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());


    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int newMinTemperature = conditioner.getMinTemperature() + 1;
        conditioner.setCurrentTemperature(newMinTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }
}