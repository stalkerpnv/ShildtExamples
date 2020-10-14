package chapter1;

public class ConversionTwo {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Преобразование int в byte");
        b = (byte) i; // 257 mod 256
        System.out.println(b);

        System.out.println("Преобразование double в int");
        i = (int) d; // отбрасывание дробной части
        System.out.println(i);

        System.out.println("Преобразование double в byte");
        b = (byte) d; // 323 mod 256
        System.out.println(b);
    }
}
