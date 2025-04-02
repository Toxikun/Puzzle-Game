  

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class d3Game {
	
	JFrame frame = new JFrame();
	JButton shuffleButton = new JButton("SHUFFLE");
	JButton restartButton = new JButton("RESTART");
	JButton checkButton = new JButton("CHECK");
	JButton returnButton = new JButton("CHANGE GAME");
	JLabel actionLabel = new JLabel("Sort Smallest to Largest");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton(" ");
	JSeparator separator = new JSeparator();
	JSeparator separator_1 = new JSeparator();
	int maxP = 110;
	int clickCount = 0;
	int res = 0;
	
	public d3Game() {
		

		restartButton.setEnabled(false);
		checkButton.setEnabled(false);
		returnButton.setEnabled(true);
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setTitle("3x3 Numeric Puzzle");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 475, 486);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setLayout(null);
		frame.setVisible(true);
		
		b1.setFont(new Font("Monospaced", Font.BOLD, 25));
		b1.setEnabled(false);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b1, b2);
					clickCount++;
				}
				else if(b4.getText().equals(" ")) {
					numberChanger(b1, b4);
					clickCount++;
				}
				
			}
		});
		b1.setBackground(Color.decode("#5adbb5"));
		b1.setBounds(91, 58, 80, 80);
		frame.add(b1);
		
		b2.setFont(new Font("Monospaced", Font.BOLD, 25));
		b2.setEnabled(false);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getText().equals(" ")) {
					numberChanger(b2, b1);
					clickCount++;
				}
				else if(b3.getText().equals(" ")) {
					numberChanger(b2, b3);
					clickCount++;
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b2, b5);
					clickCount++;
				}
				
			}
		});
		b2.setBackground(Color.decode("#5adbb5"));
		b2.setBounds(190, 58, 80, 80);
		frame.add(b2);
		
		b3.setFont(new Font("Monospaced", Font.BOLD, 25));
		b3.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b3, b2);
					clickCount++;
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b3, b6);
					clickCount++;
				}
				
			}
		});
		b3.setBackground(Color.decode("#5adbb5"));
		b3.setBounds(289, 58, 80, 80);
		frame.add(b3);
		
		b4.setFont(new Font("Monospaced", Font.BOLD, 25));
		b4.setEnabled(false);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getText().equals(" ")) {
					numberChanger(b4, b1);
					clickCount++;
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b4, b5);
					clickCount++;
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b4, b7);
					clickCount++;
				}
				
			}
		});
		b4.setBackground(Color.decode("#5adbb5"));
		b4.setBounds(91, 148, 80, 80);
		frame.add(b4);
		
		b5.setFont(new Font("Monospaced", Font.BOLD, 25));
		b5.setEnabled(false);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b5, b2);
					clickCount++;
				}
				else if(b4.getText().equals(" ")) {
					numberChanger(b5, b4);
					clickCount++;
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b5, b6);
					clickCount++;
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b5, b8);
					clickCount++;
				}
				
			}
		});
		b5.setBackground(Color.decode("#5adbb5"));
		b5.setBounds(190, 148, 80, 80);
		frame.add(b5);
		
		b6.setFont(new Font("Monospaced", Font.BOLD, 25));
		b6.setEnabled(false);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b3.getText().equals(" ")) {
					numberChanger(b6, b3);
					clickCount++;
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b6, b5);
					clickCount++;
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b6, b9);
					clickCount++;
				}
				
			}
		});
		b6.setBackground(Color.decode("#5adbb5"));
		b6.setBounds(289, 148, 80, 80);
		frame.add(b6);
		
		b7.setFont(new Font("Monospaced", Font.BOLD, 25));
		b7.setEnabled(false);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b4.getText().equals(" ")) {
					numberChanger(b7, b4);
					clickCount++;
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b7, b8);
					clickCount++;
				}
				
			}
		});
		b7.setBackground(Color.decode("#5adbb5"));
		b7.setBounds(91, 238, 80, 80);
		frame.add(b7);
		
		b8.setFont(new Font("Monospaced", Font.BOLD, 25));
		b8.setEnabled(false);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b5.getText().equals(" ")) {
					numberChanger(b8, b5);
					clickCount++;
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b8, b7);
					clickCount++;
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b8, b9);
					clickCount++;
				}
				
			}
		});
		b8.setBackground(Color.decode("#5adbb5"));
		b8.setBounds(190, 238, 80, 80);
		frame.add(b8);
		
		b9.setFont(new Font("Monospaced", Font.BOLD, 25));
		b9.setEnabled(false);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b6.getText().equals(" ")) {
					numberChanger(b9, b6);
					clickCount++;
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b9, b8);
					clickCount++;
				}
				
			}
		});
		b9.setBackground(Color.decode("#5adbb5"));
		b9.setBounds(289, 238, 80, 80);
		frame.add(b9);
		
		shuffleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] list = new String[9];
				numbers(list);
				b1.setText(list[0]);
				b2.setText(list[1]);
				b3.setText(list[2]);
				b4.setText(list[3]);
				b5.setText(list[4]);
				b6.setText(list[5]);
				b7.setText(list[6]);
				b8.setText(list[7]);
				b9.setText(list[8]);
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
				b1.setText("1");
				b2.setText("2");
				b3.setText("3");
				b4.setText("4");
				b5.setText("5");
				b6.setText("6");
				b7.setText("7");
				b8.setText("8");
				b9.setText(" ");
				shuffleButton.setEnabled(true);
				restartButton.setEnabled(false);
				actionLabel.setText("Sort Smallest to Largest");
				maxP = 110;
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
				if(b1.getText().equals("1")&&
						b2.getText().equals("2")&&
						b3.getText().equals("3")&&
						b4.getText().equals("4")&&
						b5.getText().equals("5")&&
						b6.getText().equals("6")&&
						b7.getText().equals("7")&&
						b8.getText().equals("8")) {
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
					res = 10;
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
		
		
		actionLabel.setForeground(new Color(255, 0, 0));
		actionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		actionLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		actionLabel.setBounds(10, 11, 439, 36);
		frame.add(actionLabel);
		
		separator.setBounds(0, 45, 459, 2);
		frame.add(separator);
		
		separator_1.setBounds(0, 333, 459, 2);
		frame.add(separator_1);
		
		
		
		
	}
	
	public void numberChanger(JButton button1, JButton button2) {
		
		String b1Text = button1.getText();
		String b2Text = button2.getText();
		
		button1.setText(b2Text);
		button2.setText(b1Text);
		
	}
	
	public String[] numbers(String[] list) {
		
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", " "};
		Collections.shuffle(Arrays.asList(numbers));
		for(int i = 0; i <= numbers.length - 1; i++) {
			list[i] = numbers[i];
		}
		
		return list;
		
	}
	
}
