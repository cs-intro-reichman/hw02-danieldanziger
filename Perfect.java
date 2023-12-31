/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);           //input
		int sum = 1;                                   //will later represent the sum of the dividers
		String s =  num + " is a perfect number since " + num + " = 1";    //the string for the print later
		
		
		for (int i = 2; i < num; i++) {         //i for running from 1 to the num given as input
			if	(num % i == 0)               	//if the num mod i without remainder
			{			
				sum += i;                     //adding the i that is a divider of num to the sum
				s += " + " + i;               //adds the number in i to the message we will later print
			}
		}
		if (sum == num)
		{
			System.out.print(s);
		}
	    	else {
					System.out.print(num + " is not a perfect number");
					
			}
		
		}
		
	}
