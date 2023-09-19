import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    private WaterBottle waterBottle;

    @Before
    public void setUp() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {

        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void RemovesVolume10() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }
    @Test
    public void RemovesVolume10() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void SetVolumeTo0() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillVolumeTo100() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
