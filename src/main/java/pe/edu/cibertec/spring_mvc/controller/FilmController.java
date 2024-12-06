package pe.edu.cibertec.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.spring_mvc.entity.Film;
import pe.edu.cibertec.spring_mvc.service.FilmService;
import pe.edu.cibertec.spring_mvc.service.LanguageService;

import java.util.List;

@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private LanguageService languageService;

    @GetMapping
    public String listarFilms(Model model) {
        List<Film> films = filmService.getAllFilms();
        model.addAttribute("films", films);
        return "films/list";
    }

    @GetMapping("/{id}")
    public String detailFilm(@PathVariable Long id, Model model) {
        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        return "films/detail";
    }

    @GetMapping("/new")
    public String newFilm(Model model) {
        model.addAttribute("film", new Film());
        model.addAttribute("languages", languageService.getAllLanguages());
        return "films/form";
    }

    @PostMapping
    public String saveFilm(@ModelAttribute Film film) {
        filmService.saveFilm(film);
        return "redirect:/films";
    }

    @GetMapping("/edit/{id}")
    public String editFilm(@PathVariable Long id, Model model) {
        Film film = filmService.getFilmById(id);
        model.addAttribute("film", film);
        model.addAttribute("languages", languageService.getAllLanguages());
        return "films/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return "redirect:/films";
    }
}
