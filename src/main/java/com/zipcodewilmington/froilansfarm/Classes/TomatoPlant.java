package com.zipcodewilmington.froilansfarm.Classes;
import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;

public class TomatoPlant extends Crop {

    public Tomato yield() throws CropNotHarvestedOrFertilizedException {
        if(this.getHasBeenFertilized() && this.getHasBeenHarvested()) {
            return new Tomato();
        }
        throw new CropNotHarvestedOrFertilizedException("Tomato");
    }
}