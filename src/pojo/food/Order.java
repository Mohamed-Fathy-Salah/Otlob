package pojo.food;

import pojo.Area;

import java.util.Date;
import java.util.List;

public class Order {
    private Area area;
    private List<Meal> meals;
    private Date deliveryDate, estimatedTime;

    public float getPrice() {
        float price = 0;
        for (Meal m : meals) {
            price += m.getTotalPrice();
        }
        return price;
    }

    public boolean cancelMeal(Meal meal) {
        return meals.remove(meal);
    }

    public boolean cancelMeal(Meal meal, int quantity) {
        if (meals.contains(meal)) {
            meals.get(meals.indexOf(meal)).decreaseBy(quantity);
            return true;
        }
        return false;
    }

    public boolean addMeal(Meal meal){
        if (meals.contains(meal)){
            meals.get(meals.indexOf(meal)).increaseBy(meal.getQuantity());
            return true;
        }
        return meals.add(meal);
    }

    public void showBill() {
        //TODO
    }
}
