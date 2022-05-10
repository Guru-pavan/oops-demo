package oopsdemo1;
/* Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */

public class Time {
	int days,hrs,min,sec;

	public Time() {
		// TODO Auto-generated constructor stub
	
	days=hrs=min=sec=0;
}

	public Time(int days,int hrs, int min, int sec) {
		this.days=days;
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
void add(Time t)
{
	//Assignment
	this.days+=t.days;
	this.hrs+=t.hrs;
	this.min+=t.min;
	this.sec+=t.sec;
	if(sec>=60)
	{
		min++;
		sec = sec-60;
	}
	if(min>=60)
	{
		hrs++;
		min=min-60;
	}
	if(hrs<=24)
	{
		days++;
		hrs=hrs-24;
	}

	
}
void display()
{
	System.out.println(this.days+":"+this.hrs+":"+this.min+":"+this.sec);
}
}
