import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


//public class CheckBoxFrame extends JFrame {
public class RadioButtonFrame extends JFrame{
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    
    private Font italicFont;
    private Font boldItalicFont;
    // private JCheckBox boldJCheckBox;
    // private JCheckBox italicJCheckBox;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    
    private ButtonGroup radioGroup;
    
    
    // public CheckBoxFrame() {
    public RadioButtonFrame(){
	super("JCehckBox Test");
	setLayout( new FlowLayout() );

	textField = new JTextField("Watch the font style change", 25);
	// textField.setFont( new Font ("Serif", Font.PLAIN, 14)); 
	add(textField);


	plainJRadioButton = new JRadioButton("Plain", true);
	boldJRadioButton = new JRadioButton("Bold", false);
	italicJRadioButton = new JRadioButton("Italic", false);
	boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
	add(plainJRadioButton);
	add(boldJRadioButton);
	add(italicJRadioButton);
	add(boldItalicJRadioButton);

	radioGroup = new ButtonGroup();
	radioGroup.add(plainJRadioButton);
	radioGroup.add(boldJRadioButton);
	radioGroup.add(italicJRadioButton);
	radioGroup.add(boldItalicJRadioButton);

	plainFont = new Font("Serif", Font.PLAIN, 14);
	boldFont = new Font("Serif", Font.BOLD, 14);
	italicFont = new Font("Serif", Font.ITALIC, 14);
	boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	textField.setFont(plainFont);

	plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
	boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
	italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
	boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	


    }

    //private class CheckBoxHandler implements ItemListener {
    private class RadioButtonHandler implements ItemListener {
	private Font font;

	public RadioButtonHandler( Font f ) {
	    font = f;
	}

	public void itemStateChanged(ItemEvent event) {
	    textField.setFont(font);
	}
    }
}
