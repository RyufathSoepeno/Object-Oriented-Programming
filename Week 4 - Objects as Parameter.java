/* Java Program Example - Java Use Objects as Parameters
 * In Java, Objects may be passed to methods
 */

class Test
{
    int a, b;

    Test(int i, int j)
    {
        a = i;
        b = j;
    }

    /* return true if o is equal to invoking object */
    boolean equalTo(Test o)
    {
        if(o.a == a && o.b == b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class JavaProgram
{
    public static void main(String args[])
    {

        Test obj1 = new Test(100, 22);
        Test obj2 = new Test(100, 22);
        Test obj3 = new Test(-1, -1);

        System.out.println("obj1 == obj2 : " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3 : " + obj1.equalTo(obj3));

    }
}
