package HackerRankWarmUp;

public class InstancePrimeNumber {

	public static void main(String[] args) {
		primeChecker(5);

	}
//==============================================
	 public static void primeChecker(int n) {
		 boolean flag = false;
	        if(n <= 1) {
	        	flag = false;
	        }
	        for(int i=2; i <= n/2; i++) {
	            //System.out.println( i);
	            if(n % i == 0) {
	            	flag = true;
	            	break;
	            }
	        }
	        if (flag == false)
	            System.out.println(n + " is a prime number.");
	        else
	            System.out.println(n + " is not a prime number."); 
	    }
//-----------------------------------------------
}
