package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Abstract.Produce;
import com.zipcodewilmington.froilansfarm.Classes.Beet;
import com.zipcodewilmington.froilansfarm.Classes.BeetPlant;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestBeetPlant {

    @Test
    public void testCropYieldException() throws CropNotHarvestedOrFertilizedException {
        Produce beetPlant = new BeetPlant();
        try {
            beetPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Beet at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testBeetPlantNotFertilizied() throws CropNotHarvestedOrFertilizedException {
        Crop beetPlant = new BeetPlant();
        beetPlant.setHasBeenHarvested(true);
        try {
            beetPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Beet at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testBeetPlantnNotHarvested() throws CropNotHarvestedOrFertilizedException {
        Crop beetPlant = new BeetPlant();
        beetPlant.setHasBeenFertilized(true);
        try {
            beetPlant.yield();
        } catch (Exception e) {
            String message = "You cannot yield Beet at this current time!";
            assertEquals(message, e.getMessage());
        }
    }

    @Test
    public void testBeetPlantYield() throws CropNotHarvestedOrFertilizedException {
        BeetPlant beetPlant = new BeetPlant();
        beetPlant.setHasBeenFertilized(true);
        beetPlant.setHasBeenHarvested(true);
        Beet beet = beetPlant.yield();
        assertNotNull(beet);
    }
}
