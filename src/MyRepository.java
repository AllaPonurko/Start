import Interfaces.*;
import Models.Human;

import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyRepository extends Humans
        implements ICrudRepository
{



    @Override
    public void AddHuman(Human human) {
        Employees.add(human);
    }

    @Override
    public void deleteHuman(Human human) {
       Employees.remove(human);
    }

    @Override
    public void readHumanById(UUID id) {
//       try {
//           for (var human : Employees) {
//               if(human.getId()==id)
//               System.out.println(human.toString());
//
//           }
//       }catch (Exception e)
//       {
//            System.out.println(e.getMessage());
//        }
    }

    @Override
    public void readAll() {
        for (var human:Employees
             ) {
            System.out.println(human.toString());
        }
    }

    @Override
    public void updateHuman() {

    }



}
