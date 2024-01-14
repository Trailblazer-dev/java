
class ArrayAverage{
   public static void main(String[] args){
	double geo[] ={34.5,56.7,63.1,30.0,44.3};
	double sum=0;
	for(int no=0; no<geo.length;no++){
	   sum +=geo[no];
	   System.out.println(sum);
	}
	double average = sum/5;
	System.out.println(average);
}
}
