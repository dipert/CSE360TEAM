
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainMenu {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInput = new JButton("Insert/add entries");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InputMenu nw = new InputMenu();
				//nw.NewScreen();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		btnInput.setBounds(173, 94, 167, 29);
		frame.getContentPane().add(btnInput);
		
		JButton btnNewButton = new JButton("Delete/remove entries");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HelpMenu nw = new HelpMenu();
				//nw.HelpScreen();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(173, 176, 167, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAbout = new JButton("Change Priority");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AboutMenu nw = new AboutMenu();
				//nw.AboutScreen();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		btnAbout.setBounds(173, 135, 167, 29);
		frame.getContentPane().add(btnAbout);
		
		JButton btnQuit = new JButton("Change/update");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AboutMenu nw = new AboutMenu();
				//nw.AboutScreen();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		btnQuit.setBounds(173, 217, 167, 29);
		frame.getContentPane().add(btnQuit);
		
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HelpMenu nw = new HelpMenu();
				//nw.HelpScreen();
				frame.setVisible(false);
				frame.dispose();
			}
		});//
		display.setBounds(173, 256, 167, 29);
		frame.getContentPane().add(display);
		
		
		JLabel lblNewLabel = new JLabel("To_Do_List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(175, 22, 157, 29);
		frame.getContentPane().add(lblNewLabel);
	}
}
