import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;





public class Menu extends JFrame implements ActionListener {
	




private JButton starten;
private JButton einstellung;
private JButton info;
private JButton ende;
private JButton anleitung;




	public static void main (String[] args) { 
			 

	
		
	Menu dasMenu = new Menu("Menü");
	
	dasMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	dasMenu.setSize(900,700);
	
	dasMenu.setLayout(null); // nichts, das Layout wird selber gemacht
	
	dasMenu.setVisible(true); 
	
																															
	}
	
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::	
	
	public Menu(String title) {
		
		super(title); 
		
		starten = new JButton("Spiel starten"); // Name zeigt an , dass das Spiel gestartet wird und das Menu beim Klicken geschlossen wird.
		starten.setBounds(250,80,400,60);    //a,b = Größe des Buttons ; c,d = Position der Buttons
		starten.addActionListener(this);
		add(starten);		// wird der Oberfläche hinzugefügt
		
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
	   
	   
		
		JLabel label = new JLabel("Golden Chess Team ");
		label.setBounds(700,630,150,20);
		add(label);
		
	
		
	}
		

	
	//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
	
	
	public void actionPerformed(ActionEvent e){ // für die ereignisse der Buttons
		
		
		if (e.getSource() == starten){ 
			fenster();	
			
			
		}
		
		if (e.getSource() == info){
			Object[] options = { "OK"}; // OK button auf dem Fenster wenn man auf info klcikt
			JOptionPane.showOptionDialog(null, "Programmiert von Josias Kolb & Arbnor Uka", "Information", //message box

			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,

			        null, options, options[0]);
		}
		
		if (e.getSource() == einstellung){
			Object[] options = { "OK"};
			JOptionPane.showOptionDialog(null , "Hier können Sie die Zeit einstellen.", "Information",  

			        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,

			        null, options, options[0]);
		}
		
		
		if (e.getSource() == ende){
			System.exit(0);
			
			
		}
		
		if (e.getSource() == anleitung){
			tutorial(); //methode Tutorial wird ausgeführt die das Cardlayout aus der Klasse CardLayout ruft.
			
			
			
		}
	}
	 
	
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	
	private void tutorial() {
		//Hier kommuniziert das Menu mit der Klasse CardLayoutAnleitung
		CardLayoutAnleitung dieAnleitung;
		dieAnleitung = new CardLayoutAnleitung();
		
	

	
	
	}
	
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	public static void fenster(){
		/*Hier kommuniziert das Menu mit den Klassen Bewegungsmuster und Actionlistener
		 * Und erhält somit einen Zugriff auf die Gui */
		
		Bewegungsmuster dieBewegungsmuster;
		dieBewegungsmuster = new Bewegungsmuster();
		Actionlistener dieActionListener;
		dieActionListener = new Actionlistener();
	
	

		Gui startfenster = new Gui(dieBewegungsmuster,dieActionListener);
	
		startfenster.setVisible(true);

	}
	
	
	
		}
	
	
		
