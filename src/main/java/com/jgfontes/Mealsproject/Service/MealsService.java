package com.jgfontes.Mealsproject.Service;

import com.jgfontes.Mealsproject.Entity.MealApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MealsService {

    private static String getRandomMealUrl = "https://www.themealdb.com/api/json/v1/1/random.php";
    private static String getAllByFirstLetterUrl = "https://www.themealdb.com/api/json/v1/1/search.php?f=b";

    @Autowired
    private RestTemplate restTemplate;

    public Object getRandomMeal() {
        try {
            HttpHeaders headers = new HttpHeaders();
//            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);
            MealApiResponse responseMeal = restTemplate.getForObject(getRandomMealUrl, MealApiResponse.class);

            System.out.println("Output from Meals API: " + responseMeal.getMeals().get(0).toString());
            return responseMeal;
        } catch (Exception e) {
            System.out.println("Something went wrong getting value from MealsAPI");
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Exception when calling endpoint of Meals API",
                    e
            );
        }
    }
}
