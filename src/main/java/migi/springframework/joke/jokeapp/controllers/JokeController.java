package migi.springframework.joke.jokeapp.controllers;

import migi.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;


    @Autowired
    public JokeController(JokeService service) {
        this.jokeService = service;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        // return view name
        return "chucknorris";
    }
}
