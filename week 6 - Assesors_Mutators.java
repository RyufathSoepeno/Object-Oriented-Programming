public class Assesors_Mutators {
    public static void main(String[] args) {
        class Employee {
            private int number;
            public int getNumber() /** assesor */{
                return number;
            }
            public void setNumber(int newNumber) /** Mutator */ {
                number = newNumber;
            }
        }
    }

}
