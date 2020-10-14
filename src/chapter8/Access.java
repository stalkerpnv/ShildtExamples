package chapter8;

class A {
    int i;
    private int j;

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int sum;

    int sum() {
        return (i); // (i+j) error
    }
}

public class Access {
    public static void main(String[] args) {
        A a = new A();
        a.setIJ(10,20);
        B b = new B();
        b.sum();
    }
}
