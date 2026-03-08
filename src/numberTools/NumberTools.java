package numberTools;

import java.util.Scanner;

public class NumberTools {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int choice;
		 
		 do {
			 showMenu();
			 choice=sc.nextInt();
			 
			 switch(choice) {
			 	case 1 : 
			 		System.out.println("Please enter a number");
			 		int number=sc.nextInt();
			 		System.out.println("Is the number Even? "+ isEven(number));
			 		break;
			 	case 2 : 
			 		System.out.println("Enter 2 numbers to check which is maximum");
			 		int num1=sc.nextInt();
			 		int num2=sc.nextInt();
			 		System.out.println("The maximum number is : "+ findMax(num1,num2));
			 		break;
			 	case 3 :
			 		System.out.println("Enter a number to reverse it");
			 		int n=sc.nextInt();
			 		System.out.println("The reversed number is : "+ reverseNumber(n));
			 		break;
			 	case 4 :
			 		System.out.println("Enter 2 numbers to find their sum");
			 		int n1=sc.nextInt();
			 		System.out.println("The sum of 2 numbers is : "+ sumOfDigits(n1));
			 		break;
			 	case 5:
			 		System.out.println("Enter a number to check if it is a palindrome");
			 		int num=sc.nextInt();
			 		System.out.println("Is the number palindrome? "+ isPalindrome(num));
			 		break;
			 	case 6 :
			 		System.out.println("Exiting the Number Tool...");
			 		break;
			 	default :
			 		System.out.println("Invalid choice! Please try again.");
			 }
		 }while(choice !=6);
		 sc.close();

	}
	
	public static void showMenu() {
		System.out.println("\n====== Number Tools ======");
		System.out.println("1. Check Even or Odd");
		System.out.println("2. Find Maximum of Two Numbers");
		System.out.println("3. Reverse a Number");
		System.out.println("4. Sum of Digits");
		System.out.println("5. Palindrome Check");
		System.out.println("6. Exit");
		
		System.out.println("\nPlease select a program from above");
	}
	
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int findMax(int num1, int num2) {
		int max=(num1 > num2) ? num1 : num2;
		return max;
	}
	
	public static int reverseNumber(int n) {
		int reverse =0;
		while (n!=0){
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		return reverse;
	}
	
	public static int sumOfDigits(int n) {
		int sum = 0;

	    while (n != 0) {
	        sum += n % 10;
	        n = n / 10;
	    }
		return sum;
	}
	
	public static boolean isPalindrome(int n) {
		int original=n;
		int reverse =0;
		while (n!=0){
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		return original==reverse;
	}

}
