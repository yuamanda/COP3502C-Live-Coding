import java.util.Scanner;

public class LongestSequence
{
    public static void main(String[] args)
    {
        // "8 4 15 9 I 30 2 I 20"
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // read 8 as the length of the array
        String[] items = new String[size];

        for(int i = 0; i < size; i++)
        {
            items[i] = scanner.next();
        }
        // items: {"4", "15", "9", "I", "30", "2", "I", "20"}
        int currentLength = 0;
        int longestLength = 0;

        // encodeRle(byte[] flatData) {15, 15, 3, 3, 3, 3} count is initialized at 1
        // when flatData[i] == flatData[i + 1], increment count by 1
        // when flatData[i] != flatData[i + 1]
            // update: store the info of old run in res array
                // res[index] = count, increment count by 1
                // res[index] = flatData[len - 1], increment index by 1
            // reset: reset the count to 1
        // outside of the for loop, record information for the last group
        // count
        for(int i = 0;  i < size; i++)
        {
            // visit "I"
            if(items[i].equals("I"))
            {
                // update the longestLength
                if(currentLength > longestLength)
                {
                    longestLength = currentLength;
                }
                //reset the currentLength
                currentLength = 0;
            }
            // visit other inputs
            else
            {
                currentLength++;
            }
        }
        if(currentLength > longestLength)
        {
            longestLength = currentLength;
        }
        System.out.println(longestLength);
    }
}
