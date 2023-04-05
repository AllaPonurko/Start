package Models;

import Interfaces.IEntity;

import java.util.UUID;

public abstract class Human implements IEntity {
    private UUID Id;
    private String Name;
    private int Age;
    private double Salary;
    private int Experience;
    public String Occupation;
    public Human()
    {

    }
   public Human(String Name,int Age,double Salary, int Experience)
   {   Id=UUID.randomUUID();
       this.Age=Age;
       this.Experience=Experience;
       this.Salary=Salary;
       this.Name=Name;
   }
   public String getName()
   {
       return  Name;
   }
   public int getAge()
   {
       return Age;
   }
   public double getSalary()
   {
       return  Salary;
   }
   public int getExperience()
   {
     return  Experience;
   }
   @Override
    public UUID getId() {
        return Id;
    }

    public String displayInfo()
   {return
       "Name: "+getName()+"\n"+"Age: "+getAge()+"\n"+
               "Salary: "+getSalary()+"\n"+"Experience: "+getExperience();
   }
  @Override
    public String toString ()
    {
        return "Occupation: "+Occupation+"\n"+displayInfo();
    }
}
