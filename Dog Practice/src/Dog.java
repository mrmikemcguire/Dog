
//import java.util.ArrayList;
import java.util.ArrayList;
import static java.lang.System.*;

public class Dog
{
	private int age;
	private String name;
	
	public Dog( String n, int a )
	{
		age = a;
		name = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Dog - " + name + " " + age;
	}
}
