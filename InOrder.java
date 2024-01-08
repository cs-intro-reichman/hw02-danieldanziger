/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
			int	a = (int)(Math.random()*10);
			System.out.print(a); // TODO: missing identation
			int b = (int)(Math.random()*10);
				
			while (b>=a)
		{ // TODO: parenthness identation mess...read Java Code Style Guidelines https://docs.google.com/document/d/178R1ZbXLUT6myw2JjPhYRTL3mfb6oNSe/edit
			System.out.print(" "+b);
			a = b;
			b = (int)(Math.random()*10);
			}
		}
	}

