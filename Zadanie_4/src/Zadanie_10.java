import java.util.Scanner;

public class Zadanie_10 {

    public static void main(String args[]) {

        int[][] mas = massiv();   // вызов метода для ввода массива
        System.out.print("Вывод элементов массива первой строки, умноженных на 3:\n");
        umno(mas);
    }

    public static int[][] massiv() {     //Ввод массива
        Scanner milk = new Scanner(System.in);
        System.out.println("Введите количество строк массива R1=: ");
        int dog = milk.nextInt();
        System.out.println("Введите количество столбцов массива R1=: ");
        int dog1 = milk.nextInt();

        int[][] b = new int[dog][dog1];
        for (int i = 0; i < dog; i++)
        {
            for (int j = 0; j < dog1; j++) {
                System.out.print("Введите значение [" + j + "] строки [" + i + "]= \n");
                b[i][j] = milk.nextInt();
            }
        }
        return b;
    }

    private static void umno (int[][] massiv_1)
    {
        for (int i = 0; i < massiv_1[0].length; i++)
        {
            System.out.print("[0][" + i + "] = "+massiv_1 [0][i]*3+"\n");
        }
    }
}
