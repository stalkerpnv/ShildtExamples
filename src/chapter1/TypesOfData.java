package chapter1;
/*
1. Целое число - byte(8 бит), short(16 бит), int(32 бита), long(64 бита)
2. Число с плавающей точкой - float(32 бита), double(64 бита)
3. Символ - char (16 бит) Unicode, 0 до 65536
4. Булев тип - boolean (1 бит)
 */
public class TypesOfData {
    public static void main(String[]args){
        byte b = 127;
        short s = 32767;
        int i  = 2147483647;
        long l = 922337207;
        float f = (float) 3.15;
        double d = 3.15;
        char charInUnicode = 88;
        char charInSymbol = 'X';
        System.out.println(charInUnicode);
        System.out.println(charInSymbol);
        boolean bool = true;
    }
}
