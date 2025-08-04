
abstract class Animal {

    abstract void makeSound();// Abstract method (does not have a body)

   void breathe() // concrete (Regular)(has method body)
    {
        System.out.println("This animal is breathing.");
    }
}

// Dog inherits from Animal and implements makeSound()
class Dog extends Animal {
    void makeSound() // overriding abstract method here
    {
        System.out.println("Dog says: Woof Woof!");
    }
    
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog(); // upcasting

        d.makeSound();
        d.breathe();

    }
}
 
// keypoints experimented
//static and final methods cannot be overridden