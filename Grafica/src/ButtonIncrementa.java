import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ButtonIncrementa implements ActionListener{
	private Contatore cont;
	
	ButtonIncrementa(Contatore cont)
	{
		this.cont = cont;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cont.incrementa();
	}
}
