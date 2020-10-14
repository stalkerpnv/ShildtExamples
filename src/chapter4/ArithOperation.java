package chapter4;

/*
+, -, /, *;
%, ++,--;
+=, -=, *=, /=, %=;
 */
public class ArithOperation {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a % 3);

        int b = 1;
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);
        int c = 10;
        int d=15;
        d+=c; // d=d+c;
        d-=c; // d=d-c;
        d*=c; // d=d*c;
        d/=c; // d=d/c;
        d%=c; // d=d%c;
    }
}
