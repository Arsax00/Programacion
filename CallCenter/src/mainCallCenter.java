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

import images.clientes;

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
    static int xMouse,yMouse;
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
		setBounds(100, 100, 857, 578);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(40, 40));
		contentPane.setBackground(SystemColor.inactiveCaption);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setIcon(new ImageIcon(mainCallCenter.class.getResource("/images/logo1.png")));
		lbllogo.setBounds(386, 77, 50, 60);
		contentPane.add(lbllogo);
		
	
		
		JLabel lblNewLabel = new JLabel("Call Center");
		lblNewLabel.setForeground(new Color(123, 104, 238));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(350, 135, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(670, 40, 196, 550);
		contentPane.add(lblNewLabel_1);
		
		JPanel header = new JPanel();
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
		header.setLayout(null);
		header.setBorder(null);
		header.setBackground(SystemColor.inactiveCaption);
		header.setBounds(0, 0, 866, 40);
		contentPane.add(header);
		
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
		cliente.setLayout(null);
		cliente.setBorder(new EmptyBorder(0, 0, 0, 0));
		cliente.setBackground(SystemColor.inactiveCaption);
		cliente.setBounds(148, 0, 110, 41);
		header.add(cliente);
		
		JLabel lblClientesHeader = new JLabel("Cliente");
		lblClientesHeader.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			    setVisible(false);
			    clientes c= new clientes();
			    c.setVisible(true);
			}
		});
		lblClientesHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientesHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClientesHeader.setBackground(SystemColor.inactiveCaption);
		lblClientesHeader.setBounds(0, 0, 108, 41);
		cliente.add(lblClientesHeader);
		
		
		JPanel proveedores = new JPanel();
		proveedores.setLayout(null);
		proveedores.setBackground(SystemColor.inactiveCaption);
		proveedores.setBounds(298, 0, 125, 41);
		header.add(proveedores);
		
		JLabel lblProveedoresHeader = new JLabel("Proveedores");
		lblProveedoresHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedoresHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProveedoresHeader.setBounds(0, 0, 125, 41);
		proveedores.add(lblProveedoresHeader);
		
		JPanel Pedidos = new JPanel();
		Pedidos.setLayout(null);
		Pedidos.setBackground(SystemColor.inactiveCaption);
		Pedidos.setBounds(456, 0, 119, 41);
		header.add(Pedidos);
		
		JLabel lblPedidosHeader = new JLabel("Pedidos");
		lblPedidosHeader.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPedidosHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidosHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPedidosHeader.setBounds(0, 0, 119, 41);
		Pedidos.add(lblPedidosHeader);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(619, 0, 125, 41);
		header.add(panel);
		
		JLabel lblDevolucionesHeader = new JLabel("Devoluciones");
		lblDevolucionesHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevolucionesHeader.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevolucionesHeader.setBounds(0, 0, 125, 41);
		panel.add(lblDevolucionesHeader);
	}
}
