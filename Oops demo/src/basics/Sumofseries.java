package basics;

import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args) {
		int i=0,N,sum=0;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Value for N : ");
        N=s.nextInt();
        s.close();
        while(i<=N)
        {
        	sum=sum+i;
        	i+=1;
        }
        System.out.println("sum of the series:"+sum);

	}

}
