package Lec1;
import java.util.*;
public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int age = sc.nextInt();
		
		if(age%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		
	}

}
