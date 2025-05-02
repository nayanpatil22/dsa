package Lec1;
import java.util.*;
public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Voter's verificstion");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote!");
		}else {
			System.out.println("Sorry, you need to grow up :(");
		}
		
	}

}
