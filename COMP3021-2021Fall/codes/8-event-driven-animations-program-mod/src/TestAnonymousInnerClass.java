public class TestAnonymousInnerClass {
    private int j=99;

  public static void main(String[] args) {
    var x = new TestAnonymousInnerClass().factoryMethod();
    System.out.println("The factory method has ended.");
    x.f(); // 3.1
  }

  SuperClass factoryMethod() {
    int i = 1;  // local variable

    var o = new SuperClass(i) { // anonymous inner class call overloaded superclass constructor
//  static // 2: May we have static fields in anonymous inner class? don't recommend
      int k;
      void f() { System.out.println("Executing the f method: "+ i + j); } // 0: access outer class and local vars
//      { k=1; System.out.println("Anonymous class instance initializer" + k); } // 1: Is instance initializer block allowed?
    };

//    o.f();
//    i++; // 3.1: local var used in anonymous innerclass method cannot be modified; effectively final
//      var m = new Cloneable() {} [10]; // 4: define an anonymous inner class that implements Cloneable and creates array?
      return o;
  }
}

abstract class SuperClass {
  SuperClass(int x) {
    System.out.println("Execute superclass constructor " + x);
  }
  void f() {}
}
