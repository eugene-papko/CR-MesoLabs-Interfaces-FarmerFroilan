package com.zipcodewilmington.froilansfarm.Classes;

import com.zipcodewilmington.froilansfarm.Abstract.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> singleCropRow;

    public CropRow() {
        this.singleCropRow = new ArrayList<Crop>();
    }

    public int getSize() {
        return singleCropRow.size();
    }

    public List<Crop> getListOfCrops() {
        return singleCropRow;
    }

    public void plantSingleCrop(Crop crop) {
        singleCropRow.add(crop);
    }


}
