package JavaIQProgQuestion;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
	/*1-Write a program to swap 2 numbers without a temporary variable?
	 *  Swap  2 strings without a temporary variable?	
//	 */System.out.println(".........1........");
//		int a=11,b=22;
//		int temp;
//		a=b;
//		System.out.println(a);
//		
//		String c="tuba",d="Ayse";
//		c=d;
//		System.out.println(c);
		
	//hocanin cozumu
		
		int a=10;
		int b=20;
		a=a+b; //30
		b=a-b;//30-20=10
		a=a-b; //30-10=20
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
		
		//2 String method
		String str11="Hello";
		String str22="Welcome";
		
		str11=str11+str22; //HelloWelcome
		str22=str11.substring(0,str11.length()-str22.length()); //Hello
		str11=str11.substring(str22.length()); 
		
		System.out.println("The value of str11="+str11);
		System.out.println("The value of str22="+str22);
		
		
	/*2-Write a java program to find the second largest number 
	 * in the array? 
	 * Maximum and minimum number in the array?
	 */
		System.out.println("..........2..........");
		
//		int[] array={12,22,44,13,54,32,66,82,31,36};
//		
//		int max1=array[0];
//		int smax=array[0];
//		for (int j = 0; j < array.length; j++) {
//				
//			if(max1<array[j] ) {
//				max1=array[j];
//			}
//				if (array[j]<smax || smax<max1) {
//					smax=array[j];
//				}
//			
//			}System.out.println(max1);
//		System.out.println(smax);
		
		//Hocanin cozumu 
		
		int [] array= {100,-90,8787,898,0,1};
		//1easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		//2 way
		int[] myArray= {100,-90,8787,898,0,1};
		int largest=myArray[0];
		int smalest=myArray[0];
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}
			if(myArray[i]<smalest){
				smalest=myArray[i];
			}
		}
		System.out.println("The smalest value in the array is "+smalest);
		System.out.println("The largest value in the array is "+largest);
		
		//
		int[] nums= {100,-90,8787,898,0,1};
		int large=nums[0];
		int slarge=nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>large ) {
				slarge=large;
				large=nums[i];
			}
			
			if(nums[i]>slarge && nums[i]<large) {
				slarge=nums[i];
			}
			
		}
		System.out.println("Large number"+large);
		System.out.println("Second large number"+slarge);
		
	//.........................baskasinin yaptigi cozum..................
		 int [] myNums= { 10, 212, 44, 35, 315, 404, 12, 9};
		    
		   int max11=myNums[0]; 
		   int secondMax=myNums[0];
		   
		    
		   
		   for (int i = 0; i < myNums.length; i++) {
		        if (myNums[i]>max11) {
		            max11=myNums[i]; 
		        }
		    }   
		    
		   
		   
		   int min11=max11; 
		   for (int i = 0; i < myNums.length; i++) {
		    if (myNums[i]<min11) {
		        min11=myNums[i];
		    }
		}
		  
		   for (int i = 0; i < myNums.length; i++) {
		       
		       if (myNums[i]>secondMax&&myNums[i]!=max11) {
		           
		           secondMax=myNums[i]; 
		           
		       }
		   }
		   System.out.println("The max number is :"+max11);
		   
		   
		   System.out.println("The second max number is :"+secondMax);
		   
		   
		   System.out.println("The minx number is :"+min11);
		   
		
		
		
	
	/*3-Find out how many alpha characters present in a string? */
		System.out.println(".....3............");
		String str="This*is$search#any!alpa@carachter";
		System.out.println(str.replaceAll("[^A-Za-z]", "").length());
		//yada .replace("\\w",""); de yazilabilir yada .replace("[^a-n],"");
	
	/*4-How to find out the part of the string from a string?
	 *  What is substring? 
	 * Find number of words in string?	
	 */
		System.out.println(".....4.....");
		
//		String str2="This is java program";
//		
//		System.out.println(str2.substring(8)); 
//		System.out.println(str2.length()); benim yine soruyu yanlis anlaisim
		
		
		/*Step1: split based on the space--> array of String
		 * Step2: find the length of array
		 */
	
		String str3="Today is very cold outside ";
		String[] words=str3.split(" ");
		System.out.println(words.length);
		
	}

}
