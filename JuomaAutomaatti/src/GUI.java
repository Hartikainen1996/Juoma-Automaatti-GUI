import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnYllpito;
	private JMenu mnTietojaOhjelmasta;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblKahvi;
	private JLabel lblTee;
	private JLabel lblKaakao;
	private JLabel lblNewLabel;
	private JLabel lblTeetJljell;
	private JLabel lblKaakaotaJljell;
	private JMenuItem mntmAsetaKahvinMr;
	private JMenuItem mntmAsetaTeenMr;
	private JMenuItem mntmAsetaKaakaonMr;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JMenuItem mntmLopeta;
	private JMenuItem mntmVersiotiedot;
	private JMenuItem mntmOhje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					JuomaAutomaatti ja = new JuomaAutomaatti();
					
					GUI frame = new GUI(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI(JuomaAutomaatti ja) {
		setTitle("Kahviautomaatti GUI v. 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 610);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnYllpito = new JMenu("Yll\u00E4pito");
		menuBar.add(mnYllpito);
		
		mntmAsetaKahvinMr = new JMenuItem("Aseta kahvin m\u00E4\u00E4r\u00E4");
		mntmAsetaKahvinMr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mntmAsetaKahvinMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ", "Aseta kahvi", JOptionPane.INFORMATION_MESSAGE);
				int uusiKahvi = Integer.parseInt(uusiArvo);
				ja.setKahvi(uusiKahvi);
				lblNewLabel.setText("Kahvia jäljellä: " + ja.getKahvi());
				if(ja.getKahvi() < 20) {
					lblNewLabel.setForeground(Color.RED); 
				} else {
					lblNewLabel.setForeground(Color.BLACK);
				}}
			}
		);
		mnYllpito.add(mntmAsetaKahvinMr);
		
		mntmAsetaTeenMr = new JMenuItem("Aseta teen m\u00E4\u00E4r\u00E4");
		mntmAsetaTeenMr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
		mntmAsetaTeenMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ", "Aseta kahvi", JOptionPane.INFORMATION_MESSAGE);
				int uusiTee = Integer.parseInt(uusiArvo);
				ja.setTee(uusiTee);
				lblTeetJljell.setText("Teetä jäljellä: " + ja.getTee());
				if(ja.getTee() < 20) {
					lblTeetJljell.setForeground(Color.RED); 
			}else {
				lblTeetJljell.setForeground(Color.BLACK);
				}}
			}
		);
		mnYllpito.add(mntmAsetaTeenMr);
		
		mntmAsetaKaakaonMr = new JMenuItem("Aseta kaakaon m\u00E4\u00E4r\u00E4");
		mntmAsetaKaakaonMr.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mntmAsetaKaakaonMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uusiArvo = JOptionPane.showInputDialog(null, "Anna uusi arvo: ", "Aseta kahvi", JOptionPane.INFORMATION_MESSAGE);
				int uusiKaakao = Integer.parseInt(uusiArvo);
				ja.setKaakao(uusiKaakao);
				lblKaakaotaJljell.setText("Kaakaota jäljellä: " + ja.getKaakao());
				if(ja.getKaakao() < 20) {
					lblKaakaotaJljell.setForeground(Color.RED); 
			}else {
				lblKaakaotaJljell.setForeground(Color.BLACK);
				}}
			}
		);
		mnYllpito.add(mntmAsetaKaakaonMr);
		
		mntmTallennaAutomaatinTila = new JMenuItem("Tallenna automaatin tila");
		mntmTallennaAutomaatinTila.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		mntmTallennaAutomaatinTila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Sarjallistamista.kirjoitaTiedostoon( ja );
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		mnYllpito.add(mntmTallennaAutomaatinTila);
		
		mntmLataaAutomaatti = new JMenuItem("Lataa automaatti");
		mntmLataaAutomaatti.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mntmLataaAutomaatti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JuomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					ja.setKahvi(uusi.getKahvi());
					lblNewLabel.setText("Kahvia jäljellä: " + uusi.getKahvi());
					if(uusi.getKahvi() < 20) {
						lblNewLabel.setForeground(Color.RED); 
				}else {
					lblNewLabel.setForeground(Color.BLACK);
				}
					ja.setTee(uusi.getTee());
					lblTeetJljell.setText("Teetä jäljellä: " + uusi.getTee());
					if(uusi.getTee() < 20) {
						lblTeetJljell.setForeground(Color.RED); 
				}else {
					lblTeetJljell.setForeground(Color.BLACK);
				}
					ja.setKaakao(uusi.getKaakao());
					lblKaakaotaJljell.setText("Kaakaota jäljellä: " + uusi.getKaakao());
					if(uusi.getKaakao() < 20) {
						lblKaakaotaJljell.setForeground(Color.RED); 
				}else {
					lblKaakaotaJljell.setForeground(Color.BLACK);
				}
				} catch (FileNotFoundException e1) {
				
					e1.printStackTrace();
				
				}
			}
		});
		mnYllpito.add(mntmLataaAutomaatti);
		
		mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnYllpito.add(mntmLopeta);
		
		mnTietojaOhjelmasta = new JMenu("Tietoja ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		mntmVersiotiedot = new JMenuItem("Versiotiedot");
		mntmVersiotiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Versiotiedot.NewScreen();
				}
		});
		mnTietojaOhjelmasta.add(mntmVersiotiedot);
		
		mntmOhje = new JMenuItem("Ohje");
		mntmOhje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ohje.NewScreen2();
			}
		});
		mnTietojaOhjelmasta.add(mntmOhje);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ja.valmistaKahvi();
				lblNewLabel.setText("Kahvia jäljellä: " + ja.getKahvi());
			 if(ja.getKahvi() < 20) {
					lblNewLabel.setForeground(Color.RED); 
					}}
		});
		btnNewButton.setIcon(new ImageIcon(GUI.class.getResource("/resources/coffee.jpg")));
		btnNewButton.setBounds(21, 29, 130, 130);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ja.valmistaTee();
				lblTeetJljell.setText("Teetä jäljellä: " + ja.getTee());
				if(ja.getTee() < 20) {
					lblTeetJljell.setForeground(Color.RED); 
					}}
		});
		btnNewButton_1.setIcon(new ImageIcon(GUI.class.getResource("/resources/tea.jpg")));
		btnNewButton_1.setBounds(21, 202, 130, 130);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(GUI.class.getResource("/resources/cocoa.jpg")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ja.valmistaKaakao();
				lblKaakaotaJljell.setText("Kaakaota jäljellä: " + ja.getKaakao());
				if(ja.getKaakao() < 20) {
					lblKaakaotaJljell.setForeground(Color.RED); 
				}}
		});
		btnNewButton_2.setBounds(21, 372, 130, 130);
		contentPane.add(btnNewButton_2);
		
		lblKahvi = new JLabel("Kahvi");
		lblKahvi.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblKahvi.setHorizontalAlignment(SwingConstants.CENTER);
		lblKahvi.setBounds(64, 169, 46, 13);
		contentPane.add(lblKahvi);
		
		lblTee = new JLabel("Tee");
		lblTee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTee.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTee.setBounds(64, 342, 46, 13);
		contentPane.add(lblTee);
		
		lblKaakao = new JLabel("Kaakao");
		lblKaakao.setHorizontalAlignment(SwingConstants.CENTER);
		lblKaakao.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblKaakao.setBounds(64, 512, 54, 13);
		contentPane.add(lblKaakao);
		
		lblNewLabel = new JLabel("Kahvia jäljellä: " + ja.getKahvi());
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(161, 88, 215, 13);
		contentPane.add(lblNewLabel);
		
		lblTeetJljell = new JLabel("Teetä jäljellä: " + ja.getTee());
		lblTeetJljell.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTeetJljell.setBounds(161, 262, 215, 13);
		contentPane.add(lblTeetJljell);
		
		lblKaakaotaJljell = new JLabel("Kaakaota jäljellä: " + ja.getKaakao());
		lblKaakaotaJljell.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKaakaotaJljell.setBounds(161, 432, 215, 13);
		contentPane.add(lblKaakaotaJljell);
	}
}
