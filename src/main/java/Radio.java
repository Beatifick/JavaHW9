public class Radio {
    public int currentStation;
    public int currentVolume;

    public int nextStation() {
        if (currentStation == 9) {
            return currentStation = 0;
        } else {
            return currentStation + 1;
        }
    }

    public int prevStation() {
        if (currentStation == 0) {
            return currentStation = 9;
        } else {
            return currentStation - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 0) {
            newCurrentStation = 0;
        }
        if (newCurrentStation >= 9) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public int increaseVolume() {
        if (currentVolume <= 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int reducingVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}