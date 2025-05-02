package Lec2;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 1;
		while(j <= n) {
			int i =1;
			while(i <= n) {
				System.out.print("* ");
				i++;
			}
			j++;
			System.out.println();
		}
		
		
	}

}
