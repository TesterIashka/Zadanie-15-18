import java.util.InputMismatchException;
import java.util.Scanner;

public class Itog_2
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

    // сортировка методом прямого выбора
    private static void sort_mas(double A[])
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }

        double min;
        int min_2 =0;
        for (int x=0; x<A.length; x++)
        {
            int samoe_minimal = x;
            for (int i = samoe_minimal + 1; i < A.length; i++)
            {
                if (A[i] < A[samoe_minimal] )//& (i + 1) != A.length)
                 {
                    samoe_minimal = i;}
            }
            double buf = A[samoe_minimal];
            A[samoe_minimal] = A[x];
            A[x] = buf;


        }
        System.out.println();
        for (int k=0; k<A.length; k++)
        {
            System.out.print(A[k]+"   ");
        }

    }
}
