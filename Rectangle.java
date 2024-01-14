public class Rectangle {
     public static  void main(String[]args){
        Measurements rec = new Measurements();
        rec.Area(14, 15);
        rec.displayArea();
    }
    
}
class Measurements{
    private int length;
    private int width;
    void Area(int l, int w){
        length = l;
        width = w;
    }
    void displayArea(){
        System.out.println("Area = " + length* width);
    }
}