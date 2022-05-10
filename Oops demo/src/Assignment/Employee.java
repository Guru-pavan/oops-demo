package Assignment;

public class Employee {
String name;
int yearofjoining;
double  salary;
String address;
public Employee(String name, int yearofjoining, double salary, String address) {
	this.name = name;
	this.yearofjoining = yearofjoining;
	this.salary = salary;
	this.address = address;
}
void details()
{
	System.out.println("NAME\t"+"YEAROFJOINING\t"+"salary\t"+"address\t");
}
void display()
{

	System.out.println(name+"\t"+yearofjoining+"\t\t"+salary+"\t"+address );

}
}
