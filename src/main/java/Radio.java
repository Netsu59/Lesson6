import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {

    private int numberOfStations = 10;

    private final int  radioMinStation = 0;

    private int radioMaxStation = numberOfStations-1;

    private int currentStation;

    final int radioMaxVolume = 100;

    final int radioMinVolume = 0;

    private int currentVolume;

    public Radio(int number) {
        numberOfStations = number;
        radioMaxStation = number - 1;
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
