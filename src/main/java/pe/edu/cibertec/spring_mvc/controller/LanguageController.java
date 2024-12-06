package pe.edu.cibertec.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.spring_mvc.service.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    // Listar todos los idiomas
    @GetMapping
    public String listLanguages(Model model) {
        model.addAttribute("languages", languageService.getAllLanguages());
        return "languages/list";
    }
}
