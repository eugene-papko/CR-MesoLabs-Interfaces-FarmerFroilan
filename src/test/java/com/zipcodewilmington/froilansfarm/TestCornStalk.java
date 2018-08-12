package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Abstract.Produce;
import com.zipcodewilmington.froilansfarm.Classes.CornStalk;
import com.zipcodewilmington.froilansfarm.Classes.EarCorn;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCornStalk {

    @Test
    public void testCropYieldException() throws CropNotHarvestedOrFertilizedException {
        Produce cornStalk = new CornStalk();
        try {
            cornStalk.yield();
        } catch (Exception e) {
            String message = "You cannot yield Corn at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testCornStalkNotFertilizied() throws CropNotHarvestedOrFertilizedException {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenHarvested(true);
        try {
            cornStalk.yield();
        } catch (Exception e) {
            String message = "You cannot yield Corn at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testCornStalknNotHarvested() throws CropNotHarvestedOrFertilizedException {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        try {
            cornStalk.yield();
        } catch (Exception e) {
            String message = "You cannot yield Corn at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testCornStalkYield() throws CropNotHarvestedOrFertilizedException {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        EarCorn corn = cornStalk.yield();
        assertNotNull(corn);
    }
}