public class bunnyEars {

	public static void main(String[] args) {
		System.out.println(bunnyEars(5));
	}
	
	public static int bunnyEars(int bunnies) {
	  if(bunnies == 0) 
		  return 0 ;
	  	else 
	  return(2 + bunnyEars(bunnies-1));  
	   
	}
}
