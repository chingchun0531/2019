package vivian.com;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500, 300);
		JButton ok = new JButton("OK");
		JPanel north = new JPanel();
		north.add(ok);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}
