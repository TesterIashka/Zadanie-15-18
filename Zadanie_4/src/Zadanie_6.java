import java.util.Scanner;

public class Zadanie_6 {

    public static void main(String args[]) {

        Scanner meow = new Scanner(System.in);
        System.out.println("Введите значение x=: ");
        int cat = meow.nextInt();
        System.out.println("Введите значение y=: ");
        int cat1 = meow.nextInt();
        System.out.println("Введите значение z=: ");
        int cat2 = meow.nextInt();


            System.out.println("Среднее арифметическое x,y,z = "+SredeeArif(cat,cat1,cat2));
            System.out.println("Среднее арифметическое пополам без остатка x,y,z = "+SredeeArifBezOstatk(cat,cat1,cat2));
            if (SredeeArifBezOstatk(cat,cat1,cat2)>3)
                {
                      System.out.println("Программа выполнена корректно");
                }


        }

    private static double SredeeArif(int x, int y, int z)
    {
        return (x+y+z)/3;
    }

    private static int SredeeArifBezOstatk(int x1, int y1, int z1)
    {
        return (x1+y1+z1)/6;
    }

}


