package guru.springframework.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokesapp.services.JokeServiceImpl;

@Controller
public class JokeController {

    private final JokeServiceImpl jokeService;

    public JokeController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({ "/", "" })
    public String displayJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }

}
