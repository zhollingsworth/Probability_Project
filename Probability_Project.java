//******************************************************************//
//Coded by Zac Hollingsworth
//July 13, 2014
//Computes probability and E[X] for
//MATH3600 Probability Project
//*****************************************************************//

public class Probability_Project
{

	public static void main(String[] args)
	{
		//total used to get probability for each X
		double total = 1;
		//total2 used to add up the E[X]
		double total2 = 0;
		//match used for the duplicates probability
		double match = 0;
		//Column Header
		System.out.println("X=\tProbability\t\tPrep for E[X]");
		
		for(int i = 1; i < 50; i++)
		{
			System.out.print(i);
			//computes the prob for duplicates during each turn
			match = (3.0/(52.0-i));
			//computing the factorials
			
			//Inner for loop handles the factorials
			for(int j = 1; j < i; j++)
			{
				total *= (49.0-j)/(52.0-j);
			}//end of inner for loop
			
			//prints the actual probability
			System.out.print("\t" + (total*match));
			//counts up for the E[X]
			total2 += total*i*match;
			//prints individual portions of E[X] counter
			System.out.println("\t" + total*match*i);
			total = 1;
		
		}//end of outer for loop
		
		System.out.println("\nExpected Value: " + total2);
	}//end of main
}//end of class
