
public class Contatore 
{
	private int i;
	
	Contatore(int j)
	{
		this.i = j;
	}
	
	public void azzeraContatore()
	{
		i = 0;
	}
	
	public int incrementa()
	{
		return i++;
	}
	
	public int decrementa() 
	{
		return i--;
	}
}
