/**
 *  Just for fun
 * 
 */
// Using super to overcome name hiding.
class A3 {
  int i;
}

// Create a subclass by extending class A3.
class B3 extends A3 {
  int i; // this i hides the i in A3

  B3(int a, int b) {
    super.i = a; // i in A3
    i = b; // i in B3
  }

  void show() {
    System.out.println("i in superclass: " + super.i);
    System.out.println("i in subclass: " + i);
  }
}

class UseSuper {
  public static void main(String args[]) {
    B3 subOb = new B3(1, 2);

    subOb.show();
  }
}