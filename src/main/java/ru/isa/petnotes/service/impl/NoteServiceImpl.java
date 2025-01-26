package ru.isa.petnotes.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.isa.petnotes.model.Note;
import ru.isa.petnotes.repository.NoteRepository;
import ru.isa.petnotes.service.NoteService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Integer id) {
        return noteRepository.findById(id).get();
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Integer id) {
        noteRepository.deleteById(id);
    }
}
