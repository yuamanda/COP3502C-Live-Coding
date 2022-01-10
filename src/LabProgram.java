import java.util.InputMismatchException;
import java.util.Scanner;

public class LabProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            int userNum = scanner.nextInt(); // 15.5, cause exception
            int divNum = scanner.nextInt();
            // division cause problem if denominator is 0
            int result = userNum / divNum;
            System.out.println(result);
        }

        catch(ArithmeticException e) // int x
        {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch(InputMismatchException e) // int x
        {
            System.out.println("Input Mismatch Exception: " + e.toString());
        }
    }
}
