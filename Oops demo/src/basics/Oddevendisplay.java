package basics;

public class Oddevendisplay {

	public static void main(String[] args) {
		System.out.println("ODD\tEven");
		System.out.println("------\t-----");
		int i=1;
		while(i<=10)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println("\t"+i);
			}
			i=i+1;
		}


	}

}
