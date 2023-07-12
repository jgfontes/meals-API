package com.jgfontes.Mealsproject.Controller;

import com.jgfontes.Mealsproject.Auxiliar.GamePopulator;
import com.jgfontes.Mealsproject.Entity.Game;
import com.jgfontes.Mealsproject.Entity.MealApiResponse;
import com.jgfontes.Mealsproject.Service.MealsService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.*;

@Controller
@RequiredArgsConstructor
public class HtmlController {

    @Autowired
    private final MealsService mealsService;
    private Game game;

    @GetMapping("/")
    public String openHtml(Model model) {
        //test
        Game game = GamePopulator.populateGame(new Game(), 5, mealsService);
        String[] strAreaAlternatives = game.getAlternatives().toArray(new String[0]);
        this.game = game;
        System.out.println(game);

        model.addAttribute("recepyInstructions", game.getInstruction());
        model.addAttribute("country0", strAreaAlternatives[0]);
        model.addAttribute("country1", strAreaAlternatives[1]);
        model.addAttribute("country2", strAreaAlternatives[2]);
        model.addAttribute("country3", strAreaAlternatives[3]);
        model.addAttribute("country4", strAreaAlternatives[4]);

        return "main";
    }

    @PostMapping("/check-answer")
    public String updateHtml(
            @RequestParam(defaultValue = "false") boolean alternative1,
            @RequestParam(defaultValue = "false") boolean alternative2,
            @RequestParam(defaultValue = "false") boolean alternative3,
            @RequestParam(defaultValue = "false") boolean alternative4,
            @RequestParam(defaultValue = "false") boolean alternative5,
            Model model
    ) {
        int userGuess = 0;
        boolean[] userAlternatives = {alternative1, alternative2, alternative3, alternative4, alternative5};
        for (int i = 0; i < userAlternatives.length; i++) {
            if(userAlternatives[i]) {
                userGuess=i;
                System.out.println("User Guess is :" + userGuess);
                break;
            }
        }

        String answer;
        if(game.getAlternatives().toArray()[userGuess].equals(game.getAnswer())) {
            answer = "Correct";
        } else {
            answer = "Wrong";
        }

        model.addAttribute("answer", answer);
        model.addAttribute("recepyInstructions", game.getInstruction());
        model.addAttribute("recepyCountry", game.getAnswer());
        model.addAttribute("strMealThumb", game.getStrMealThumb());
        model.addAttribute("strYoutube", game.getStrYoutube());
        model.addAttribute("strSource", game.getStrSource());

        return "result";
    }

}
