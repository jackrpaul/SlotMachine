import java.util.*;
public class createSlotMachine
	{
		static int col;
		static Symbol [][] machine = new Symbol[3][3];
		static ArrayList <Symbol> symbols = new ArrayList <Symbol>();
		public static void main(String[] args)
			{
			
			addSymbols();
			pullLever();

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
				symbols.add(new Symbol("aircraft carrier", 350, 2.6, false, 1));
				
			}
		
		private static void pullLever()
			{
			System.out.println("Spinning");
			Timer dot = new Timer();
			for (int row = 0; row < 3; row++)
				{
				double spin = (double)(Math.random()*100.0 + .1);
				if (spin < 22.5)
					{
						machine [row][col] = symbols.get(0);
					}
				else if (spin >=22.5 && spin < 62.5)
					{
						machine [row][col] = symbols.get(1);
					}
				else if (spin >= 62.5 && spin < 74.5)
					{
						machine [row][col] = symbols.get(2);
					}
				else if (spin >= 74.5 && spin < 79.5)
					{
						machine [row][col] = symbols.get(3);
					}
				else if (spin >= 79.5 && spin < 82.0)
					{
						machine [row][col] = symbols.get(4);
					}
				else if (spin >= 82.0 && spin < 83.0)
					{
						machine [row][col] = symbols.get(5);
					}
				else if (spin >= 83.0 && spin < 83.5)
					{
						machine [row][col] = symbols.get(6);
					}
				else if (spin >= 83.5 && spin < 85.0)
					{
						machine [row][col] = symbols.get(7);
					}
				else if (spin >= 85.0 && spin < 97.5)
					{
						machine [row][col] = symbols.get(8);
					}
				else if (spin >= 97.5 && spin < 97.6)
					{
						machine [row][col] = symbols.get(9);
					}
				else
					{
						machine [row][col] = symbols.get(10);
					}
				for (col = 0; col < 3; col++)
					{
						spin = (double)(Math.random()*100.0 + .1);
						if (spin < 22.5)
							{
								machine [row][col] = symbols.get(0);
							}
						else if (spin >=22.5 && spin < 62.5)
							{
								machine [row][col] = symbols.get(1);
							}
						else if (spin >= 62.5 && spin < 74.5)
							{
								machine [row][col] = symbols.get(2);
							}
						else if (spin >= 74.5 && spin < 79.5)
							{
								machine [row][col] = symbols.get(3);
							}
						else if (spin >= 79.5 && spin < 82.0)
							{
								machine [row][col] = symbols.get(4);
							}
						else if (spin >= 82.0 && spin < 83.0)
							{
								machine [row][col] = symbols.get(5);
							}
						else if (spin >= 83.0 && spin < 83.5)
							{
								machine [row][col] = symbols.get(6);
							}
						else if (spin >= 83.5 && spin < 85.0)
							{
								machine [row][col] = symbols.get(7);
							}
						else if (spin >= 85.0 && spin < 97.5)
							{
								machine [row][col] = symbols.get(8);
							}
						else if (spin >= 97.5 && spin < 97.6)
							{
								machine [row][col] = symbols.get(9);
							}
						else
							{
								machine [row][col] = symbols.get(10);
							}
					}
				}
			}
		

	}
