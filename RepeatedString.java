package HackerRankWarmUp;

public class RepeatedString {

	public static void main(String[] args) {
	
		System.out.println(myRepeatString("aba", 10));
	}
//=============================================================
	public static long myRepeatString(String s, long n) {
//		String[] arr = new String[(int) n];
//		Arrays.fill(arr, s);
		long A=0, B=0;
		long p = n / s.length();
		long r = n % s.length();
		
		for(int i=0; i<s.length(); ++i) {
			if(i < r) {
				if((s.charAt(i) ^ 'a') == 0) {
					++A;
					++B;
				}
			}else {
				if((s.charAt(i) ^ 'a')  == 0) {
					++A;
				}
			}
		}
		return A * p + B;
	}
}
