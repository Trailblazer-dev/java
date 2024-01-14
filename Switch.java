public class Switch{
    //instance
    String dayOfTheWeek;
    public Switch(String dayOfTheWeek){
        this.dayOfTheWeek = dayOfTheWeek;
    }
    public static void main(String[]args){
        Switch day = new Switch("Monday");
        String name = day.dayOfTheWeek;
        //Use of switch condition is displayed below
        switch(name) {
            case "Monday":
                System.out.println("It is a Mindful day");                
                break;
            case "Tuesday":
                System.out.println("Tech Tuesday");
                break;
            case "Wensday":
                System.out.println("Wired daylight");
                break;
            case "Thursday":
                System.out.println("Thoughtful day ahead");
                break;
            case "Friday":
                System.out.println("Freedom ");
                break;
            default:
                System.out.println("Invalid work day");
                break;
        }
     
    }
}