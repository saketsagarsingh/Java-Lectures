public class AccessModifiers {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.a + " " + b);  // 10,20
        obj1.a  = 30;
        obj1.b = 40;
        System.out.println(obj1.a + " " + b); // 30,40

        AccessModifiers obj2 = new AccessModifiers();
        System.out.println(obj2.a + " " + b); // 10,40

    }
}
