/**
 *  Just for fun
 * 
 */
class OverloadDemo2 {
    void test()  {
        System.out.println("No parameters");
    }

    void test(int a, int b)  {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a)  {
        System.out.println("double a: " + a);
        return a*a;
    }
}
public class Overload2 {
    public static void main(String args[])  {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);  //  this will invoke test(double)
        ob.test(123.2);  //  this will invoke test(double)
    }
}
