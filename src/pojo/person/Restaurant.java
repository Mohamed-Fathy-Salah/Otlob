package pojo.person;

public class Restaurant extends Person {


    // the area to be fetched from the database
    private Area area = new Area(x, y);

    // TODO voucher setup

    public Restaurant(String email, String password) {
        super(email, password);
    }

    public void addMeal(Meal meal) {
        //TODO: to be inserted in the dataBase
    }

    public Meal[] getMeals() {
        //TODO: to be fetched form the dataBase
    }

    public String[] getComments() {
        //TODO: to be fetched from the dateBase
    }

    public void addEmployee(Employee employee) {
        //TODO: to be insereted in the data base
    }

    public void removeEmployee(Employee employee) {
        //TODO: to be removed from the database
    }

    public Employee[] getEmployees() {
        //TODO: to be fetched from thne database
    }

    public Bill[] getBills(Date) {
        //TODO: to be fetched from thne database
    }

    public Bill[] getBills(Customer customer) {
        //TODO: to be fetched from thne database
    }


}
