package oopsdemo1;
class Language
{
	private String s;
	private int version;
	Language()//IMPLICIT constructor
	{
		System.out.println("Iam a Implicit Constructor");//No Args constructor
		s="Python";
		System.out.println("Hello from:"+s);
	}
	Language(String lang)//PARAMETERIZED CONSTRUCTORS
	{
		System.out.println("Iam a Explicit Constructor");
		this.s=lang;
		System.out.println("Hello from:" +s);
	}
	Language(String lang,int ver)//Parameterized constructor with two arguments
	{
		System.out.println("Iam a parameterized constructor with 2 arguments");
		this.s=lang;
		this.version=ver;
		System.out.println("HEllo from: "+s+"v."+version);
	}
	
}
public class LanguagesDemo {

	public static void main(String[] args) {
		Language l1=new Language();//AUtomatically invokes implicit Constructor
        Language l2=new Language("RUBY");//Automatically invokes parameterized constructor
        Language l3=new Language("SCALA");
        Language l4=new Language();
        Language l5=new Language("java",2);//Automatically invokes 2Args parameterized constructor
	}
}


