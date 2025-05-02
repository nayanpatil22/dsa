package Lec1;
import java.util.*;
public class maximum_3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to highest number finder");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' ");
		int a = sc.nextInt();
		System.out.println("Enter 'b' ");
		int b = sc.nextInt();
		System.out.println("Enter 'c' ");
		int c = sc.nextInt();
		
		if(a >= b && a >= c) {
			System.out.println(a);
		}else if(b >= a && b >= c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
