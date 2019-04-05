import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField answer= new JTextField(30);
	JFrame jframe= new JFrame("Binary Converter");
	JPanel jpanel= new JPanel();
public static void main(String[] args) {
	BinaryConverter binary= new BinaryConverter();
	binary.method();


}

public void method() {
   
	
	
	JButton jbutton= new JButton("Convert");
    jbutton.setSize(200,100);
	jbutton.addMouseListener(this);
	
	jpanel.add(jbutton);
	jpanel.add(answer);
	jframe.add(jpanel);
	
	
	jframe.setSize(400, 100);
	jframe.setVisible(true);
	
}

String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}

@Override
public void mouseClicked(MouseEvent e) {
	
	   
}

@Override
public void mousePressed(MouseEvent e) {
	   JLabel jlabel= new JLabel();
	
	   jlabel.setText(convert(answer.getText()));
	   jpanel.add(jlabel);
	   jframe.add(jpanel);
	   jframe.pack();
      
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
