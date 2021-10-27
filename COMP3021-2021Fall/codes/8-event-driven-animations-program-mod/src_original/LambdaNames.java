/*public class LambdaNames {
  public static void main(String[] args) {
    myName( new Names() {
      @Override
      public void sayName(String n) {
        System.out.println("My name is " + n);
      }
    }, "Alex");
  }
  public static void myName(Names nameInstance, String name) {
    nameInstance.sayName(name);
  }
}*/

public class LambdaNames {
  public static void main(String[] args) {
    // The lambda expression creates an object that implements
    // the abstract method. Java infers the argument types and return types
    myName(n -> System.out.println("My name is " + n), "John");

    Names x = n -> System.out.println("Your name is " + n);  // 1
    myName(x, "Mary"); // 1

    ((Names) n -> System.out.println("My sister's name is " + n)).sayName("Susan"); // 2

/*    myName(new Names() {  // functionally equivalent anonymous inner class implementation
      @Override
      public void sayName(String n) {
        System.out.println("My name is " + n);
      }
    }, "John");*/

  }
  public static void myName(Names nameInstance, String name) {
    nameInstance.sayName(name);
  }
}

interface Names { void sayName(String name); }
// 2: May lambda implements a method in an abstract class?
//abstract class Names { public abstract void sayName(String name); }
