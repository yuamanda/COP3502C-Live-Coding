import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] reverse = new int[size];

        for(int i = 0; i < size; i++)
        {
            reverse[i] = scan.nextInt();
        }

        for (int i = 0; i < reverse.length / 2; i++)
        {
            int tmp = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = tmp;
        }

        for(int i = 0; i < size; i++)
        {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
    }
}
