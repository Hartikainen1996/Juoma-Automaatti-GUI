import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Ohje {

	private JFrame frmOhje;
	private JLabel lblTllOhjelmallaPystyt;
	private JLabel lblVhentmnKahvin;
	private JLabel lblMuuttamaanKahvin;
	private JLabel lblTallentamaanAutomaatin;
	private JLabel lblAvaamaanTallennetun;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ohje window = new Ohje();
					window.frmOhje.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ohje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOhje = new JFrame();
		frmOhje.setTitle("Ohje");
		frmOhje.setBounds(100, 100, 450, 300);
		frmOhje.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmOhje.getContentPane().setLayout(null);
		
		lblTllOhjelmallaPystyt = new JLabel("T\u00E4ll\u00E4 ohjelmalla pystyt suorittamaan seuraavia asioita:");
		lblTllOhjelmallaPystyt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTllOhjelmallaPystyt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTllOhjelmallaPystyt.setBounds(10, 45, 400, 13);
		frmOhje.getContentPane().add(lblTllOhjelmallaPystyt);
		
		lblVhentmnKahvin = new JLabel("- V\u00E4hent\u00E4m\u00E4\u00E4n kahvin, teen ja kaakaon m\u00E4\u00E4r\u00E4\u00E4");
		lblVhentmnKahvin.setHorizontalAlignment(SwingConstants.CENTER);
		lblVhentmnKahvin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVhentmnKahvin.setBounds(10, 68, 341, 13);
		frmOhje.getContentPane().add(lblVhentmnKahvin);
		
		lblMuuttamaanKahvin = new JLabel("- Muuttamaan kahvin, teen ja kaakaon m\u00E4\u00E4r\u00E4\u00E4");
		lblMuuttamaanKahvin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMuuttamaanKahvin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMuuttamaanKahvin.setBounds(10, 91, 341, 13);
		frmOhje.getContentPane().add(lblMuuttamaanKahvin);
		
		lblTallentamaanAutomaatin = new JLabel("- Tallentamaan automaatin tilan");
		lblTallentamaanAutomaatin.setHorizontalAlignment(SwingConstants.CENTER);
		lblTallentamaanAutomaatin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTallentamaanAutomaatin.setBounds(-40, 115, 341, 13);
		frmOhje.getContentPane().add(lblTallentamaanAutomaatin);
		
		lblAvaamaanTallennetun = new JLabel("- Avaamaan tallennetun automaatin tilan");
		lblAvaamaanTallennetun.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvaamaanTallennetun.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAvaamaanTallennetun.setBounds(-11, 138, 341, 13);
		frmOhje.getContentPane().add(lblAvaamaanTallennetun);
	}
}
