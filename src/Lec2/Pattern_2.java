package Lec2;
import java.util.*;
public class Pattern_2{
	public static void main(String[] args) {
	//triangular left star
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int row = 1;
	int star = 1;
	
	while(row <= n) {
		int i = 1;
		while(i <= star) {
			System.out.print("* ");
			i++;
			
		}
		row++;
		star++;
		System.out.println();
	}
}
}
