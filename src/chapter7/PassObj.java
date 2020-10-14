package chapter7;

public class PassObj {
    public static void main(String[] args) {
        Test obj1 = new Test(1, 2);
        Test obj2 = new Test(1, 2);
        System.out.println(obj1.equalTo(obj2));
    }
}

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }

    void meth(Test obj) {
        obj.a *= 2;
        obj.b /= 2;
    }

    boolean equalTo(Test obj) {
        if ((obj.a == this.a) && (obj.b == this.b)) return true;
        else return false;
    }
}
