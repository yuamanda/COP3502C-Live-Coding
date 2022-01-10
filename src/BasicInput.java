import java.util.Scanner;

public class BasicInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        int userInt = scanner.nextInt(); // 99
        System.out.println("Enter double:");
        double userDouble = scanner.nextDouble(); // 3.77
        System.out.println("Enter character:");
        char userChar = scanner.next().charAt(0); // z
        System.out.println("Enter string:");
        String userString = scanner.next(); // Howdy

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        int userDoubleToInt = (int)userDouble; // 3.77 -> 3
        System.out.println(userDouble + " cast to an integer is " + userDoubleToInt);
    }
}
