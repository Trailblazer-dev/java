class Practice{
    int length;
    int width;
    void insertRecords(int l, int w){
        length = l;
        width = w;
    }
    void displayArea(){
        System.out.println("Area = " + length* width);
    }
}
public class Rectangle {
     public static  void main(String[]args){
        Practice rec = new Practice();
        rec.insertRecords(14, 15);
        rec.displayArea();
    }
    
}
