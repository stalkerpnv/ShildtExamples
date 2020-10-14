package chapter4;

/*
Проверка значения переменной на равенство 2,3,4,5;
 */
public class SwitchCase {
    public static void main(String[] args) {
        int value = 4;

        if (value == 2) System.out.println("Value = 2");
        else if (value == 3) System.out.println("Value = 3");
        else if (value == 4) System.out.println("Value = 4");
        else if (value == 5) System.out.println("Value = 5");
        else System.out.println("Unknown value");


        switch (value) {
            case 2: {
                System.out.println("Value = 2");
                break;
            }
            case 3: {
                System.out.println("Value = 3");
                break;
            }
            case 4: {
                System.out.println("Value = 4");
                break;
            }
            case 5: {
                System.out.println("Value = 5");
                break;
            }
            default: {
                System.out.println("Unknown value");
            }
        }
    }
}