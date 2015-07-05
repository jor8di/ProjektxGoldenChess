 import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Gui extends JFrame{
	
	//Welcher Spieler ist am Zug?

	String spieler="gold";
	
	//Variable die angibt, wie rum das Spielfeld gedreht ist
	
	Boolean goldOben = true;
	
	//Variable die angibt, welche Figur gerade am Zug ist
	
	Boolean istAmZug = false;
	
	//Array der die Koordinaten der im Zug befindlichen Figur speichert
	
	int buttonKoordinaten [] = new int [2];
	
	//String, wo der String der am Zug befindlichen Figur abgespeichert wird
	
	String figurAmZug;
	
	//assoziation mit Steuerung
	
	Steuerung dieSteuerung;
	
	//assoziation mit Bewegungsmuster
	Bewegungsmuster dieBewegungsmuster;
	
	//assoziation mit Actionlistener
	Actionlistener dieActionlistener;
	
	//zweidimensionales Hintergrundspielfeldarray 
	
	String [][] arraySpielfeld = new String[8][8];
	
	//Feldernamen für array
	//gold
	String turmGold = "tuGold";
	String pferdGold = "pfGold";
	String laeuferGold = "laGold";
	String dameGold = "daGold";
	String koenigGold= "koGold";
	String bauerGold = "baGold";
	//rot-gold
	String tuGoldRH = "tuGoldRH";
	String pfGoldRH = "pfGoldRH";
	String laGoldRH = "laGoldRH";
	String daGoldRH = "daGoldRH";
	String koGoldRH = "koGoldRH";
	String baGoldRH = "baGoldRH";
	
	//silber:
	String turmSilber = "tuSilber";
	String pferdSilber = "pfSilber";
	String laeuferSilber = "laSilber";
	String dameSilber = "daSilber";
	String koenigSilber = "koSilber";
	String bauerSilber = "baSilber";
	//rot-silber
	String tuSilberRH = "tuSilberRH";
	String pfSilberRH = "pfSilberRH";
	String laSilberRH = "laSilberRH";
	String daSilberRH = "daSilberRH";
	String koSilberRH = "koSilberRH";
	String baSilberRH = "baSilberRH";
	
	//weiß und schwarz
	String weißesFeld = "weiß";
	String schwarzesFeld ="schwarz"; 
	
	//64 Buttons für die jeweiligen Felder deklarieren, 1-8 = x-Achse, A-H= y-Achse
	JButton bA1,bA2,bA3,bA4,bA5,bA6,bA7,bA8;
	
	JButton bB1,bB2,bB3,bB4,bB5,bB6,bB7,bB8;
	
	JButton bC1,bC2,bC3,bC4,bC5,bC6,bC7,bC8;
	
	JButton bD1,bD2,bD3,bD4,bD5,bD6,bD7,bD8;
	
	JButton bE1,bE2,bE3,bE4,bE5,bE6,bE7,bE8;
	
	JButton bF1,bF2,bF3,bF4,bF5,bF6,bF7,bF8;
	
	JButton bG1,bG2,bG3,bG4,bG5,bG6,bG7,bG8;
	
	JButton bH1,bH2,bH3,bH4,bH5,bH6,bH7,bH8;
	
	//Buttons und fensterframe für die Umwandlung
	JFrame auswahl = new JFrame("Umwandlung");
		JButton UDame;
		JButton UPferd;
		JButton ULaeufer;
		JButton UTurm;
	
	//Button für das Drehen des Spielfeldes 
	
	JButton bSpielfeldDreher;
	
	//Label für das Anzeigen der geschlagenen Figuren
	JLabel lLinksLeer;
	JLabel lRechtsLeer;
	
	//linke Seite
	JLabel lLinksAnzeige;
	//Figur
	JLabel lLinksFigur1;
	JLabel lLinksFigur2;
	JLabel lLinksFigur3;
	JLabel lLinksFigur4;
	JLabel lLinksFigur5;
	JLabel lLinksFigur6;
	
	//Anzahl
	JLabel lLinksAnzahl1;
	JLabel lLinksAnzahl2;
	JLabel lLinksAnzahl3;
	JLabel lLinksAnzahl4;
	JLabel lLinksAnzahl5;
	JLabel lLinksAnzahl6;
	
	
	//rechte Seite
	JLabel lRechtsAnzeige;
	//Figur
	JLabel lRechtsFigur1;
	JLabel lRechtsFigur2;
	JLabel lRechtsFigur3;
	JLabel lRechtsFigur4;
	JLabel lRechtsFigur5;
	JLabel lRechtsFigur6;
	
	//Anzahl
	JLabel lRechtsAnzahl1;
	JLabel lRechtsAnzahl2;
	JLabel lRechtsAnzahl3;
	JLabel lRechtsAnzahl4;
	JLabel lRechtsAnzahl5;
	JLabel lRechtsAnzahl6;
	
	//JLAbel zur Anzeige wer gerade am Zug ist + Strings
	
	JLabel lZugAnzeige;
	
	String goldenerSpielerAmZug = "goldener Spieler ist am Zug ...";
	
	String silbernerSpielerAmZug = "silberner Spieler ist am Zug ...";
	
	//JLabel zur Anzeige wie viel Zeit übrig bleibt
	
	JLabel lZeitAnzeige;
	
	//ImageIcons für SIegerbildschirme
	ImageIcon iSiegGold;
	ImageIcon iSiegSilber;
	
	//ImageIcons für unbesetzte Felder
	ImageIcon iWeißesFeld; 
	ImageIcon iSchwarzesFeld;
	ImageIcon iBlauesFeld;
	
	//goldene Figurenicons
	ImageIcon iGoldeneDameWH;
	ImageIcon iGoldeneDameSH;
	ImageIcon iGoldenerKoenigWH;
	ImageIcon iGoldenerKoenigSH;
	ImageIcon iGoldenerLaeuferWH;
	ImageIcon iGoldenerLaeuferSH;
	ImageIcon iGoldenesPferdWH;
	ImageIcon iGoldenesPferdSH;
	ImageIcon iGoldenerTurmWH;
	ImageIcon iGoldenerTurmSH;
	ImageIcon iGoldenerBauerWH;
	ImageIcon iGoldenerBauerSH;
	
	//rote goldene Figuren
	ImageIcon iGoldeneDameRH;
	ImageIcon iGoldenerKoenigRH;
	ImageIcon iGoldenerLaeuferRH;
	ImageIcon iGoldenesPferdRH;
	ImageIcon iGoldenerTurmRH;
	ImageIcon iGoldenerBauerRH;
	//Blaue goldene Figuren
	ImageIcon iGoldeneDameDBH;
	ImageIcon iGoldenerKoenigDBH;
	ImageIcon iGoldenerLaeuferDBH;
	ImageIcon iGoldenesPferdDBH;
	ImageIcon iGoldenerTurmDBH;
	ImageIcon iGoldenerBauerDBH;
	
	//silberne Figurenicons
	ImageIcon iSilberneDameWH;
	ImageIcon iSilberneDameSH;
	ImageIcon iSilbernerKoenigWH;
	ImageIcon iSilbernerKoenigSH;
	ImageIcon iSilbernerLaeuferWH;
	ImageIcon iSilbernerLaeuferSH;
	ImageIcon iSilbernesPferdWH;
	ImageIcon iSilbernesPferdSH;
	ImageIcon iSilbernerTurmWH;
	ImageIcon iSilbernerTurmSH;
	ImageIcon iSilbernerBauerWH;
	ImageIcon iSilbernerBauerSH;
	
	//rote Silberne Figurenicons
	ImageIcon iSilberneDameRH;
	ImageIcon iSilbernerKoenigRH;
	ImageIcon iSilbernerLaeuferRH;
	ImageIcon iSilbernesPferdRH;
	ImageIcon iSilbernerTurmRH;
	ImageIcon iSilbernerBauerRH;
	
	//blaue Silberne Figurenicons
	ImageIcon iSilberneDameDBH;
	ImageIcon iSilbernerKoenigDBH;
	ImageIcon iSilbernerLaeuferDBH;
	ImageIcon iSilbernesPferdDBH;
	ImageIcon iSilbernerTurmDBH;
	ImageIcon iSilbernerBauerDBH;
	
	
	
	
	
	JPanel pBrett;
	JPanel pUnten;
	JPanel pLinks;
	JPanel pRechts;
	JPanel pOben;
	JPanel pContentpane;
	
	
	
	Gui(Bewegungsmuster b,Actionlistener a, int zeitProZug){
		dieBewegungsmuster = b;
		dieActionlistener = a;
		
		dieSteuerung = new Steuerung(dieBewegungsmuster, zeitProZug);
		
		dieActionlistener.linkGui(this);
		
		
		init(); //initialisiert Variablen der Gui
		
		dieBewegungsmuster.linkGui(this);
		
	}

	
	//Initialisierungsmethode---------------------------------------------------------------------------
	
	private void init() {
		
		
		arraySpielfeld = erstelleSpielfeldArray();
		
		//initialisiere Imagesicons von siegerbildschirmen
		iSiegGold = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/GoldSieg.png");
		iSiegSilber = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/SilberSieg.png");
		
		//initialisiere Imageicons mithilfe der Bilder im Ordner SchachfigurenBilderBearbeitet
		iWeißesFeld = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/WH.jpg");
		iSchwarzesFeld = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/SH.jpg");
		iBlauesFeld = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FeldHellBlau.jpg");
		
		//gold
		iGoldeneDameWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DameGoldWH.jpg");
		iGoldeneDameSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DameGoldSH.jpg");
		iGoldenerKoenigWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/KoenigGoldWH.jpg");
		iGoldenerKoenigSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/KoenigGoldSH.jpg");
		iGoldenerLaeuferWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/LaeuferGoldWH.jpg");
		iGoldenerLaeuferSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/LaeuferGoldSH.jpg");
		iGoldenesPferdWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/PferdGoldWH.jpg");
		iGoldenesPferdSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/PferdGoldSH.jpg");
		iGoldenerTurmWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/TurmGoldWH.jpg");
		iGoldenerTurmSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/TurmGoldSH.jpg");
		iGoldenerBauerWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/BauerGoldWH.jpg");
		iGoldenerBauerSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/BauerGoldSH.jpg");
		
		//goldRoteFiguren
		iGoldeneDameRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/DameGoldRH.jpg");
		iGoldenerKoenigRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/KoenigGoldRH.jpg");
		iGoldenerTurmRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/TurmGoldRH.jpg");
		iGoldenerBauerRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/BauerGoldRH.jpg");
		iGoldenesPferdRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/PferdGoldRH.jpg");
		iGoldenerLaeuferRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/rotGold/LaeuferGoldRH.jpg");
		
		//goldBlaueFiguren
		iGoldeneDameDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/DameGoldDBH.jpg");
		iGoldenerKoenigDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/KoenigGoldDBH.jpg");
		iGoldenerTurmDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/TurmGoldDBH.jpg");
		iGoldenerBauerDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/BauerGoldDBH.jpg");
		iGoldenesPferdDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/PferdGoldDBH.jpg");
		iGoldenerLaeuferDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenGold/DBlauGold/LaeuferGoldDBH.jpg");
		
		
		//silber
		iSilberneDameWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DameSilberWH.jpg");
		iSilberneDameSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DameSilberSH.jpg");
		iSilbernerKoenigWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/KoenigSilberWH.jpg");
		iSilbernerKoenigSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/KoenigSilberSH.jpg");
		iSilbernerLaeuferWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/LaeuferSilberWH.jpg");
		iSilbernerLaeuferSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/LaeuferSilberSH.jpg");
		iSilbernesPferdWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/PferdSilberWH.jpg");
		iSilbernesPferdSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/PferdSilberSH.jpg");
		iSilbernerTurmWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/TurmSilberWH.jpg");
		iSilbernerTurmSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/TurmSilberSH.jpg");
		iSilbernerBauerWH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/BauerSilberWH.jpg");
		iSilbernerBauerSH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/BauerSilberSH.jpg");
		
		//silberRoteFiguren
		iSilberneDameRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/DameSilberRH.jpg");
		iSilbernerKoenigRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/KoenigSilberRH.jpg");
		iSilbernerLaeuferRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/LaeuferSilberRH.jpg");
		iSilbernesPferdRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/PferdSilberRH.jpg");
		iSilbernerTurmRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/TurmSilberRH.jpg");
		iSilbernerBauerRH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/rotSilber/BauerSilberRH.jpg");
		
		//blaue silberne Figuren
		iSilberneDameDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/DameSilberDBH.jpg");
		iSilbernerKoenigDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/KoenigSilberDBH.jpg");
		iSilbernerLaeuferDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/LaeuferSilberDBH.jpg");
		iSilbernesPferdDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/PferdSilberDBH.jpg");
		iSilbernerTurmDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/TurmSilberDBH.jpg");
		iSilbernerBauerDBH = new ImageIcon("/Projekt Schachspiel/SchachfigurenBilderBearbeitet/FigurenSilber/DBlauSilber/BauerSilberDBH.jpg");
	
		
		
		
		initButtons();
		
		labelErstellung();
		
		dieActionlistener.erstelleActionLis();
		
		pContentpane = new JPanel();
		
		pBrett = new JPanel();
		pBrett = erstelleSpielfeldGridlayout();
		
		panelRechtsErstellen();
		panelLinksErstellen();
		
		
		pUnten = new JPanel(new FlowLayout());
		
		pUnten.add(lZeitAnzeige);
		pUnten.add(bSpielfeldDreher);
		
		
		pOben = new JPanel(new FlowLayout());
		pOben.add(lZugAnzeige);
		
		pContentpane.setLayout(new BorderLayout());
		pContentpane.add(pBrett,BorderLayout.CENTER);
		pContentpane.add(pUnten,BorderLayout.SOUTH);
		pContentpane.add(pLinks,BorderLayout.WEST);
		pContentpane.add(pRechts,BorderLayout.EAST);
		pContentpane.add(pOben,BorderLayout.NORTH);
		
		
		this.setContentPane(pContentpane);
		
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setSize(1500,1000);
		
		
	
		
		
	}
	
	//Initialisierungsmethode Buttons-----------------------------------------------------------------
	
	public void initButtons(){
		
		bA1 = new JButton(iGoldenerTurmWH);
		bA2 = new JButton(iGoldenesPferdSH);
		bA3 = new JButton(iGoldenerLaeuferWH);
		bA4 = new JButton(iGoldeneDameSH);
		bA5 = new JButton(iGoldenerKoenigWH);
		bA6 = new JButton(iGoldenerLaeuferSH);
		bA7 = new JButton(iGoldenesPferdWH);
		bA8 = new JButton(iGoldenerTurmSH);
		bB1 = new JButton(iGoldenerBauerSH);
		bB2 = new JButton(iGoldenerBauerWH);
		bB3 = new JButton(iGoldenerBauerSH);
		bB4 = new JButton(iGoldenerBauerWH);
		bB5 = new JButton(iGoldenerBauerSH);
		bB6 = new JButton(iGoldenerBauerWH);
		bB7 = new JButton(iGoldenerBauerSH);
		bB8 = new JButton(iGoldenerBauerWH);
		bC1 = new JButton(iWeißesFeld);
		bC2 = new JButton(iSchwarzesFeld);
		bC3 = new JButton(iWeißesFeld);
		bC4 = new JButton(iSchwarzesFeld);
		bC5 = new JButton(iWeißesFeld);
		bC6 = new JButton(iSchwarzesFeld);
		bC7 = new JButton(iWeißesFeld);
		bC8 = new JButton(iSchwarzesFeld);
		bD1 = new JButton(iSchwarzesFeld);
		bD2 = new JButton(iWeißesFeld);
		bD3 = new JButton(iSchwarzesFeld);
		bD4 = new JButton(iWeißesFeld);
		bD5 = new JButton(iSchwarzesFeld);
		bD6 = new JButton(iWeißesFeld);
		bD7 = new JButton(iSchwarzesFeld);
		bD8 = new JButton(iWeißesFeld);
		bE1 = new JButton(iWeißesFeld);
		bE2 = new JButton(iSchwarzesFeld);
		bE3 = new JButton(iWeißesFeld);
		bE4 = new JButton(iSchwarzesFeld);
		bE5 = new JButton(iWeißesFeld);
		bE6 = new JButton(iSchwarzesFeld);
		bE7 = new JButton(iWeißesFeld);
		bE8 = new JButton(iSchwarzesFeld);
		bF1 = new JButton(iSchwarzesFeld);
		bF2 = new JButton(iWeißesFeld);
		bF3 = new JButton(iSchwarzesFeld);
		bF4 = new JButton(iWeißesFeld);
		bF5 = new JButton(iSchwarzesFeld);
		bF6 = new JButton(iWeißesFeld);
		bF7 = new JButton(iSchwarzesFeld);
		bF8 = new JButton(iWeißesFeld);
		bG1 = new JButton(iSilbernerBauerWH);
		bG2 = new JButton(iSilbernerBauerSH);
		bG3 = new JButton(iSilbernerBauerWH);
		bG4 = new JButton(iSilbernerBauerSH);
		bG5 = new JButton(iSilbernerBauerWH); 
		bG6 = new JButton(iSilbernerBauerSH);
		bG7 = new JButton(iSilbernerBauerWH);
		bG8 = new JButton(iSilbernerBauerSH);
		bH1 = new JButton(iSilbernerTurmSH);
		bH2 = new JButton(iSilbernesPferdWH);
		bH3 = new JButton(iSilbernerLaeuferSH);
		bH4 = new JButton(iSilberneDameWH);
		bH5 = new JButton(iSilbernerKoenigSH);
		bH6 = new JButton(iSilbernerLaeuferWH);
		bH7 = new JButton(iSilbernesPferdSH);
		bH8 = new JButton(iSilbernerTurmWH);
		
		
		
		bSpielfeldDreher = new JButton("Drehmeister");
		
		
		UDame = new JButton("Umwandlung in Dame");
		UDame.setBounds(150, 90, 300, 50);
		UTurm = new JButton("Umwandlung in Turm");
		UTurm.setBounds(150, 170, 300, 50);
		ULaeufer = new JButton("Umwandlung in Läufer");
		ULaeufer.setBounds(150,250,300,50);		
		UPferd = new JButton("Umwandlung in Pferd");
		UPferd.setBounds(150, 330, 300, 50);
		
	}

    //Methode für die Umwandlung des Bauern ,nachdem er das andere Ende erreicht hat
		void auswahl() {
			
			 auswahl.setSize(600, 500);
			 auswahl.setLayout(null);
			
			auswahl.add(UDame);
			
			auswahl.add(UPferd);
			auswahl.add(ULaeufer);
			auswahl.add(UTurm);
			auswahl.setVisible(true); 
		
	}
	//Gebe Buttons Actionlistener-------------------------------------------------------------------
	
		public void erstelleActionLis() {
			
			//Actionlistener für Dreher-Button:
			
			bSpielfeldDreher.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					arraySpielfeld = dieSteuerung.dreheSpielfeld(arraySpielfeld);
					
					überschreibeButtons(arraySpielfeld);
					
					
				}
			});
			
		}
	
	//Füge Buttons dem Grid-Layout zu-------------------------------------------------------------------
	
	public JPanel erstelleSpielfeldGridlayout(){
		
		pBrett = new JPanel(); 
		pBrett.setLayout(new GridLayout(8,8));
		
		pBrett.add(bA1);
		pBrett.add(bA2);
		pBrett.add(bA3);
		pBrett.add(bA4);
		pBrett.add(bA5);
		pBrett.add(bA6);
		pBrett.add(bA7);
		pBrett.add(bA8);
		
		pBrett.add(bB1);
		pBrett.add(bB2);
		pBrett.add(bB3);
		pBrett.add(bB4);
		pBrett.add(bB5);
		pBrett.add(bB6);
		pBrett.add(bB7);
		pBrett.add(bB8);
		
		pBrett.add(bC1);
		pBrett.add(bC2);
		pBrett.add(bC3);
		pBrett.add(bC4);
		pBrett.add(bC5);
		pBrett.add(bC6);
		pBrett.add(bC7);
		pBrett.add(bC8);
		
		pBrett.add(bD1);
		pBrett.add(bD2);
		pBrett.add(bD3);
		pBrett.add(bD4);
		pBrett.add(bD5);
		pBrett.add(bD6);
		pBrett.add(bD7);
		pBrett.add(bD8);
		
		pBrett.add(bE1);
		pBrett.add(bE2);
		pBrett.add(bE3);
		pBrett.add(bE4);
		pBrett.add(bE5);
		pBrett.add(bE6);
		pBrett.add(bE7);
		pBrett.add(bE8);
		
		pBrett.add(bF1);
		pBrett.add(bF2);
		pBrett.add(bF3);
		pBrett.add(bF4);
		pBrett.add(bF5);
		pBrett.add(bF6);
		pBrett.add(bF7);
		pBrett.add(bF8);
		
		pBrett.add(bG1);
		pBrett.add(bG2);
		pBrett.add(bG3);
		pBrett.add(bG4);
		pBrett.add(bG5);
		pBrett.add(bG6);
		pBrett.add(bG7);
		pBrett.add(bG8);
		
		pBrett.add(bH1);
		pBrett.add(bH2);
		pBrett.add(bH3);
		pBrett.add(bH4);
		pBrett.add(bH5);
		pBrett.add(bH6);
		pBrett.add(bH7);
		pBrett.add(bH8);
		
		
		return pBrett;
		
	}
	
	//Labelerstellung
	
	public void labelErstellung() {
		
		lLinksLeer = new JLabel("");
		lRechtsLeer = new JLabel("");
		
		lLinksAnzeige = new JLabel("geschlagene Figuren Silber");
		
		//LinksFigur
		lLinksFigur1 = new JLabel("");
		lLinksFigur2 = new JLabel("");
		lLinksFigur3 = new JLabel("");
		lLinksFigur4 = new JLabel("");
		lLinksFigur5 = new JLabel("");
		lLinksFigur6 = new JLabel("");
		
		//LinksAnzahl
		lLinksAnzahl1 = new JLabel("");
		lLinksAnzahl2 = new JLabel("");
		lLinksAnzahl3 = new JLabel("");
		lLinksAnzahl4 = new JLabel("");
		lLinksAnzahl5 = new JLabel("");
		lLinksAnzahl6 = new JLabel("");
		
		
		lRechtsAnzeige = new JLabel("geschlagene Figuren Gold");
		
		//RechtsFigur
		lRechtsFigur1 = new JLabel("");
		lRechtsFigur2 = new JLabel("");
		lRechtsFigur3 = new JLabel("");
		lRechtsFigur4 = new JLabel("");
		lRechtsFigur5 = new JLabel("");
		lRechtsFigur6 = new JLabel("");
				
		//RechtsAnzahl
		lRechtsAnzahl1 = new JLabel("");
		lRechtsAnzahl2 = new JLabel("");
		lRechtsAnzahl3 = new JLabel("");
		lRechtsAnzahl4 = new JLabel("");
		lRechtsAnzahl5 = new JLabel("");
		lRechtsAnzahl6 = new JLabel("");
		
		//gold als erstes am Zug => 
		
		lZugAnzeige = new JLabel(goldenerSpielerAmZug);
		
		
		lZeitAnzeige = new JLabel("");
		
		
	}
	
	//Erstellung des Panels links vom Spielfeld
	
	public void panelLinksErstellen() {
		
		pLinks = new JPanel(new GridLayout(7,2));
		
		pLinks.add(lLinksAnzeige);
		pLinks.add(lLinksLeer);
		
		pLinks.add(lLinksFigur1);
		pLinks.add(lLinksAnzahl1);
		
		pLinks.add(lLinksFigur2);
		pLinks.add(lLinksAnzahl2);
		
		pLinks.add(lLinksFigur3);
		pLinks.add(lLinksAnzahl3);
		
		pLinks.add(lLinksFigur4);
		pLinks.add(lLinksAnzahl4);
		
		pLinks.add(lLinksFigur5);
		pLinks.add(lLinksAnzahl5);
		
		pLinks.add(lLinksFigur6);
		pLinks.add(lLinksAnzahl6);
		
		
	}
	
	
	//Erstellung des Panels rechts vom Spielfeld
	
		public void panelRechtsErstellen() {
			
			pRechts = new JPanel(new GridLayout(7,2));
			
			pRechts.add(lRechtsAnzeige);
			pRechts.add(lRechtsLeer);
			
			pRechts.add(lRechtsFigur1);
			pRechts.add(lRechtsAnzahl1);
			
			pRechts.add(lRechtsFigur2);
			pRechts.add(lRechtsAnzahl2);
			
			pRechts.add(lRechtsFigur3);
			pRechts.add(lRechtsAnzahl3);
			
			pRechts.add(lRechtsFigur4);
			pRechts.add(lRechtsAnzahl4);
			
			pRechts.add(lRechtsFigur5);
			pRechts.add(lRechtsAnzahl5);
			
			pRechts.add(lRechtsFigur6);
			pRechts.add(lRechtsAnzahl6);
			
		}
	
	
	//erstelle einen zweidimensionalen Stringarray------------------------------------------------------
	
	public String [] [] erstelleSpielfeldArray(){
		
	String [][] arraySpielfeld = new String [8][8];
	int moduloRest;
		
		
	//alle Felder mit schwarz oder weiß initialisieren
	
		for (int i = 0; i < 8; i++) {
			
			moduloRest = i%2;
			
			if (moduloRest!=0) {
				
				for (int j = 0; j < 8; j++) {
					
					moduloRest = j%2;
					
					if (moduloRest!=0) {
						
						arraySpielfeld[j][i] = weißesFeld;
						
					} else {
						
						arraySpielfeld[j][i] = schwarzesFeld;
						
					}
					
				}
				
				
			} else {
				
				for (int j = 0; j < 8; j++) {
					
					moduloRest = j%2;
					
					if (moduloRest!=0) {
						
						arraySpielfeld[j][i] = schwarzesFeld;
						
					} else {
						
						arraySpielfeld[j][i] = weißesFeld;
						
					}

			}
			
			
		}
		
	   }
	
		//goldene bauern dem array hinzufügen
		
		for (int k = 0; k < 8; k++) {
			
			arraySpielfeld[k][1] = "baGold";
			
		}
		
		//silberne bauern dem array hinzufügen
		
		for (int k = 0; k < 8; k++) {
					
			arraySpielfeld[k][6] = "baSilber";
					
		}
	
		//restliche figuren setzen
		//gold:
		arraySpielfeld[0][0] = turmGold;
		arraySpielfeld[1][0] = pferdGold;
		arraySpielfeld[2][0] = laeuferGold;
		arraySpielfeld[3][0] = dameGold;
		arraySpielfeld[4][0] = koenigGold;
		arraySpielfeld[5][0] = laeuferGold;
		arraySpielfeld[6][0] = pferdGold;
		arraySpielfeld[7][0] = turmGold;
		
		//silber:
		arraySpielfeld[0][7] = turmSilber;
		arraySpielfeld[1][7] = pferdSilber;
		arraySpielfeld[2][7] = laeuferSilber;
		arraySpielfeld[3][7] = dameSilber;
		arraySpielfeld[4][7] = koenigSilber;
		arraySpielfeld[5][7] = laeuferSilber;
		arraySpielfeld[6][7] = pferdSilber;
		arraySpielfeld[7][7] = turmSilber;
		
		
		
		return arraySpielfeld;
		
	
	}


    //füge die möglichen Felder für einen zug als blaue  oder mit rotem Hintergrund Buttons hinzu
    
    public void setzteFeld(int x, int y, ImageIcon farbe, String feldArray){
    	
    	if (x==0 && y==0) {
			
    		bA1.setIcon(farbe);
    		arraySpielfeld[x][y] = feldArray;
    		
		} else if(x==1 && y==0){
			bA2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==0){
			bA3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==0){
			bA4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==0){
			bA5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==0){
			bA6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==0){
			bA7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==0){
			bA8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==1){
			bB1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==1 && y==1){
			bB2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==1){
			bB3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==1){
			bB4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==1){
			bB5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==1){
			bB6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==1){
			bB7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==1){
			bB8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==2){
			bC1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==1 && y==2){
			bC2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==2){
			bC3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==2){
			bC4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==2){
			bC5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==2){
			bC6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==2){
			bC7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==2){
			bC8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==3){
			bD1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==1 && y==3){
			bD2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==3){
			bD3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==3){
			bD4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==3){
			bD5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==3){
			bD6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==3){
			bD7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==3){
			bD8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==4){
			bE1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==1 && y==4){
			bE2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
					
		}else if(x==2 && y==4){
			bE3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==4){
			bE4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==4){
			bE5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==4){
			bE6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==4){
			bE7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==4){
			bE8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==5){
			bF1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
		}else if(x==1 && y==5){
			bF2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==5){
			bF3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==5){
			bF4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==5){
			bF5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==5){
			bF6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==5){
			bF7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==5){
			bF8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==6){
			bG1.setIcon(farbe);
			arraySpielfeld[x][y] =feldArray;

		}else if(x==1 && y==6){
			bG2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==6){
			bG3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==6){
			bG4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==6){
			bG5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==5 && y==6){
			bG6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==6){
			bG7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==6){
			bG8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
			

		}else if(x==0 && y==7){
			bH1.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==1 && y==7){
			bH2.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==2 && y==7){
			bH3.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==3 && y==7){
			bH4.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==4 && y==7){
			bH5.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;
			
		}else if(x==5 && y==7){
			bH6.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==6 && y==7){
			bH7.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}else if(x==7 && y==7){
			bH8.setIcon(farbe);
			arraySpielfeld[x][y] = feldArray;

		}
		
		
		else {
			
		}
    
    	
    }
    
    
    // Prüfe von welcher gegnerischen Figur Feld besetzt wird
    
    public void schreibeGegnerButton(int x, int y, String gegnerString,String button){
    
    	switch (gegnerString) {

    	case "tuGold":
    		
    		setzteFeld(x, y, iGoldenerTurmRH, tuGoldRH);
			
			break;

    	case "pfGold":
			
    		setzteFeld(x, y, iGoldenesPferdRH, pfGoldRH);
    		
			break;

    	case "laGold":
			
    		setzteFeld(x, y, iGoldenerLaeuferRH, laGoldRH);
    		
			break;

    	case "daGold":
			
    		setzteFeld(x, y, iGoldeneDameRH, daGoldRH);
    		
			break;

    	case "koGold":
			
    		setzteFeld(x, y, iGoldenerKoenigRH, koGoldRH);
    		
			break;

    	case "baGold":
			
    		setzteFeld(x, y, iGoldenerBauerRH, baGoldRH);
    		
			break;

    	case "tuSilber":
			
    		setzteFeld(x, y, iSilbernerTurmRH, tuSilberRH);
    		
			break;

    	case "pfSilber":
			
    		setzteFeld(x, y, iSilbernesPferdRH, pfSilberRH);
    		
			break;

    	case "laSilber":
			
    		setzteFeld(x, y, iSilbernerLaeuferRH, laSilberRH);
    		
			break;

    	case "daSilber":
			
    		setzteFeld(x, y, iSilberneDameRH, daSilberRH);
    		
			break;

    	case "koSilber":
			
    		setzteFeld(x, y, iSilbernerKoenigRH, koSilberRH);
    		
			break;

    	case "baSilber":
			
    		setzteFeld(x, y, iSilbernerBauerRH, baSilberRH);
    		
			break;

			
		default:
			
			System.out.println("Fehler bei Verarbeitung des Actionlisteners von " + button);
			
			break;
		}

    	
    }
    
    // Prüfe ob Feld von gegnerischer oder eigener Figur besetzt wird
    
    public boolean pruefeObVerbuendeter(int x, int y){
    	
    	//nach weißen Verbündeten abfragen
    	
    	if (arraySpielfeld[x][y].equals("baGold") && spieler.equals("gold")) {
    		return true;
		} else if(arraySpielfeld[x][y].equals("tuGold") && spieler.equals("gold")){
			return true;
		}else if(arraySpielfeld[x][y].equals("pfGold") && spieler.equals("gold")){
			return true;
		}else if(arraySpielfeld[x][y].equals("laGold") && spieler.equals("gold")){
			return true;
		}else if(arraySpielfeld[x][y].equals("daGold") && spieler.equals("gold")){
			return true;
		}else if(arraySpielfeld[x][y].equals("koGold") && spieler.equals("gold")){
			return true;
		}else{
    	
    	//nach schwarzen Verbündeten abfragen
    	if (arraySpielfeld[x][y].equals("baSilber") && spieler.equals("silber")) {
    		return true;
		} else if(arraySpielfeld[x][y].equals("tuSilber") && spieler.equals("silber")){
			return true;
		}else if(arraySpielfeld[x][y].equals("pfSilber") && spieler.equals("silber")){
			return true;
		}else if(arraySpielfeld[x][y].equals("laSilber") && spieler.equals("silber")){
			return true;
		}else if(arraySpielfeld[x][y].equals("daSilber") && spieler.equals("silber")){
			return true;
		}else if(arraySpielfeld[x][y].equals("koSilber") && spieler.equals("silber")){
			return true;
		}else{
			return false;
		}
    	
		}
    	
    }

    //Überprüfen ob ein gegner auf dem potentiellen Bewegungsfeld sitzt

	public String pruefeObGegner(int x, int y) {
		
//nach goldenen Gegnern abfragen
    	
		
		
    	if (arraySpielfeld[x][y].equals("baGold") && spieler.equals("silber")) {
    		return "baGold";
		} else if(arraySpielfeld[x][y].equals("tuGold") && spieler.equals("silber")){
			return "tuGold";
		}else if(arraySpielfeld[x][y].equals("pfGold") && spieler.equals("silber")){
			return "pfGold";
		}else if(arraySpielfeld[x][y].equals("laGold") && spieler.equals("silber")){
			return "laGold";
		}else if(arraySpielfeld[x][y].equals("daGold") && spieler.equals("silber")){
			return "daGold";
		}else if(arraySpielfeld[x][y].equals("koGold") && spieler.equals("silber")){
			return "koGold";
		}else{
    	
    	//nach silbernen Gegnern abfragen
    	if (arraySpielfeld[x][y]=="baSilber" && spieler.equals("gold")) {
    		return "baSilber";
		} else if(arraySpielfeld[x][y].equals("tuSilber") && spieler.equals("gold")){
			return "tuSilber";
		}else if(arraySpielfeld[x][y].equals("pfSilber") && spieler.equals("gold")){
			return "pfSilber";
		}else if(arraySpielfeld[x][y].equals("laSilber") && spieler.equals("gold")){
			return "laSilber";
		}else if(arraySpielfeld[x][y].equals("daSilber") && spieler.equals("gold")){
			return "daSilber";
		}else if(arraySpielfeld[x][y].equals("koSilber") && spieler.equals("gold")){
			return "koSilber";
		}else{
			
			return "-1";
		}
    	
		}
		
		
	}
    
	//--------------------------------------------------------------------------------------------------------------------------
	//Methode, welche die Buttons des Spielfeldes mit den Figuren des Strings überschreibt
	
	public void überschreibeButtons(String arraySpielfeld [][]) {
		
		for (int i = 0; i < arraySpielfeld.length; i++) {
			
			for (int j = 0; j < arraySpielfeld.length; j++) {
				
				switch (arraySpielfeld[j][i]) {
				
				case "tuGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldenerTurmWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldenerTurmSH, arraySpielfeld[j][i]);
					}
					break;
					//---------------------------------------------------------
				case "pfGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldenesPferdWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldenesPferdSH, arraySpielfeld[j][i]);
					}
					break;
					//---------------------------------------------------------
				case "laGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldenerLaeuferWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldenerLaeuferSH, arraySpielfeld[j][i]);
					}
					break;
					//---------------------------------------------------------
				case "daGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldeneDameWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldeneDameSH, arraySpielfeld[j][i]);
					}
					break;
					//---------------------------------------------------------
				case "koGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldenerKoenigWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldenerKoenigSH, arraySpielfeld[j][i]);
					}
					break;
					//---------------------------------------------------------
				case "baGold":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iGoldenerBauerWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iGoldenerBauerSH, arraySpielfeld[j][i]);
					}
					break;
					
					//----goldMitRotemHintergrund
				case "tuGoldRH":
					setzteFeld(j, i, iGoldenerTurmRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "laGoldRH":
					setzteFeld(j, i, iGoldenerLaeuferRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "pfGoldRH":
					setzteFeld(j, i, iGoldenesPferdRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "daGoldRH":
					setzteFeld(j, i, iGoldeneDameRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "koGoldRH":
					setzteFeld(j, i, iGoldenerKoenigRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "baGoldRH":
					setzteFeld(j, i, iGoldenerBauerRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
					
					//----goldMitBlauemHintergrund
				case "tuGoldDBH":
					setzteFeld(j, i, iGoldenerTurmDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "laGoldDBH":
					setzteFeld(j, i, iGoldenerLaeuferDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "pfGoldDBH":
					setzteFeld(j, i, iGoldenesPferdDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "daGoldDBH":
					setzteFeld(j, i, iGoldeneDameDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "koGoldDBH":
					setzteFeld(j, i, iGoldenerKoenigDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "baGoldDBH":
					setzteFeld(j, i, iGoldenerBauerDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
					
					
					
				//--------------------------------Silberne Figuren---------------------------------------------------
				case "tuSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilbernerTurmWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilbernerTurmSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				case "pfSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilbernesPferdWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilbernesPferdSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				case "laSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilbernerLaeuferWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilbernerLaeuferSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				case "daSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilberneDameWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilberneDameSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				case "koSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilbernerKoenigWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilbernerKoenigSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				case "baSilber":
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iSilbernerBauerWH, arraySpielfeld[j][i]);
					} else {
						setzteFeld(j, i, iSilbernerBauerSH, arraySpielfeld[j][i]);
					}
					break;
				//----------------------------------------------------------------
				
					//----SilberMitRotemHintergrund
				case "tuSilberRH":
					setzteFeld(j, i, iSilbernerTurmRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "laSilberRH":
					setzteFeld(j, i, iSilbernerLaeuferRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "pfSilberRH":
					setzteFeld(j, i, iSilbernesPferdRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "daSilberRH":
					setzteFeld(j, i, iSilberneDameRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "koSilberRH":
					setzteFeld(j, i, iSilbernerKoenigRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "baSilberRH":
					setzteFeld(j, i, iSilbernerBauerRH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
					
					//----SilberMitBlauemHintergrund
				case "tuSilberDBH":
					setzteFeld(j, i, iSilbernerTurmDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "laSilberDBH":
					setzteFeld(j, i, iSilbernerLaeuferDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "pfSilberDBH":
					setzteFeld(j, i, iSilbernesPferdDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "daSilberDBH":
					setzteFeld(j, i, iSilberneDameDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "koSilberDBH":
					setzteFeld(j, i, iSilbernerKoenigDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
				case "baSilberDBH":
					setzteFeld(j, i, iSilbernerBauerDBH, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------
					
					
					
					//--Unbesetzte Felder
				case "blau":
					setzteFeld(j, i, iBlauesFeld, arraySpielfeld[j][i]);
					break;
					//-------------------------------------------------------	
					

				default:
					
					if (schwarzOderWeiß(j, i).equals("weiß")) {
						setzteFeld(j, i, iWeißesFeld, "weiß");
					} else {
						setzteFeld(j, i, iSchwarzesFeld, "schwarz");
					}
					
					break;
				}
				
			}
		}
		
	}
	
	
	//Methode, welche zurückgibt ob das durch x-und y-Koordinaten übergebene Feld weiß oder schwarz ist
	
	public String schwarzOderWeiß(int x, int y) {
		
		int moduloRest;
		
		moduloRest = y%2;
		
		if (moduloRest!=0) {
				
				moduloRest = x%2;
				
				if (moduloRest!=0) {
					
					return "weiß";
					
				} else {
					
					return "schwarz";
					
				}
			
			
		} else {
				
				moduloRest = x%2;
				
				if (moduloRest!=0) {
					
					return "schwarz";
					
				} else {
					
					return "weiß";
					
				}
				
		}		

		
		
	}

	
	
	
	
}




