/** The this keyword refers to the current object in a method or constructor. 
The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name */

public class This {
  int x;

  // Constructor with a parameter
  public This(int x) {
    this.x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    This myObj = new This(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
