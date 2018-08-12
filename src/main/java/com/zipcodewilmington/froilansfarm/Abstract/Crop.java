package com.zipcodewilmington.froilansfarm.Abstract;

import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class Crop extends Produce {
    public boolean hasBeenHarvested;

    public abstract Edible yield() throws CropNotHarvestedOrFertilizedException;

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}