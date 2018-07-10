interface Animal {
	void walk();
	void sing();

}

interface  WaterBirds
{
	void swim();
}
interface  flyingBirds
{
	void fly();
}
class Bird implements Animal {
	public void walk(){
		System.out.println("I am walking");
		}
// Implementing singing
public void sing() {
System.out.println("I am singing");
}

//
void say(String words) {
System.out.println(words);
}
}

class Duck extends Bird implements WaterBirds,flyingBirds
{
	public void swim() {
		System.out.println("I am Swimming");
		}

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}
}

public class Solution {
public static void main(String[] args) {
Bird duck = new Bird();
Bird chicken = new Bird();
Bird bird = new Bird();
bird.walk();
bird.sing();
duck.say("Quack, quack");
chicken.say("Cluck, cluck");

Duck d1=new Duck();
d1.swim();
d1.fly();
}
}