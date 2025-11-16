import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void transferToTheForwardStationTo9() {
        Radio rad = new Radio();

        rad.currentStation = 9;

        int expected = 0;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void transferToTheForwardStationTo8() {
        Radio rad = new Radio();

        rad.currentStation = 8;

        int expected = 9;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationTo0() {
        Radio rad = new Radio();

        rad.currentStation = 0;

        int expected = 9;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationT01() {
        Radio rad = new Radio();

        rad.currentStation = 1;

        int expected = 0;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelection() {
        Radio rad = new Radio();

        rad.currentStation = 3;

        int expected = 3;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionTo10() {
        Radio rad = new Radio();

        rad.setCurrentStation(13);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelectionTo0() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo100() {
        Radio rad = new Radio();
        rad.currentVolume = 99;

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo101() {
        Radio rad = new Radio();
        rad.currentVolume = 101;

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionTo0() {
        Radio rad = new Radio();
        rad.currentVolume = 1;

        int expected = 0;
        int actual = rad.reducingVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionToMinus1() {
        Radio rad = new Radio();
        rad.currentVolume = -1;

        int expected = 0;
        int actual = rad.reducingVolume();

        Assertions.assertEquals(expected, actual);
    }
}
