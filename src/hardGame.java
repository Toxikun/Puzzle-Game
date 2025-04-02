
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class hardGame {
	
	int clickCounter=30;
	
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
	JSeparator separator_1_1 = new JSeparator();
	JLabel clickJLabel = new JLabel("30");
	JLabel remLabel = new JLabel("Remaining");
	JLabel clkLabel = new JLabel("Clicks:");
	JButton scoreButton = new JButton("Scores");
	private JTextField opText;
	JLabel opLabel = new JLabel("Write a player name to challenge");
	
	public hardGame() {
		
		restartButton.setEnabled(false);
		checkButton.setEnabled(false);
		returnButton.setEnabled(true);
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setTitle("Challenge");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 692, 485);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setLayout(null);
		frame.setVisible(true);
		
		b1.setFont(new Font("Monospaced", Font.BOLD, 25));
		b1.setEnabled(false);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(b2.getText().equals(" ")) {
					numberChanger(b1, b2);
					gameOver();
				}
				else if(b4.getText().equals(" ")) {
					numberChanger(b1, b4);
					gameOver();
								
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
					gameOver();
				}
				else if(b3.getText().equals(" ")) {
					numberChanger(b2, b3);
					gameOver();		
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b2, b5);
					gameOver();		
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
					gameOver();
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b3, b6);
					gameOver();
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
					gameOver();
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b4, b5);
					gameOver();
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b4, b7);
					gameOver();
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
					gameOver();
				}
				else if(b4.getText().equals(" ")) {
					numberChanger(b5, b4);
					gameOver();	
				}
				else if(b6.getText().equals(" ")) {
					numberChanger(b5, b6);
					gameOver();	
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b5, b8);
					gameOver();	
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
					gameOver();	
				}
				else if(b5.getText().equals(" ")) {
					numberChanger(b6, b5);
					gameOver();		
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b6, b9);
					gameOver();	
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
					gameOver();
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b7, b8);
					gameOver();
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
					gameOver();
				}
				else if(b7.getText().equals(" ")) {
					numberChanger(b8, b7);
					gameOver();
				}
				else if(b9.getText().equals(" ")) {
					numberChanger(b8, b9);
					gameOver();
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
					gameOver();
				}
				else if(b8.getText().equals(" ")) {
					numberChanger(b9, b8);
					gameOver();
				}
				
			}
		});
		b9.setBackground(Color.decode("#5adbb5"));
		b9.setBounds(289, 238, 80, 80);
		frame.add(b9);
		
		shuffleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        String opName = opText.getText();
		        boolean exists = false;

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password")) {
                    String query = "SELECT Player, Score FROM player WHERE Player = ?";
                    try (PreparedStatement stmt = con.prepareStatement(query)) {
                        stmt.setString(1, opName);
                        try (ResultSet rs = stmt.executeQuery()) {
                            if (rs.next()) {
                                exists = true;
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                if (exists) {
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
                } else {
                    JOptionPane.showMessageDialog(null, "Player not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
				
			}
				
				}
		);
		
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
				clickJLabel.setText("30");
				clickCounter = 30;
			}
		});
		
		restartButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		restartButton.setBackground(new Color(244, 164, 96));
		restartButton.setBounds(329, 346, 120, 37);
		frame.add(restartButton);
		
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opName = opText.getText();
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
					actionLabel.setText("30 Points Gained");
					try {
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score + ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, 30);
					    pst.setString(2, LogSignInPage.nickName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					try {
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, 30);
					    pst.setString(2, opName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					actionLabel.setText("30 Points Lost");
					try {
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score + ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, 30);
					    pst.setString(2, opName);
					    
					    pst.executeUpdate();
					    
					    pst.close();
					    con.close();   
					} catch (SQLException e1) {
					    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
					}
					try {
					    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
					    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
					    PreparedStatement pst = con.prepareStatement(query);
					    
					    pst.setInt(1, 30);
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
		
		clickJLabel.setForeground(new Color(220, 20, 60));
		clickJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clickJLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
		clickJLabel.setBounds(471, 154, 195, 40);
		frame.add(clickJLabel);
		
		clkLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clkLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		clkLabel.setForeground(new Color(65, 105, 225));
		clkLabel.setBounds(471, 103, 195, 40);
		frame.add(clkLabel);
		
		remLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		remLabel.setHorizontalAlignment(SwingConstants.CENTER);
		remLabel.setForeground(new Color(65, 105, 225));
		remLabel.setBounds(471, 71, 195, 40);
		frame.add(remLabel);
		
		separator.setBounds(0, 45, 459, 2);
		frame.add(separator);
		
		separator_1.setBounds(0, 333, 459, 2);
		frame.add(separator_1);
		
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setBounds(459, 0, 2, 446);
		frame.add(separator_1_1);
		
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
		
		
		opText = new JTextField();
		opText.setHorizontalAlignment(SwingConstants.CENTER);
		opText.setFont(new Font("Tahoma", Font.BOLD, 13));
		opText.setBounds(471, 268, 195, 29);
		frame.add(opText);
		opText.setColumns(10);
		
		opLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		opLabel.setBounds(471, 228, 195, 29);
		frame.add(opLabel);
		
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
		scoreButton.setBounds(499, 308, 146, 40);
		frame.add(scoreButton);
		
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
	public void gameOver() {
		String opName = opText.getText();
		clickCounter--;
		
		if (clickCounter<=0) {
			clickJLabel.setText("0");
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
			actionLabel.setText("30 Points Lost");
			try {
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
			    String query = "UPDATE player SET Score = Score + ? WHERE Player = ?";
			    PreparedStatement pst = con.prepareStatement(query);
			    
			    pst.setInt(1, 30);
			    pst.setString(2, opName);
			    
			    pst.executeUpdate();
			    
			    pst.close();
			    con.close();   
			} catch (SQLException e1) {
			    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
			}
			try {
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
			    String query = "UPDATE player SET Score = Score - ? WHERE Player = ?";
			    PreparedStatement pst = con.prepareStatement(query);
			    
			    pst.setInt(1, 30);
			    pst.setString(2, LogSignInPage.nickName);
			    
			    pst.executeUpdate();
			    
			    pst.close();
			    con.close();   
			} catch (SQLException e1) {
			    JOptionPane.showMessageDialog(null, "Somethings Went Wrong!", "Error", JOptionPane.ERROR_MESSAGE);
			}
			}
			else{
				
				clickJLabel.setText(""+clickCounter);
				
			}
	}	
}
