

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class imgGame {

	JFrame frame = new JFrame();
	JButton shuffleButton = new JButton("SHUFFLE");
	JButton restartButton = new JButton("RESTART");
	JButton checkButton = new JButton("CHECK");
	JButton returnButton = new JButton("CHANGE GAME");
	JLabel actionLabel = new JLabel("Fix the Image");
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JSeparator separator = new JSeparator();
	JSeparator separator_1 = new JSeparator();
	ImageIcon icon1= new ImageIcon("josef1.jpg");
	ImageIcon icon2= new ImageIcon("josef2.jpg");
	ImageIcon icon3= new ImageIcon("josef3.jpg");
	ImageIcon icon4= new ImageIcon("josef4.jpg");
	ImageIcon icon5= new ImageIcon("josef5.jpg");
	ImageIcon icon6= new ImageIcon("josef6.jpg");
	ImageIcon icon7= new ImageIcon("josef7.jpg");
	ImageIcon icon8= new ImageIcon("josef8.jpg");
	ImageIcon icon9= new ImageIcon("josef9.jpg");
	ImageIcon icon = new ImageIcon("");
	ImageIcon iconn = new ImageIcon("teduIcon.png");
	int maxP = 160;
	int clickCount = 0;
	int res = 0;
	
	public imgGame() {
		
		frame.setIconImage(iconn.getImage());
		frame.setTitle("Picture Puzzle");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 475, 486);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setLayout(null);
		frame.setVisible(true);
		
	
		restartButton.setEnabled(false);
		checkButton.setEnabled(false);
		returnButton.setEnabled(true);
		
		b1.setEnabled(false);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getIcon().equals(icon)) {
					numberChanger(b1, b2);
					clickCount++;
				}
				else if(b4.getIcon().equals(icon)) {
					numberChanger(b1, b4);
					clickCount++;
				}
				
			}
		});
		b1.setBackground(new Color(0, 191, 255));
		b1.setBounds(110, 68, 80, 80);
		b1.setIcon(icon1);
		frame.add(b1);
		
		b2.setEnabled(false);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getIcon().equals(icon)) {
					numberChanger(b2, b1);
					clickCount++;
				}
				else if(b3.getIcon().equals(icon)) {
					numberChanger(b2, b3);
					clickCount++;
				}
				else if(b5.getIcon().equals(icon)) {
					numberChanger(b2, b5);
					clickCount++;
				}
				
			}
		});
		b2.setBackground(new Color(0, 191, 255));
		b2.setBounds(190, 68, 80, 80);
		b2.setIcon(icon2);
		frame.add(b2);
		
		b3.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getIcon().equals(icon)) {
					numberChanger(b3, b2);
					clickCount++;
				}
				else if(b6.getIcon().equals(icon)) {
					numberChanger(b3, b6);
					clickCount++;
				}
				
			}
		});
		b3.setBackground(new Color(0, 191, 255));
		b3.setBounds(270, 68, 80, 80);
		b3.setIcon(icon3);
		frame.add(b3);
		
		b4.setEnabled(false);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getIcon().equals(icon)) {
					numberChanger(b4, b1);
					clickCount++;
				}
				else if(b5.getIcon().equals(icon)) {
					numberChanger(b4, b5);
					clickCount++;
				}
				else if(b7.getIcon().equals(icon)) {
					numberChanger(b4, b7);
					clickCount++;
				}
				
			}
		});
		b4.setBackground(new Color(0, 191, 255));
		b4.setBounds(110, 148, 80, 80);
		b4.setIcon(icon4);
		frame.add(b4);
		
		b5.setEnabled(false);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getIcon().equals(icon)) {
					numberChanger(b5, b2);
					clickCount++;
				}
				else if(b4.getIcon().equals(icon)) {
					numberChanger(b5, b4);
					clickCount++;
				}
				else if(b6.getIcon().equals(icon)) {
					numberChanger(b5, b6);
					clickCount++;
				}
				else if(b8.getIcon().equals(icon)) {
					numberChanger(b5, b8);
					clickCount++;
				}
				
			}
		});
		b5.setBackground(new Color(0, 191, 255));
		b5.setBounds(190, 148, 80, 80);
		b5.setIcon(icon5);
		frame.add(b5);
		
		b6.setEnabled(false);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b3.getIcon().equals(icon)) {
					numberChanger(b6, b3);
					clickCount++;
				}
				else if(b5.getIcon().equals(icon)) {
					numberChanger(b6, b5);
					clickCount++;
				}
				else if(b9.getIcon().equals(icon)) {
					numberChanger(b6, b9);
					clickCount++;
				}
				
			}
		});
		b6.setBackground(new Color(0, 191, 255));
		b6.setBounds(270, 148, 80, 80);
		b6.setIcon(icon6);
		frame.add(b6);
		
		b7.setEnabled(false);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b4.getIcon().equals(icon)) {
					numberChanger(b7, b4);
					clickCount++;
				}
				else if(b8.getIcon().equals(icon)) {
					numberChanger(b7, b8);
					clickCount++;
				}
				
			}
		});
		b7.setBackground(new Color(0, 191, 255));
		b7.setBounds(110, 228, 80, 80);
		b7.setIcon(icon7);
		frame.add(b7);
		
		b8.setEnabled(false);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b5.getIcon().equals(icon)) {
					numberChanger(b8, b5);
					clickCount++;
				}
				else if(b7.getIcon().equals(icon)) {
					numberChanger(b8, b7);
					clickCount++;
				}
				else if(b9.getIcon().equals(icon)) {
					numberChanger(b8, b9);
					clickCount++;
				}
				
			}
		});
		b8.setBackground(new Color(0, 191, 255));
		b8.setBounds(190, 228, 80, 80);
		b8.setIcon(icon8);
		frame.add(b8);
		
		b9.setEnabled(false);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b6.getIcon().equals(icon)) {
					numberChanger(b9, b6);
					clickCount++;
				}
				else if(b8.getIcon().equals(icon)) {
					numberChanger(b9, b8);
					clickCount++;
				}
				
			}
		});
		b9.setBackground(new Color(0, 191, 255));
		b9.setBounds(270, 228, 80, 80);
		b9.setIcon(icon9);
		frame.add(b9);
		
		shuffleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon[] list = new ImageIcon[9];
				numbers(list);
				b1.setIcon(list[0]);;
				b2.setIcon(list[1]);
				b3.setIcon(list[2]);
				b4.setIcon(list[3]);
				b5.setIcon(list[4]);
				b6.setIcon(list[5]);
				b7.setIcon(list[6]);
				b8.setIcon(list[7]);
				b9.setIcon(list[8]);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				shuffleButton.setEnabled(false);
				checkButton.setEnabled(true);
				actionLabel.setText("SHUFFLED");
			}
		});
		
		shuffleButton.setBackground(new Color(0, 255, 255));
		shuffleButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		shuffleButton.setBounds(10, 346, 120, 37);
		frame.add(shuffleButton);
		
		restartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setIcon(icon1);
				b2.setIcon(icon2);
				b3.setIcon(icon3);
				b4.setIcon(icon4);
				b5.setIcon(icon5);
				b6.setIcon(icon6);
				b7.setIcon(icon7);
				b8.setIcon(icon8);
				b9.setIcon(icon9);
				shuffleButton.setEnabled(true);
				restartButton.setEnabled(false);
				actionLabel.setText("Fix the Image");
				maxP = 160;
				clickCount = 0;
				res = 0;
			}
		});
		
		restartButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		restartButton.setBackground(new Color(244, 164, 96));
		restartButton.setBounds(329, 346, 120, 37);
		frame.add(restartButton);
		
		
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				restartButton.setEnabled(true);
				checkButton.setEnabled(false);
				if(b1.getIcon()==icon1&&
						b2.getIcon()==icon2&&
						b3.getIcon()==icon3&&
						b4.getIcon()==icon4&&
						b5.getIcon()==icon5&&
						b6.getIcon()==icon6&&
						b7.getIcon()==icon7&&
						b8.getIcon()==icon8) {
					res = (maxP-clickCount);
					if(res <= 0) {
						actionLabel.setText("Correct! No Points Gained");
					}
					else {
						actionLabel.setText(Integer.toString(res) +" Points Gained");
						try {
						    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
						    String query = "UPDATE player SET Score = Score + ? WHERE Player = ?";
						    PreparedStatement pst = con.prepareStatement(query);
						    
						    pst.setInt(1, res);
						    pst.setString(2, LogSignInPage.nickName);
						    
						    pst.executeUpdate();
						    
						    pst.close();
						    con.close();   
						} catch (SQLException e1) {
						    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				else {
					res = 14;
					actionLabel.setText(Integer.toString(res) +" Points Lost");
					try {
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, res);
					    pst.setString(2, LogSignInPage.nickName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		checkButton.setBackground(new Color(0, 255, 127));
		checkButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		checkButton.setBounds(158, 346, 138, 37);
		frame.add(checkButton);
		
		actionLabel.setForeground(new Color(255, 0, 0));
		actionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		actionLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		actionLabel.setBounds(10, 11, 439, 36);
		frame.add(actionLabel);
		
		separator.setBounds(0, 45, 459, 2);
		frame.add(separator);
		
		separator_1.setBounds(0, 333, 459, 2);
		frame.add(separator_1);
		
		returnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selectionWindow selectionWindow = new selectionWindow();
				int x = frame.getX();
				int y = frame.getY();
				selectionWindow.frame.setLocation(x, y);
				frame.dispose();
				
			}
		});
		returnButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		returnButton.setBackground(new Color(186, 85, 211));
		returnButton.setBounds(131, 394, 196, 37);
		frame.add(returnButton);
		
	}
	
	public void numberChanger(JButton button1, JButton button2) {
		
		Icon b1Icon = button1.getIcon();
		Icon b2Icon = button2.getIcon();
		
		button1.setIcon(b2Icon);
		button2.setIcon(b1Icon);
		
	}
	
	public ImageIcon[] numbers(ImageIcon[] list) {
	
		ImageIcon[] numbers = {icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon};
		Collections.shuffle(Arrays.asList(numbers));
		for(int i = 0; i <= numbers.length - 1; i++) {
			list[i] = numbers[i];
		}
		
		return list;
		
	}
	
}



