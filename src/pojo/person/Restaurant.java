package pojo.person;

import pojo.Area;
import pojo.food.Bill;
import pojo.food.Meal;

import java.util.Date;

public class Restaurant extends Person {


    // the area to be fetched from the database
    private Area area ;

    // TODO voucher setup

    public Restaurant(String email, String password,Area area) {
        super(email, password);
        this.area = area;
    }

    public void addMeal(Meal meal) {
        //TODO: to be inserted in the dataBase
    }

    public Meal[] getMeals() {
        //TODO: to be fetched form the dataBase
        return new Meal[0];
    }

    public String[] getComments() {
        //TODO: to be fetched from the dateBase
        return new String[0];
    }

    public void addEmployee(Employee employee) {
        //TODO: to be insereted in the data base
    }

    public void removeEmployee(Employee employee) {
        //TODO: to be removed from the database
    }

    public Employee[] getEmployees() {
        //TODO: to be fetched from thne database
        return new Employee[0];
    }

    public Bill[] getBills(Date date) {
        //TODO: to be fetched from thne database
        return new Bill[0];
    }

    public Bill[] getBills(Customer customer) {
        //TODO: to be fetched from thne database
        return new Bill[0];
    }
}
