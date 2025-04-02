

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

public class d4Game {
	
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
	JButton b9 = new JButton("9");
	JButton b10 = new JButton("10");
	JButton b11 = new JButton("11");
	JButton b12 = new JButton("12");
	JButton b13 = new JButton("13");
	JButton b14 = new JButton("14");
	JButton b15 = new JButton("15");
	JButton b16 = new JButton(" ");
	JSeparator separator = new JSeparator();
	JSeparator separator_1 = new JSeparator();
	int maxP = 215;
	int clickCount = 0;
	int res = 0;
	
	public d4Game() {
		
		
		restartButton.setEnabled(false);
		checkButton.setEnabled(false);
		returnButton.setEnabled(true);
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setTitle("4x4 Numeric Puzzle");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 468, 581);
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
				else if(b5.getText().equals(" ")) {
					numberChanger(b1, b5);
					clickCount++;
				}
				
			}
		});
		b1.setBackground(Color.decode("#5adbb5"));
		b1.setBounds(49, 58, 80, 80);
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
				else if(b6.getText().equals(" ")) {
					numberChanger(b2, b6);
					clickCount++;
				}
				
			}
		});
		b2.setBackground(Color.decode("#5adbb5"));
		b2.setBounds(139, 58, 80, 80);
		frame.add(b2);
		
		b3.setFont(new Font("Monospaced", Font.BOLD, 25));
		b3.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b3, b2);
					clickCount++;
				}
				else if(b4.getText().equals(" ")) {
					numberChanger(b3, b4);
					clickCount++;
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b3, b7);
					clickCount++;
				}
				
			}
		});
		b3.setBackground(Color.decode("#5adbb5"));
		b3.setBounds(229, 58, 80, 80);
		frame.add(b3);
		
		b4.setFont(new Font("Monospaced", Font.BOLD, 25));
		b4.setEnabled(false);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b3.getText().equals(" ")) {
					numberChanger(b4, b3);
					clickCount++;
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b4, b8);
					clickCount++;
				}
				
			}
		});
		b4.setBackground(Color.decode("#5adbb5"));
		b4.setBounds(319, 58, 80, 80);
		frame.add(b4);
		
		b5.setFont(new Font("Monospaced", Font.BOLD, 25));
		b5.setEnabled(false);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b1.getText().equals(" ")) {
					numberChanger(b5, b1);
					clickCount++;
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b5, b6);
					clickCount++;
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b5, b9);
					clickCount++;
				}
				
			}
		});
		b5.setBackground(Color.decode("#5adbb5"));
		b5.setBounds(49, 149, 80, 80);
		frame.add(b5);
		
		b6.setFont(new Font("Monospaced", Font.BOLD, 25));
		b6.setEnabled(false);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b6, b2);
					clickCount++;
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b6, b5);
					clickCount++;
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b6, b7);
					clickCount++;
				}
				else if(b10.getText().equals(" ")) {
					numberChanger(b6, b10);
					clickCount++;
				}
				
			}
		});
		b6.setBackground(Color.decode("#5adbb5"));
		b6.setBounds(139, 149, 80, 80);
		frame.add(b6);
		
		b7.setFont(new Font("Monospaced", Font.BOLD, 25));
		b7.setEnabled(false);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b3.getText().equals(" ")) {
					numberChanger(b7, b3);
					clickCount++;
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b7, b6);
					clickCount++;
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b7, b8);
					clickCount++;
				}
				else if(b11.getText().equals(" ")) {
					numberChanger(b7, b11);
					clickCount++;
				}
				
			}
		});
		b7.setBackground(Color.decode("#5adbb5"));
		b7.setBounds(229, 149, 80, 80);
		frame.add(b7);
		
		b8.setFont(new Font("Monospaced", Font.BOLD, 25));
		b8.setEnabled(false);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b4.getText().equals(" ")) {
					numberChanger(b8, b4);
					clickCount++;
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b8, b7);
					clickCount++;
				}
				else if(b12.getText().equals(" ")) {
					numberChanger(b8, b12);
					clickCount++;
				}
				
			}
		});
		b8.setBackground(Color.decode("#5adbb5"));
		b8.setBounds(319, 149, 80, 80);
		frame.add(b8);
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b5.getText().equals(" ")) {
					numberChanger(b9, b5);
					clickCount++;
				}
				else if(b10.getText().equals(" ")) {
					numberChanger(b9, b10);
					clickCount++;
				}
				else if(b13.getText().equals(" ")) {
					numberChanger(b9, b13);
					clickCount++;
				}
				
			}
		});
		b9.setFont(new Font("Monospaced", Font.BOLD, 25));
		b9.setEnabled(false);
		b9.setBackground(new Color(90, 219, 181));
		b9.setBounds(49, 242, 80, 80);
		frame.add(b9);
		
		
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b6.getText().equals(" ")) {
					numberChanger(b10, b6);
					clickCount++;
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b10, b9);
					clickCount++;
				}
				else if(b11.getText().equals(" ")) {
					numberChanger(b10, b11);
					clickCount++;
				}
				else if(b14.getText().equals(" ")) {
					numberChanger(b10, b14);
					clickCount++;
				}
				
			}
		});
		b10.setFont(new Font("Monospaced", Font.BOLD, 25));
		b10.setEnabled(false);
		b10.setBackground(new Color(90, 219, 181));
		b10.setBounds(139, 242, 80, 80);
		frame.add(b10);
		
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b7.getText().equals(" ")) {
					numberChanger(b11, b7);
					clickCount++;
				}
				else if(b10.getText().equals(" ")) {
					numberChanger(b11, b10);
					clickCount++;
				}
				else if(b12.getText().equals(" ")) {
					numberChanger(b11, b12);
					clickCount++;
				}
				else if(b15.getText().equals(" ")) {
					numberChanger(b11, b15);
					clickCount++;
				}
				
			}
		});
		b11.setFont(new Font("Monospaced", Font.BOLD, 25));
		b11.setEnabled(false);
		b11.setBackground(new Color(90, 219, 181));
		b11.setBounds(229, 242, 80, 80);
		frame.add(b11);
		
		b12.setFont(new Font("Monospaced", Font.BOLD, 25));
		b12.setEnabled(false);
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b8.getText().equals(" ")) {
					numberChanger(b12, b8);
					clickCount++;
				}
				else if(b11.getText().equals(" ")) {
					numberChanger(b12, b11);
					clickCount++;
				}
				else if(b16.getText().equals(" ")) {
					numberChanger(b12, b16);
					clickCount++;
				}
				
			}
		});
		b12.setBackground(Color.decode("#5adbb5"));
		b12.setBounds(319, 242, 80, 80);
		frame.add(b12);
		
		
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b9.getText().equals(" ")) {
					numberChanger(b13, b9);
					clickCount++;
				}
				else if(b14.getText().equals(" ")) {
					numberChanger(b13, b14);
					clickCount++;
				}
				
			}
		});
		b13.setFont(new Font("Monospaced", Font.BOLD, 25));
		b13.setEnabled(false);
		b13.setBackground(new Color(90, 219, 181));
		b13.setBounds(49, 333, 80, 80);
		frame.add(b13);
		
		
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b10.getText().equals(" ")) {
					numberChanger(b14, b10);
					clickCount++;
				}
				else if(b13.getText().equals(" ")) {
					numberChanger(b14, b13);
					clickCount++;
				}
				else if(b15.getText().equals(" ")) {
					numberChanger(b14, b15);
					clickCount++;
				}
				
			}
		});
		b14.setFont(new Font("Monospaced", Font.BOLD, 25));
		b14.setEnabled(false);
		b14.setBackground(new Color(90, 219, 181));
		b14.setBounds(139, 333, 80, 80);
		frame.add(b14);
		
		
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b11.getText().equals(" ")) {
					numberChanger(b15, b11);
					clickCount++;
				}
				else if(b14.getText().equals(" ")) {
					numberChanger(b15, b14);
					clickCount++;
				}
				else if(b16.getText().equals(" ")) {
					numberChanger(b15, b16);
					clickCount++;
				}
				
			}
		});
		b15.setFont(new Font("Monospaced", Font.BOLD, 25));
		b15.setEnabled(false);
		b15.setBackground(new Color(90, 219, 181));
		b15.setBounds(229, 331, 80, 80);
		frame.add(b15);
		
		
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b12.getText().equals(" ")) {
					numberChanger(b16, b12);
					clickCount++;
				}
				else if(b15.getText().equals(" ")) {
					numberChanger(b16, b15);
					clickCount++;
				}
				
			}
		});
		b16.setFont(new Font("Monospaced", Font.BOLD, 25));
		b16.setEnabled(false);
		b16.setBackground(new Color(90, 219, 181));
		b16.setBounds(319, 331, 80, 80);
		frame.add(b16);
		
		shuffleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] list = new String[16];
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
				b10.setText(list[9]);
				b11.setText(list[10]);
				b12.setText(list[11]);
				b13.setText(list[12]);
				b14.setText(list[13]);
				b15.setText(list[14]);
				b16.setText(list[15]);
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(true);
				b11.setEnabled(true);
				b12.setEnabled(true);
				b13.setEnabled(true);
				b14.setEnabled(true);
				b15.setEnabled(true);
				b16.setEnabled(true);
				shuffleButton.setEnabled(false);
				checkButton.setEnabled(true);
				actionLabel.setText("SHUFFLED");
			}
		});
		
		shuffleButton.setBackground(new Color(0, 255, 255));
		shuffleButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		shuffleButton.setBounds(10, 446, 120, 37);
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
				b9.setText("9");
				b10.setText("10");
				b11.setText("11");
				b12.setText("12");
				b13.setText("13");
				b14.setText("14");
				b15.setText("15");
				b16.setText(" ");
				shuffleButton.setEnabled(true);
				restartButton.setEnabled(false);
				actionLabel.setText("Sort Smallest to Largest");
				maxP = 215;
				clickCount = 0;
				res = 0;
			}
		});
		
		restartButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		restartButton.setBackground(new Color(244, 164, 96));
		restartButton.setBounds(287, 446, 120, 37);
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
				b10.setEnabled(false);
				b11.setEnabled(false);
				b12.setEnabled(false);
				b13.setEnabled(false);
				b14.setEnabled(false);
				b15.setEnabled(false);
				b16.setEnabled(false);
				restartButton.setEnabled(true);
				checkButton.setEnabled(false);
				if(b1.getText().equals("1")&&
						b2.getText().equals("2")&&
						b3.getText().equals("3")&&
						b4.getText().equals("4")&&
						b5.getText().equals("5")&&
						b6.getText().equals("6")&&
						b7.getText().equals("7")&&
						b8.getText().equals("8")&&
						b9.getText().equals("9")&&
						b10.getText().equals("10")&&
						b11.getText().equals("11")&&
						b12.getText().equals("12")&&
						b13.getText().equals("13")&&
						b14.getText().equals("14")&&
						b15.getText().equals("15")) {
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
					res = 17;
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
		checkButton.setBounds(139, 446, 138, 37);
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
		returnButton.setEnabled(true);
		returnButton.setBackground(new Color(186, 85, 211));
		returnButton.setBounds(113, 494, 196, 37);
		frame.add(returnButton);
		
		actionLabel.setForeground(new Color(255, 0, 0));
		actionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		actionLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		actionLabel.setBounds(10, 11, 439, 36);
		frame.add(actionLabel);
		
		separator.setBounds(0, 45, 459, 2);
		frame.add(separator);
		
		separator_1.setBounds(0, 433, 459, 2);
		frame.add(separator_1);
		
	}
	
	public void numberChanger(JButton button1, JButton button2) {
		
		String b1Text = button1.getText();
		String b2Text = button2.getText();
		
		button1.setText(b2Text);
		button2.setText(b1Text);
		
	}
	
	public String[] numbers(String[] list) {
		
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " "};
		Collections.shuffle(Arrays.asList(numbers));
		for(int i = 0; i <= numbers.length - 1; i++) {
			list[i] = numbers[i];
		}
		
		return list;
		
	}
	
}
