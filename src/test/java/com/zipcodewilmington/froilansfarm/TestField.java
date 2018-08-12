package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Classes.CropRow;
import com.zipcodewilmington.froilansfarm.Classes.Field;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestField {

    @Test
    public void testAddRow() {
        Field field = new Field();
        field.addRow(new CropRow());
        field.addRow(new CropRow());
        int expected = 2;
        int actual = field.getNumberOfRows();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetListOfRows() {
        Field field = new Field();
        for (int i=0; i<5; i++) {
            field.addRow(new CropRow());
        }
        int expected = 5;
        int actual = field.getListOfRows().size();
        assertEquals(expected, actual);
    }
}
