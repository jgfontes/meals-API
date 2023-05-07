package com.jgfontes.Mealsproject.Controller;

import com.jgfontes.Mealsproject.Service.MealsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controls requests comming directly from API calls
@RestController
@RequestMapping("/meals")
@RequiredArgsConstructor
public class MealsController {

    private final MealsService mealsService;

    @GetMapping("/getRandomMeal")
    public ResponseEntity<?> callRandomMealEndpoint() {
        return ResponseEntity.ok(mealsService.getRandomMeal());
    }
}
