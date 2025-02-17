package ru.isa.petnotes.repository;

import ru.isa.petnotes.model.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryNoteDAO {
    public final List<Note> NOTES = new ArrayList<>();

    public List<Note> getNotes() {
        return NOTES;
    }

    public Note newNote(Note note) {
        NOTES.add(note);
        return note;
    }

    public Note findNote(Integer id) {
        return NOTES.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst()
                .orElse(null);
    }



    public void deleteNote(Integer id) {
        var note = findNote(id);
        if (note != null) {
            NOTES.remove(note);
        }
    }

    public void deleteAllNotes() {
        NOTES.clear();
    }

    public List<Note> findNoteByEmail(String email) {
        return NOTES.stream()
                .filter(note -> note.getEmail().equals(email))
                .collect(Collectors.toList());
    }
}
