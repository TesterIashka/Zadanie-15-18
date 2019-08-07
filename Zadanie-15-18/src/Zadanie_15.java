import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadanie_15
{
    public static void main (String agrs[])
    {
        sort_mas(mas());
    }

    // Ввод массива цифр
    private static double[] mas()
    {
        Scanner god = new Scanner(System.in);
        System.out.println("Введите количество цифр в массиве: ");
        int razm = god.nextInt();
        double[] nesort_mas = new double[razm];

        for (int i = 0; i < razm; i++) {
            System.out.println("Введите " + i + " элемент массива");
            // проверка на исключение InputMismatchException
            try
            {
               nesort_mas[i] = god.nextDouble();
            }
            catch (InputMismatchException ex)
            {
                god.nextLine();
                System.out.println("Введите дробное число через \',\'");
                i = i - 1;
            }
        }
        return nesort_mas;
    }

    // сортировка методом пузырька цифр
    private static void sort_mas(double A[])
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }

        for (int x=0; x<A.length-1; x++)
        {
            for (int y=0; y<A.length-1; y++)
            {
                if (A[y]>A[y+1])
                {
                    double S = A [y];
                    A[y] = A[y+1];
                    A[y+1] = S;
                }
            }
        }
        System.out.println();
        for (int k=0; k<A.length; k++)
        {
            System.out.print(A[k]+"   ");
        }

    }
}
