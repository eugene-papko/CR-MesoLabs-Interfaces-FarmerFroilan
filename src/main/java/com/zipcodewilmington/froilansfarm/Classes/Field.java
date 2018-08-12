package com.zipcodewilmington.froilansfarm.Classes;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> field;

    public Field() {
        this.field = new ArrayList<CropRow>();
    }

    public int getNumberOfRows() {
        return field.size();
    }

    public void addRow(CropRow row) {
        field.add(row);
    }

    public List<CropRow> getListOfRows() {
        return field;
    }
}
