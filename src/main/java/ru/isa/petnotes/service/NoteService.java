package ru.isa.petnotes.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.isa.petnotes.model.Note;
import ru.isa.petnotes.repository.NoteRepository;

import java.util.List;


public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Integer id);
    Note createNote(Note note);
    void deleteNote(Integer id);
    void deleteAllNotes();
    List<Note> findNoteByEmail(String email);

}
