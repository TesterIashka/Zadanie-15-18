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

        System.out.println("Введите номер пункта, обозначающего что необходимо получить от программы:\n" +
                "1 - Вычесть среднее арифметическое значений x,y,z\n"+
                "2 - Получить значение среднего арифметического поделенного на 2 без остатка\n"+
                "3 - Все вышеперечисленное\n"
                   );
        int cat3 = meow.nextInt();
        switch (cat3)
        {
            case (1): System.out.println("Среднее арифметическое x,y,z = "+SredeeArif(cat,cat1,cat2));
            break;
            case (2): System.out.println("Среднее арифметическое x,y,z = "+SredeeArifBezOstatk(cat,cat1,cat2));
            if (SredeeArifBezOstatk(cat,cat1,cat2)>3)
            {
                System.out.println("Программа выполнена корректно");
            }
            break;
            case (3): System.out.println("Среднее арифметическое x,y,z = "+SredeeArif(cat,cat1,cat2));
                      System.out.println("Среднее арифметическое x,y,z = "+SredeeArifBezOstatk(cat,cat1,cat2));
                      if (SredeeArifBezOstatk(cat,cat1,cat2)>3)
                {
                      System.out.println("Программа выполнена корректно");
                }
            break;

            default:  System.out.println("Вы ввели несуществующий номер пункта");
            break;
        }


        }

    private static int SredeeArif(int x, int y, int z)
    {
        return (x+y+z)/3;
    }

    private static int SredeeArifBezOstatk(int x1, int y1, int z1)
    {
        return SredeeArif(x1,y1,z1)/2;
    }

}


