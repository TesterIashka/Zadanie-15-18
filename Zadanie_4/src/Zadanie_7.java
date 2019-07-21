import java.util.Scanner;

public class Zadanie_7
{

    public static void main(String args[])
    {

        Scanner meow = new Scanner(System.in);
        System.out.println("Введите значение number=: ");
        int cat = meow.nextInt();
        sravnenie(cat);
    }

    private static void sravnenie(int A)
    {
       final int X=3;
       final int Y=6;
       final int Z=10;
        switch (A)
        {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;

                default:
                    System.out.println("Такой константы нет!");
                    break;
        }
    }
}