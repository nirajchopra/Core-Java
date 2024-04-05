package com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = "01/04/2024";

        Date date = sdf.parse(dateString);

        System.out.println(date + " (String To date)");

        String stringDate = sdf.format(date);

        System.out.println(stringDate + " (date To String)");
    }
}