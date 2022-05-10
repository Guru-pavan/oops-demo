package oopsdemo1;

public class RoomTest {

	public static void main(String[] args) {
			Room room1=new Room();
			room1.setData(101, "two bedroom", 1500, true);

			room1.displayData();
			Room r2=new Room();
			r2.setData(109, "Triple bed room", 2000, false);
			r2.displayData();
			Room r3=new Room();
			r3.setData(116, "Duplex",3000, true);
			r3.displayData();
			Room r4=new Room();
			r4.setData(191, "Four bed Room", 8000, true);
			}

			
	}


