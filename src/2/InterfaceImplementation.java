public class InterfaceImplementation implements Interface {
    public void method1() {
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
        InterfaceImplementation obj = new InterfaceImplementation();
        obj.method1();
        obj.method2();
    }
}