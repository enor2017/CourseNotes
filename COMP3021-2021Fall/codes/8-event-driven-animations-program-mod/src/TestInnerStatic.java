public class TestInnerStatic {
    class Inner {
        static int i;
        static void f() {}
        Inner() { ++i; }
        static {}
    }
}
