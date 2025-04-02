
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class LogSignInPage {
	
	JFrame frame = new JFrame();
	JButton signBtn = new JButton("Sign In");
	JButton logBtn = new JButton("Log In");
	JTextField newNickText = new JTextField();
	JTextField nickText = new JTextField();
	JLabel lblNewLabel = new JLabel("Create New Account");
	JLabel lblContinueOnRecord = new JLabel("Continue On Record");
	JSeparator separator = new JSeparator();
	public static String score = "";
	public static String nickName = "";
	
	public LogSignInPage() {
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 567, 180);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setTitle("Log In/Sign In");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		
		newNickText.setFont(new Font("Tahoma", Font.BOLD, 15));
		newNickText.setBounds(39, 68, 202, 29);
		frame.add(newNickText);
		newNickText.setColumns(10);
		
		nickText.setFont(new Font("Tahoma", Font.BOLD, 15));
		nickText.setColumns(10);
		nickText.setBounds(313, 68, 202, 29);
		frame.add(nickText);
		
		signBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password");
		            nickName = newNickText.getText();
		            if(nickName.length() > 20 | nickName.length() < 3) {
		            	JOptionPane.showMessageDialog(null, "A nick name must be at least 3 up to 20 character!", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		            else {
		            	String query = "INSERT INTO player (Player) VALUES (?)";
			            PreparedStatement pst = con.prepareStatement(query);
			            
			            pst.setString(1, nickName);
			            pst.executeUpdate();
			            
			            pst.close();
			            con.close();
			            
			            mainMenu mainMenu = new mainMenu();
						int x = frame.getX();
						int y = frame.getY();
						mainMenu.frame.setLocation(x, y);
						frame.dispose();
		            }
		            
		        } catch (SQLException e1) {
		            JOptionPane.showMessageDialog(null, "A player with this nick name is already exist!", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
			}
		});
		signBtn.setBackground(Color.ORANGE);
		signBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		signBtn.setBounds(89, 108, 101, 23);
		frame.add(signBtn);
		
		logBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nickName = nickText.getText();
                boolean exists = false;

                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:AAAA/cmpe114", "root", "password")) {
                    String query = "SELECT Player, Score FROM player WHERE Player = ?";
                    try (PreparedStatement stmt = con.prepareStatement(query)) {
                        stmt.setString(1, nickName);
                        try (ResultSet rs = stmt.executeQuery()) {
                            if (rs.next()) {
                                exists = true;
                                score = rs.getString("Score");
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                if (exists) {
                    mainMenu mainMenu = new mainMenu();
                    int x = frame.getX();
                    int y = frame.getY();
                    mainMenu.frame.setLocation(x, y);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Player not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
		logBtn.setBackground(Color.ORANGE);
		logBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		logBtn.setBounds(371, 108, 101, 23);
		frame.add(logBtn);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 30, 202, 27);
		frame.add(lblNewLabel);
		
		lblContinueOnRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblContinueOnRecord.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContinueOnRecord.setBounds(313, 30, 202, 27);
		frame.add(lblContinueOnRecord);
		
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(274, 0, 2, 211);
		frame.add(separator);
	}
}
