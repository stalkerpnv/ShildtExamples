package chapter7.recursion;

class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}

public class RecursionOne {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial 3 is equals " + f.fact(3));
        System.out.println("Factorial 3 is equals " + f.fact(4));
        System.out.println("Factorial 5 is equals " + f.fact(5));
    }
}
