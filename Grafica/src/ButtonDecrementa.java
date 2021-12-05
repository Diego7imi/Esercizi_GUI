import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDecrementa implements ActionListener{
	private Contatore cont;
	
	ButtonDecrementa(Contatore cont)
	{
		this.cont = cont;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cont.decrementa();
	}
}

