package com.sthel.surpresa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private static final String SENHA_SECRETA = "09032022"; // Defina a senha correta

    @GetMapping("/")
    public String loginPage() {
        return "index";
    }

    @PostMapping("/verificar")
    public ModelAndView verificarSenha(@RequestParam("senha") String senha) {
        if (SENHA_SECRETA.equals(senha)) {
            return new ModelAndView("redirect:/carta");
        } else {
            return new ModelAndView("index");
        }
    }

    @GetMapping("/carta")
    public String cartaPage() {
        return "carta";
    }
}
