import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class console {


public static void main(String args[]){

//GridBagLayout layout=new GridBagLayout ();
//GridBagConstraints angle=new GridBagConstraints();
BorderLayout layout= new BorderLayout();
JPanel panel1=new JPanel(layout);


//panel1.setLayout(layout);
JFrame display=new JFrame();
JButton button1=new JButton("stack");
JButton button2=new JButton("queue");
JPanel panel2 = new JPanel(layout);

panel1.add(button1);
panel1.setBounds(0,0,100,100);
button1.addActionListener(new ActionListener(){

            @Override

			public void actionPerformed(ActionEvent ae){
				StackLinkedList sll=new StackLinkedList();
				sll.menu();
				System.out.print("saman");
			}
        });

panel2.add(button2);
panel2.setBounds(100,0,100,100);

frame.getContentPane().add(panel1);
getContentPane().add(panel2);
revalidate();
button2.addActionListener(new ActionListener(){

            @Override

			public void actionPerformed(ActionEvent ae){
				QueueLinkedList qll=new QueueLinkedList ();
				qll.menu();
				System.out.print("saman");
			}
        });



display.add(panel1);

display.setDefaultCloseOperation(3);
display.setVisible(true);
display.setSize(200,200);
}


}