public class Problem {
    String name;
    int goals;
    char level;
    double point;
    public Problem(String name, int goals, char level){
        this.name = name;
        this.goals= goals;
        this.level = level;
    }
    public static void main (String[]args){
        Problem d = new Problem("mancity", 7, 'B');
        if(d.goals>5){
            int g=0;
            while(g<10){
                g++;
                d.point +=g;
            }
        }
        if(d.goals<5){
            for(int i =0;i<5;i++){
                d.point +=i;
            }
        }
        
        System.out.println(d.name+" "+ d.goals+" "+d.level+" "+ d.point);
    }
    
}
