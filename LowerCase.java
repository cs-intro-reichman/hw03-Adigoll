/** String processing exercise 1. */
public class LowerCase 
{
    	public static void main(String[] args) 
	{  
        	String str = args[0];
        	System.out.println(lowerCase(str));
    	}

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    	public static String lowerCase(String s) 
	{
		String newStr = "";
		char ch;
		int charAsc;
		int i;
		for (i = 0; i < s.length(); i++)
		{
			charAsc = s.charAt(i);
			if (charAsc >= 65 && charAsc <= 90)
			{
				charAsc = charAsc + 32;
				ch = (char)(charAsc);
				newStr = newStr + ch;
			}
			else
			{
				ch = (char)(s.charAt(i));
				newStr = newStr + ch;
			}
		}
		return newStr;
    }
}
