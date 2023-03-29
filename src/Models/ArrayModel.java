package Models;

import java.lang.reflect.Array;

public class ArrayModel implements Runnable{
    int k=15;
    public int[] arr =new int[k];
    @Override
    public void run() {
        try{
            seedArr();
            MaxNum();
            MinNum();
            CountOfPositiveNegativeNum();
            NewArray();
            }
        catch (ArrayIndexOutOfBoundsException  ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void seedArr()
    {
        for(int i=0;i<k;i++) {
            arr[i]= (int) ((int)-36+ Math.random()*100);
            System.out.print(arr[i]+";");
        }
        System.out.print("\n");
    }
public void MaxNum()
{int max=arr[0];
  for(int i=0;i<k;i++)
  {
      if(arr[i]>max)
          max=arr[i];
  }
  System.out.println("Максимальне число в масиві: "+max);
}
    public void MinNum()
    {int min=arr[0];
        for(int i=0;i<k;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Мінімальне число в масиві: "+min);
    }
    public void CountOfPositiveNegativeNum()
    {
      int countPositive=0;
       int countNegative=0;
       int countNull=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
                countNegative++;
            if(arr[i]>0)
                countPositive++;
            if(arr[i]==0)
                countNull++;
        }
        System.out.println("Кількість позитивних елементів" +
                " в масиві: "+countPositive);
        System.out.println("Кількість негативних елементів" +
                " в масиві: "+countNegative);
        System.out.println("Кількість елементів, що дорівнює 0" +
                " в масиві: "+countNull);
    }
    public void NewArray()
    {
        int countPositive=0;
        int countNegative=0;
        int countHonest=0;
        int countOdd=0;

        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
            {
                countNegative++;
            }
            if(arr[i]>0)
            {
             countPositive++;
            }
            if(arr[i]%2==0)
            {
                 countHonest++;
            }
            if(arr[i]%2!=0)
            {
                countOdd++;
            }
        }
        int arrPositive[]=new int[countPositive];
        int arrNegative[]=new int[countNegative];
        int arrHonest[]=new int[countHonest];
        int arrOdd[]=new int[countOdd];
        for(int i=0,j=0;i<arr.length;i++)
        {
            if(arr[i]<0&&j<countNegative)
            {
                arrNegative[j]=arr[i];
                j++;
            }
        }
        System.out.println("Масив негативних чисел: ");
        for(int j=0;j<countNegative;j++)
        {
            System.out.print(arrNegative[j]+";");
        }
        System.out.print("\n");
        for(int i=0,j=0;i<arr.length;i++)
        {
            if(arr[i]>0&&j<countPositive)
            {
                arrPositive[j]=arr[i];
                j++;
            }
//
        }
        System.out.println("Масив позитивних чисел: ");
        for(int j=0;j<countPositive;j++)
        {
            System.out.print(arrPositive[j]+";");
        }
        System.out.print("\n");
        for(int i=0,j=0;i<arr.length;i++)
        {
                if(arr[i]%2==0&&j<countHonest)
                {
                arrHonest[j]=arr[i];
                 j++;
                }
        }
        System.out.println("Масив парних чисел: ");
        for(int j=0;j<countHonest;j++)
        {
            System.out.print(arrHonest[j]+";");
        }
        System.out.print("\n");
        for(int i=0,j=0;i<arr.length;i++)
        {

            if(arr[i]%2!=0&&j<countOdd)
            {
                arrOdd[j]=arr[i];
                j++;
            }

        }
        System.out.println("Масив непарних чисел: ");
        for(int j=0;j<countOdd;j++)
        {
            System.out.print(arrOdd[j]+";");
        }
        System.out.print("\n");
    }
    }

