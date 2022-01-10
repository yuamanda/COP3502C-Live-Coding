import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 5
        int [] arr = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt(); // {10, 4, 39, 12, 2}
        }

        sortArray(arr, size);

        for(int item: arr)
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // S          US
    // {10 | 4, 39, 12, 2}
    //  0    1  2   3   4
    // {10   10, 39, 12, 2}
    public static void sortArray(int[] arr, int size)
    {
        for(int i = 1; i < size; i++)
        {
            int value = arr[i]; // 4
            int j = i - 1; // j in index one position before i

            while(j >= 0 && arr[j] > value)
            {
                arr[j + 1] = arr[j];
                j--; // j =-1;
            }
            arr[j + 1] = value;
        }
    }
}
