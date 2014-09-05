import java.util.ArrayList;

public class DoggiesRunner
	{
	public static Dog findOldest( ArrayList<Dog> kennel )
		{
		Dog oldestDog = null;
		int max = 0;
		for(Dog d : kennel)
			{
			if(max < d.getAge())
				{
				max = d.getAge();
				oldestDog = d;
				}
			}
		return oldestDog;		
		}
	
	public static void main(String args[])
		{
		ArrayList<Dog> kennel = new ArrayList<Dog>();
		
		kennel.add( new Dog( "Fred", 7) );
		kennel.add( new Dog( "Ann", 9) );
		kennel.add( new Dog( "Sundae", 1) );
		kennel.add( new Dog( "Ficus", 10) );

		System.out.println(kennel);
		System.out.println("The oldest dog: " + findOldest( kennel));
		}
	}