package HackerRankWarmUp;

public class SumOfArray {

	public static void main(String[] args) {
		Integer[] array = {1,4,7,9,2,5,6};
		int[] array2 = {1,4,7,9,2,5,6};
		mySumOfArray(array2);
		System.out.println("2 answer: "+recursion(array2,array2.length));
	}
//============================================
	public static void mySumOfArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("1 answer: " + sum);
	}
//--------------------------------------------
	public static int recursion(int[] array, int n) {
		if(n <= 0) {
			return 0;
		}		
		return recursion(array, n-1) + array[n-1];		
	}
}
