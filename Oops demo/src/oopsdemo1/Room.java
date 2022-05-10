package oopsdemo1;

public class Room {
	int RoomNo;
	String RoomType;
	float RoomArea;
	boolean ACmachine;


void setData(int RoomNo,String RoomType,float RoomArea,boolean ACmachine)
{
	this.RoomNo=RoomNo;
	this.RoomType=RoomType;
	this.RoomArea=RoomArea;
	this.ACmachine=ACmachine;
}
void displayData()
{
	System.out.println("The Room Number is:"+RoomNo);
	System.out.println("The Room Type is:"+RoomType);
	System.out.println("The ROom Area is:"+RoomArea);
	String s=(ACmachine)?"yes":"no";
	System.out.println("IS there AC in the room:"+s);
}

	// TODO Auto-generated method stub
	

}

