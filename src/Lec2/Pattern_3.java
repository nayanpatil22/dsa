package Lec2;
import java.util.*;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row <= n) {
			//space
			int i =1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star++;
			space --;
			System.out.println();
			
			
		}
		
	}

}
