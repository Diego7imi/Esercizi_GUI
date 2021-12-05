import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ButtonMostra implements ActionListener{
	private Contatore cont;
	
	ButtonMostra(Contatore cont)
	{
		this.cont = cont;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null,"Il valore e': " + cont.getValore());
	}
}

