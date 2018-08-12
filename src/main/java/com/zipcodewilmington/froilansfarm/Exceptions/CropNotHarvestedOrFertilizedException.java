package com.zipcodewilmington.froilansfarm.Exceptions;

public class CropNotHarvestedOrFertilizedException extends Exception {
    public CropNotHarvestedOrFertilizedException(String message) {
        super("You cannot yield " + message + " at this current time!");
    }
}
