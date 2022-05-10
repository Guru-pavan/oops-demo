package basics;

import java.util.Scanner;

/*
 * Programm to count no of vowels in a string-a,e,i,o,u;
 */
public class Countvowels {

	public static void main(String[] args) {
		//String s="java is fun";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s= scan.nextLine();
		scan.close();
        int count=0;
System.out.println("Enter the length of the string is: "+s.length());
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' ||
                    s.charAt(i) =='o' || s.charAt(i) =='u')
            {
                count+=1;
                System.out.println("Vowel found : "+s.charAt(i));
            }

        }
        System.out.println("Total no. of vowels in string :"+count);
	}

}
