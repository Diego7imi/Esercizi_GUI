
public class Contatore 
{
	private int i;
	
	public int getValore() {return i;}
	
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
