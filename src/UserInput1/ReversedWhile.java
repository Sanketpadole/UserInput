package UserInput1;

public class ReversedWhile {

	public static void main(String[] args) {

		int[] n = { 1, 4, 3, 2, 5, 6, 8 };
		int reversedNum = 0;
		int lastNum = 0;
		int i = 0;
		int temp = 0;

		while (n[i] < n.length) {
			lastNum = n[n.length - 1];
			// reversedNum = reversedNum + lastNum;
			temp = n[n.length - 1];
			n[n.length - 1] = n[n.length - 2];
			n[n.length - 2] = temp;

		}
		System.out.println("reversedNum" + temp);

	}
}

//
//public static void main(String[] args) {
//
//	int a = 45567;
//	int rev = 0;
//	int rem = 0;
//	while (a != 0) {
//		rem = a % 10;
//
//		rev = rem + rev * 10;
//		a = a / 10;
//
//	}
//	System.out.println("Reverser" + rev);
//
//}
