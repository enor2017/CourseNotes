// ShowInnerClass.java
public class ShowInnerClass {
  private int data = 3021; // 3: shared by InnerClass instances created under the same ShowInnerClass instance
  private void n() {
    System.out.println("n is executed and data = " + data);
  }
  public void m(InnerClass x) { /** A method in the outer class */  // 5.1
    InnerClass instance = new InnerClass(); // 5: Innerclass as type
    instance.mi();
    var i = instance.j; // 1: bidirectional access of private members
  }
  // 2: An inner class (a.k.a. instance class whose access needs to be made through an instance)
  class InnerClass {
      static int i = 0;  // 4: static members
      private int j;
      InnerClass () { data++;} // 1: Directly reference private data defined in its outer class
      public void mi() { /** A method in the inner class */
         n();  // 1: Directly reference private method defined in its outer class
    }
//    class InnerInner { // 6 Inner class inside an inner class
//    }
  }
//  static class StaticNestedClass {static int i;} // 7: static nested class
  interface NestedInterface { static void f() {} } // 6: interfaces are implicitly static

  public static void main(String[] args) {
     var s = new ShowInnerClass();
//     var a = s.new InnerClass(); // 2
//     var b = s.new InnerClass(); // 2
//     var c = new ShowInnerClass().InnerClass(); // 2
//     new ShowInnerClass().new InnerClass().mi(); // 2: use inner class to call methods directly
//     a.mi(); // 3
//     b.mi(); // 3
//     c.mi(); // 3
//     ShowInnerClass.InnerClass.i = 1; // 4: access static members in an inner class
//     ShowInnerClass.InnerClass w = null; // 5.2 Inner class as a type
//     ShowInnerClass.NestedInterface v = null; // 6
//      ShowInnerClass.NestedInterface.f(); // 6
//     new ShowInnerClass.StaticNestedClass(); // 7  create an instance from static nested class
//     ShowInnerClass.StaticNestedClass x = null; // 7.1: use static nested class as a type
  }
}