package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int increaseCurrentTemperature;
    private int decreaseCurrentTemperature;


    public int getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;

    }

    public int getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;

    }

    public int getIncreaseCurrentTemperature() {
        return increaseCurrentTemperature;
    }

    public void setIncreaseCurrentTemperature(int increaseCurrentTemperature) {
        if (increaseCurrentTemperature > maxTemperature) {
            return;
        }
        if (increaseCurrentTemperature < minTemperature) {
            return;
        }
        this.increaseCurrentTemperature = increaseCurrentTemperature +1;
    }

    public int getDecreaseCurrentTemperature() {
        return decreaseCurrentTemperature;
    }

    public void setDecreaseCurrentTemperature(int decreaseCurrentTemperature) {
        if (decreaseCurrentTemperature > maxTemperature) {
            return;
        }
        if (decreaseCurrentTemperature < minTemperature) {
            return;
        }
        this.decreaseCurrentTemperature = decreaseCurrentTemperature -1;
    }
}
//increaseCurrentTemperature - увеличивает температуру на 1, если не достигнута максимальная (maxTemperature),
//последующие (после достижения maxTemperature) вызовы метода не должны ничего менять в состоянии объекта

//decreaseCurrentTemperature - уменьшает температуру на 1, если не достигнута минимальная (minTemperature),
//последующие (после достижения minTemperature) вызовы метода не должны ничего менять в состоянии объекта

//методы должны производить увеличение лишь на 1, не нужно писать внутри цикл.
//один вызов метода должен приводить к переключению на один градус (если не достигнут min/max)!