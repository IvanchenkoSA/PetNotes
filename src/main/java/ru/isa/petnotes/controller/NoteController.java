package ru.isa.petnotes.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.isa.petnotes.model.Note;
import ru.isa.petnotes.service.NoteService;

import java.util.List;


@RestController
@RequestMapping("/api/notes")
@AllArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping("/get-notes")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/get-notes-by-email/{email}")
    public List<Note> getNotesByEmail(@PathVariable String email) {
        return noteService.findNoteByEmail(email);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Integer id) {
        return noteService.getNoteById(id);
    }

    @PostMapping("/new-note")
    public String createNote(@RequestBody Note note) {
        noteService.createNote(note);
        return "Note created";
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Integer id) {
        noteService.deleteNote(id);
    }

    @DeleteMapping("delete-all-note")
    public void deleteAllNotes() {
        noteService.deleteAllNotes();
    }

}
