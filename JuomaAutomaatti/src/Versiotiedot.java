import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Versiotiedot {

	private JFrame frmJuomaautomaattiGuiV;
	private JLabel lblJuomaautomaattiV;
	private JLabel lblTekijEemilHartikainen;
	private JLabel lblHttpsgithubcomhartikainenjuomaautomaattigui;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Versiotiedot window = new Versiotiedot();
					window.frmJuomaautomaattiGuiV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Versiotiedot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJuomaautomaattiGuiV = new JFrame();
		frmJuomaautomaattiGuiV.setTitle("Juoma-automaatti GUI v. 1.0");
		frmJuomaautomaattiGuiV.setBounds(100, 100, 428, 226);
		frmJuomaautomaattiGuiV.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmJuomaautomaattiGuiV.getContentPane().setLayout(null);
		
		lblJuomaautomaattiV = new JLabel("JUOMA-AUTOMAATTI V. 1.0");
		lblJuomaautomaattiV.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuomaautomaattiV.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblJuomaautomaattiV.setBounds(58, 10, 275, 39);
		frmJuomaautomaattiGuiV.getContentPane().add(lblJuomaautomaattiV);
		
		lblTekijEemilHartikainen = new JLabel("TEKIJ\u00C4: EEMIL HARTIKAINEN");
		lblTekijEemilHartikainen.setHorizontalAlignment(SwingConstants.CENTER);
		lblTekijEemilHartikainen.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTekijEemilHartikainen.setBounds(45, 59, 310, 39);
		frmJuomaautomaattiGuiV.getContentPane().add(lblTekijEemilHartikainen);
		
		lblHttpsgithubcomhartikainenjuomaautomaattigui = new JLabel("https://github.com/Hartikainen1996/Juoma-Automaatti-GUI");
		lblHttpsgithubcomhartikainenjuomaautomaattigui.setHorizontalAlignment(SwingConstants.CENTER);
		lblHttpsgithubcomhartikainenjuomaautomaattigui.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHttpsgithubcomhartikainenjuomaautomaattigui.setBounds(10, 108, 394, 39);
		frmJuomaautomaattiGuiV.getContentPane().add(lblHttpsgithubcomhartikainenjuomaautomaattigui);
	}
}
