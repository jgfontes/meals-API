package com.jgfontes.Mealsproject.Controller;

import com.jgfontes.Mealsproject.Entity.MealApiResponse;
import com.jgfontes.Mealsproject.Service.MealsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@Controller
@RequiredArgsConstructor
public class HtmlController {

    @Autowired
    private final MealsService mealsService;

    @GetMapping("/")
    public String openHtml(Model model) {
        //Call MealsAPI and store content into MealApiResponse Entity
        MealApiResponse meal = (MealApiResponse) mealsService.getRandomMeal();

        //Generate Array with different Areas (Containing the answer)
        ArrayList strAreaAlternatives = generateCountriesList(meal.getMeals().get(0).getStrArea(), 5);
        System.out.println("Answer is: " + meal.getMeals().get(0).getStrArea());
        strAreaAlternatives.stream().forEach(System.out::println);

        model.addAttribute("recepyInstructions", meal.getMeals().get(0).getStrInstructions());
        model.addAttribute("country0", strAreaAlternatives.get(0));
        model.addAttribute("country1", strAreaAlternatives.get(1));
        model.addAttribute("country2", strAreaAlternatives.get(2));
        model.addAttribute("country3", strAreaAlternatives.get(3));
        model.addAttribute("country4", strAreaAlternatives.get(4));
        return "main";
    }

    private ArrayList generateCountriesList(String strAreaAnswer, int size) {
        ArrayList strAreaAlternatives = new ArrayList(size);
        strAreaAlternatives.add(strAreaAnswer);
        Random r = new Random();

        while(strAreaAlternatives.size() < size) {
            String randomArea = MealApiResponse.strAreaArray[r.nextInt(MealApiResponse.strAreaArray.length)];
            if (!strAreaAlternatives.contains(randomArea)) {
                strAreaAlternatives.add(randomArea);
            }
        }

        Collections.shuffle(strAreaAlternatives);
        return strAreaAlternatives;
    }
}
