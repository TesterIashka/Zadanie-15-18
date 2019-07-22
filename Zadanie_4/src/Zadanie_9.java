import java.util.Scanner;

public class Zadanie_9 {


    public static void main(String args[]) {

        int[] mas = massiv();   // вызов метода для ввода массива
        System.out.print("Вывод элементов массива, умноженного на 2:\n");
        umno(mas);
        }

       public static int[] massiv() {     //Ввод массива
           Scanner milk = new Scanner(System.in);
           System.out.println("Введите размер массива R=: ");
           int dog = milk.nextInt();
           int[] b = new int[dog];
           for (int i = 0; i < dog; i++) {
               System.out.print("Введите первое значение массива [" + i + "] = \n");
               b[i] = milk.nextInt();
           }
           return b;
       }

       private static void umno (int[] massiv_1)
        {


           for (int i = 0; i < massiv_1.length; i++)
           {
               System.out.print("[" + i + "] = "+massiv_1 [i]*2+"\n");
           }
       }


}
