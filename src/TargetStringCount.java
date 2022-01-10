import java.util.Scanner;

public class TargetStringCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String target = scanner.next();

        int res = targetStringCount(s, target);
        System.out.println(res);
    }

    // s: catcowcat -> atcowcat -> tcowcat -> cowcat -> owcat -> wcat -> cat -> at
    // target: cat
    public static int targetStringCount(String s, String target)
    {
        // 1. base case
        if(target.length() > s.length())
        {
            return 0;
        }

        // 2. recurrence relation
        if(s.substring(0, target.length()).equals(target))
        {
            return 1 + targetStringCount(s.substring(1), target);
        }
        return targetStringCount(s.substring(1), target);
    }
}
