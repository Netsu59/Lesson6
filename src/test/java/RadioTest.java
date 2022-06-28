import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetNextStationAfterZero() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setNextStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setNextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationAfterFour() {
        Radio radio = new Radio();
        radio.setStation(4);
        radio.setNextStation();
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationAfterEight(){
        Radio radio = new Radio();
        radio.setStation(8);
        radio.setNextStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationBeforeOne(){
        Radio radio = new Radio();
        radio.setStation(1);
        radio.setPrevStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationBeforeFive(){
        Radio radio = new Radio();
        radio.setStation(5);
        radio.setPrevStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationBeforeZero(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setPrevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationBeforeNine(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setPrevStation();
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    void shouldSetHighBorderStation(){
        Radio radio = new Radio();
        radio.setStation(9);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetMiddleStation(){
        Radio radio = new Radio();
        radio.setStation(4);
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void shouldSetLowBorderStation(){
        Radio radio = new Radio();
        radio.setStation(0);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetWrongPositiveStation(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.setStation(10);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetWrongNegativeStation(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.setStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolumeToOne(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeToFive(){
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5,radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeToNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeToTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOverTen(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolumeUnderTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9,radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolumeUnderOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolumeFromFive(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4,radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolumeUnderZero(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

}

