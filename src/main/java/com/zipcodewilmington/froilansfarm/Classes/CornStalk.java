package com.zipcodewilmington.froilansfarm.Classes;
import com.zipcodewilmington.froilansfarm.Abstract.Crop;
import com.zipcodewilmington.froilansfarm.Exceptions.CropNotHarvestedOrFertilizedException;

public class CornStalk extends Crop{

    public EarCorn yield() throws CropNotHarvestedOrFertilizedException {
        if(this.getHasBeenFertilized() && this.getHasBeenHarvested()) {
            return new EarCorn();
    }
        throw new CropNotHarvestedOrFertilizedException("Corn");
    }
}