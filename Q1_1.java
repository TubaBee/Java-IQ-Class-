package JavaIQProgQuestion;

public class Q1_1 {

	public static void main(String[] args) {
		/*
		 * 5-Write a java program to reverse String? Reverse a string word by word?
		 */

		System.out.println(".....5.......");

		String str = "This is java program";
		String[] arr = str.split(" ");

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
		System.out.println();

// ........hocanin cozumu..........................
		System.out.println(".....Hocanin cozumu............");
		String given = "Welcome to the java class";
		/*
		 * to reverse String split(); Step1: split--> array of String Step2: use for
		 * loop and use decrement to print values
		 */

//		String[] str11=given.split("\\s");
//		for (int i= str11.length-1;  i>= 0; i--) {
//			System.out.print(str11[i]+" ");
//		}  // split ile yapimi

		String reversed = "";
		String[] str11 = given.split("\\s");
		for (int i = str11.length - 1; i >= 0; i--) {
			reversed = reversed + str11[i] + " ";
		}
		System.out.println(reversed);

		// This is write a java program to reverse String?
		// otCharArray(); charAt();

		char[] charArray = given.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		String word3 = "I love Java";
		for (int i = word3.length() - 1; i >= 0; i--) {
			System.out.print(word3.charAt(i));
		}

		System.out.println("\n......6.......");

		/*
		 * 6-Write a Java Program to find whether a String is palindrome or not?
		 */

//		String str1 = "fatma";
//		String a2=str1.substring(0,5);
//
//		for (int i= str1.length(); i >= 0;  i--) {
//			if (a2.equals(str1)) {
//			System.out.println(" \nThis is a palindrom word "+str1);
//		}else {
//			System.out.println("\nThis is not palindrom word");
//		}
//		}			
//		 System.out.println(a2);

//..........Hocanin cozumu.................
		/*
		 * Logical: 
		 * Step1:reverse String 
		 * Step2: compare 2 String:
		 * 		if string are equels 
		 * 
		 */

		String original = "kayak";
		String reversd = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reversd = reversd + original.charAt(i);// +k=k+a=ka+k
		}
		System.out.println(reversd);

		if (original.equals(reversd)) {
			System.out.println("String is a palindrom");

		} else {
			System.out.println("String is not palindrom");
		}
		
		System.out.println(".......7.......");
		/*
		 * 7-Write a java program to check whether a given number is prime or not?
		 */

		int[] num = { 1, 3, 5, 7, 8, 9, 11, 12, 13 };

//		for (int i = 0; i < num.length; i++) {
//			int c = num.length;
//			if (num[i] % c == 1) {
//				System.out.println(num[i]);
//				c++;
//			}
//		}

//...........hocanin cozumu ............................
		
		//take range of numbers from 2 to 100 and print all prime
		//2,3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)

		
		int num1=5;
		boolean isPrime=true;
		if(num1<=1) {
			isPrime=false;
	}else {
		
		for (int i = 2; i < num1; i++) {
			if (num1%i==0) {
				isPrime=false;
				break;
			}
		}
	}
		
		if(isPrime) {
			System.out.println(num1+" is a prime number");
		}else {
			System.out.println(num1+" is NOT Prime number");
		}
		
		
		
		System.out.println("......8.......");
		/*
		 * 8-Write a Java Program to print first 10 numbers of Fibonacci series.
		 */
//		int[] a = new int[10];
//		a[0] = 0;
//		a[1] = 1;
//		int fib = 0;
//		for (int i = 2; i < a.length; i++) {
//			// for (int j = 0; j < 10; j++) {
//
//			System.out.println(a[i] = (a[i - 2]) + (a[i - 1]));
//
//			// }
		
//...........hocanin cozumu.........................
		int a,b,c;
		a=0;
		b=1;
		for (int i = 0; i <10; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
		
		}

	}