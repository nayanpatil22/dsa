package Lec4;
import java.util.*;
public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row <= 2*n-1) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			if(row < n) {
				star++;
				row++;
			}else {
				row++;
				star--;
			}
			System.out.println();
			
		}
	}

}
