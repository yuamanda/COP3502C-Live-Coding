import java.util.Scanner;

public class ArmStrongNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // a = 500, b = 10,000 => 500, 501, 502, 503,...,10,000

        for(int i = a; i <= b; i++)
        {
            // find the number of digits in i
            // e.g. 500/10 = 50/10 = 5/10 = 0
            int temp = i, numOfDigits = 0;

            while(temp != 0)
            {
                temp /= 10; // temp = temp / 10;
                numOfDigits++;
            }
            // 501 -> 5^numOfDigits + 0^numOfDigits + 1^numOfDigits
            // 501%10 = 1, 501/10 = 50 => 50%10 = 0, 50/10 = 5 => 5%10 = 5, 5/10 = 0
            int num = i;
            int sum = 0;

            while(num != 0)
            {
                int lastDigit = num % 10;
                sum += Math.pow(lastDigit, numOfDigits);
                num /= 10;
            }
            if(sum == i)
            {
                System.out.println(i);
            }
        }
    }
}
