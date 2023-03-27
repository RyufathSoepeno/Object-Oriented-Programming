public class Fool {
    int x = 0; // Instance
    int y = 0; // Instance
    void p() {
        int x = 1; // Local
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
class TestFoo1 {
    public static void main(String[] args) {
        Fool myObj1 = new Fool();
        System.out.println(myObj1.x);
    }
}
