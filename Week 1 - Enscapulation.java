/** Encapsulation */

/// Summary: Think of them as initializer (set variable to) in scratch, if no value is set
/// there will be no information about the first variable, other words, the game's start would not be interactive

/** 
Keeping data and the methods that work on it bundled together, and controlling who can access it.
Example: Your phone has private settings you can only change through its settings menu—not by poking its chips directly.
*/

/** https://www.instagram.com/p/Cskfp_gI0z0/?igshid=MmJiY2I4NDBkZg== */


class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }
}
