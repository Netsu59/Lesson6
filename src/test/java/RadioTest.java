import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setNextStationAfterZero() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setNextStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void setNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setNextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void setNextStationAfterFour() {
        Radio radio = new Radio();
        radio.setStation(4);
        radio.setNextStation();
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    void setNextStationAfterEight(){
        Radio radio = new Radio();
        radio.setStation(8);
        radio.setNextStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void setPreviousStationBeforeOne(){
        Radio radio = new Radio();
        radio.setStation(1);
        radio.setPrevStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void setPreviousStationBeforeFive(){
        Radio radio = new Radio();
        radio.setStation(5);
        radio.setPrevStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void setPreviousStationBeforeZero(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setPrevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void setPreviousStationBeforeNine(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setPrevStation();
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    void setHighBorderStation(){
        Radio radio = new Radio();
        radio.setStation(9);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void setMiddleStation(){
        Radio radio = new Radio();
        radio.setStation(4);
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void setLowBorderStation(){
        Radio radio = new Radio();
        radio.setStation(0);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void setWrongPositiveStation(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setStation(10);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void setWrongNegativeStation(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void increaseVolumeToOne(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeToFive(){
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5,radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeToNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeToTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeOverTen(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeUnderTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeUnderOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeFromFive(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeUnderZero(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

}

