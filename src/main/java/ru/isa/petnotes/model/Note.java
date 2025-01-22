package ru.isa.petnotes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Note {
    @Id
    private int id;
    private String title;
    private String content;
}
