package string;

/*
Основные методы для работы со строками
Переворачивание строки
 */
public class Example {
    public static void main(String[] args) {
        String strOne;
        strOne = "Java";
        String strTwo = new String("Java");

        System.out.println(strOne.length()); // размер
        System.out.println(strOne.charAt(1)); // получение второго символа
        System.out.println(strOne.equals("Java")); // сравнение строк(первый вариант)
        System.out.println(strOne == "Java");  // сравнение строк(второй вариант)
        // Переворачивание строки(первый способ)
        String reverseStr = " ";
        char[] chFromStrOne = strOne.toCharArray(); // Перевод строки в массив символов
        for (int i = chFromStrOne.length; i > 0; i--) {
            System.out.println((i - 1) + " " + chFromStrOne[i - 1]);
            reverseStr = reverseStr + chFromStrOne[i - 1];

        }
        System.out.println(reverseStr);
        // Переворачивание строки(второй способ)
        String str = "Java is object programming language";
        StringBuffer srtBuf = new StringBuffer(str).reverse();
        String strRev = srtBuf.toString();
        System.out.println(strRev);

    }
}
