package com.example.wellnesscomrade;

public class Deficiency {

    private String name;
    private String foodSources;
    private String description;

    public Deficiency(String name, String foodSources,
                      String description) {
        this.name = name;
        this.foodSources = foodSources;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getFoodSources() {
        return foodSources;
    }

    public String getDescription() {
        return description;
    }
}
