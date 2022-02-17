package botones;
import javax.swing.*;
import java.awt.event.*;
public class ejemplo1 extends JFrame implements ActionListener {

	
	JButton boton1;
	JButton boton2;
	JButton boton3;
	
	JLabel l1;
	//Constructor
	public ejemplo1() {
		//Layout absoluto
		setLayout(null);
		//Tamaño de la ventana
		setBounds(0,0,450,350);
		//Título
		setTitle("Ejemplo 1: Botón");
		//Cerrar proceso al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Label
		l1=new JLabel("Programación DAM");
		l1.setBounds(10,20,300,30);
		add(l1);
		//Button
		boton1= new JButton("Finalizar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener(this);
		//Muestro JFrame(lo último para que lo pinte todo correctamente)
		setVisible(true);
		
		boton2= new JButton("Open");
		boton2.setBounds(300,200,100,30);
		add(boton2);
		boton2.addActionListener(this);

		boton3= new JButton("Update");
		boton3.setBounds(300,150,100,30);
		add(boton3);
		boton3.addActionListener(this);
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1){
			
			System.exit(0);
		}
		
		if(e.getSource()==boton2) {
			
			System.out.println("Holaaa");
		}
		
		if(e.getSource()==boton3) {
			
			System.out.println("Llamando a otra clase");
		}
	}
	
	public static void main(String[]args) {
		
		new ejemplo1();
		System.out.println();
	}
	
}
