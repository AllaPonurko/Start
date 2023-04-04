package Models;

public class Pilot extends Human{
    public Pilot(String Name, int Age, double Salary, int Experience) {
        super(Name, Age, Salary, Experience);
        Occupation="Pilot";
    }
}
