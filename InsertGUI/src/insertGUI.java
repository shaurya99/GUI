import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class insertGUI {
	public static void main(String s[])
			{
				JFrame f =  new JFrame();
				JLabel lr=new JLabel("Roll");
				JLabel ln= new JLabel("Name");
				JLabel lm=new JLabel("Marks");
				
				JTextField rollText = new JTextField();
				JTextField nameText = new JTextField();
				JTextField marksText = new JTextField();
				
				Myhandler m = new Myhandler();
				
				JButton insertButton = new JButton("insert");
				
				insertButton.addActionListener(m);
				
				lr.setBounds(50 , 50 , 100 , 30);
				rollText.setBounds(120,50,100,30);
				
				ln.setBounds(50,100,100,30);
				nameText.setBounds(120,100,100,30);
				
				lm.setBounds(50,150,100,30);
				marksText.setBounds(120,150,100,30);
				
				f.setLayout(null);
				f.add(lr);
				f.add(rollText);
				
				f.add(ln);
				f.add(nameText);
				
				f.add(lm);
				f.add(marksText);
				
				insertButton.setBounds(100,200,100,30);
				f.add(insertButton);
				
				f.setSize(300,300);
				f.setVisible(true);
				
			}
}


