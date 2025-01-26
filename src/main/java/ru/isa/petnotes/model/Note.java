package ru.isa.petnotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String content;

}
