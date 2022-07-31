/* 
This file will not run as a one program. It will just throw you errors if u run.
This is solely made for learning purpose
*/

//Array Declaration examples
String[] cars;

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

int[] myNum = {10, 20, 30, 40};


// Accessing the array elements
System.out.println(cars[2]) //outputs the element which is present in 2nd position of the array cars.
   
//Loop through an array:
public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		int[] nums = {1,2,3,4,5};
		int n = nums.length;
		for(int i=0;i<n;i++){
		    System.out.println(nums[i]);
		}
	}
}

//Change the elements of an array
int[] nums = {1,2,3,4,5};
nums[2]=7; //changing 3 to 7 using indexing.

//Loop through an array:(Mthod 2):
public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		int[] nums = {1,2,3,4,5};
		
		for(int i : nums){
		    System.out.println(i);
		}
	}
}
