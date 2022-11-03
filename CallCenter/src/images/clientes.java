package images;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class clientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
    static int xMouse,yMouse;
    private JTextField textFieldCP;
    private JTextField textFieldNum;
    private JTextField textFieldTelf;
    private JTextField textField_2;
    private JTextField textFieldLocalidad;
    private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientes frame = new clientes();
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
	public clientes() {
		setUndecorated(true);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 13));
		lblNombre.setBounds(74, 120, 74, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Calle:");
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDireccion.setFont(new Font("Arial", Font.BOLD, 13));
		lblDireccion.setBounds(74, 242, 67, 14);
		contentPane.add(lblDireccion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(226, 242, 127, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(226, 120, 127, 20);
		contentPane.add(textField_1);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBorder(null);
		header.setBackground(SystemColor.inactiveCaption);
		header.setBounds(0, 0, 866, 41);
		contentPane.add(header);
		header.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();

			}
		});
		 header.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);

			}
		
		});
		JPanel Exit = new JPanel();
		Exit.setLayout(null);
		Exit.setBackground(SystemColor.inactiveCaption);
		Exit.setBounds(0, 0, 48, 41);
		header.add(Exit);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExit.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblExit.setBackground(SystemColor.inactiveCaption);
		lblExit.setBounds(0, 0, 47, 41);
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
		
		JPanel cliente = new JPanel();
		cliente.setBorder(new EmptyBorder(0, 0, 0, 0));
		cliente.setBackground(SystemColor.activeCaption);
		cliente.setBounds(148, 0, 110, 41);
		header.add(cliente);
		cliente.setLayout(null);
		
		JLabel lblClientesHeader = new JLabel("Cliente");
		lblClientesHeader.setBounds(0, 0, 108, 41);
		lblClientesHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClientesHeader.setBackground(SystemColor.activeCaption);
		cliente.add(lblClientesHeader);
		
		JPanel proveedores = new JPanel();
		proveedores.setBackground(SystemColor.inactiveCaption);
		proveedores.setBounds(298, 0, 125, 41);
		header.add(proveedores);
		proveedores.setLayout(null);
		
		JLabel lblProveedoresHeader = new JLabel("Proveedores");
		lblProveedoresHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedoresHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProveedoresHeader.setBounds(0, 0, 125, 41);
		proveedores.add(lblProveedoresHeader);
		
		JPanel Pedidos = new JPanel();
		Pedidos.setBackground(SystemColor.inactiveCaption);
		Pedidos.setBounds(456, 0, 119, 41);
		header.add(Pedidos);
		Pedidos.setLayout(null);
		
		JLabel lblPedidosHeader = new JLabel("Pedidos");
		lblPedidosHeader.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPedidosHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidosHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPedidosHeader.setBounds(0, 0, 119, 41);
		Pedidos.add(lblPedidosHeader);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(619, 0, 125, 41);
		header.add(panel);
		panel.setLayout(null);
		
		JLabel lblDevolucionesHeader = new JLabel("Devoluciones");
		lblDevolucionesHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevolucionesHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevolucionesHeader.setBounds(0, 0, 125, 41);
		panel.add(lblDevolucionesHeader);
		
		JLabel lblCP = new JLabel("CP:");
		lblCP.setHorizontalAlignment(SwingConstants.CENTER);
		lblCP.setFont(new Font("Arial", Font.BOLD, 13));
		lblCP.setBounds(74, 288, 74, 14);
		contentPane.add(lblCP);
		
		textFieldCP = new JTextField();
		textFieldCP.setColumns(10);
		textFieldCP.setBounds(226, 288, 127, 20);
		contentPane.add(textFieldCP);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(new Color(123, 104, 238));
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblRegistro.setBounds(151, 71, 90, 20);
		contentPane.add(lblRegistro);
		
		JLabel lblN = new JLabel("Nº:");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setFont(new Font("Arial", Font.BOLD, 13));
		lblN.setBounds(363, 245, 24, 14);
		contentPane.add(lblN);
		
		textFieldNum = new JTextField();
		textFieldNum.setBounds(391, 242, 34, 20);
		contentPane.add(textFieldNum);
		textFieldNum.setColumns(10);
		
		JLabel lblTelf = new JLabel("Teléfono:");
		lblTelf.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelf.setFont(new Font("Arial", Font.BOLD, 13));
		lblTelf.setBounds(74, 330, 74, 14);
		contentPane.add(lblTelf);
		
		textFieldTelf = new JTextField();
		textFieldTelf.setColumns(10);
		textFieldTelf.setBounds(226, 330, 127, 20);
		contentPane.add(textFieldTelf);
		
		JLabel lblNombreUsuario = new JLabel("Usuario:");
		lblNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreUsuario.setFont(new Font("Arial", Font.BOLD, 13));
		lblNombreUsuario.setBounds(74, 427, 74, 14);
		contentPane.add(lblNombreUsuario);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(226, 421, 127, 20);
		contentPane.add(textField_2);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocalidad.setFont(new Font("Arial", Font.BOLD, 13));
		lblLocalidad.setBounds(74, 204, 74, 14);
		contentPane.add(lblLocalidad);
		
		textFieldLocalidad = new JTextField();
		textFieldLocalidad.setColumns(10);
		textFieldLocalidad.setBounds(226, 204, 127, 20);
		contentPane.add(textFieldLocalidad);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblContraseña.setFont(new Font("Arial", Font.BOLD, 13));
		lblContraseña.setBounds(74, 468, 90, 14);
		contentPane.add(lblContraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 462, 127, 20);
		contentPane.add(passwordField);
		
		JLabel lblIntroduzcaLosDatos = new JLabel("Introduzca los datos para su cuenta:");
		lblIntroduzcaLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduzcaLosDatos.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIntroduzcaLosDatos.setBounds(74, 376, 266, 20);
		contentPane.add(lblIntroduzcaLosDatos);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeNacimiento.setFont(new Font("Arial", Font.BOLD, 13));
		lblFechaDeNacimiento.setBounds(74, 158, 157, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JComboBox años = new JComboBox();
		años.setBounds(391, 154, 60, 22);
		contentPane.add(años);
		for(int i=1930;i<=2005;i++) {
			años.addItem(i);
			}
		JComboBox mes = new JComboBox();
		mes.setBounds(277, 154, 101, 22);
		contentPane.add(mes);
		
		String meses[] = {" Enero ", " Febrero ", " Marzo ", " Abril ", " Mayo ", " Junio ", " Julio ", " Agosto ", " Septiembre ", " Octubre ", " Noviembre ", " Diciembre "};
		for(int i=0;i<=11;i++) {
			
			mes.addItem(meses[i]);
		}
		
		JComboBox dia = new JComboBox();
		dia.setBounds(226, 154, 41, 22);
		contentPane.add(dia);
		
		JButton btnRegistro = new JButton("Registrar");
		btnRegistro.setBackground(new Color(123, 104, 238));
		btnRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistro.setBounds(221, 527, 90, 40);
		contentPane.add(btnRegistro);
		
		for(int i=1;i<=31;i++) {
			
		dia.addItem(i);
			
		}
	
		
	}
}
