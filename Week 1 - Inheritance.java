/** Inheritance */

/// Summary: Think of them as tree diagrams, which can EXTEND [Ignore the protected part]

/** 
Passing down traits or abilities from one thing to another.
Example: A child inherits eye color from parents; in programming, a “Car” class can pass its features to a “SportsCar” class
*/

/** https://www.instagram.com/p/Cskfp_gI0z0/?igshid=MmJiY2I4NDBkZg== */

class Vehicle1 {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle1 {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
