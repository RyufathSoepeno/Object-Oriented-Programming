/** Abstraction */

/// Summary: Data abstraction is the process of hiding certain details and showing only essential information to the user.
/// Abstraction can be achieved with either abstract classes or interfaces

/** https://www.instagram.com/p/Cskfp_gI0z0/?igshid=MmJiY2I4NDBkZg== */

// Abstract class
abstract class Animal2 {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pigman extends Animal2 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Pigman myPig = new Pigman(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
