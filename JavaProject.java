 //Youtube.java

package com.youtube;
import java.util.ArrayList;
import java.util.List;
class Channel
{
	List<Customer_Subscriber> l1 = new ArrayList<Customer_Subscriber>();
	String title;
	public void subscribe(Customer_Subscriber sub)
	{	
		l1.add(sub);
	}
	public void unSubscribe(Customer_Subscriber c)
	{
		l1.remove(c);
	}
	public void upload(String t) {
		this.title = t;
		notifiySubscriber();
	}
	public void notifiySubscriber(){
		for(Customer_Subscriber sub:l1)
		{
			sub.update();
		}
	}
}
class Customer_Subscriber
{
	String NAME;
	Channel worldAffairs = new Channel();
	public Customer_Subscriber(String n) 
	{
		this.NAME = n;
	}
	public void subscribeChannel(Channel ch)
	{
		worldAffairs=ch;
	}
	public void update()
	{
		System.out.println("Hello "+NAME+", Video Uploaded : "+worldAffairs.title);
	}
}
public class Youtube 
{
	public static void main(String[] args)
	{
		Channel c = new  Channel();
		Customer_Subscriber cs1 = new Customer_Subscriber("Amol");
		Customer_Subscriber cs2 = new Customer_Subscriber("Yash");
		Customer_Subscriber cs3 = new Customer_Subscriber("Rohan");
		Customer_Subscriber cs4 = new Customer_Subscriber("Kiran");
		Customer_Subscriber cs5 = new Customer_Subscriber("Mohan");
		c.subscribe(cs1);
		c.subscribe(cs2);
		c.subscribe(cs3);
		c.subscribe(cs4);
		c.subscribe(cs5);
		c.unSubscribe(cs4);
		cs1.subscribeChannel(c);
		cs2.subscribeChannel(c);
		cs3.subscribeChannel(c);
		cs4.subscribeChannel(c);
		cs5.subscribeChannel(c);
		c.upload("TechMe");
	}
}

//UI_01.java

package com.ui;

import java.awt.*;

class Amol extends Frame {
	Amol() {
		Button b = new Button("Home");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(400, 450);
		setLayout(null);
		setVisible(true);

	}
}

public class UI_01 {
	public static void main(String[] args) {
		new Amol();
	}
}

//UI_02.java

package com.ui;
import java.awt.*;
import java.awt.event.*;
class Amol1 extends Frame
{
	Label l;
	public Amol1()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
		
		l= new Label("Window Closing Example");
		this.add(l);
		setTitle("Sinhgad");
		setSize(400,450);
		setLayout(null);
		setVisible(true);
	}
}
public class UI_02 
{
	public static void main(String[] args)
	{
		new Amol1();
	}
}

//UI_03.java

package com.ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UI_03 extends JFrame
{
	JLabel l1,l2,l3;
	JTextField f1,f2;
	JButton b1,b2,b3;
	JFrame jf;
	public UI_03() 
	{
		jf = new JFrame("FlowLayout Example");
		jf.setSize(400,400);
		l1=new JLabel("Enter your Name : ");
		l2=new JLabel("Enter your City : ");
		f1=new JTextField(15);
		f2=new JTextField(15);
		b1=new JButton("Clear");
		b2=new JButton("Submit");
		b3=new JButton("Exit");
		jf.setLayout(new FlowLayout());
		
		jf.add(l1);
		jf.add(f1);
		jf.add(l2);
		jf.add(f2);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		
		jf.setVisible(true);
		

	}
	public static void main(String[] args)
	{
		new UI_03();
	}
}


//UI_04.java


package com.ui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UI_04 extends JFrame
{
	JFrame f1;
	public UI_04()
	{
		f1=new JFrame("GridLayout Example");
		
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("*");
		
		JButton b5=new JButton("4");
		JButton b6=new JButton("5");
		JButton b7=new JButton("6");
		JButton b8=new JButton("/");
		
		JButton b9=new JButton("7");
		JButton b10=new JButton("8");
		JButton b11=new JButton("9");
		JButton b12=new JButton("-");
		
		JButton b13=new JButton("0");
		JButton b14=new JButton("=");
		JButton b15=new JButton("AC");
		JButton b16=new JButton("+");
		
		f1.setLayout(new GridLayout(2,7));
		
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(b7);
		f1.add(b8);
		f1.add(b9);
		f1.add(b10);
		f1.add(b11);
		f1.add(b12);
		f1.add(b13);
		f1.add(b14);
		f1.add(b15);
		f1.add(b16);
		
		f1.setSize(400,400);
		f1.setVisible(true);
	}
	public static void main(String[] args)
	{
		new UI_04();
	}
}

//UI_05.java

package com.ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UI_05 extends JFrame implements ActionListener
{
	JFrame jf;
	JPanel jp;
	CardLayout cd;
	public UI_05()
	{
		jf = new JFrame("CardLayout Example");
		cd = new CardLayout();
		
		/*
		 * Creating a main parent panel that will 
		 * contain two child panels.		
		 */
		
		jp = new JPanel();
		
		//Creating two child panel
		
		JPanel cp1 = new JPanel();
		JPanel cp2 = new JPanel();
		
		JButton b1 = new JButton("Numbers");
		JButton b2 = new JButton("Alphabates");
		
		JButton b3 = new JButton("1");
		JButton b4 = new JButton("2");
		JButton b5 = new JButton("3");
		
		//Adding b3,b4,b5 buttons to cp1
		
		cp1.add(b3);
		cp1.add(b4);
		cp1.add(b5);
		
		JButton b6 = new JButton("A");
		JButton b7 = new JButton("B");
		JButton b8 = new JButton("C");
		JButton b9 = new JButton("D");
		
		//Adding B6,B7,B8,B9 buttons to cp2
		
		cp2.add(b6);
		cp2.add(b7);
		cp2.add(b8);
		cp2.add(b9);
		
		/*
		 * Setting the positioning of the components 
		 * in parent panel that contains cp1 and cp2 to card layout
		 */
		
		jp.setLayout(cd);
		
		//Adding cp1 and cp2 to parent panel
		
		jp.add(cp1,"Numbers");
		jp.add(cp2,"Alphabates");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//Setting container JframesLayouts to flowLayout
		
		jf.setLayout(new FlowLayout());
		
		/*
		 * Adding two buttons to JFrame, this buttons 
		 * will remain commonly visible to all panels
		 */
		
		jf.add(b1);
		jf.add(b2);
		
		//Adding parent panel to JFrame
		
		jf.add(jp);
		
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		/*
		 * if "Numbers" button Is Clicked , open the jpanel
		 * with buttons showing Numbers
		 */
		
		if(e.getActionCommand()=="Numbers")
		{
			cd.show(jp, "Numbers");
		}
		
		/*
		 * if "Alphabets" button Is Clicked , open the jpanel
		 * with buttons showing Alphabates.
		 */
		else
		{
			cd.show(jp,"Alphabates");
		}
	}
	public static void main(String[] args)
	{
		new UI_05();
	}
}

//UI_06.java

package com.ui;
import java.awt.*;
import java.awt.event.*;
public class UI_06 extends Frame implements ActionListener
{
	Button R,G,B;
	
	public UI_06()
	{
		R = new Button("Red");
		G = new Button("Green");
		B = new Button("Blue");
		
		setLayout(new FlowLayout());
		add(R);
		add(G);
		add(B);
		
		R.addActionListener(this);
		G.addActionListener(this);
		B.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==R)
		{
			setBackground(Color.red);
		}
		else if(e.getSource()==G)
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
		}
	}
	public static void main(String[] args) 
	{
		UI_06 obj = new UI_06();
		obj.setSize(400,300);
		obj.setVisible(true);
		obj.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}

//UI_07.java

package com.ui;
import java.awt.*;
import java.awt.event.*;
public class UI_07 implements MouseListener
{
	Label l1,l2;
	Frame f1;
	String str;
	
	public UI_07()
	{
		f1 = new Frame("Mouse Handling Example");
		l1 = new Label("Handling Mouse Event in the frame window",Label.CENTER);
		l2 = new Label();
		f1.setLayout(new FlowLayout());
		f1.add(l1);
		f1.add(l2);
		f1.addMouseListener(this);
		f1.setSize(400,400);
		f1.setVisible(true);
	}
	
	public void mouseEntered(MouseEvent e)
	{
		l2.setText("Mouse has Entered the window area");
		f1.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l2.setText("Mouse Was Clicked");
		f1.setVisible(true);
	}
	public void mousePressed(MouseEvent e)
	{
		l2.setText("Mouse button is being pressed");
		f1.setVisible(true);
	}
	public void mouseReleased(MouseEvent e)
	{
		l2.setText("Mouse button is Relesed");
		f1.setVisible(true);
	}
	public void mouseExited(MouseEvent e)
	{
		l2.setText("Mouse has Exited the window area");
		f1.setVisible(true);
	}
	public static void main(String[] args)
	{
		new UI_07();
	}

}






















