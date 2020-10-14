package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box; //Объявить объект;
        box = new Box(); // Выделить память под объект, получить ссылку, инициализировать объект
        double volume;
        box.width = 10;
        box.height = 20;
        box.depth = 15;

        //Вычисление объема через локальную переменную
        volume = box.width * box.height * box.depth;
        System.out.println("Volume = " + volume);
        //Вычисление объема через метод
        System.out.println("volume =" + box.volume());

        //Инициализация значения через метод
        Box boxTwo = new Box();
        boxTwo.setDim(3,6,9);

    }
}
