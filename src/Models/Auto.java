package Models;

import java.util.Date;

public class Auto {
    public String Name;
    private String Vendor;
    private Date YearOfIssue;
    private double EngineCapacity;
    public Auto(String name, String vendor, String date, double engineCapacity)
    {

    }


    public void setEngineCapacity(double engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return EngineCapacity;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setYearOfIssue(Date yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }

    public Date getYearOfIssue() {
        return YearOfIssue;
    }
}
