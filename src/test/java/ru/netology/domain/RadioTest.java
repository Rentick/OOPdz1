package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
    @Test
    void increaseCurrentNumberRadio() {
        Radio radio = new Radio();
//        int newMaxNumberRadio = radio.getMinNumberRadio();
//        radio.setCurrentNumberRadio(newMaxNumberRadio);
        radio.setCurrentNumberRadio(radio.getMaxNumberRadio());
        radio.increaseCurrentNumberRadio();
        System.out.println(radio.getCurrentNumberRadio());
//        assertEquals(radio.getMinNumberRadio(), radio.getCurrentNumberRadio());
    }

    @Test
    void decreaseCurrentNumberRadio() {
        Radio radio = new Radio();
//        int newMinNumberRadio = radio.getMaxNumberRadio();
//        radio.setCurrentNumberRadio(newMinNumberRadio);
        radio.setCurrentNumberRadio(radio.getMinNumberRadio());
        radio.decreaseCurrentNumberRadio();
        System.out.println(radio.getCurrentNumberRadio());
//        assertEquals(radio.getMaxNumberRadio(), radio.getCurrentNumberRadio());
    }
    @Test
    void increaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMaxVolumeSound());
        radio.increaseCurrentVolumeSound();
        System.out.println(radio.getCurrentVolumeSound());
//        assertEquals(radio.getMaxVolumeSound(), radio.getCurrentVolumeSound());
    }

    @Test
    void decreaseCurrentVolumeSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(radio.getMinVolumeSound());
        radio.decreaseCurrentVolumeSound();
        System.out.println(radio.getCurrentVolumeSound());
//        assertEquals(radio.getMinVolumeSound(), radio.getCurrentVolumeSound());
    }
}