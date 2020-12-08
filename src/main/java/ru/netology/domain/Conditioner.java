package ru.netology.domain;

public class Conditioner {
//    private int maxTemperature = 10;
//    private int minTemperature = 2;
//    private int currentTemperature = 5;

//    public int getCurrentTemperature() {
//        return currentTemperature;
//    }
//
//    public void setCurrentTemperature(int currentTemperature) {
//        this.currentTemperature = currentTemperature;
//    }
//
//    public void IncreaseCurrentTemperature(int currentTemperature) {
//        if (currentTemperature >= maxTemperature) {
//            return;
//        } else {
//            currentTemperature++;
//        }
//
//        public void DecreaseCurrentTemperature(int currentTemperature) {
//            if (currentTemperature <= minTemperature) {
//                return;
//            } else {
//                currentTemperature--;
//            }
//        }
//    }
//}
//

    private int maxTemperature = 10;
    private int minTemperature = 2;
    private int currentTemperature = 9;


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


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }


    public void increaseCurrentTemperature() {
        int increaseTemperature = getCurrentTemperature() + 1;
        setCurrentTemperature(increaseTemperature);
    }

    public void decreaseCurrentTemperature() {
        int decreaseTemperature = getCurrentTemperature() - 1;
        setCurrentTemperature(decreaseTemperature);
    }
}


//increaseCurrentTemperature - увеличивает температуру на 1, если не достигнута максимальная (maxTemperature),
//последующие (после достижения maxTemperature) вызовы метода не должны ничего менять в состоянии объекта

//decreaseCurrentTemperature - уменьшает температуру на 1, если не достигнута минимальная (minTemperature),
//последующие (после достижения minTemperature) вызовы метода не должны ничего менять в состоянии объекта

//методы должны производить увеличение лишь на 1, не нужно писать внутри цикл.
//один вызов метода должен приводить к переключению на один градус (если не достигнут min/max)!