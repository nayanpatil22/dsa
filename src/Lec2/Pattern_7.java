package Lec2;
import java.util.*;
public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = 2*n-3;
		int star = 1;
		
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(row == n) {
				k = 2;
			}
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			row++;
			space = space -2;
			star++;
			System.out.println();
			
			
				
		}
		
	}

}
