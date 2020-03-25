package pojo.person;

public abstract class Person {
    private String email,password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void deleteAccount(){
        //TODO: delete account from database
    }
}
