/*
******Encapsulation******
Encapsulation in Java is a process of wrapping code and data together into a single unit.
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
The Java Bean class is the example of a fully encapsulated class.

*******Advantage of Encapsulation******
1. declare class variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable

*/

class Encapsulate {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String geekName;
	private int geekRoll;
	private int geekAge;

	// get method for age to access
	// private variable geekAge
	public int getAge() { return geekAge; }

	// get method for name to access
	// private variable geekName
	public String getName() { return geekName; }

	// get method for roll to access
	// private variable geekRoll
	public int getRoll() { return geekRoll; }

	// set method for age to access
	// private variable geekage
	public void setAge(int debAge) { geekAge = debAge; }

	// set method for name to access
	// private variable geekName
	public void setName(String newName)
	{
		geekName = newName;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setRoll(int newRoll) { geekRoll = newRoll; }
}

public class Encap{
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);

		// Displaying values of the variables
		System.out.println("Geek's name: " + obj.getName());
		System.out.println("Geek's age: " + obj.getAge());
		System.out.println("Geek's roll: " + obj.getRoll());

		// Direct access of geekRoll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.geekName);
	}
}
