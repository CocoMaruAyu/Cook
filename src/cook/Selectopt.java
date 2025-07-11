package cook;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Selectopt extends JPanel{
	public Selectopt(MainFrame frame) {
		setLayout(new GridLayout(6, 1, 10, 10));
		JButton cookButton = new JButton("料理登録ボタン");
		 cookButton.addActionListener(e -> frame.showPanel("COOK"));
		 
		 add(cookButton);
	}
}
