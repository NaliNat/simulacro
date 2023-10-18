package ar.edu.bda.losmejores.simulacro.repositories;
import ar.edu.bda.losmejores.simulacro.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
  /*  Film findByTitle(String title);
    List<Film> findByReleaseYear(String year);
    List<Film> findByCategory(String category);*/
  /*  Film deleteFilmById(Long id);
    Film updateFilm(Film film);
    Film findFilmById(Long id);*/
}
