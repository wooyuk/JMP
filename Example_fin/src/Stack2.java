/**
 *  Just for fun
 * 
 */
class Stack2 {
    private int stck[] = new int[10];
    private int tos;

    Stack2()  {
        tos = -1;
    }
    void push(int item)  {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    int pop()  {
        if(tos < 0)  {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
