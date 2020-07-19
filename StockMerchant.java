package HackerRankWarmUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StockMerchant {

	public static void main(String[] args) {

		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockPair(arr) );
		System.out.println(sockPairArray(arr));
	}
	//=================================================
	public static int sockPair(int[] arr) {	 	 
		int pair = 0;
		if(arr.length <= 0) return pair;
//		List<Integer> set = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				pair++;
				set.remove(arr[i]);
				// For ArrayList use index or object
				// Calling remove(index) numbers.remove(1); 
				//Calling remove(object) numbers.remove(new Integer(3));
//				set.remove(new Integer(arr[i]));
			}
		}
		return pair;
	}
	//-------------------------------------------------------------------
	public static int sockPairArray(int[] arr) {	 	 
		int pair = 0;
		if(arr.length <= 0) return pair;

		int[] arr2 = new int[101];
		for(int i : arr) {
			//System.out.println(arr2[i]);
			arr2[i]++;
		}
		for(int i : arr2) {
			pair += i/2;
		}		
		return pair;
	}
	//-----complecated--------------------------------------------------------
	public static int sockMerchant( int[] ar) {
		int pairCount=0;
		Map<Integer,Integer> socks=new HashMap<Integer,Integer>();

		for(int sockCount=0; sockCount<ar.length; sockCount++){
			if(socks.get(ar[sockCount])!=null){
				socks.put(ar[sockCount],socks.get(ar[sockCount])+1);
			}else{
				socks.put(ar[sockCount],1);
			}
		}

		for(int sock:socks.keySet()){
			pairCount=pairCount+socks.get(sock)/2;
		}
		return pairCount;
	}
	//------------------------------------------

}
