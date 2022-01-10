import java.util.Scanner;

public class Acronyms
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // userPhase: "Institute of Electrical and Electronics Engineers"

        System.out.println(createAcronym(input));
    }

    // index 01234
    //       Hello, "Hello".length() = 5
    //      "Institute of Electrical and Electronics Engineers"
    public static String createAcronym(String userPhase)
    {
        String acronym = "";
        for(int i = 0; i < userPhase.length() - 1; i++)
        {
            if(i == 0) // special case, for all the other cases, the first letter of the word is after an empty space
            {
                if(Character.isUpperCase(userPhase.charAt(i))); // "I"
                {
                    acronym += userPhase.charAt(i);
                }
            }
            if(userPhase.charAt(i) == ' ' && i != userPhase.length() - 1) // common case: the first letter of all the other words is after ' '
            {
                if(Character.isUpperCase(userPhase.charAt(i + 1))) // locate the empty space and find the very next character after it
                {
                    acronym += userPhase.charAt(i + 1);
                }
            }
        }
        return acronym;
    }
}
