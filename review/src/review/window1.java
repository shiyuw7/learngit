package review;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class window1 {

	private JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window1 window = new window1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			/*int x;
			int y;
			public void mouseClicked(MouseEvent e) {
				x=e.getX();
				y=e.getY();
			}*/
			public void mouseDragged(MouseEvent e) {
				frame.getGraphics().drawLine(e.getX(), e.getY(), e.getX(), e.getY());
				
			}
		});
	}
}
		
