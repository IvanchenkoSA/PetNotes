package ru.isa.petnotes.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isa.petnotes.model.Note;
import ru.isa.petnotes.repository.InMemoryNoteDAO;
import ru.isa.petnotes.service.NoteService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryNoteServiceImpl implements NoteService {

    private final InMemoryNoteDAO service = new InMemoryNoteDAO();
    @Override
    public List<Note> getAllNotes() {
        return service.getNotes();
    }

    @Override
    public Note getNoteById(Integer id) {
        return service.findNote(id);
    }

    @Override
    public Note createNote(Note note) {
        return service.newNote(note);
    }

    @Override
    public void deleteNote(Integer id) {
        service.deleteNote(id);
    }

    @Override
    public void deleteAllNotes() {
        service.deleteAllNotes();
    }

    @Override
    public List<Note> findNoteByEmail(String email) {
        return service.findNoteByEmail(email);
    }
}
