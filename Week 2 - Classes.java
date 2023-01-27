public class TheClass {
    int a = 5;
    //Code below is how to declare classes and objects
    public static void main(String[] args) {
        // The Format --> Class_Name Object_Name = new Class_Name
        // "New" creates a new instance for the class, it is a reference type variable
        TheClass MyObj = new TheClass();
        System.out.println(MyObj.a);

        /** Or Alternatively continuation */

        Puppy myPuppy = new Puppy( "Louie the Cat Dog" );
    }
}
    /** Or Alternatively*/

    /// Public can only be used when the file is named with .java in Intellij, else, just don't include public when you copy them
class Puppy {
        public Puppy(String name) {
            // To use Public --> Public Class_Name(Parameter_Type Parameter Name)

            // This constructor has one parameter, name.
            System.out.println("Passed Name is :" + name);
        }
    }
