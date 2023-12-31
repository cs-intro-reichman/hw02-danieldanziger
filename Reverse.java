/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String s = "";
	
		for (int i = word.length() - 1; i >= 0; i--) {
			s += word.charAt(i);
			
		}
		int middle = (s.length() / 2);
		System.out.println(s);
		System.out.println("The middle character is " + s.charAt(middle));
		}
	}




