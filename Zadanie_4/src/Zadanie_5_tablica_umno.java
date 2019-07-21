import java.util.Scanner;

public class Zadanie_5_tablica_umno {

    public static void main(String args[]) {
        Scanner meow = new Scanner(System.in);
        System.out.print("Введите число для показа таблицы умножения в диапазоне от 1 до 10: ");
        int cat = meow.nextInt();

       System.out.print(cat+"*1="+cat+"; "+cat+"*2="+cat*2+"; "+cat+"*3="+cat*3+"; "+cat+"*4="+cat*4+"; "+cat+"*5="+cat*5+"; "
               +cat+"*6="+cat*6+"; "+cat+"*7="+cat*7+"; "+cat+"*8="+cat*8+"; "+cat+"*9="+cat*9+"; "+cat+"*10="+cat*10+"; ");
    }

}
