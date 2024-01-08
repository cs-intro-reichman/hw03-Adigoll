/** String processing exercise 2. */
public class UniqueChars 
{
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) 
    {
        int i;
        String newStr = "";
        for (i = 0; i < s.length(); i++)
        {
            if (newStr.indexOf(s.charAt(i)) == -1)
            {
                newStr = newStr + s.charAt(i); 

            }
            else
            {
                if (s.charAt(i) == ' ')
                {
                    newStr = newStr + s.charAt(i);
                }
            }

        }
        return newStr;
    }
}
