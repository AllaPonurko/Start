public class Person {
    public String Name;
    private int Age;
    private String NumberOfTelephone;
    public String Email;

    public Person(String Name,int Age)
    {
        this.Age=Age;
        this.Name=Name;
        getNumberOfTelephone();
    }
    public Person(String Name,String Email)
    {
        this.Name=Name;
        getAge();
        getNumberOfTelephone();
        this.Email=Email;
    }
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public int getAge()
    {
        return Age;
    }
    public String getNumberOfTelephone()
    {
        return NumberOfTelephone;
    }
    public void setNumberOfTelephone(String Number)
    {
        NumberOfTelephone=Number;
    }


}
