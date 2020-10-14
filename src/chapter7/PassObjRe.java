package chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test obj = new Test(14,20);
        System.out.println("obj.a и obj.b до вызова: " +
                            obj.a + " " + obj.b);
        obj.meth(obj);
        System.out.println("obj.a и obj.b после вызова: " +
                obj.a + " " + obj.b);
    }
}
