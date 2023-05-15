package com.example.demoweek2;

/**
 * This is the model class. It stores the information we would typically track about the objects
 * */
public class FoodMenu {
    private String foodName;
    private double price;
    private int spicyLevel;

    /*
     * Summary: This method is the constructor
     * @param foodName - the name to be assigned
     *
     * */
    public FoodMenu(String foodName, double price, int spicyLevel) {
        setFoodName(foodName);
        setPrice(price);
        setSpicyLevel(spicyLevel);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        if (!foodName.isBlank() && foodName.length() >= 3)
            this.foodName = foodName;
        else
            throw new IllegalArgumentException("food name must longer than 2 characters");
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 100)
            this.price = price;
        else
            throw new IllegalArgumentException("price must from $1 to $100");
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }

    /**
     * set spicy level 0-3
     *
     * @param spicyLevel
     */
    public void setSpicyLevel(int spicyLevel) {
        if (spicyLevel >= 0 && spicyLevel <= 3)
            this.spicyLevel = spicyLevel;
        else
            throw new IllegalArgumentException("SpicyLevel must between 0 to 3");
    }

    @Override
    public String toString() {

        return String.format("%s, $%.2f, %d Spicy, ", foodName, price, spicyLevel);

    }
}
