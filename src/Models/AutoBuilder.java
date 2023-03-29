package Models;

import java.util.Scanner;

public class AutoBuilder implements Runnable{
    private String name;
    private String vendor;
    private String date;
    private double engineCapacity;

    public AutoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AutoBuilder setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public AutoBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public AutoBuilder setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public Auto createAuto() {
        return new Auto(name, vendor, date, engineCapacity);
    }
     public void displayInfo()
     {
         System.out.println("Модель автомобиля: "+name+"\n"+
                 "Производитель: "+vendor+"\n"+
                 "Год выпуска: "+date+"\n"+
                 "Объём двигателя: "+engineCapacity+" л.");
     }
    @Override
    public void run() {
        AutoBuilder autoBuilder=new AutoBuilder();
        Scanner in=new Scanner(System.in);
        System.out.println("Введите название автомобиля:" );
        String name=in.nextLine();
        System.out.println("Введите производителя автомобиля:" );
        String vendor=in.nextLine();
        System.out.println("Введите год выпуска автомобиля:" );
        String date=in.nextLine();
        System.out.println("Введите объём двигателя автомобиля:" );
        String engineCapacity=in.nextLine();
        autoBuilder.setName(name);
        autoBuilder.setVendor(vendor);
        autoBuilder.setDate( date);
        autoBuilder.setEngineCapacity(Double.parseDouble((String)engineCapacity));
        autoBuilder.createAuto();
        autoBuilder.displayInfo();
    }
}