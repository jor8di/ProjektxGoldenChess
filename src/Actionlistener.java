
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Actionlistener implements ActionListener{
 
	Gui dieGui;
	
	String button;
	
	public Actionlistener() {
		
	}
	
	
	//Gebe Buttons Actionlistener-------------------------------------------------------------------
	
		public void erstelleActionLis() {
			
			dieGui.bA1.addActionListener(this);
			dieGui.bA2.addActionListener(this);
			dieGui.bA3.addActionListener(this);
			dieGui.bA4.addActionListener(this);
			dieGui.bA5.addActionListener(this);
			dieGui.bA6.addActionListener(this);
			dieGui.bA7.addActionListener(this);
			dieGui.bA8.addActionListener(this);
			
			dieGui.bB1.addActionListener(this);
			dieGui.bB2.addActionListener(this);
			dieGui.bB3.addActionListener(this);
			dieGui.bB4.addActionListener(this);
			dieGui.bB5.addActionListener(this);
			dieGui.bB6.addActionListener(this);
			dieGui.bB7.addActionListener(this);
			dieGui.bB8.addActionListener(this);
			
			dieGui.bC1.addActionListener(this);
			dieGui.bC2.addActionListener(this);
			dieGui.bC3.addActionListener(this);
			dieGui.bC4.addActionListener(this);
			dieGui.bC5.addActionListener(this);
			dieGui.bC6.addActionListener(this);
			dieGui.bC7.addActionListener(this);
			dieGui.bC8.addActionListener(this);
			
			dieGui.bD1.addActionListener(this);
			dieGui.bD2.addActionListener(this);
			dieGui.bD3.addActionListener(this);
			dieGui.bD4.addActionListener(this);
			dieGui.bD5.addActionListener(this);
			dieGui.bD6.addActionListener(this);
			dieGui.bD7.addActionListener(this);
			dieGui.bD8.addActionListener(this);
			
			dieGui.bE1.addActionListener(this);
			dieGui.bE2.addActionListener(this);
			dieGui.bE3.addActionListener(this);
			dieGui.bE4.addActionListener(this);
			dieGui.bE5.addActionListener(this);
			dieGui.bE6.addActionListener(this);
			dieGui.bE7.addActionListener(this);
			dieGui.bE8.addActionListener(this);
			
			dieGui.bF1.addActionListener(this);
			dieGui.bF2.addActionListener(this);
			dieGui.bF3.addActionListener(this);
			dieGui.bF4.addActionListener(this);
			dieGui.bF5.addActionListener(this);
			dieGui.bF6.addActionListener(this);
			dieGui.bF7.addActionListener(this);
			dieGui.bF8.addActionListener(this);
			
			dieGui.bG1.addActionListener(this);
			dieGui.bG2.addActionListener(this);
			dieGui.bG3.addActionListener(this);
			dieGui.bG4.addActionListener(this);
			dieGui.bG5.addActionListener(this);
			dieGui.bG6.addActionListener(this);
			dieGui.bG7.addActionListener(this);
			dieGui.bG8.addActionListener(this);
			
			dieGui.bH1.addActionListener(this);
			dieGui.bH2.addActionListener(this);
			dieGui.bH3.addActionListener(this);
			dieGui.bH4.addActionListener(this);
			dieGui.bH5.addActionListener(this);
			dieGui.bH6.addActionListener(this);
			dieGui.bH7.addActionListener(this);
			dieGui.bH8.addActionListener(this);
			dieGui.bSpielfeldDreher.addActionListener(this);
			dieGui.UDame.addActionListener(this);
			dieGui.UTurm.addActionListener(this);
			dieGui.ULaeufer.addActionListener(this);
			dieGui.UPferd.addActionListener(this);
			
			
		}
	
   
        
    
 
    public void actionPerformed (ActionEvent ae){
        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        if(ae.getSource() == this.dieGui.bA1){
        	button = "bA1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA2){
        	button = "bA2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA3){
        	button = "bA3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA4){
        	button = "bA4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA5){
        	button = "bA5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA6){
        	button = "bA6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA7){
        	button = "bA7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bA8){
        	button = "bA8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB1){
        	button = "bB1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB2){
        	button = "bB2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB3){
        	button = "bB3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB4){
        	button = "bB4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB5){
        	button = "bB5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB6){
        	button = "bB6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB7){
        	button = "bB7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bB8){
        	button = "bB8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC1){
        	button = "bC1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC2){
        	button = "bC2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC3){
        	button = "bC3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC4){
        	button = "bC4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC5){
        	button = "bC5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC6){
        	button = "bC6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC7){
        	button = "bC7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bC8){
        	button = "bC8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD1){
        	button = "bD1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD2){
        	button = "bD2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD3){
        	button = "bD3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD4){
        	button = "bD4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD5){
        	button = "bD5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD6){
        	button = "bD6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD7){
        	button = "bD7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bD8){
        	button = "bD8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE1){
        	button = "bE1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE2){
        	button = "bE2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE3){
        	button = "bE3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE4){
        	button = "bE4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE5){
        	button = "bE5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE6){
        	button = "bE6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE7){
        	button = "bE7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bE8){
        	button = "bE8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF1){
        	button = "bF1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF2){
        	button = "bF2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF3){
        	button = "bF3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF4){
        	button = "bF4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF5){
        	button = "bF5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF6){
        	button = "bF6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF7){
        	button = "bF7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bF8){
        	button = "bF8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG1){
        	button = "bG1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG2){
        	button = "bG2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG3){
        	button = "bG3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG4){
        	button = "bG4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG5){
        	button = "bG5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG6){
        	button = "bG6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG7){
        	button = "bG7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bG8){
        	button = "bG8";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH1){
        	button = "bH1";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH2){
        	button = "bH2";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH3){
        	button = "bH3";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH4){
        	button = "bH4";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH5){
        	button = "bH5";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH6){
        	button = "bH6";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH7){
        	button = "bH7";
        	action(button);
        }
        else if(ae.getSource() == this.dieGui.bH8){
        	button = "bH8";
        	action(button); }
        
        
    	else if(ae.getSource() == this.dieGui.bSpielfeldDreher){
    		
    		dieGui.arraySpielfeld = dieGui.dieSteuerung.dreheSpielfeld(dieGui.arraySpielfeld);
			
			dieGui.überschreibeButtons(dieGui.arraySpielfeld); 
			
			if (dieGui.goldOben == true) {
				
				dieGui.goldOben = false;
				
			} else {
				
				dieGui.goldOben = true;

			}
			
			
			}
        
    	else if(ae.getSource() == this.dieGui.UDame){
    	
				
				dieGui.dieSteuerung.dieDame.dameClicked(button,dieGui.arraySpielfeld);
				dieGui.dieSteuerung.dieBewegungsmuster.dieGui.istAmZug= true;
				dieGui.auswahl.dispose();
			
	
    	
    	}
    	else if(ae.getSource() == this.dieGui.UTurm){
    		
			
				dieGui.dieSteuerung.derTurm.turmClicked(button,dieGui.arraySpielfeld);
				dieGui.dieSteuerung.dieBewegungsmuster.dieGui.istAmZug= true;
				dieGui.auswahl.dispose();
			
    	
    	}
    	else if(ae.getSource() == this.dieGui.UPferd){
    		
				dieGui.dieSteuerung.dasPferd.pferdClicked(button,dieGui.arraySpielfeld);
				dieGui.dieSteuerung.dieBewegungsmuster.dieGui.istAmZug= true;
				dieGui.auswahl.dispose();
			
			
    	
    	}
    	else if(ae.getSource() == this.dieGui.ULaeufer){
    		
				
				dieGui.dieSteuerung.derLaeufer.laeuferClicked(button,dieGui.arraySpielfeld);
				dieGui.dieSteuerung.dieBewegungsmuster.dieGui.istAmZug= true;
				dieGui.auswahl.dispose();
			
    	
    	}
    		
    		
    }
  
        
        
    
     // Assoziation mit Gui:
    	
    	public void linkGui(Gui g) {
    		
    		dieGui = g;
    		
    	}
        
    	
    	public void action(String button) {
			
    		System.out.println(dieGui.istAmZug);
    		
			if (dieGui.istAmZug==false) {
				
				dieGui.dieSteuerung.rufeBewegungsMusterKlassen(dieGui.arraySpielfeld, dieGui.spieler, button);
				
			} else {
				
				dieGui.dieSteuerung.bewegen(dieGui.buttonKoordinaten,button);
			
				
			}
    		
		}
    	
    	
    }
