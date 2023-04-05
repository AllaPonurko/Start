import Interfaces.*;
import Models.Human;

import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyRepository extends Humans
        implements ICrudRepository
{

    @Override
    public void AddHuman(IEntity human) {
        Employees.add(human);
    }

    @Override
    public void deleteHuman(IEntity human) {
       Employees.remove(human);
    }

    @Override
    public void readHumanById(UUID id) {
//       try {
//           System.out.println(Employees.stream().filter(h->h.equals(h).getId()==id).findFirst().toString());
//
//       }catch (Exception e)
//       {
//            System.out.println(e.getMessage()+"Not found");
//        }

    }

    @Override
    public void readAll() {
        try {
            for (var human : Employees
            ) {
                System.out.println(human.toString());
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateHuman() {

    }



}
