import java.io.*;

public class Zadanie_18
{
    public static void main (String agrs[]) throws IOException
    {
        FileReader rock = new FileReader("C:\\Users\\user\\Desktop\\New.txt");
        BufferedReader rock_1 = new BufferedReader(rock);

            int i = 0;
            int j = 0;

            String magog;
            while ((magog = rock_1.readLine()) !=null)
            {
                i++;
                System.out.println(magog);
            }
       System.out.println("Количество строк в файле для перезаписи = "+i);

       FileWriter rockstar_1 = new FileWriter("C:\\Users\\user\\Desktop\\New.txt");
       BufferedWriter stop = new BufferedWriter(rockstar_1);
       BufferedReader crot = new BufferedReader(new InputStreamReader(System.in));

       while (j != i)
            {
                System.out.println("Введите "+(j+1)+" строку в файл");
                String poker = crot.readLine();
                stop.write(poker+"\r\n");
                j++;
            }

       rock_1.close();
       crot.close();
       stop.close();
        }
    }



