package chapter4;

/*
Назначение оператора break:
1. Выход из оператора switch
2. Выход из цикла
3. Безусловный переход(альтернатива goto)
 */
public class Break {
    public static void main(String[] args) {
        boolean bool = true;
        first:{
            second:{
            third:{
                System.out.println("Предшествует оператору break");
                if(bool) break second;
                System.out.println("Этот оператор не будет выполняться");
            }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
