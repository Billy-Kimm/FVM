package UI.Remote;

import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

public class East extends JPanel {

	JButton button1, button2, button3;

	East() {

		ButtonGroup topGroup = new ButtonGroup();

		button1 = new JButton("�α���");
		button1.setBounds(250, 200, 100, 30);

		add(button1);

		button2 = new JButton("ȸ������");
		add(button2);

		button3 = new JButton("�������͸�");
		add(button3);

		Box topBox = Box.createVerticalBox();
		topBox.setBorder(BorderFactory.createTitledBorder("Toppings"));

		setVisible(true);
	}
}
