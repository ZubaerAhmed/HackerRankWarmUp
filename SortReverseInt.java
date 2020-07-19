package HackerRankWarmUp;

import java.util.Arrays;
import java.util.Comparator;

public class SortReverseInt {

	public static void main(String[] args) {
		Integer[] array = {1,4,7,9,2,5,6};
		int[] array2 = {1,4,7,9,2,5,6};
//		testing(array);
//		reverseArray(array2);
//		sortingArray(array2);
		for(int i : array2) {
			System.out.print(i +" ");
		}
		System.out.println("\n");
		recursion(array2, 0);
		for(int i : array2) {
			System.out.print(i +" ");
		}
	}
//==========================================
	public static void testing(Integer[] array) {
		Arrays.sort(array, Comparator.reverseOrder());
		//Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Bigest-> "+ array[0]);		
	}
//------------------------------------------
	public static void reverseArray(int[] array) {		
		Arrays.sort(array);
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i] +" ");
		}
		System.out.println("Bigest-> "+ array[array.length-1]);
	}
//-------------------------------------------
	public static void sortingArray(int[] num) {	
		int temp;
		for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) { 
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.print(num[i]+" ");
        }
		System.out.println("Bigest-> "+num[num.length-1]);
	}
//-----Recursion didn't work-----------------
//-----works as reverse
	public static void recursion(int[] num, int start) {
		if(start >=  num.length-1) {
			return;
		}
		int temp = 0;
		while (num[start] < num[start+1]) {
			temp = num[start];
			num[start] = num[start+1]; 
			num[start+1] = temp;
		}
		
		recursion(num, start+1);
	}
}






