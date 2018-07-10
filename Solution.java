

interface action{  
 void say(String sound);  
 void walk();
} 

interface waterbird{  
	 void swim();  
	} 

interface landbird{  
	 void swim();  
	} 

class Bird  implements action {
void fly() {
System.out.println("I am flying");
}
void sing() {
System.out.println("I am singing");
}

@Override
public void walk(){
System.out.println("I am walking");
}

@Override
public void say(String sound) {

	System.out.println(sound);
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
}
}