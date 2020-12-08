package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
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