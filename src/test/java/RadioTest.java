import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void transferToTheForwardStationTo9() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 0;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void transferToTheForwardStationTo8() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationTo0() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 9;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBackToTheStationTo1() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        int expected = 0;
        int actual = rad.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSelection() {
        Radio rad = new Radio();

        rad.setCurrentStation(3);

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
    public void increaseTheVolumeTo99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeTo101() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.setToMaxVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionTo1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.reducingVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionTo0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.reducingVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionToMin() {
        Radio rad = new Radio();
        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeReductionToMinus1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}