public class Radio {

    private int numberOfStations = 10;

    public Radio(int number) {
        numberOfStations = number;
        radioMaxStation = number - 1;
    }

    public Radio() {

    }

    private final int  radioMinStation = 0;

    private int radioMaxStation = numberOfStations-1;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int currentStation) {
        if (currentStation > radioMaxStation){
            return;
        }
        if (currentStation < radioMinStation){
            return;
        }
        this.currentStation = currentStation;
    }

    private int currentStation;

    final int radioMaxVolume = 100;
    final int radioMinVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int radioVolume) {
        this.currentVolume = radioVolume;
    }

    private int currentVolume;

    public void setNextStation() {
        if (currentStation < radioMaxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = radioMinStation;
        }
    }

    public void setPrevStation() {
        if (currentStation > radioMinStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = radioMaxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < radioMaxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume(){
        if (currentVolume > radioMinVolume){
            currentVolume = currentVolume - 1;
        }
    }

}
