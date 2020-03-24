import pojo.person.Person;

public class System {
    //Singleton "can't be more than one person on the app"
    private static System instance;
    private static Person person;
    private System (){}

    public static System getInstance() {
        //use thread safe implementation if threads are used
        if (instance == null)
            instance = new System();
        return instance;
    }

    public boolean login(Person newPerson){
        //TODO: check if the user in the database and all the information is correct
        person = newPerson;
        return true;
    }
    public boolean signUp(Person newPerson){
        //TODO: add in database if no conflict happened
        return true;
    }
    public boolean logout(){
        person=null;
        return true;
    }
}
