
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class selectionWindow {

	JFrame frame = new JFrame();
	JLabel numPuzzle = new JLabel("Numeric Puzzle");
	JLabel imgPuzzle = new JLabel("Image Puzzle");
	String[] Ds = {"Easy(9P)", "Normal(16P)", "Challenge"};
	JComboBox comboBox = new JComboBox(Ds);
	JButton returnButton = new JButton("Main Menu");
	JButton imgGameButton = new JButton("Start(20P)");
	int ser = 0;
	
	public selectionWindow() {
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setTitle("New Game");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 455, 196);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		numPuzzle.setFont(new Font("Tahoma", Font.BOLD, 20));
		numPuzzle.setHorizontalAlignment(SwingConstants.CENTER);
		numPuzzle.setBounds(31, 21, 182, 25);
		frame.add(numPuzzle);
		
		imgPuzzle.setFont(new Font("Tahoma", Font.BOLD, 20));
		imgPuzzle.setHorizontalAlignment(SwingConstants.CENTER);
		imgPuzzle.setBounds(223, 21, 182, 25);
		frame.add(imgPuzzle);
		
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBackground(new Color(255, 250, 205));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex()==0) {
					
					d3Game d3Game = new d3Game();
					int x = frame.getX();
					int y = frame.getY();
					d3Game.frame.setLocation(x, y);
					
					try {
						ser = 9;
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, ser);
					    pst.setString(2, LogSignInPage.nickName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					frame.dispose();
					
				}
				else if(comboBox.getSelectedIndex()==1) {
					
					d4Game d4Game = new d4Game();
					int x = frame.getX();
					int y = frame.getY();
					d4Game.frame.setLocation(x, y);
					try {
						ser = 16;
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, ser);
					    pst.setString(2, LogSignInPage.nickName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					frame.dispose();
					
				}
				else if(comboBox.getSelectedIndex()==2) {
					
					hardGame hardGame = new hardGame();
					int x = frame.getX();
					int y = frame.getY();
					hardGame.frame.setLocation(x, y);
					frame.dispose();
					
				}
				
			}
		});
		comboBox.setBounds(88, 57, 79, 22);
		frame.add(comboBox);
		
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainMenu mainMenu = new mainMenu();
				int x = frame.getX();
				int y = frame.getY();
				mainMenu.frame.setLocation(x, y);
				frame.dispose();
				
			}
		});
		returnButton.setBackground(new Color(253, 245, 230));
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		returnButton.setBounds(162, 134, 110, 23);
		frame.add(returnButton);
		
		imgGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				imgGame imgGame = new imgGame();
				int x = frame.getX();
				int y = frame.getY();
				imgGame.frame.setLocation(x, y);
				try {
					ser = 20;
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
				    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
				    PreparedStatement pst = con.prepareStatement(query);
				    
				    pst.setInt(1, ser);
				    pst.setString(2, LogSignInPage.nickName);
				    
				    pst.executeUpdate();
				    
				    pst.close();
				    con.close();   
				} catch (SQLException e1) {
				    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				frame.dispose();
				
			}
		});
		imgGameButton.setBackground(new Color(255, 250, 205));
		imgGameButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		imgGameButton.setBounds(255, 57, 110, 23);
		frame.add(imgGameButton);
		
		
	}
	
}
