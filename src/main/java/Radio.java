public class Radio {

    private final int  radioMinStation = 0;

    private final int radioMaxStation = 9;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int currentStation) {
        if (currentStation > 9){
            return;
        }
        if (currentStation < 0){
            return;
        }
        this.currentStation = currentStation;
    }

    private int currentStation;

     final int radioMaxVolume = 10;

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
        }else if(currentStation == radioMaxStation){
            currentStation = radioMinStation;
        }
    }

    public void setPrevStation() {
        if (currentStation > radioMinStation) {
            currentStation = currentStation - 1;
        }else if(currentStation == radioMinStation){
            currentStation = radioMaxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < radioMaxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume(){
        if(currentVolume > radioMinVolume){
            currentVolume = currentVolume - 1;
        }
    }

}
