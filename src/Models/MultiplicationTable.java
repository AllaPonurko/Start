package Models;

import java.util.Scanner;

public class MultiplicationTable implements Runnable {
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input next number: ");
        int num2 = in.nextInt();
        Multiplication(num1, num2);
    }

    public void Multiplication(int a, int b) {
        if (a < b) {
            while (a <= b) {
                for (int i = 1; i < 11; i++) {
                    {
                        int res = a * i;
                        System.out.print(a + "*" + i + "=" + res + ";");
                    }
                }
                System.out.print("\n");
                a++;
            }
        } else  {
            while (b <= a) {
                for (int i = 1; i < 11; i++) {
                    {
                        int res = b * i;
                        System.out.print(b + "*" + i + "=" + res + ";");
                    }
                }
                System.out.print("\n");
                b++;
            }
        }
    }
}