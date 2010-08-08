/**
 *  Just for fun
 * 
 */
// Demonstrate instanceof operator.
class A10 {
  int i, j;
}

class B10 {
  int i, j;
}

class C10 extends A10 {
  int k;
}

class D10 extends A10 {
  int k;
}

class InstanceOf {
  public static void main(String args[]) {
    A10 a = new A10();
    B10 b = new B10();
    C10 c = new C10();
    D10 d = new D10();

    if(a instanceof A10)
      System.out.println("a is instance of A");
    if(b instanceof B10)
      System.out.println("b is instance of B");
    if(c instanceof C10)
      System.out.println("c is instance of C");
    if(c instanceof A10)
      System.out.println("c can be cast to A");

    if(a instanceof C10)
      System.out.println("a can be cast to C");

    System.out.println();

    // compare types of derived types
    A10 ob;

    ob = d; // A reference to d
    System.out.println("ob now refers to d");
    if(ob instanceof D10)
      System.out.println("ob is instance of D");

    System.out.println();

    ob = c; // A reference to c
    System.out.println("ob now refers to c");

    if(ob instanceof D10)
      System.out.println("ob can be cast to D");
    else
      System.out.println("ob cannot be cast to D");

    if(ob instanceof A10)
      System.out.println("ob can be cast to A");

    System.out.println();

    // all objects can be cast to Object
    if(a instanceof Object)
      System.out.println("a may be cast to Object");
    if(b instanceof Object)
      System.out.println("b may be cast to Object");
    if(c instanceof Object)
      System.out.println("c may be cast to Object");
    if(d instanceof Object)
      System.out.println("d may be cast to Object");
  }
}
