package chapter7;
//Аргументы примитивных типов передаются по значению
public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test(1,3);
        int a = 15;
        int b = 20;
        System.out.println("До вызова" + "a = " + a + " b = " + b);
        test.meth(a,b);
        System.out.println("После вызова" + "a = " + a + " b = " + b);
    }
}

