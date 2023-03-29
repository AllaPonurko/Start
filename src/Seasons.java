import java.util.Scanner;

import static java.lang.System.*;

public class Seasons implements Runnable {
    @Override
    public void run() {
        seasonsByMonth();
    }

    public void seasonsByMonth() {
        Scanner in = new Scanner(System.in);
        out.println("Введіть число від 1 до 12: ");
        int num = in.nextInt();
        if(num<1||num>12)
         {
            out.println("Некоректний ввод");
        }
        switch (num) {
            case 1, 2, 12:
                out.println("Зима");
                break;
            case 3, 4, 5:
                out.println("Весна");
                break;
            case 6, 7, 8:
                out.println("Літо");
                break;
            case 9, 10, 11:
                out.println("Осінь");
                break;
        }
    }
}
