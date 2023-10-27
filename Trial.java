public class Trial {
    char grade;
    public Trial(char grade){
        this.grade = grade;
        System.out.println("Hello");
    }
    private void normal(int marks){
        System.out.println("your marks are " + marks);
    }
   public static void main(String[]args){
    Trial cook = new Trial('B');
    System.out.println(cook.grade);
    cook.normal(399);
   } 
}
