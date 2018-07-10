class Animal {
void walk(){
System.out.println("I am walking");
}
}

class Bird extends Animal {
void fly() {
System.out.println("I am flying");
}

// Implementing singing
void sing() {
System.out.println("I am singing");
}

//
void say(String words) {
System.out.println(words);
}
}

public class Solution {
public static void main(String[] args) {
Bird duck = new Bird();
Bird chicken = new Bird();
Bird bird = new Bird();
bird.walk();
bird.fly();
bird.sing();
duck.say("Quack, quack");
chicken.say("Cluck, cluck");
}
}