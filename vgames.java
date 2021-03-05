// Java program to implement 
// a Simple Registration Form 
// using Java Swing 

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class MyFrame 
	extends JFrame 
	implements ActionListener { 

	// Components of the Form 
	private Container c; 
	private JLabel title; 
	private JLabel name; 
	private JTextField tname; 
	private JLabel EA; 
	private JTextField tmno; 
	private JLabel type;
	private JRadioButton CC;
	private JRadioButton DC;
	private JRadioButton OB;
	private JRadioButton PC; 
	private JRadioButton PS;
	private JRadioButton xbox;
	private ButtonGroup typep; 
	private JLabel dob; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JLabel add; 
	private JTextArea tadd; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset; 
	private JTextArea tout; 
	private JLabel res; 
	private JTextArea resadd; 

	private String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	private String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sup", "Oct", "Nov", "Dec" }; 
	private String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019", "2020" }; 

	// constructor, to initialize the components 
	// with default values. 
	public MyFrame() 
	{ 
		setTitle("Video Games Service's"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("Video Games Service's"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(350, 30); 
		title.setLocation(300, 20); 
		c.add(title); 

		name = new JLabel("Name of the game :"); 
		name.setFont(new Font("Arial", Font.PLAIN, 15)); 
		name.setSize(150, 20); 
		name.setLocation(25, 100); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(200, 100); 
		c.add(tname); 

		EA = new JLabel("Order.no :"); 
		EA.setFont(new Font("Arial", Font.PLAIN, 15)); 
		EA.setSize(150, 20); 
		EA.setLocation(25, 145); 
		c.add(EA); 

		tmno = new JTextField(); 
		tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tmno.setSize(190, 20); 
		tmno.setLocation(200, 145); 
		c.add(tmno); 

		type = new JLabel("Platform :"); 
		type.setFont(new Font("Arial", Font.PLAIN, 15)); 
		type.setSize(150, 20); 
		type.setLocation(25, 200); 
		c.add(type); 

		PC = new JRadioButton("PC"); 
		PC.setFont(new Font("Arial", Font.PLAIN, 15)); 
		PC.setSelected(true); 
		PC.setSize(70, 20); 
		PC.setLocation(200, 200); 
		c.add(PC); 

		PS = new JRadioButton("PS"); 
		PS.setFont(new Font("Arial", Font.PLAIN, 15)); 
		PS.setSelected(false); 
		PS.setSize(80, 20); 
		PS.setLocation(275, 200); 
		c.add(PS); 
		
		xbox = new JRadioButton("xbox"); 
		xbox.setFont(new Font("Arial", Font.PLAIN, 15)); 
		xbox.setSelected(true); 
		xbox.setSize(90, 20); 
		xbox.setLocation(200, 225); 
		c.add(xbox);

		typep = new ButtonGroup(); 
		typep.add(PC); 
		typep.add(PS); 
		typep.add(xbox);

		dob = new JLabel("Purchase Date :"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 17)); 
		dob.setSize(150, 20); 
		dob.setLocation(25, 250); 
		c.add(dob); 

		date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setSize(50, 20); 
		date.setLocation(200, 250); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setSize(60, 20); 
		month.setLocation(250, 250); 
		c.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setSize(60, 20); 
		year.setLocation(320, 250); 
		c.add(year);
		
		type = new JLabel("Mode of purchase :"); 
		type.setFont(new Font("Arial", Font.PLAIN, 15)); 
		type.setSize(150, 20); 
		type.setLocation(25, 300); 
		c.add(type);
		
		CC = new JRadioButton("CreditCard"); 
		CC.setFont(new Font("Arial", Font.PLAIN, 10)); 
		CC.setSelected(true);
		CC.setSize(90, 20);
		CC.setLocation(200, 300); 
		c.add(CC);

		DC = new JRadioButton("DebitCard"); 
		DC.setFont(new Font("Arial", Font.PLAIN, 10)); 
		DC.setSelected(true); 
		DC.setSize(85, 20); 
		DC.setLocation(287, 300); 
		c.add(DC);

		OB = new JRadioButton("NetBanking"); 
		OB.setFont(new Font("Arial", Font.PLAIN, 10)); 
		OB.setSelected(true); 
		OB.setSize(130, 20); 
		OB.setLocation(370, 300); 
		c.add(OB);
		
		typep = new ButtonGroup(); 
		typep.add(CC); 
		typep.add(DC); 
		typep.add(OB);

		add = new JLabel("Address :"); 
		add.setFont(new Font("Arial", Font.PLAIN, 17)); 
		add.setSize(150, 20); 
		add.setLocation(25, 325); 
		c.add(add); 

		tadd = new JTextArea(); 
		tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadd.setSize(200, 75); 
		tadd.setLocation(200, 325); 
		tadd.setLineWrap(true); 
		c.add(tadd); 

		term = new JCheckBox("I'm not a robot."); 
		term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		term.setSize(250, 20); 
		term.setLocation(150, 400); 
		c.add(term); 

		sub = new JButton("Submit"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub.setSize(100, 20); 
		sub.setLocation(150, 450); 
		sub.addActionListener(this); 
		c.add(sub); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset.setSize(100, 20); 
		reset.setLocation(270, 450); 
		reset.addActionListener(this); 
		c.add(reset); 

		tout = new JTextArea(); 
		tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tout.setSize(300, 400); 
		tout.setLocation(500, 100); 
		tout.setLineWrap(true); 
		tout.setEditable(false); 
		c.add(tout); 

		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 20)); 
		res.setSize(500, 25); 
		res.setLocation(100, 500); 
		c.add(res); 

		resadd = new JTextArea(); 
		resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		resadd.setSize(200, 75); 
		resadd.setLocation(580, 175); 
		resadd.setLineWrap(true); 
		c.add(resadd); 

		setVisible(true); 
	} 

	// method actionPerformed() 
	// to get the action performed 
	// by the user and act accordingly 
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				String data1; 
				String data 
					= "Name of the game : "
					+ tname.getText() + "\n"
					+ "Order.no : "
					+ tmno.getText() + "\n"; 
				if (PC.isSelected()) 
					data1 = " Platform : PC"
							+ "\n"; 
				else if (PS.isSelected())
					data1 = "Platform : PS"
							+ "\n";
				else 
					data1 = "Platform : xbox"
							+ "\n";							
				String data2 
					= "Purchase : "
					+ (String)date.getSelectedItem() 
					+ "/" + (String)month.getSelectedItem() 
					+ "/" + (String)year.getSelectedItem() 
					+ "\n";
				
				String data3 = "Address : " + tadd.getText()+"\n";

		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				String data4;
					if (CC.isSelected()) 
					data4 = " Mode of purchase : CreditCard"
							+ "\n"; 
				else if (DC.isSelected())
					data4 = "Mode of purchase : DebitCard"
							+ "\n";
				else 
					data4 = "Mode of purchase : Netbanking"
							+ "\n";
				
				tout.setText(data + data1 + data2 + data3 + data4); 
				tout.setEditable(false); 
				res.setText("Thank you for your patience"); 
			} 
			else { 
				tout.setText(""); 
				resadd.setText(""); 
				res.setText("Please accept the"
							+ " terms & conditions.."); 
			} 
		}
			}
		}

		else if (e.getSource() == reset) { 
			String def = ""; 
			tname.setText(def); 
			tadd.setText(def); 
			tmno.setText(def); 
			res.setText(def); 
			tout.setText(def); 
			term.setSelected(false); 
			date.setSelectedIndex(0); 
			month.setSelectedIndex(0); 
			year.setSelectedIndex(0); 
			resadd.setText(def); 
		} 
	} 
} 

// Driver Code 
class vgames { 

	public static void main(String[] args) throws Exception 
	{ 
		MyFrame f = new MyFrame(); 
	} 
} 
