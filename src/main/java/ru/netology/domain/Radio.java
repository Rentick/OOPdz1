package ru.netology.domain;

public class Radio {
    private int maxNumberRadio;
    private int minNumberRadio;
    private int currentNumberRadio;

    private int maxVolumeSound;
    private int minVolumeSound;
    private int currentVolumeSound;

    public int getMaxNumberRadio() {
        return maxNumberRadio;
    }

    public void setMaxNumberRadio(int maxNumberRadio) {

        this.maxNumberRadio = maxNumberRadio;
    }

    public int getMinNumberRadio() {

        return minNumberRadio;
    }

    public void setMinNumberRadio(int minNumberRadio) {

        this.minNumberRadio = minNumberRadio;
    }

    public int getCurrentNumberRadio() {

        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int currentNumberRadio) {
        if (currentNumberRadio > maxNumberRadio) {
            return;
        }

        if (currentNumberRadio < minNumberRadio) {
            return;
        }

        this.currentNumberRadio = currentNumberRadio;
    }
//    Номер текущей радиостанции изменяется в пределах от 0 до 9
//        Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
//        Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая
//        Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - 9)

    public int getMaxVolumeSound() {

        return maxVolumeSound;
    }

    public void setMaxVolumeSound(int maxVolumeSound) {

        this.maxVolumeSound = maxVolumeSound;
    }

    public int getMinVolumeSound() {

        return minVolumeSound;
    }

    public void setMinVolumeSound(int minVolumeSound) {

        this.minVolumeSound = minVolumeSound;
    }

    public int getCurrentVolumeSound() {

        return currentVolumeSound;
    }

    public void setCurrentVolumeSound(int currentVolumeSound) {
        if (currentVolumeSound > maxVolumeSound) {
            return;
        }

        if (currentVolumeSound < minVolumeSound) {
            return;
        }

        this.currentVolumeSound = currentVolumeSound;
    }
}
//    Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)*
//        Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
//        Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить