package JavaIQProgQuestion;

public class Q1_1 {

	public static void main(String[] args) {
		/*
		 * 5-Write a java program to reverse String? Reverse a string word by word?
		 */
		System.out.println(".....5.......");
		String str = "This is java program";
		// String[] arr=str.split(" ");

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}
		System.out.println();

//................. 2. yol kelime kelime ters yazdirma.................
		String[] array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

		System.out.println("......6.......");
		/*
		 * 6-Write a Java Program to find whether a String is palindrome or not?
		 */

		String str1 = "fatma";
		String a2=str1.substring(0,5);

		for (int i= str1.length(); i >= 0;  i--) {
			if (a2.equals(str1)) {
			System.out.println(" \nThis is a palindrom word "+str1);
		}else {
			System.out.println("\nThis is not palindrom word");
		}
		}			
		 System.out.println(a2);

		System.out.println(".......7.......");
		/*
		 * 7-Write a java program to check whether a given number is prime or not?
		 */

		int[] num = { 1, 3, 5, 7, 8, 9, 11, 12, 13 };

		for (int i = 0; i < num.length; i++) {
			int c = num.length;
			if (num[i] % c == 1) {
				System.out.println(num[i]);
				c++;
			}
		}

		System.out.println("......8.......");
		/*
		 * 8-Write a Java Program to print first 10 numbers of Fibonacci series.
		 */
		int[] a = new int[10];
		a[0] = 0;
		a[1] = 1;
		int fib = 0;
		for (int i = 2; i < a.length; i++) {
			// for (int j = 0; j < 10; j++) {

			System.out.println(a[i] = (a[i - 2]) + (a[i - 1]));

			// }
		}

	}

}
