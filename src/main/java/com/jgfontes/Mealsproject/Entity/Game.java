package com.jgfontes.Mealsproject.Entity;

import java.util.Set;

public class Game {
    //Main Page Params
    private Set<String> alternatives;
    private String answer;
    private String instruction;
    //Result Page Params
    private String strMealThumb;
    private String strYoutube;
    private String strSource;

    public void setAlternatives(Set<String> alternatives) {
        this.alternatives = alternatives;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public void setStrSource(String strSource) {
        this.strSource = strSource;
    }

    public Set<String> getAlternatives() {
        return alternatives;
    }

    public String getAnswer() {
        return answer;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public String getStrSource() {
        return strSource;
    }

    @Override
    public String toString() {
        return "Game{" +
                "alternatives=" + alternatives +
                ", answer='" + answer + '\'' +
                '}';
    }
}
