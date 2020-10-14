package chapter6;

/*
Класс параллелепипед
 */
public class Box {
    double width; // ширина
    double height; // высота
    double depth; // глубина

   /* void volume() {
        System.out.println("volume = " + width * height * depth);
    }*/
   //
    Box(){

    }
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
   void setDim(double w, double h, double d){
       width = w;
       height = h;
       depth = d;
   }
    double volume(){
        return (width * height * depth);
    }
}

