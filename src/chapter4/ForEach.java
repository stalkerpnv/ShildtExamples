package chapter4;

/*
 Цикл в стиле for each предназначен для строго последовательного выполнения
 повторяющихся действий над коллекцией объектов вроде массива
 */
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        // Традиционный for
       /* for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i]; // sum+=nums[i]
        }
        */
        //Использование for each, поэлементное чтение из массива
        for (int x : nums) sum = sum + x;
        System.out.println(sum);

        //Использование for each с оператором break
        int sumFiveElements = 0;
        for(int x: nums){
            sumFiveElements = sumFiveElements + x;
            if (x==5) break;
        }
        System.out.println(sumFiveElements);
    }
}
