package chapter8;

class ClassA {
    int i, j;

    void showIJ() {
        System.out.println("i and j: " + i + "; " + j);
    }
}

class ClassB extends ClassA {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("sum " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.i = 10;
        a.j = 20;
        a.showIJ();

        ClassB b = new ClassB();
        b.i = 7;
        b.j = 10;
        b.k = 15;
        b.showIJ();
        b.showK();
        b.sum();
    }
}
