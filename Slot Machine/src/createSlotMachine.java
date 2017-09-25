import java.util.*;
public class createSlotMachine
	{
		static ArrayList <Symbol> symbols = new ArrayList <Symbol>();
		public static void main(String[] args)
			{
			
			addSymbols();
			generateRows();
			

			}
		private static void addSymbols()
			{
			
				symbols.add(new Symbol("cherry", 25, 22.5, false, 1));
				symbols.add(new Symbol("orange", 10, 40.0, false, 1));
				symbols.add(new Symbol("banana", 75, 12.0, false, 1));
				symbols.add(new Symbol("dog", 200, 5.0, false, 1));
				symbols.add(new Symbol("cat", 700, 2.5, false, 1));
				symbols.add(new Symbol("frodo", 1, 1.0, false, 1));
				symbols.add(new Symbol("mac n' cheese", 1000, .5, false, 1));
				symbols.add(new Symbol("boomerang", 750, 1.5, false, 1));
				symbols.add(new Symbol("flag", 50, 12.5, false, 1));
				symbols.add(new Symbol("aglet", 5000, .1, false, 1));
				symbols.add(new Symbol("aircraft carrier", 350, 3.6, false, 1));
				
			}
		private static void generateRows()
			{
			
				
			}

	}
