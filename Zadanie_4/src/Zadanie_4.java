import java.util.Scanner;
public class Zadanie_4 {
    public static void main(String args[]) {

        Scanner meow = new Scanner(System.in);
        System.out.print("Vvedite binarnoe chislo: ");
        String cat = meow.nextLine();
        System.out.println(Integer.parseInt(cat,2));
}}
