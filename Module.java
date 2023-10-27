class Module{
    String regNo;
    int age;
    double fees;
    int phoneNUmber;

    public Module(String regNo,int age,double fees,int phoneNumber){
        this.regNo = regNo;
        this.age=age;
        this.fees=fees;
        this.phoneNUmber=phoneNumber;
    }
    public void googleoutput(){
        System.out.println("student details"+regNo+" "+age+" "+fees+" "+ phoneNUmber);
        //return regNo+" "+age+" "+fees+" "+ phoneNUmber;
    }
    public static void main(String[]args){
        Module hd=new Module("s17/08013/22",21,2800.00,123);
       // System.out.println(hd.googleoutput());
        hd.googleoutput();
    }
}
