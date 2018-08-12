package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Abstract.Produce;
import com.zipcodewilmington.froilansfarm.Classes.Tomato;
import com.zipcodewilmington.froilansfarm.Classes.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestTomatoPlant {

    @Test
    public void testCropYieldException() throws CropNotHarvestedOrFertilizedException {
        Produce tomatoPlant = new TomatoPlant();
        try {
            tomatoPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Tomato at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testCropYieldExceptionNotFertilizied() throws CropNotHarvestedOrFertilizedException {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenHarvested(true);
        try {
            tomatoPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Tomato at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testCropYieldExceptionNotHarvested() throws CropNotHarvestedOrFertilizedException {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        try {
            tomatoPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Tomato at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testTomatoYield() throws CropNotHarvestedOrFertilizedException {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(true);
        Tomato tomato = tomatoPlant.yield();
        assertNotNull(tomato);
    }
}
