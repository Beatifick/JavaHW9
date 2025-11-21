public class Radio {

    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int currentStation;
    private int currentVolume;

    //Переключение станции.

    public Radio() {
        this.maxCurrentStation = 9;
    }

    public Radio(int stationsCount) {
        if (stationsCount < 1) {
            stationsCount = 1;
        }
        this.maxCurrentStation = stationsCount - 1;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }


    public int nextStation() {
        if (currentStation == maxCurrentStation) {
            currentStation = minCurrentStation;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == minCurrentStation) {
            currentStation = maxCurrentStation;
        } else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minCurrentStation) {
            currentStation = minCurrentStation;
            return;
        }
        if (newCurrentStation > maxCurrentStation) {
            currentStation = maxCurrentStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    //Переключение громкости.

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reducingVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
}