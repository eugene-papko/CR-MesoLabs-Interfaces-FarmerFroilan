package com.zipcodewilmington.froilansfarm.Abstract;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class Produce {
    public boolean hasBeenFertilized;

    public Produce() {
        hasBeenFertilized = false;
    }

    public abstract Edible yield() throws CropNotHarvestedOrFertilizedException;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
