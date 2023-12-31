/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		
			int T = Integer.parseInt(args[0]);		
			double sumC = 0.0;
			double average = 0.0;
			int c_2 = 0;
			int c_3 = 0;
			int c_4 = 0;
			
			
			for (int i=0; i<T; i++)   //the i is the one running so i++
			{
				double x = 0;   // the number from random 0-10
				int g = 0;
				int b = 0;
				int c = 0; //number of children
				while (g <1 || b<1) //when the count comes to 1g and 1b the loop will stop.
				{
					x = (Math.random());   //when calling a function we need to have ()
					if (x<0.5)
					{
						g++;           //if the number is even, count one more girl
					}
					else
						{ b++;
					}
						c++;   //everytime the loop (while) runs, add another one to c (also possible to add right after the while
			}	
					
					sumC = sumC + c;   //count children and add the children of next family
					if (c == 2)
					{
						c_2++; //each time theres a family with c_2 add one num to the count
					}
					else                                            //why else and not if? doesnt have to run all over again
					{
						if (c == 3)
						{
						c_3++;
						}
						else    //no need to define again for >=4 - all of what is not 2 or 3
						{
						c_4 ++;
						}
					}
			
			}
						average = (sumC/T);	
						System.out.println();
						System.out.println("Average: " + average + " children to get at least one of each gender.");
						System.out.println("Number of families with 2 children: " + c_2);
						System.out.println("Number of families with 3 children: " + c_3);
						System.out.println("Number of families with 4 or more children: " + c_4);
	

					if	((c_2 >= c_3) && (c_2 >= c_4))
					{
						System.out.println("The most common number of children is 2.");
					}
						else 
						{
							if ((c_3 >= c_2) && (c_3 >= c_4))
							{
								System.out.println("The most common number of children is 3.");
							}
							else
							{
							System.out.println("The most common number of children is 4.");
							}
				}
		}
}
	