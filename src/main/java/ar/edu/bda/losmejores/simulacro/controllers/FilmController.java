package ar.edu.bda.losmejores.simulacro.controllers;

import ar.edu.bda.losmejores.simulacro.models.Film;
import ar.edu.bda.losmejores.simulacro.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping
    public List<Film> getAll(){
        return service.getAll();
    }
}
