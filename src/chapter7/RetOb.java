package chapter7;

class TestClass{
    int a;
    TestClass(int a){
        this.a = a;
    }
    TestClass incrbyTen(){
        TestClass temp = new TestClass( a + 10);
        return temp;
    }
}
public class RetOb {
    public static void main(String[] args) {
        TestClass testOne = new TestClass(5);
        System.out.println("Object testOne a = " + testOne.a);
        TestClass testTwo;
        testTwo = testOne.incrbyTen();
        System.out.println("Object testOne a = " + testTwo.a);
        //Второе увеличение
        testTwo = testTwo.incrbyTen();
        System.out.println("Object testOne a = " + testTwo.a);
    }
}
