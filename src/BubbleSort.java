import java.util.Scanner;

public class BubbleSort
{
    // size: 5 elements in the array: 10 4 39 12 2
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

    // 10 4 39 12 2
    // 1st pass: 4 10 12 2 39
    // bubble sort on the arr
    public static void sortArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    //switch
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
