package chapter4;

import java.util.Scanner;

public class WhileTrue {
    public static void main(String[] args) {
        System.out.println("Введите a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String command;
        sc.nextLine();

        oper:while (true) {
            System.out.println("Введите операцию (inc - прибавление 1, dec - уменьшение на 1, exit - выход из программы)");
            command = sc.nextLine();
        /*    if (command.equals("inc")) {
                a++;
                System.out.println("increment a " + a);
            }
            else if (command.equals("dec")) {
                a--;
                System.out.println("decrement a " + a);
            }
            else if (command.equals("exit")) {
                System.out.println("Exit");
                System.out.println("a = " + a);
                break;
            } else {
                System.out.println("Неизвестная команда");
            }*/

            switch (command){
                case "inc":{
                    a++;
                    System.out.println("a равно " + a);
                    break;
                }
                case "dec":{
                    a--;
                    System.out.println("a равно " + a);
                    break;
                }
                case "exit": {
                    System.out.println("Выход из программы");
                    break oper;
                }
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
}
