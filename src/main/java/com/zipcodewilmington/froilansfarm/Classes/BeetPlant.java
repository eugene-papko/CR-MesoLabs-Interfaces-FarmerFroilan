package com.zipcodewilmington.froilansfarm.Classes;

import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;

public class BeetPlant extends Crop {

    public Beet yield() throws CropNotHarvestedOrFertilizedException {
        if(this.getHasBeenFertilized() && this.getHasBeenHarvested()) {
            return new Beet();
        }
        throw new CropNotHarvestedOrFertilizedException("Beet");
    }
}