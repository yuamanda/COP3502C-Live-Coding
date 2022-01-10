import java.util.Scanner;

public class RemoveGray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        int redNum = scanner.nextInt(); // 130
        int greenNum = scanner.nextInt(); //50
        int blueNum = scanner.nextInt(); // 30

        // input: 130 50 30
        int minNum = redNum; // keep track of the smallest element e.g. 130

        if(greenNum <= minNum) // 50 <= 130, minNum = 50
        {
            minNum = greenNum;
        }
        if(blueNum <= minNum) // 30 <= 50 update minNum = 30
        {
            minNum = blueNum;
        }

        redNum -= minNum; // redNum = redNum - minNum
        greenNum -= minNum;
        blueNum -= minNum;

        System.out.println(redNum + " " + greenNum + " " + blueNum);
    }
}
