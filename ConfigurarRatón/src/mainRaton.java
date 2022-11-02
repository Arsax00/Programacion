import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;

public class mainRaton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainRaton frame = new mainRaton();
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
	public mainRaton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 369);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setForeground(new Color(75, 0, 130));
		spinner.setModel(new SpinnerNumberModel(0, 0, 50, 25));
		spinner.setFont(new Font("Consolas", Font.PLAIN, 15));
		spinner.setBackground(new Color(255, 228, 181));
		spinner.setBounds(69, 63, 98, 32);
		contentPane.add(spinner);
		
		JLabel lblVelocidad = new JLabel("Velocidad del ratón:");
		lblVelocidad.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblVelocidad.setBounds(37, 27, 179, 25);
		contentPane.add(lblVelocidad);
		
		JLabel lblBotnSeleccionado = new JLabel("Botón seleccionado:");
		lblBotnSeleccionado.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblBotnSeleccionado.setBounds(287, 27, 179, 25);
		contentPane.add(lblBotnSeleccionado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(75, 0, 130));
		comboBox.setFont(new Font("Consolas", Font.PLAIN, 15));
		comboBox.setBackground(new Color(255, 222, 173));
		comboBox.setBounds(314, 66, 110, 25);
		contentPane.add(comboBox);
		comboBox.addItem("Izquierdo");
		comboBox.addItem("Derecho");
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(64, 136, 103, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel barraProgreso = new JLabel("");
		barraProgreso.setBounds(0, 0, 103, 32);
		panel.add(barraProgreso);
		barraProgreso.setForeground(new Color(255, 255, 240));
		barraProgreso.setBackground(new Color(255, 192, 203));
	}
}
