package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Data {
    Faker faker = new Faker(new Locale("en-US"));

    private String filepath, sheetName,sheetNameData;
    int cellNumber, rowNumber;

    public Data(){

        this.filepath = "resources\\Data.xlsx";
        this.sheetName = "Datos";
        this.sheetNameData = "Validations";
        this.cellNumber = 0;
        this.rowNumber = 0;
    }
    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }
    public String getSheetNameData(){
        return sheetNameData;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }
}
