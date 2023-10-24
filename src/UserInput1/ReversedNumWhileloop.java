package UserInput1;

public class ReversedNumWhileloop {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 5, 61, 7, 11 };

		// find size
		int size = arr.length;

		// variables
		int i = 0;
		int j = size - 1;
		int temp = 0;

		// while loop
		while (i <= size / 2) {

			// swap elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			// update i & j
			i++; // increase i
			j--; // decrease j
		}

		// return result
		System.out.println(arr[j]);
	}

}
