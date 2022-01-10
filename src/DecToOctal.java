import java.util.Scanner;

// convert a decimal to octal representation
// 42 -> 52
// decimal to any other base
// 42/8 = 5, remainder: 2
// 5/8 = 0 remainder: 5

public class DecToOctal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int dec = scanner.nextInt();

        System.out.println(decToOctal(dec));
    }
    public static String decToOctal(int dec)
    {
        // 42
        String octal = "";
        while(dec != 0)
        {
            int remainder = dec % 8; // 2
            dec /= 8;
            octal = remainder + octal; // 5 + "2" = "52"
        }
        return octal;
    }
}
