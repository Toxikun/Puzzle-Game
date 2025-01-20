
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.w3c.dom.events.EventTarget;
public class Rules{
	
	JFrame frame = new JFrame();
	ImageIcon pic = new ImageIcon("teduIcon.png");
	ImageIcon mdaIcon = new ImageIcon("mda130.png");
	ImageIcon l1icon = new ImageIcon("1.png");
	ImageIcon l2icon = new ImageIcon("2.png");
	ImageIcon l3icon = new ImageIcon("3.png");
	ImageIcon l31icon = new ImageIcon("3.1.png");
	ImageIcon l32icon = new ImageIcon("3.2.png");
	ImageIcon l4icon = new ImageIcon("4.png");
	ImageIcon l5icon = new ImageIcon("5.png");
	ImageIcon l6icon = new ImageIcon("6.png");
	ImageIcon l61icon = new ImageIcon("6.1.png");
	ImageIcon l7icon = new ImageIcon("7.png");
	
	ImageIcon l9icon = new ImageIcon("9.png");
	ImageIcon l10icon = new ImageIcon("10.png");
	ImageIcon l11icon = new ImageIcon("11.png");
	ImageIcon l12icon = new ImageIcon("12.png");
	private int clickCounter = 0;
	JLabel l1 = new JLabel("");
	JLabel l2 = new JLabel("");
	JLabel l3 = new JLabel("");
	JLabel l31 = new JLabel("");
	JLabel l32 = new JLabel("");
	JLabel l4 = new JLabel("");
	JLabel l5 = new JLabel("");
	JLabel l6 = new JLabel("");
	JLabel l61 = new JLabel("");
	JLabel l7 = new JLabel("");
	
	JLabel l9 = new JLabel("");
	JLabel l10 = new JLabel("");
	JLabel l11 = new JLabel("");
	JLabel l12 = new JLabel("");
	
	JLabel mdaLabel = new JLabel("");
	JButton nextBtn = new JButton("Next");
	JButton backBtn = new JButton("Back");
	JButton returnBtn = new JButton("Return");
	JLabel rulesLabel = new JLabel("RULES");
	
	public Rules() {
		
		ImageIcon icon = new ImageIcon("teduIcon.png");
		frame.setIconImage(icon.getImage());
		frame.setTitle("Rules");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setBounds(100, 100, 592, 545);
		frame.getContentPane().setBackground(new Color(125, 240, 255));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);

		mdaLabel.setBounds(446, 376, 130, 130);
		mdaLabel.setIcon(mdaIcon);
		frame.add(mdaLabel);

		JLabel welcomeLabel = new JLabel("<html>Hi! Welcome to the Sliding Puzzle Game. I'm a member of the developer team of this game and these are the rules.</html>");
		welcomeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcomeLabel.setBounds(30, 376, 406, 74);
		frame.add(welcomeLabel);

		nextBtn.setBackground(new Color(123, 104, 238));
		nextBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        clickCounter++;
		        if (clickCounter == 1) {
		            welcomeLabel.setText("<html>First, there are four types of game options: Easy, Normal, Challenge, and Image.</html>");
		            frame.remove(l1);
		            
		    		l2.setBounds(84, 95, 406, 144);
		    		l2.setIcon(l2icon);
		            frame.add(l2);
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 2) {
		            welcomeLabel.setText("<html>Easy, Challenge, and Image modes are a 3x3 puzzles and Normal mode is a 4x4 puzzle.</html>");
		            frame.remove(l2);
		            
		    		l3.setBounds(10, 63, 171, 280);
		    		l3.setIcon(l3icon);
		    		frame.add(l3);
		            
		            l31.setBounds(203, 63, 171, 280);
		    		l31.setIcon(l31icon);
		    		frame.add(l31);
		            
		            l32.setBounds(384, 63, 171, 280);
		    		l32.setIcon(l32icon);
		    		frame.add(l32);
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 3) {
		            welcomeLabel.setText("<html>When you click on a button, if there is an empty button next to it, the buttons will swap places. Like '3', '4' and '1'.</html>");
		            frame.remove(l3);
		            frame.remove(l31);
		            frame.remove(l32);
		            
		            l4.setBounds(136, 56, 287, 309);
		    		l4.setIcon(l4icon);
		    		frame.add(l4);
		    		
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 4) {
		            welcomeLabel.setText("<html>Buttons that are diagonally adjacent or not null ones cannot swap places. Like '8'.</html>");
		            l4.setBounds(136, 56, 287, 309);
		    		l4.setIcon(l4icon);
		    		frame.remove(l4);
		    		
		    		l5.setBounds(136, 56, 287, 309);
		    		l5.setIcon(l5icon);
		    		frame.add(l5);
		    		
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 5) {
		            welcomeLabel.setText("<html>In Numeric puzzles, the numbers from 1 to 8 (or 15) are shuffled randomly, and you need to reorder them.</html>");
		            
		            l5.setBounds(136, 56, 287, 309);
		    		l5.setIcon(l5icon);
		    		frame.remove(l5);
		    		
		    		l6.setBounds(30, 66, 239, 288);
		    		l6.setIcon(l6icon);
		    		frame.add(l6);
		    		
		    		l61.setBounds(308, 66, 239, 288);
		    		l61.setIcon(l61icon);
		    		frame.add(l61);
		    		
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 6) {
		            welcomeLabel.setText("<html>In Image mode, an image is split into pieces and you need to put it back together.</html>");
		            l6.setBounds(30, 66, 239, 288);
		    		l6.setIcon(l6icon);
		    		frame.remove(l6);
		    		
		    		l61.setBounds(308, 66, 239, 288);
		    		l61.setIcon(l61icon);
		    		frame.remove(l61);
		    		
		    		l7.setBounds(136, 56, 287, 309);
		    		l7.setIcon(l7icon);
		    		frame.add(l7);
		    		
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 7) {
		            welcomeLabel.setText("<html>In Challenge mode, you challenge a chosen person, and if you win before your clicks run out, you take some of their points.</html>");
		            l7.setBounds(136, 56, 287, 309);
		    		l7.setIcon(l7icon);
		    		frame.remove(l7);
		    		
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 8) {
		            welcomeLabel.setText("<html>Each player starts with 70 points. Playing the game deducts a certain amount of points from you.</html>");
		            
		            l9.setBounds(58, 74, 488, 266);
		    		l9.setIcon(l9icon);
		    		frame.add(l9);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 9) {
		            welcomeLabel.setText("<html>Winning the game before reaching a certain number of clicks earns you points, otherwise, you may not earn points and even lose some.</html>");
		            
		            l9.setBounds(58, 74, 448, 266);
		    		l9.setIcon(l9icon);
		    		frame.remove(l9);
		    		
		    		l10.setBounds(136, 56, 287, 309);
		    		l10.setIcon(l10icon);
		    		frame.add(l10);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }else if (clickCounter == 10) {
		            welcomeLabel.setText("<html>You can track the current scores from the score table located in the main menu.</html>");
		            l10.setBounds(136, 56, 287, 309);
		    		l10.setIcon(l10icon);
		    		frame.remove(l10);
		    		
		    		l11.setBounds(58, 74, 488, 266);
		    		l11.setIcon(l11icon);
		    		frame.add(l11);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }else if (clickCounter == 11) {
		            welcomeLabel.setText("<html>That's all for the rules of the game, have fun!</html>");
		            
		            l11.setBounds(58, 74, 488, 266);
		    		l11.setIcon(l11icon);
		    		frame.remove(l11);

		    		l12.setBounds(152, 83, 260, 260);
		    		l12.setIcon(l12icon);
		    		frame.add(l12);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }

		        if (clickCounter > 11) {
		            clickCounter = 11;
		        }
		    }
		});
		nextBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		nextBtn.setBounds(253, 461, 111, 34);
		frame.add(nextBtn);

		backBtn.setBackground(new Color(123, 104, 238));
		backBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        clickCounter--;
		        if (clickCounter == 0) {
		            welcomeLabel.setText("<html>Hi! Welcome to the Sliding Puzzle Game. I'm a member of the developer team of this game and these are the rules.</html>");
		            frame.add(l1);
		            
		            frame.remove(l2);
		            frame.revalidate();
		            frame.repaint();
		    		l2.setBounds(84, 95, 406, 144);
		    		l2.setIcon(l2icon);
		        } else if (clickCounter == 1) {
		            welcomeLabel.setText("<html>First, there are four types of game options: Easy, Normal, Challenge, and Image.</html>");
		            frame.add(l2);
		    		l2.setBounds(84, 95, 406, 144);
		    		l2.setIcon(l2icon);
		    		
		    		l3.setBounds(10, 63, 171, 280);
		    		l3.setIcon(l3icon);
		    		frame.remove(l3);
		            
		            l31.setBounds(203, 63, 171, 280);
		    		l31.setIcon(l31icon);
		    		frame.remove(l31);
		            
		            l32.setBounds(384, 63, 171, 280);
		    		l32.setIcon(l32icon);
		    		frame.remove(l32);
		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 2) {
		            welcomeLabel.setText("<html>Easy, Challenge, and Image modes are a 3x3 puzzles and Normal mode is a 4x4 puzzle.</html>");
		            l3.setBounds(10, 63, 171, 280);
		    		l3.setIcon(l3icon);
		    		frame.add(l3);
		            
		            l31.setBounds(203, 63, 171, 280);
		    		l31.setIcon(l31icon);
		    		frame.add(l31);
		            
		            l32.setBounds(384, 63, 171, 280);
		    		l32.setIcon(l32icon);
		    		frame.add(l32);
		            

		    		l4.setBounds(136, 56, 287, 309);
		    		l4.setIcon(l4icon);
		    		frame.remove(l4);
		            

		            frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 3) {
		            welcomeLabel.setText("<html>When you click on a button, if there is an empty button next to it, the buttons will swap places. Like '3', '4' and '1'.</html>");
		            l5.setBounds(136, 56, 287, 309);
		    		l5.setIcon(l5icon);
		    		frame.remove(l5);

		    		l4.setBounds(136, 56, 287, 309);
		    		l4.setIcon(l4icon);
		    		frame.add(l4);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 4) {
		            welcomeLabel.setText("<html>Buttons that are diagonally adjacent or not null ones cannot swap places. Like '8'.</html>");
		            
		            l5.setBounds(136, 56, 287, 309);
		    		l5.setIcon(l5icon);
		    		frame.add(l5);
		    		
		    		l6.setBounds(30, 66, 239, 288);
		    		l6.setIcon(l6icon);
		    		frame.remove(l6);
		    		
		    		l61.setBounds(308, 66, 239, 288);
		    		l61.setIcon(l61icon);
		    		frame.remove(l61);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 5) {
		            welcomeLabel.setText("<html>In Numeric puzzles, the numbers from 1 to 8 (or 15) are shuffled randomly, and you need to reorder them.</html>");
		            l6.setBounds(30, 66, 239, 288);
		    		l6.setIcon(l6icon);
		    		frame.add(l6);
		    		
		    		l61.setBounds(308, 66, 239, 288);
		    		l61.setIcon(l61icon);
		    		frame.add(l61);

		    		l7.setBounds(136, 56, 287, 309);
		    		l7.setIcon(l7icon);
		    		frame.remove(l7);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 6) {
		            welcomeLabel.setText("<html>In Image mode, an image is split into pieces and you need to put it back together.</html>");
		            l7.setBounds(136, 56, 287, 309);
		    		l7.setIcon(l7icon);
		    		frame.add(l7);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        } else if (clickCounter == 7) {
		            welcomeLabel.setText("<html>In Challenge mode, you challenge a chosen person, and if you win before your clicks run out, you take some of their points.</html>");
		            
		            l9.setBounds(58, 74, 448, 266);
		    		l9.setIcon(l9icon);
		    		frame.remove(l9);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }else if (clickCounter == 8) {
		            welcomeLabel.setText("<html>Each player starts with 70 points. Playing the game deducts a certain amount of points from you.</html>");
		            
		            l9.setBounds(58, 74, 448, 266);
		    		l9.setIcon(l9icon);
		    		frame.add(l9);
		    		
		    		l10.setBounds(136, 56, 287, 309);
		    		l10.setIcon(l10icon);
		    		frame.remove(l10);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }else if (clickCounter == 9) {
		            welcomeLabel.setText("<html>Winning the game before reaching a certain number of clicks earns you points, otherwise, you may not earn points and even lose some.</html>");
		            
		            l10.setBounds(136, 56, 287, 309);
		    		l10.setIcon(l10icon);
		    		frame.add(l10);
		    		
		    		l11.setBounds(58, 74, 488, 266);
		    		l11.setIcon(l11icon);
		    		frame.remove(l11);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }else if (clickCounter == 10) {
		            welcomeLabel.setText("<html>You can track the current scores from the score table located in the main menu.</html>");

		    		l11.setBounds(58, 74, 488, 266);
		    		l11.setIcon(l11icon);
		    		frame.add(l11);

		    		l12.setBounds(152, 83, 260, 260);
		    		l12.setIcon(l12icon);
		    		frame.remove(l12);
		    		
		    		frame.revalidate();
		            frame.repaint();
		        }
		        
		        if (clickCounter < 0) {
		            clickCounter = 0;
		        }
		    }
		});
		backBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		backBtn.setBounds(84, 461, 111, 34);
		frame.add(backBtn);
		
		returnBtn.setBackground(new Color(60, 179, 113));
		returnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainMenu mainMenu = new mainMenu();
				int x = frame.getX();
				int y = frame.getY();
				mainMenu.frame.setLocation(x, y);
				frame.dispose();
				
			}
		});
		returnBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		returnBtn.setBounds(0, 0, 102, 31);
		frame.add(returnBtn);
		
		rulesLabel.setForeground(new Color(220, 20, 60));
		rulesLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		rulesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rulesLabel.setBounds(193, 11, 171, 34);
		frame.add(rulesLabel);
		
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(135, 56, 301, 309);
		l1.setIcon(l1icon);
		frame.add(l1);
	}	
}
