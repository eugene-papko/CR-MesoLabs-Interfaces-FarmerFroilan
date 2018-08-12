package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Classes.CornStalk;
import com.zipcodewilmington.froilansfarm.Classes.CropRow;
import com.zipcodewilmington.froilansfarm.Classes.TomatoPlant;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCropRow {

    @Test
    public void testPlantSingleCrop() {
        CropRow rowOfCorn = new CropRow();
        int x = 0;
        while (x<5){
            rowOfCorn.plantSingleCrop(new TomatoPlant());
            x++;
        }
        int expected = 5;
        int actual = rowOfCorn.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCropRow() {
        CropRow rowOfCorn = new CropRow();
        rowOfCorn.plantSingleCrop(new CornStalk());
        int expected = 1;
        int actual = rowOfCorn.getListOfCrops().size();
        assertEquals(expected, actual);
    }
}
