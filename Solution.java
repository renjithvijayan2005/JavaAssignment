
// All Animal walk
interface Animal {
	void walk();
}

// For All Animals who can Swim
interface  swimmer
{
	void swim();
}
//For All Birds who can Fly
interface  flyingBirds
{
	void fly();
}

class Bird implements Animal {
// Implementing Walking
	public void walk(){
		System.out.println("I am walking");
		}
// Implementing singing
public void sing() {
System.out.println("I am singing");
}
//Implementing making sounds
void say(String words) {
System.out.println(words);
}
}
class Duck extends Bird implements swimmer,flyingBirds
{
	// ducks Swim and fly
	public void swim() {
		System.out.println("I am Swimming");
		}

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}
}

// Rooster is a chicken hence below implementation.
class Chicken extends Bird{
	
	
	void say(String gender) {
		if(gender.equalsIgnoreCase("Male")){
		System.out.println("Cock-a-doodle-doo");
		}else 
		{
			System.out.println("Cluck, cluck");
		}
		}
	
}

// parrot implementation

class Parrot extends Bird implements flyingBirds
{

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}
}

// Fish

class Fish implements swimmer
{
	String Size="";
	String color="";
	String behaviour="";
	Fish(String Siz, String colr, String behavr)
	{
		 Size=Siz;
		 color=colr;
		 behaviour=behavr;
	}

	@Override
	public void swim() {
		System.out.println("I am Swimming");	
		
	}
	}


// Finally the main class.
public class Solution {
public static void main(String[] args) {
Bird duck = new Bird();
Bird chicken = new Bird();
Bird bird = new Bird();
bird.walk();
bird.sing();

// Brids Sound..
duck.say("Quack, quack");
chicken.say("Cluck, cluck");

// Ducks swim and fly
Duck d1=new Duck();
d1.swim();
d1.fly();

// Roosters belongs here.
Chicken rooster=new Chicken();
rooster.say("Male");

Parrot p1= new Parrot();
p1.say("Woof, woof");
Parrot p2= new Parrot();
p2.say("Meow");
Parrot p3= new Parrot();
p3.say("Cock-a-doodle-doo");


// Fish Implementation
Fish Shark=new Fish ("Large","Grey","Eat other fish");
Fish Clownfish=new Fish ("Small","Orange","Make Jokes");

}



}