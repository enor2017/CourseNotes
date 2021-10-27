public class Outer {
  int x = 0;
  
  public Outer() { x++; }  
  
  public void mutate() { x++; }
  
  public class Inner {
    public int get() { return x; }
  }
  
  public static void main(String[] args) {
    Outer o = new Outer();
    
    Outer.Inner i1 = o.new Inner();
    System.out.println(i1.get());
    o.mutate();
    
    Outer.Inner i2 = o.new Inner();
    System.out.println(i2.get());
    System.out.println(i1.get());
  }
}