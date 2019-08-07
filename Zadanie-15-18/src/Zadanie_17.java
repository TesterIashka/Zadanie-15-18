import java.io.*;

public class Zadanie_17
{
    public static void main (String agrs[]) throws IOException
    {
        BufferedReader rock = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Для прекращения ввода данных в текстовый файл необходимо ввести \"стоп\"");
        try (FileWriter rockstar = new FileWriter("Rock_U"))
        {

        while (true)
        {
            String poker = rock.readLine();
            if(poker.equals("стоп")){
                rockstar.write(poker);
                break;
            }
            else {
                rockstar.write(poker +"\r\n");
            }
        }
      rock.close();
    }
    }

}
