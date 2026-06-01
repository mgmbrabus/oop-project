package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsAmount;

    public Radio() {
        stationsAmount = 10;
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0 || currentStation >= stationsAmount) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void next() {

        if (currentStation == stationsAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {

        if (currentStation == 0) {
            currentStation = stationsAmount - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}