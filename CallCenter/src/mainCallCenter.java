import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.Cursor;
import java.awt.Point;

public class mainCallCenter extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUser;
	private JTextField textFieldContraseña;
    static int xMouse,yMouse;
    private JTextField textFieldNombreProveedor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainCallCenter frame = new mainCallCenter();
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
	public mainCallCenter() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 590);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(40, 40));
		contentPane.setBackground(SystemColor.inactiveCaption);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(mainCallCenter.class.getResource("/images/logo1.png")));
		lbllogo.setBounds(120, 71, 50, 60);
		contentPane.add(lbllogo);
		
		JPanel header = new JPanel();
		header.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse=e.getX();
				yMouse=e.getY();
				
			}
		});
		header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int y= e.getXOnScreen();
				int x= e.getYOnScreen();
				setLocation(x - xMouse,y - yMouse);
				
			}
		});
		
		header.setBackground(SystemColor.inactiveCaption);
		header.setBorder(new LineBorder(new Color(0, 0, 0)));
		header.setBounds(0, 0, 866, 41);
		contentPane.add(header);
		header.setLayout(null);
		
		JPanel Exit = new JPanel();
		Exit.setBackground(SystemColor.inactiveCaption);
		Exit.setBounds(0, 0, 48, 41);
		header.add(Exit);
		Exit.setLayout(null);
		
		JLabel lblExit = new JLabel("X");
			
		lblExit.setBackground(SystemColor.inactiveCaption);
		lblExit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExit.setBounds(1, 0, 46, 41);
		Exit.add(lblExit);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Color colorPulsado=new Color(44,29,95);
				Exit.setBackground(colorPulsado);
				lblExit.setForeground(Color.white);
				
				
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				Exit.setBackground(SystemColor.inactiveCaption);
				lblExit.setForeground(Color.black);
			}
		});
		
	
		
		JLabel lblNewLabel = new JLabel("Call Center");
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 129, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Arial", Font.BOLD, 17));
		lblClientes.setBounds(53, 182, 86, 26);
		contentPane.add(lblClientes);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 13));
		lblUsuario.setBounds(34, 233, 83, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(670, 40, 196, 550);
		contentPane.add(lblNewLabel_1);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(124, 230, 127, 20);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Arial", Font.BOLD, 13));
		lblDireccion.setBounds(34, 276, 83, 14);
		contentPane.add(lblDireccion);
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		textFieldContraseña.setBounds(124, 273, 127, 20);
		contentPane.add(textFieldContraseña);
		
		JLabel lblProveedores = new JLabel("Proveedores:");
		lblProveedores.setFont(new Font("Arial", Font.BOLD, 17));
		lblProveedores.setBounds(464, 182, 117, 26);
		contentPane.add(lblProveedores);
		
		JLabel lblNombreProveedor = new JLabel("Nombre:");
		lblNombreProveedor.setFont(new Font("Arial", Font.BOLD, 13));
		lblNombreProveedor.setBounds(464, 230, 83, 14);
		contentPane.add(lblNombreProveedor);
		
		textFieldNombreProveedor = new JTextField();
		textFieldNombreProveedor.setColumns(10);
		textFieldNombreProveedor.setBounds(554, 227, 127, 20);
		contentPane.add(textFieldNombreProveedor);
	}
}
