package ar.edu.bda.losmejores.simulacro.services;

import ar.edu.bda.losmejores.simulacro.models.Film;
import ar.edu.bda.losmejores.simulacro.repositories.FilmRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FilmServiceImpl implements FilmService{
    private FilmRepository repository;

    @Autowired
    public FilmServiceImpl(FilmRepository repository){
        this.repository = repository;
    }
/*
    @Override
    public Film crear(Film f) {
        return repository.save(f);
    }

    @Override
    public Optional<Film> consultarFilm(long id) {
        return repository.findById(id);
    }

    @Override
    public Film borrarFilm(long id) {
        return repository.deleteFilmById(id);
    }

    @Override
    public Film modificarFilm(Film film) {
        return repository.updateFilm(film);
    }
*/
    @Override
    public List<Film> getAll() {
        return repository.findAll();
    }
/*
    @Override
    public Film getById(Long aLong) {
        return repository.findFilmById(aLong);
    }
*/
    @Override
    public void add(Film entity) {
        repository.save(entity);
    }
}
