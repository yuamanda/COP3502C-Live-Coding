/* input
Lee 18
Lua 21
Mary Beth 19
Stu 33
-1
 */

import java.util.Scanner;

public class NameAgeChecker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // Mary
        int age;

        while(!name.equals("-1"))
        {
            try
            {
                age = scanner.nextInt(); // "Beth"
                System.out.println(name + " " + (age + 1));
            }

            catch(Exception e)
            {
                age = 0;
                scanner.nextLine();
                System.out.println(name + " " + age);
            }
            name = scanner.next();
        }
    }
}
