package Lec4;
import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int number = 1;
		int val = 1;
		
		while(row <= n) {
			//space
			int i = 1;
			while(i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while(j <= number) {
				System.out.print(val + "\t");
				j++;
				val++;	
			}
			row++;
			number+=2;
			space--;
			
			System.out.println();
		}
	}

}
