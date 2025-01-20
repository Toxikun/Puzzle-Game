
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.mysql.cj.x.protobuf.MysqlxCursor.Open;

import java.awt.Font;

public class mainMenu {
	
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("teduIcon.png");
	JButton gameButton = new JButton("New Game");
	JButton rButton = new JButton("Rules");
	JButton exitButton = new JButton("Exit");
	JButton scoreButton = new JButton("Scores");
	JButton creditButon = new JButton("Credits");
	JButton playerButton = new JButton("Account");
	JLabel header = new JLabel("Sliding Puzzle Game");
	LogSignInPage lsp;
	JLabel img = new JLabel();
	
	public mainMenu(){
			
		frame.setIconImage(icon.getImage());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setTitle("Main Menu");
		frame.setBounds(100, 100, 500, 540);
		frame.setLayout(null);
		frame.setVisible(true);
		
		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectionWindow selectionWindow = new selectionWindow();
				int x = frame.getX();
				int y = frame.getY();
				selectionWindow.frame.setLocation(x, y);
				frame.dispose();
				
			}
		});
		gameButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		gameButton.setBackground(new Color(30, 100, 190));
		gameButton.setBounds(163, 203, 146, 40);
		frame.getContentPane().add(gameButton);
		
		playerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				LogSignInPage logSignInPage = new LogSignInPage();
				int x = frame.getX();
				int y = frame.getY();
				logSignInPage.frame.setLocation(x, y);
				if(scoresWindow.open == true) {
					scoresWindow.frame.dispose();
				}
				
			}
		});
		playerButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		playerButton.setBackground(new Color(130, 100, 100));
		playerButton.setBounds(163, 305, 146, 40);
		frame.getContentPane().add(playerButton);
			
		rButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		rButton.setBackground(new Color(255, 127, 80));
		rButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Rules rules = new Rules();
				int x = frame.getX();
				int y = frame.getY();
				rules.frame.setLocation(x, y);
				frame.dispose();
				
			}
		});
		rButton.setBounds(163, 254, 146, 40);
		frame.getContentPane().add(rButton);
			
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		exitButton.setBackground(new Color(60, 179, 113));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(163, 356, 146, 40);
		frame.getContentPane().add(exitButton);
		
		
		creditButon.setFont(new Font("Tahoma", Font.BOLD, 18));
		creditButon.setBackground(new Color(100, 107, 147));
		creditButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				creditsWindow creditsWindow = new creditsWindow();
				int x = frame.getX();
				int y = frame.getY();
				creditsWindow.frame.setLocation(x,y);
				frame.dispose();
				
			}
		});
		creditButon.setBounds(243, 450, 146, 40);
		frame.getContentPane().add(creditButon);
		
		scoreButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		scoreButton.setBackground(new Color(170, 177, 217));
		scoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				scoresWindow scoresWindow = new scoresWindow();
				int x = frame.getX();
				int y = frame.getY();
				scoresWindow.frame.setLocation(x,y);
				
			}
		});
		scoreButton.setBounds(90, 450, 146, 40);
		frame.getContentPane().add(scoreButton);
			
		header.setFont(new Font("Tahoma", Font.BOLD, 24));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setBounds(96, 11, 296, 58);
		frame.add(header);
		
		img.setIcon(icon);
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setBounds(174, 65, 125, 125);
		frame.add(img);
		
		
	}
	
}