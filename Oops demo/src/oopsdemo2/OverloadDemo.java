package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		Addition a1=new Addition();
				//invoking add() Over load method
		a1.add();
		a1.add(20,30);
		a1.add(34.52f,546.78f);
		a1.add(300,100,200);
		a1.add("Hello","World");

	}

}
