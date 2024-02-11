package github.sh1rsh1n.notesapp.repository;

import github.sh1rsh1n.notesapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Обращение к БД
 */
public interface NoteRepository extends JpaRepository<Note, Long> {
}
