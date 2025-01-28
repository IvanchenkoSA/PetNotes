package ru.isa.petnotes.singleon;

import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DataFormater {

    private static DataFormater dataFormater;
    private DataFormater(){}
    public static DataFormater getInstance(){
        if(dataFormater == null){
            dataFormater = new DataFormater();
        }
        return dataFormater;
    }

    public static DateTimeFormatter getDataFormater() {
        DateTimeFormatter dtf = ofPattern("yyyy-MM-dd HH:mm:ss");
        return dtf;
    }
}
