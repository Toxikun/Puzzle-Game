
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class creditsWindow {
	
	JFrame frame = new JFrame();
	JLabel header = new JLabel("CREDITS");
	JLabel instructor = new JLabel("Instructor:");
	JLabel students = new JLabel("Students:");
	JLabel ozlem = new JLabel("Özlem ALBAYRAK");
	JLabel doruk = new JLabel("Murat Doruk AYDIN");
	JLabel cubun = new JLabel("Ahmet Orkun YILMAZ");
	JLabel bozkurt = new JLabel("Boran BOZKURT");
	JLabel mert = new JLabel("Batuhan Mert KORKMAZ");
	JLabel pako = new JLabel("Umut PAKLACI");
	JButton backButton = new JButton("Back");
	ImageIcon mdaIcon = new ImageIcon("mda.png");
	ImageIcon cubunIcon = new ImageIcon("cubun.png");
	ImageIcon bIcon = new ImageIcon("buzkurt.png");
	ImageIcon mertIcon = new ImageIcon("mert.png");
	ImageIcon pakoIcon = new ImageIcon("pako.png");
	JLabel mdaLabel = new JLabel();
	JLabel cubunLabel = new JLabel();
	JLabel bLabel = new JLabel();
	JLabel mertLabel = new JLabel();
	JLabel pakoLabel = new JLabel();
	JLabel elevLabel = new JLabel("Elevator Music - GamingWithMaks");
	JLabel musicLabel = new JLabel("Musics:");
	JLabel RushELabel = new JLabel("Rush E - Sheet Music Boss");
	JLabel CLabel = new JLabel("Correct/Wrong - CorrectAndWrong");
	JLabel ClickLabel = new JLabel("Click - Simple Sound Effects");

	
	public creditsWindow() {
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 452, 670);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setTitle("Credits");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		frame.add(header);
		frame.add(instructor);
		frame.add(students);
		frame.add(ozlem);
		frame.add(doruk);
		frame.add(cubun);
		frame.add(bozkurt);
		frame.add(mert);
		frame.add(pako);
		
		header.setForeground(new Color(220, 20, 60));
		header.setFont(new Font("Tahoma", Font.BOLD, 34));
		header.setVerticalAlignment(SwingConstants.TOP);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setBounds(69, 11, 298, 46);
		
		instructor.setForeground(new Color(255, 69, 0));
		instructor.setFont(new Font("Tahoma", Font.BOLD, 24));
		instructor.setBounds(10, 50, 233, 46);
		
		students.setForeground(new Color(255, 69, 0));
		students.setFont(new Font("Tahoma", Font.BOLD, 24));
		students.setBounds(10, 152, 233, 46);
		
		ozlem.setForeground(new Color(0, 0, 0));
		ozlem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ozlem.setBounds(20, 107, 233, 34);
		
		doruk.setForeground(Color.BLACK);
		doruk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		doruk.setBounds(20, 209, 233, 34);
		
		mdaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mdaLabel.setBounds(304, 115, 75, 75);
		mdaLabel.setIcon(mdaIcon);
		frame.add(mdaLabel);
		
		cubun.setForeground(Color.BLACK);
		cubun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cubun.setBounds(20, 254, 233, 34);
		
		cubunLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cubunLabel.setBounds(220, 188, 75, 75);
		cubunLabel.setIcon(cubunIcon);
		frame.add(cubunLabel);
		
		bozkurt.setForeground(Color.BLACK);
		bozkurt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bozkurt.setBounds(20, 299, 233, 34);
		
		bLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bLabel.setBounds(304, 255, 75, 75);
		bLabel.setIcon(bIcon);
		frame.add(bLabel);
		
		mert.setForeground(Color.BLACK);
		mert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mert.setBounds(20, 344, 233, 34);
		
		mertLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mertLabel.setBounds(220, 325, 75, 75);
		mertLabel.setIcon(mertIcon);
		frame.add(mertLabel);
		
		pako.setForeground(Color.BLACK);
		pako.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pako.setBounds(20, 389, 233, 34);
		
		pakoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pakoLabel.setBounds(304, 405, 75, 75);
		pakoLabel.setIcon(pakoIcon);
		frame.add(pakoLabel);
		
		musicLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		musicLabel.setForeground(new Color(255, 69, 0));
		musicLabel.setBounds(10, 433, 173, 41);
		frame.add(musicLabel);
		
		RushELabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RushELabel.setBounds(20, 485, 220, 34);
		frame.add(RushELabel);
		
		CLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CLabel.setBounds(20, 513, 288, 34);
		frame.add(CLabel);
		
		ClickLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ClickLabel.setBounds(20, 541, 288, 34);
		frame.add(ClickLabel);
		
		elevLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		elevLabel.setBounds(20, 567, 288, 34);
		frame.add(elevLabel);
		
		backButton.setBounds(0, 0, 89, 23);
		backButton.setBackground(new Color(60, 179, 113));
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainMenu mainMenu = new mainMenu();
				int x = frame.getX();
				int y = frame.getY();
				mainMenu.frame.setLocation(x, y);
				frame.dispose();
			}
		});
		frame.add(backButton);	
		
	}
}