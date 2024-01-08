/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);	
		for(int x = 0; x < a; x++ ) {   //int x for the columns {   //int x for the columns
		System.out.println();
		
		for (int y = 0; y < a; y++){ // int y for the rows
		 if (x % 2 == 0) {
			 System.out.print("* ");
		 } else {
			 System.out.print(" *");
				}
			}
		}
	}
}
