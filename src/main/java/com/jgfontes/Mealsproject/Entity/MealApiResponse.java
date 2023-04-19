package com.jgfontes.Mealsproject.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MealApiResponse {
    private List<Meal> meals;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public static class Meal {
        @Getter @Setter private String idMeal;
        @Getter @Setter private String strMeal;
        @Getter @Setter private String strDrinkAlternate;
        @Getter @Setter private String strCategory;
        @Getter @Setter private String strArea;
        @Getter @Setter private String strInstructions;
        @Getter @Setter private String strMealThumb;
        @Getter @Setter private String strTags;
        @Getter @Setter private String strYoutube;
        @Getter @Setter private String strIngredient1;
        @Getter @Setter private String strIngredient2;
        @Getter @Setter private String strIngredient3;
        @Getter @Setter private String strIngredient4;
        @Getter @Setter private String strIngredient5;
        @Getter @Setter private String strIngredient6;
        @Getter @Setter private String strIngredient7;
        @Getter @Setter private String strIngredient8;
        @Getter @Setter private String strIngredient9;
        @Getter @Setter private String strIngredient10;
        @Getter @Setter private String strIngredient11;
        @Getter @Setter private String strIngredient12;
        @Getter @Setter private String strIngredient13;
        @Getter @Setter private String strIngredient14;
        @Getter @Setter private String strIngredient15;
        @Getter @Setter private String strIngredient16;
        @Getter @Setter private String strIngredient17;
        @Getter @Setter private String strIngredient18;
        @Getter @Setter private String strIngredient19;
        @Getter @Setter private String strIngredient20;
        @Getter @Setter private String strMeasure1;
        @Getter @Setter private String strMeasure2;
        @Getter @Setter private String strMeasure3;
        @Getter @Setter private String strMeasure4;
        @Getter @Setter private String strMeasure5;
        @Getter @Setter private String strMeasure6;
        @Getter @Setter private String strMeasure7;
        @Getter @Setter private String strMeasure8;
        @Getter @Setter private String strMeasure9;
        @Getter @Setter private String strMeasure10;
        @Getter @Setter private String strMeasure11;
        @Getter @Setter private String strMeasure12;
        @Getter @Setter private String strMeasure13;
        @Getter @Setter private String strMeasure14;
        @Getter @Setter private String strMeasure15;
        @Getter @Setter private String strMeasure16;
        @Getter @Setter private String strMeasure17;
        @Getter @Setter private String strMeasure18;
        @Getter @Setter private String strMeasure19;
        @Getter @Setter private String strMeasure20;
        @Getter @Setter private String strSource;
        @Getter @Setter private String strImageSource;
        @Getter @Setter private String strCreativeCommonsConfirmed;
        @Getter @Setter private String dateModified;

        @Override
        public String toString() {
            return "Meal{" +
                    "strMeal='" + strMeal + '\'' +
                    ", idMeal='" + idMeal + '\'' +
                    ", strCategory='" + strCategory + '\'' +
                    ", strArea='" + strArea + '\'' +
                    ", strInstructions='" + strInstructions + '\'' +
                    ", strMealThumb='" + strMealThumb + '\'' +
                    ", strTags='" + strTags + '\'' +
                    ", strYoutube='" + strYoutube + '\'' +
                    ", strIngredient1='" + strIngredient1 + '\'' +
                    ", strIngredient2='" + strIngredient2 + '\'' +
                    ", strDrinkAlternate='" + strDrinkAlternate + '\'' +
                    ", strIngredient3='" + strIngredient3 + '\'' +
                    ", strIngredient4='" + strIngredient4 + '\'' +
                    ", strIngredient5='" + strIngredient5 + '\'' +
                    ", strIngredient6='" + strIngredient6 + '\'' +
                    ", strIngredient7='" + strIngredient7 + '\'' +
                    ", strIngredient8='" + strIngredient8 + '\'' +
                    ", strIngredient9='" + strIngredient9 + '\'' +
                    ", strIngredient10='" + strIngredient10 + '\'' +
                    ", strIngredient11='" + strIngredient11 + '\'' +
                    ", strIngredient12='" + strIngredient12 + '\'' +
                    ", strIngredient13='" + strIngredient13 + '\'' +
                    ", strIngredient14='" + strIngredient14 + '\'' +
                    ", strIngredient15='" + strIngredient15 + '\'' +
                    ", strIngredient16='" + strIngredient16 + '\'' +
                    ", strIngredient17='" + strIngredient17 + '\'' +
                    ", strIngredient18='" + strIngredient18 + '\'' +
                    ", strIngredient19='" + strIngredient19 + '\'' +
                    ", strIngredient20='" + strIngredient20 + '\'' +
                    ", strMeasure1='" + strMeasure1 + '\'' +
                    ", strMeasure2='" + strMeasure2 + '\'' +
                    ", strMeasure3='" + strMeasure3 + '\'' +
                    ", strMeasure4='" + strMeasure4 + '\'' +
                    ", strMeasure5='" + strMeasure5 + '\'' +
                    ", strMeasure6='" + strMeasure6 + '\'' +
                    ", strMeasure7='" + strMeasure7 + '\'' +
                    ", strMeasure8='" + strMeasure8 + '\'' +
                    ", strMeasure9='" + strMeasure9 + '\'' +
                    ", strMeasure10='" + strMeasure10 + '\'' +
                    ", strMeasure11='" + strMeasure11 + '\'' +
                    ", strMeasure12='" + strMeasure12 + '\'' +
                    ", strMeasure13='" + strMeasure13 + '\'' +
                    ", strMeasure14='" + strMeasure14 + '\'' +
                    ", strMeasure15='" + strMeasure15 + '\'' +
                    ", strMeasure16='" + strMeasure16 + '\'' +
                    ", strMeasure17='" + strMeasure17 + '\'' +
                    ", strMeasure18='" + strMeasure18 + '\'' +
                    ", strMeasure19='" + strMeasure19 + '\'' +
                    ", strMeasure20='" + strMeasure20 + '\'' +
                    ", strSource='" + strSource + '\'' +
                    ", strImageSource='" + strImageSource + '\'' +
                    ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                    ", dateModified='" + dateModified + '\'' +
                    '}';
        }
    }
}

