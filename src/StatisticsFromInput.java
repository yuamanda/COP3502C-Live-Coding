import java.util.Scanner;

public class StatisticsFromInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // input: 15 20 0 5 -1
        int value = scanner.nextInt(); // 15
        int maxValue = 0, sum = 0, count = 0;

        // find average
        while(value >= 0)
        {
            // find max
            if(value > maxValue)
            {
                maxValue = value; // maxValue = 20
            }

            //sum up all the value
            sum += value; // sum = sum + value = 15 + 20 = 35
            count++; // 2
            value = scanner.nextInt(); // value = 0
        }

        int average = sum / count;
        System.out.println(maxValue + " " + average);
    }
}
