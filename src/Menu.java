import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;





public class Menu extends JFrame implements ActionListener {
	




private JButton schliessen;
private JButton einstellung;
private JButton info;
private JButton ende;
private JButton anleitung;



	public static void main (String[] args) { 
			 

	
		
	Menu dasMenu = new Menu("Menü");
	
	dasMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	dasMenu.setSize(900,700);
	
	//dasMenu.setLayout(null); // nichts, das Layout wird selber gemacht
	
	dasMenu.setVisible(true); 
	
																															
	}
	
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::	
	
	public Menu(String title) {
		
		super(title); 
		
		schliessen = new JButton("Spiel starten"); // Name zeigt an , dass das Spiel gestartet wird und das Menu beim Klicken geschlossen wird.
		schliessen.setBounds(250,80,400,60);    //a,b = Größe des Buttons ; c,d = Position der Buttons
		schliessen.addActionListener(this);
		add(schliessen);							// wird der Oberfläche hinzugefügt
		
		einstellung = new JButton("Einstellungen");
		einstellung.setBounds(280, 190, 340, 40);
		einstellung.addActionListener(this);
		add(einstellung);
	
		
		info = new JButton("Credits");
		info.setBounds(280, 270, 340, 40);
		info.addActionListener(this);
		add(info);
	
		
		anleitung = new JButton("Anleitung");
		anleitung.setBounds(280, 350, 340, 40);
		anleitung.addActionListener(this);
		add(anleitung);
		    
			
		
	    ende = new JButton("Beenden");
	    ende.setBounds(250, 430, 400, 60);
	    ende.addActionListener(this);
	    add(ende);
	   
	   
		
		JLabel label = new JLabel("Made by Golden Chess Team ");
		label.setBounds(700,630,150,20);
		add(label);
		
	
		
	}
		

	
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
	
	
	public void actionPerformed(ActionEvent e){ // für die ereignisse der Buttons
		
		
		if (e.getSource() == schliessen){  //das ereignis löst aus 
			fenster();	
			
			
		}
		
		if (e.getSource() == info){
			Object[] options = { "OK"}; // OK button auf dem Fenster wenn man auf info klcikt
			JOptionPane.showOptionDialog(null, "Programmiert von J.Kolb & A.Uka", "Information", //message box

			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,

			        null, options, options[0]);
		}
		
		if (e.getSource() == einstellung){
			Object[] options = { "OK"};
			JOptionPane.showOptionDialog(null, "Hier können Sie die Zeit einstellen.", "Information",  

			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,

			        null, options, options[0]);
		}
		
		
		if (e.getSource() == ende){
			System.exit(0);
			
			
		}
		
		if (e.getSource() == anleitung){
			tutorial();
			
			
			
		}
	}
	 
	
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
	private void tutorial() {
	 JFrame tutorial = new JFrame("Anleitung");
	 tutorial.setVisible(true);
	
	}
	
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	public static void fenster(){
		
		Bewegungsmuster dieBewegungsmuster;
		dieBewegungsmuster = new Bewegungsmuster();
		Actionlistener dieActionListener;
		dieActionListener = new Actionlistener();
		
		JFrame fenster = new JFrame("ProjektSchachspiel");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Gui startfenster = new Gui(dieBewegungsmuster,dieActionListener);
		
		startfenster.setVisible(true);
	
	}
	
	
	
		}
	
	
		
