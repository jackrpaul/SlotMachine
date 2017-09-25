
public class Symbol
	{
	private String name;
	private int value;
	private double probability;
	private boolean isBonus;
	private int bonusMultiplier;

	public Symbol(String n, int v, double p, boolean b, int bM)
		{
			name = n;
			value = v;
			probability = p;
			isBonus = b;
			bonusMultiplier = bM;
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public int getValue()
		{
			return value;
		}

	public void setValue(int value)
		{
			this.value = value;
		}

	public double getProbability()
		{
			return probability;
		}

	public void setProbability(double probability)
		{
			this.probability = probability;
		}

	public boolean isBonus()
		{
			return isBonus;
		}

	public void setBonus(boolean isBonus)
		{
			this.isBonus = isBonus;
		}

	public int getBonusMultiplier()
		{
			return bonusMultiplier;
		}

	public void setBonusMultiplier(int bonusMultiplier)
		{
			this.bonusMultiplier = bonusMultiplier;
		}
	}
