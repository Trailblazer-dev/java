import java.util.Arrays;

public class Hello{
    public static void main(String[]args){
        byte age=42;//in byte we can store number  upto 127
        int viewCount= 132_832_212;//with int we can store values upto 2 billions
        //we can separate large number using underscore in place of commas
        float price = 32.32F;//when declaring float we add suffix F at the end of decimal number to specify the number as float
        char letter ='B';//NOTE we should always surround single character with single quotes and string with double quotes 
        System.out.println(viewCount);
        System.out.println("Hello world! " + age);
        System.out.println(price+letter);
        String txt = "I am new here";
        System.out.println(txt.toUpperCase());   
        int[] position = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(position));           
        //MULTIDIMENSION
        int[][] matrix = {{2,3,4},{4,3,5}};
        System.out.println(Arrays.deepToString(matrix));    
    }

 }