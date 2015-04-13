import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() {
	super("Testing JLabel");
	setLayout( new FlowLayout() ); //set frame layout

	label1 = new JLabel("Label with text");
	label1.setToolTipText( "This is label1" );
	add(label1); // add label to JFrame





	ImageIcon icon = new ImageIcon( getClass().getResource("icon.png") );

	Image image = icon.getImage();
	Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
	icon = new ImageIcon(newimg);

	
	label2 = new JLabel( "Label with text and icon", icon, SwingConstants.LEFT );
	add(label2);

	label3 = new JLabel();
	label3.setText( "Label with icon and text at bottom" );
	label3.setIcon(icon);
	label3.setHorizontalTextPosition( SwingConstants.CENTER );
	label3.setVerticalTextPosition( SwingConstants.BOTTOM);
	label3.setToolTipText( "This is label3" );
	add(label3);
    }
}
