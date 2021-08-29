package com.mehranj73.springwebapp.controllers;


import com.mehranj73.springwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 12/24/19.
 */
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthrors(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
