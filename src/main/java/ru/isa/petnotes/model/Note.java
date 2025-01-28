package ru.isa.petnotes.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;
import ru.isa.petnotes.singleon.DataFormater;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;


@Data
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue

    private Integer id;
    private String title;
    private String content;
    private String created = DataFormater.getDataFormater().format(LocalDateTime.now());
    private String email;


}
