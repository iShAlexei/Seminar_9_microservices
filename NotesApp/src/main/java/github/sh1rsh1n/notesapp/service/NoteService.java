package github.sh1rsh1n.notesapp.service;


import github.sh1rsh1n.notesapp.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getAll();

    Note getById(Long id);

    Note addNote(Note note);

    boolean updateNote(Note note);

    boolean deleteNote(Long id);
}
