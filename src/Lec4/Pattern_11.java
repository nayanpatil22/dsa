package Lec4;
import java.util.*;
public class Pattern_11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n/2;
		int space2 = -1;
		
		while(row <= n) {
			int i = 1;
			//space
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			//star
			System.out.print("* ");
			//space2
			int j =1;
			while(j <= space2) {
				System.out.print(" ");
				j++;
			}
			//star2
			System.out.print("* ");
			//next line
			if(row <= n/2) {
				space--;
				space2 = space2 + 2;
			}else {
				space++;
				space2 = space2 - 2;
			}
			row++;
			System.out.println();
			
		}
		
	}

}
