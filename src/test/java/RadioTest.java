import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio rad = new Radio();

    @Test
    public void transferToTheForwardStationTo9() {

        rad.setCurrentStation(9);

        int expected = 0;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void transferToTheForwardStationTo8() {

        rad.setCurrentStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationTo0() {

        rad.setCurrentStation(0);

        int expected = 9;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationTo1() {

        rad.setCurrentStation(1);

        int expected = 0;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelection() {

        rad.setCurrentStation(3);

        int expected = 3;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionTo10() {

        rad.setCurrentStation(13);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionTo0() {

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты на громкость

    @Test
    public void increaseTheVolumeTo99() {

        rad.setCurrentVolume(99);

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo100() {

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo101() {

        rad.setCurrentVolume(101);
        rad.setToMaxVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionTo1() {

        rad.setCurrentVolume(1);
        rad.reducingVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionTo0() {

        rad.setCurrentVolume(0);
        rad.reducingVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionToMin() {

        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeReductionToMinus1() {

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты на конструктор

    @Test
    public void shouldCreateRadioWithDefaultStations() {

        int expected = 9;
        int actual = rad.getMaxCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsTo1WhenLessThan1() {
        Radio rad = new Radio(-5);

        int expected = 0;
        Assertions.assertEquals(expected, rad.getMaxCurrentStation());
    }

    @Test
    public void shouldSetMaxStation0WhenStationsCountIs1() {
        Radio rad = new Radio(1);

        int expected = 0;
        Assertions.assertEquals(expected, rad.getMaxCurrentStation());
    }
}
