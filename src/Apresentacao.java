import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField CompleteName;
	private JTextField SurnameMom;
	private JTextField City;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
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
	public Apresentacao() {
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
		
		JLabel lblNewLabel = new JLabel("Star Wars name generator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(121, 11, 203, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira seu nome Completo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(21, 47, 143, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		CompleteName = new JTextField();
		CompleteName.setBounds(21, 62, 211, 20);
		frame.getContentPane().add(CompleteName);
		CompleteName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Insira o sobrenome de solteira de sua m\u00E3e:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(21, 93, 240, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		SurnameMom = new JTextField();
		SurnameMom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SurnameMom.setBounds(20, 113, 212, 20);
		frame.getContentPane().add(SurnameMom);
		SurnameMom.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Digite a cidade onde voc\u00EA nasceu:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(21, 144, 211, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		City = new JTextField();
		City.setBounds(21, 160, 211, 20);
		frame.getContentPane().add(City);
		City.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate name");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] entrada = new String[3];
				entrada[0] = CompleteName.getText();
				entrada[1] = SurnameMom.getText();
				entrada[2] = City.getText();
				NameGenerator name = new NameGenerator();
				String StarWars = name.generateStarWarsName(entrada);
				JOptionPane.showMessageDialog(frame, StarWars);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(107, 203, 125, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
