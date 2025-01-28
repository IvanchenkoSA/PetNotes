package ru.isa.petnotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isa.petnotes.model.Note;

import java.util.ArrayList;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    Note findByEmail(String email);
}
