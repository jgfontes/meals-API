package com.jgfontes.Mealsproject.Auxiliar;

import com.jgfontes.Mealsproject.Entity.Game;
import com.jgfontes.Mealsproject.Entity.MealApiResponse;
import com.jgfontes.Mealsproject.Service.MealsService;

import java.util.*;

public class GamePopulator {

    public static void main(String[] args) {
    }

    static public Game populateGame(Game game, int size, MealsService mealsService) {
        MealApiResponse mealApiResponse = (MealApiResponse) mealsService.getRandomMeal();
        MealApiResponse.Meal meal = mealApiResponse.getMeals().get(0);

        game.setAlternatives(generateCountriesList(meal.getStrArea(),size));
        game.setAnswer(meal.getStrArea());
        game.setInstruction(meal.getStrInstructions());
        game.setStrSource(meal.getStrSource());
        game.setStrYoutube(meal.getStrYoutube());
        game.setStrMealThumb(meal.getStrMealThumb());

        return game;
    }

    static private Set<String> generateCountriesList(String strAreaAnswer, int size) {
        Set<String> strAreaAlternatives = new HashSet<String>(size);
        strAreaAlternatives.add(strAreaAnswer);
        Random r = new Random();

        while(strAreaAlternatives.size() < size) {
            String randomArea = MealApiResponse.strAreaArray[r.nextInt(MealApiResponse.strAreaArray.length)];
            if (!strAreaAlternatives.contains(randomArea)) {
                strAreaAlternatives.add(randomArea);
            }
        }

        strAreaAlternatives.stream().forEach(System.out::println);
        return strAreaAlternatives;
    }
}
