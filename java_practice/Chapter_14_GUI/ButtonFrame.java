import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

    private JButton plainJButton;
    private JButton fancyJButton;

    public ButtonFrame() {
	super("Testing Button");
	setLayout(new FlowLayout());

	plainJButton = new JButton("Plain Button");
	add(plainJButton);

	Icon plus1 = new ImageIcon(getClass().getResource("plus.png"));
	Icon plus2 = new ImageIcon(getClass().getResource("plus.png"));
	fancyJButton = new JButton("fancy", plus1);
	add(fancyJButton);

	ButtonHandler handler = new ButtonHandler();
	fancyJButton.addActionListener(handler);
	plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
	 
	public void actionPerformed(ActionEvent event) {

	    JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
	}
    }
}
