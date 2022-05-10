package Assignment;
import java.util.Arrays;
import java.util.List;
public class Palin_pair1 {
		
 Palin_pair1(String str)
	{
		int len = str.length();
		for (int i = 0; i < len/2; i++ )
			if (str.charAt(i) != str.charAt(len-i-1))
				return;
	
		return;
	}
	static boolean checkPalindromePair(List<String> vect)
	{
		for (int i = 0; i< vect.size()-1; i++)
		{
			for (int j = i+1; j< vect.size() ; j++)
			{
				String check_str = "";
	
				check_str = check_str + vect.get(i) + vect.get(j);
				if (isPalindrome(check_str))
					return true;

				check_str = vect.get(j) + vect.get(i);
	
			
				if (isPalindrome(check_str))
					return true;
			}
		}
		return false;
	}
	private static boolean isPalindrome(String check_str) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String args[])
	{
		List<String> vect = Arrays.asList("geekf", "geeks", "or",
								"keeg", "abc", "bc");
	
	
		int c = 1 ;
		if (checkPalindromePair(vect) == true)
		c++;	System.out.println(+c);
	}
}