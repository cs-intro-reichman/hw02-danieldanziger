
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		double x = 0;   // the number from random 0-10
		int g = 0;
		int b = 0;
		int c = 0; //number of children
		while (g <1 || b<1) //when the count comes to 1g and 1b the loop will stop.
		{
			x = (Math.random());   //when calling a function we need to have ()
		       if (x<0.5)                  //random generates from 0 to 1, 0.5 gives same odds to boy or girl
			   {
				   g++;           //if the number is even, count one more girl
					System.out.print("g ");
			   }
			   else
			   { b++;
				System.out.print("b ");
			   }
			   c++;   //everytime the loop (while) runs, add another one to c (also possible to add right after the while
		}	
			System.out.println(); //in order to go one row down 
			System.out.println("You made it... and you now have " + c + " children.");
				
			
		}
	}

