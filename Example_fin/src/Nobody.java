/**
 *  Just for fun
 * 
 */
public class Nobody {
    public static void main(String args[])  {
        int i, j;

        i = 100;
        j = 200;

        //  find midpoit between i and j
        while(++i < --j)  ;  //  no body in this loop

        System.out.println("Midpoint is " + i);
    }
}
