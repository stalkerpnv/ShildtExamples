package chapter7;

public class ExampleString {
    public static void main(String[] args) {
        //Создание объектов класса String
        String strOne = "Java";
        String strTwo = new String("Java");

        //Проверка на равенство двух строк
        // Проверка по значению методом equals
        System.out.println(strOne.equals(strTwo)); //true;
        System.out.println(strOne.equals("Java"));//true

        // Проверка по ссылке в памяти оператором ==
        boolean equal = false;
        if(strOne == strTwo) equal =true;
        System.out.println(equal);

        //Узнать количество символов в строке
        //Пробел тоже учитывается как символ
        System.out.println("Java is object-programming language".length());

        //Вывести символ по индексу из строки
        System.out.println(strOne.charAt(0)); // J

        // Преобразовать строку в массив символов
        char [] charFromString;
        charFromString = strOne.toCharArray();
        for (int i = 0; i < charFromString.length; i++) {
            System.out.print(charFromString[i] + " "); // J a v a
        }
        System.out.println();
        String firstWord ="first Word";
        String secondWord = "second Word";
        String firstMethod = firstWord + " " + secondWord;
        System.out.println(firstMethod);
        String secondMethod = firstWord.concat(" " + secondWord);
        System.out.println(secondMethod);

        //Создание массивов строк
        String [] strArrayOne = new String[3];
        for (int i = 0; i < strArrayOne.length; i++) {
            strArrayOne[i] = Integer.toString(i);
        }
        String [] strArray = {"one", "two", "three"};
        for (String string:
             strArray) {
            System.out.println(string);
        }
        // Переворачивание строки
        //Первый способ использование stringBuffer
        String str = "String";
        StringBuffer stringBuffer = new StringBuffer(str).reverse();
        String reverseStr = stringBuffer.toString();
        System.out.println(reverseStr);

        //Второй способ
        String strT = "String";
        String reverStrT ="";
        char [] strChar = strT.toCharArray();

        for (int i = (strChar.length-1); i >=0; i--) {
           // reverStrT.concat(Character.toString(strChar[i]));
            reverStrT = reverStrT + strChar[i];
        }
        System.out.println(reverStrT);

        // Найти слова-палиндромы и вывести их на экран
        String strings[] = {"казак","дом", "заказ", "окно", "дверь", "шалаш"};
        String tempStr;
        StringBuffer tempBuf;
        for (int i = 0; i < strings.length; i++) {
          //  tempBuf = new StringBuffer(strings[i]).reverse();
          //  tempStr = tempBuf.toString();
          //  if(tempStr.equals(strings[i]))
            if(strings[i].equals(new StringBuffer(strings[i]).reverse().toString())){
                System.out.println(strings[i]);
            }
        }
        System.out.println();
    }
}
