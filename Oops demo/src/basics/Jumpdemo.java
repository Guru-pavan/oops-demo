package basics;
/*
 * Programm to demonstrate jump statements-break&continue
 */

public class Jumpdemo {

	public static void main(String[] args) {
		int i,j;

        System.out.println("********** Break Demo ***********");

        for(i=1;i<=10;i++)
        {
        	if(i==6)
        	{
        		break;
        	}
//for(j=1;j<=10;j++)
//        	{
  //      		if(j==6)
        //	{
       // 		continue      /skip the current Iteration
       // 	}
    //    	}

            System.out.println(i+" Pavan");
        }
		

	}
}


