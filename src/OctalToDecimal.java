import java.util.Scanner;

public class OctalToDecimal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.next();

        System.out.println(octalStringDecode(octal));
    }

    // index 012
    // octal"052" -> 42
    // lab 4: "0x1A" -> 26
    public static long octalStringDecode(String octal)
    {
        // input: 521
        if(octal.charAt(0) == '0')
        {
            octal = octal.substring(1); // "521"
        }

        //  0   1   2 index for string i + ? = octal.length()-1 => ? = octal.length-1 - i
        // "5   2   1"
        //  8^2 8^1 8^0  5 * 8^2 + 2 * 8^1 + 1 * 8^0  number system index
        long dec = 0;
        for(int i = 0; i < octal.length(); i++)
        {
            // i = 0, exponent = octal.length()-1 - i = (3 - 1) - i = 2 - 0 = 2
            dec += (octal.charAt(i) - 48) * Math.pow(8, (octal.length()-1 - i)); // '5' -> 53 '0' -> 48 => 53 - 48 = 5
        }
        return dec;
    }
}
