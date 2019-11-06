package JavaIQProgQuestion;

public class Q1 {

	public static void main(String[] args) {
	/*1-Write a program to swap 2 numbers without a temporary variable?
	 *  Swap  2 strings without a temporary variable?	
	 */System.out.println(".........1........");
		int a=11,b=22;
		int temp;
		a=b;
		System.out.println(a);
		
		String c="tuba",d="Ayse";
		c=d;
		System.out.println(c);
		
	/*2-Write a java program to find the second largest number 
	 * in the array? 
	 * Maximum and minimum number in the array?
	 */
		System.out.println("..........2..........");
		
		int[] array={12,22,44,13,54,32,66,82,31,36};
		
		int max1=array[0];
		int smax=array[0];
		for (int j = 0; j < array.length; j++) {
				
			if(max1<array[j] ) {
				max1=array[j];
			}
				if (array[j]<smax || smax<max1) {
					smax=array[j];
				}
			
			}System.out.println(max1);
		System.out.println(smax);
		
	//.........................baskasinin yaptigi cozum..................
		 int [] myNums= { 10, 212, 44, 35, 315, 404, 12, 9};
		    
		   int max=myNums[0]; 
		   int secondMax=myNums[0];
		   
		    
		   
		   for (int i = 0; i < myNums.length; i++) {
		        if (myNums[i]>max) {
		            max=myNums[i]; 
		        }
		    }   
		    
		   
		   
		   int min=max; 
		   for (int i = 0; i < myNums.length; i++) {
		    if (myNums[i]<min) {
		        min=myNums[i];
		    }
		}
		  
		   for (int i = 0; i < myNums.length; i++) {
		       
		       if (myNums[i]>secondMax&&myNums[i]!=max) {
		           
		           secondMax=myNums[i]; 
		           
		       }
		   }
		   System.out.println("The max number is :"+max);
		   
		   
		   System.out.println("The second max number is :"+secondMax);
		   
		   
		   System.out.println("The minx number is :"+min);
		   
		
		
		
	
	/*3-Find out how many alpha characters present in a string? */
		System.out.println(".....3............");
		String str="This*is$search#any!alpa@carachter";
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
		
	
	/*4-How to find out the part of the string from a string?
	 *  What is substring? 
	 * Find number of words in string?	
	 */
		System.out.println(".....4.....");
		
		String str2="This is java program";
		
		System.out.println(str2.substring(8));
		System.out.println(str2.length());
		
	
		
	}

}
