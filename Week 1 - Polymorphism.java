/** Polymorphism */

/// Summary: Poly (many) morph (forms), which means  a feature that allows one interface to be used for a general class of actions

/** https://www.instagram.com/p/Cskfp_gI0z0/?igshid=MmJiY2I4NDBkZg== */

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}


/* ======================================================================================================== */

public class Compile_Time {
    // First addition function
    public static int add(int a, int b)
    {
        return a + b;
    }

    // Second addition function
    public static double add(
            double a, double b)
    {
        return a + b;
    }

    // Driver code
    public static void main(String args[])
    {
        // Here, the first addition
        // function is called
        System.out.println(add(2, 3));

        // Here, the second addition
        // function is called
        System.out.println(add(2.0, 3.0));
    }
}

/* ======================================================================================================== */

class Test {

    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}

public class Run_Time extends Test {
    // Overriding the parent method
    public void method()
    {
        System.out.println("Method 2");
    }

    // Driver code
    public static void main(String args[])
    {
        Test test = new Run_Time();

        test.method();
    }
}
