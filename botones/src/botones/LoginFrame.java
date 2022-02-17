package botones;
import javax.swing.*;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {



	Container container= getContentPane();
	JLabel userLabel =new JLabel("USERNAME");
	JLabel passwordLabel= new JLabel("PASSWORD");
	JTextField userfield1= new JTextField();
	JPasswordField passwordfield1= new JPasswordField();
	JButton loginBoton= new JButton("LOGIN");
	JButton resetBoton= new JButton("RESET");
	JButton exitBoton=new JButton("EXIT");
	JCheckBox showPassword= new JCheckBox("show password");
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
		
	
		passwordfield1=new JPasswordField();
		passwordfield1.setBounds(110,130,200,30);
		
        //botones
		
		//Button
				
				loginBoton.setBounds(300,250,100,30);
				
				loginBoton.addActionListener(this);
				
				
				resetBoton.setBounds(300,200,100,30);
				
				resetBoton.addActionListener(this);
				
				
				exitBoton.setBounds(300,300,100,30);
				showPassword.setBounds(300,350,100,30);
				
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
    	container.add(showPassword);
    	setVisible(true);
    }
    public void addLayoutEvent() {
    	
    	loginBoton.addActionListener(this);
    	resetBoton.addActionListener(this);
    	exitBoton.addActionListener(this);
    	showPassword.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource( )==loginBoton) {
			
			System.out.println("PROBANDO...");
			String userText;
			String pwdText;
			userText= userfield1.getText();
			pwdText=passwordfield1.getText();
			
			if(userText.equalsIgnoreCase("sara")&&pwdText.equalsIgnoreCase("12345")) {
				
				JOptionPane.showMessageDialog(this, "Login Successful");
			}else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}
		}
		if(e.getSource()==resetBoton) {
			
			System.out.println("PROBANDO...");
	        userfield1.setText("");
	        passwordfield1.setText("");
		}
		if(e.getSource()==exitBoton) {
			
			System.exit(0);
		}
		if(e.getSource()==showPassword) {
			if(showPassword.isSelected()) {
				passwordfield1.setEchoChar((char)0);
			}else {
				passwordfield1.setEchoChar('*');
			}
		}
	}

	public static void main(String[]args) {
		
		LoginFrame frame= new LoginFrame();
		frame.setTitle("Login Form");
		frame.setBounds(10,10,600,600);
		frame.setVisible(true);
		
	
	}
	
	
}
