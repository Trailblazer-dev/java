public class Animals {
    //instance
    private int numberOflegs;
    private int numberOfTails;
    private String breeds;
    private String genderz;
    private String animalType;
    //constructor
    public Animals(int legs, int tails,String breed, String gender, String type){
        numberOflegs = legs;
        numberOfTails = tails;
        breeds = breed;
        genderz = gender;
        animalType = type;
    } 
     public static void  main(String[]args){
           Animals dog = new Animals(4,1,"HOWD","Male","any");
           Animals cow = new Animals(3, 1, "pershia","female","black and white");
           Animals sheep = new Animals(4, 1, "tradition", "male", "white");
           System.out.println("Dog attribute "+dog.animalType+" "+dog.breeds+" "+dog.genderz+" "+dog.numberOfTails+" "+dog.numberOflegs);
           System.out.println("Cow attribute " +cow.animalType+" "+cow.breeds+" "+cow.genderz+" "+cow.numberOfTails+" "+cow.numberOflegs);
           System.out.println("Sheep attribute " + sheep.animalType+" "+sheep.breeds+" "+sheep.genderz+" "+sheep.numberOfTails+" "+sheep.numberOflegs);
        }
    
}  

