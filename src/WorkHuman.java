import Models.Builder;
import Models.Human;
import Models.Pilot;
import Models.Sailor;

import java.util.*;

public class WorkHuman implements Runnable{
    MyRepository myRepository=new MyRepository();
    public Builder builder=new Builder("Jonny Worker",38,1560.00,13);
    public Sailor sailor=new Sailor("Antony MacDouwell",42,2830.25,22);
    public Pilot pilot=new Pilot("Ben Grade",31,3068.33,10);
public  void  seed()
{
    myRepository.AddHuman(builder);
    myRepository.AddHuman(sailor);
    myRepository.AddHuman(pilot);
}
public  void search()
{
    System.out.println("");
}
    @Override
    public void run() {
       seed();
       myRepository.readAll();

    }
}
