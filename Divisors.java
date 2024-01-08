/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);	// TODO: bad name of the variable... inputNum?
		
		for (int d = 1; d <= x; d++ ) {
			if (x % d == 0){
			System.out.println(d); // TODO: missing identation here
		}
	  }
   }			
}

