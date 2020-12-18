package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
    @Test
    void increaseCurrentNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio() - 1);
        radio.increaseCurrentNumberRadio();
        radio.increaseCurrentNumberRadio();
        assertEquals(radio.getMinNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void decreaseCurrentNumberRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMinNumberRadio());
        radio.decreaseCurrentNumberRadio();
        assertEquals(radio.getMaxNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void increaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMaxVolumeSound() - 1);
        radio.increaseCurrentVolumeSound();
        assertEquals(radio.getMaxVolumeSound(), radio.getCurrentVolumeSound());
    }

    @Test
    void decreaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMinVolumeSound());
        radio.decreaseCurrentVolumeSound();

        assertEquals(radio.getMinVolumeSound(), radio.getCurrentVolumeSound());
    }

    @Test
    void firstStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.firstStation();
        assertEquals(0, radio.getCurrentNumberRadio());
    }

    @Test
    void secondStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.secondStation();
        assertEquals(1, radio.getCurrentNumberRadio());
    }

    @Test
    void thirdStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.thirdStation();
        assertEquals(2, radio.getCurrentNumberRadio());
    }

    @Test
    void forthStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.forthStation();
        assertEquals(3, radio.getCurrentNumberRadio());
    }

    @Test
    void fiveStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.fiveStation();
        assertEquals(4, radio.getCurrentNumberRadio());
    }

    @Test
    void sixStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.sixStation();
        assertEquals(5, radio.getCurrentNumberRadio());
    }

    @Test
    void sevenStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.sevenStation();
        assertEquals(6, radio.getCurrentNumberRadio());
    }

    @Test
    void eightStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.eightStation();
        assertEquals(7, radio.getCurrentNumberRadio());
    }

    @Test
    void nineStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.nineStation();
        assertEquals(8, radio.getCurrentNumberRadio());
    }

    @Test
    void tenStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.tenStation();
        assertEquals(9, radio.getCurrentNumberRadio());
    }
}