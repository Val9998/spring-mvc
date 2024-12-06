package pe.edu.cibertec.spring_mvc.service;

import pe.edu.cibertec.spring_mvc.entity.Film;

import java.util.List;

public interface FilmService {
    List<Film> getAllFilms();
    Film getFilmById(Long id);
    Film saveFilm(Film film);
    void deleteFilm(Long id);
}
