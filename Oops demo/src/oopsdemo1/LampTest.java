package oopsdemo1;
class Lamp
{
	// stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;

    //method to turn On the light
    void turnOn()
    {
        isOn=true;
        System.out.println("Light On? "+isOn);
    }

  //method to turn Off the light
    void turnOff()
    {
        isOn=false;
        System.out.println("Light On? "+isOn);
    }
}

public class LampTest {

	public static void main(String[] args) {
		//Create object red & halogen
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		//Switch on led & Halogen
		led.turnOn();
		halogen.turnOn();
		//Switch off led & halogen
		led.turnOff();
		halogen.turnOff();
		

	}

}
