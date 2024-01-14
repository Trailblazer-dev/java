public class Reservation {
    //instance
    int capacity;
    int guestNo;
    boolean isResturantOpen;
    boolean isConfirmed;
    public Reservation(int capacity,int guestNo,boolean isResturantOpen,boolean isConfirmed){
        this.capacity = capacity;
        this.guestNo = guestNo;
        this.isResturantOpen = isResturantOpen;
        this.isConfirmed = isConfirmed;
        if(guestNo <=1){
            System.out.println("invalid reservation");
        }
    }
    public void confirmed(){
        if(guestNo<=capacity && isResturantOpen){
            System.out.println("Reservation is available");
        }
        else{
            System.out.println("Sorry we can't process your reservation right now");
        }
        if(isConfirmed){
            System.out.println("Your reservation is confirmed");
        }
        else {
            System.out.println("Your reservation is still pending we will inform you when confirmed");
        }
    }
    public static void main(String[]args){
        Reservation send = new Reservation(200, 10, false, false);
        Reservation send01 = new Reservation(200, 10, true, true);
        send.confirmed();
        send01.confirmed();
    }
}
