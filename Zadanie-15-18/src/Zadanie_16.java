import java.io.*;
public class Zadanie_16
{
    public static void main (String agrs[])
    {
        try (FileInputStream text_1 = new FileInputStream("C:\\Windows\\System32\\drivers\\gmreadme.txt"))
        {
            BufferedReader red_for = new BufferedReader(new InputStreamReader(text_1));

            String line;
            while ((line = red_for.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }
    }
}

