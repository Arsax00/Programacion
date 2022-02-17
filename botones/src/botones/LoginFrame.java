package botones;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {



	Container container= getContentPane();
	JLabel userLabel =new JLabel("USERNAME");
	JLabel passwordLabel= new JLabel("PASSWORD");
	JTextField userfield1= new JTextField();
	JTextField passwordfield1= new JTextField();
	JButton loginBoton= new JButton("LOGIN");
	JButton resetBoton= new JButton("RESET");
	JButton exitBoton=new JButton("EXIT");
	LoginFrame(){
		setLayoutManager();
		setLocationAndSize();
		addComponents();
		addLayoutEvent();
			
	}

    public void setLayoutManager() {
    	
    	container.setLayout(null);
    	
    }
    public void setLocationAndSize() {
    	
    	userLabel.setBounds(10,20,300,30);
		container.add(userLabel);
		passwordLabel.setBounds(10,130,200,30);
		
		//Text
		userfield1=new JTextField();
		userfield1.setBounds(110,20,300,30);
		
	
		passwordfield1=new JTextField();
		passwordfield1.setBounds(110,130,200,30);
		
        //botones
		
		//Button
				loginBoton= new JButton("Login");
				loginBoton.setBounds(300,250,100,30);
				
				loginBoton.addActionListener(this);
				
				resetBoton= new JButton("Reset");
				resetBoton.setBounds(300,200,100,30);
				
				resetBoton.addActionListener(this);
				
				exitBoton=new JButton("Exit");
				exitBoton.setBounds(300,300,100,30);
				
				setVisible(true);
		
		
    }
    public void addComponents(){
    	container.add(userLabel);
    	container.add(passwordLabel);
    	container.add(userfield1);
    	container.add(passwordfield1);	
    	container.add(loginBoton);
    	container.add(resetBoton);
    	container.add(exitBoton);
    	setVisible(true);
    }
    public void addLayoutEvent() {
    	
    	loginBoton.addActionListener(this);
    	resetBoton.addActionListener(this);
    	exitBoton.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource( )==loginBoton) {
			
			System.out.println("PROBANDO...");
			
		}
		if(e.getSource()==resetBoton) {
			
			System.out.println("PROBANDO...");
		}
		if(e.getSource()==exitBoton) {
			
			System.exit(0);
		}
	}

	public static void main(String[]args) {
		
		LoginFrame frame= new LoginFrame();
		frame.setTitle("Login Form");
		frame.setBounds(10,10,370,600);
		frame.setVisible(true);
		
	
	}
	
	
}
