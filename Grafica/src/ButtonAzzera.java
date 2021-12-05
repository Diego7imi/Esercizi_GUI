import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ButtonAzzera implements ActionListener{
	private Contatore cont;
	
	ButtonAzzera(Contatore cont)
	{
		this.cont = cont;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cont.azzeraContatore();
	}
}
