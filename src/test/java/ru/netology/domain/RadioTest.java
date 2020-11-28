package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextPrevCurrentRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(9);
        System.out.println(radio.getCurrentNumberRadio());

    }

    @Test
    public void minMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeSound(10);
        System.out.println(radio.getCurrentVolumeSound());
    }
}