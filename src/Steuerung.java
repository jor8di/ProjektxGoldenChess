

/**
 * 
 * @author j.kolb
 *
 */
public class Steuerung {
	
	Bewegungsmuster dieBewegungsmuster;
	Dame dieDame;
	Turm derTurm;
	Laeufer derLaeufer;
	Koenig derKoenig;
	Bauer derBauer;
	Pferd dasPferd;
	
	Steuerung(Bewegungsmuster b){
	
		dieBewegungsmuster = b;
		dieBewegungsmuster.linkSteuerung(this);
		
		
		dieDame = new Dame(b);
		derTurm = new Turm(b);
		derLaeufer = new Laeufer(b);
		derKoenig = new Koenig(b);
		derBauer = new Bauer(b);
		dasPferd = new Pferd(b);
	}
	
	// Gibt die dem Button entsprechende Stringstelle im array
	public int [] gibButtonKoordinaten(String button){
		
		
		int buttonKoordinaten [] = new int [2];
		
		switch (button){
		case "bA1":
			buttonKoordinaten [0]= 0;
			buttonKoordinaten [1]= 0;
			break;	
		
		case "bA2":
			buttonKoordinaten [0]= 1;
			buttonKoordinaten [1]= 0;
			break;
		
		case "bA3":
			buttonKoordinaten [0]= 2;
			buttonKoordinaten [1]= 0;
			break;
			
		case "bA4":
			buttonKoordinaten [0]= 3;
			buttonKoordinaten [1]= 0;
			break;
		
		case "bA5":
			buttonKoordinaten [0]= 4;
			buttonKoordinaten [1]= 0;
			break;
			
		case "bA6":
			buttonKoordinaten [0]= 5;
			buttonKoordinaten [1]= 0;
			break;
			
		case "bA7":
			buttonKoordinaten [0]= 6;
			buttonKoordinaten [1]= 0;
			break;
			
		case "bA8":
			buttonKoordinaten [0]= 7;
			buttonKoordinaten [1]= 0;
			break;
			
	//------------------------------------------------------------
			
		case "bB1":
			buttonKoordinaten [0]= 0;
			buttonKoordinaten [1]= 1;
			break;	
		
		case "bB2":
			buttonKoordinaten [0]= 1;
			buttonKoordinaten [1]= 1;
			break;
		
		case "bB3":
			buttonKoordinaten [0]= 2;
			buttonKoordinaten [1]= 1;
			break;
			
		case "bB4":
			buttonKoordinaten [0]= 3;
			buttonKoordinaten [1]= 1;
			break;
		
		case "bB5":
			buttonKoordinaten [0]= 4;
			buttonKoordinaten [1]= 1;
			break;
			
		case "bB6":
			buttonKoordinaten [0]= 5;
			buttonKoordinaten [1]= 1;
			break;
			
		case "bB7":
			buttonKoordinaten [0]= 6;
			buttonKoordinaten [1]= 1;
			break;
			
		case "bB8":
			buttonKoordinaten [0]= 7;
			buttonKoordinaten [1]= 1;
			break;
		
//-----------b-----------------
		case "bC1":
			buttonKoordinaten [0]= 0;
			buttonKoordinaten [1]= 2;
			break;	
		
		case "bC2":
			buttonKoordinaten [0]= 1;
			buttonKoordinaten [1]= 2;
			break;
		
		case "bC3":
			buttonKoordinaten [0]= 2;
			buttonKoordinaten [1]= 2;
			break;
			
		case "bC4":		
			buttonKoordinaten [0]= 3;
			buttonKoordinaten [1]= 2;
			break;
		
		case "bC5":
			buttonKoordinaten [0]= 4;
			buttonKoordinaten [1]= 2;
			break;
			
		case "bC6":
			buttonKoordinaten [0]= 5;
			buttonKoordinaten [1]= 2;
			break;
			
		case "bC7":
			buttonKoordinaten [0]= 6;
			buttonKoordinaten [1]= 2;
			break;
			
		case "bC8":
			buttonKoordinaten [0]= 7;
			buttonKoordinaten [1]= 2;
			break;
			
		case "bD1":
			buttonKoordinaten [0] = 0;
			buttonKoordinaten [1] = 3;
			break;

		case "bD2":
			buttonKoordinaten [0] = 1;
			buttonKoordinaten [1] = 3;
			break;


		case "bD3":
			buttonKoordinaten [0] = 2;
			buttonKoordinaten [1] = 3;
			break;


		case "bD4":
			buttonKoordinaten [0] = 3;
			buttonKoordinaten [1] = 3;
			break;


		case "bD5":
			buttonKoordinaten [0] = 4;
			buttonKoordinaten [1] = 3;
			break;


		case "bD6":
			buttonKoordinaten [0] = 5;
			buttonKoordinaten [1] = 3;
			break;

		case "bD7":
			buttonKoordinaten [0] = 6;
			buttonKoordinaten [1] = 3;
			break;

		case "bD8":
			buttonKoordinaten [0] = 7;
			buttonKoordinaten [1] = 3;
			break;
			//---------------------------------------------------------------------------------

		case "bE1":
			buttonKoordinaten [0] = 0;
			buttonKoordinaten [1] = 4;
			break;

		case "bE2":
			buttonKoordinaten [0] = 1;
			buttonKoordinaten [1] = 4;
			break;

		case "bE3":
			buttonKoordinaten [0] = 2;
			buttonKoordinaten [1] = 4;
			break;


		case "bE4":
			buttonKoordinaten [0] = 3;
			buttonKoordinaten [1] = 4;
			break;


		case "bE5":
			buttonKoordinaten [0] = 4;
			buttonKoordinaten [1] = 4;
			break;


		case "bE6":
			buttonKoordinaten [0] = 5;
			buttonKoordinaten [1] = 4;
			break;

		case "bE7":
			buttonKoordinaten [0] = 6;
			buttonKoordinaten [1] = 4;
			break;

		case "bE8":
			buttonKoordinaten [0] = 7;
			buttonKoordinaten [1] = 4;
			break;
			//---------------------------------------------------------------------------------


		case "bF1":
			buttonKoordinaten [0] = 0;
			buttonKoordinaten [1] = 5;
			break;

		case "bF2":
			buttonKoordinaten [0] = 1;
			buttonKoordinaten [1] = 5;
			break;

		case "bF3":
			buttonKoordinaten [0] = 2;
			buttonKoordinaten [1] = 5;
			break;


		case "bF4":
			buttonKoordinaten [0] = 3;
			buttonKoordinaten [1] = 5;
			break;


		case "bF5":
			buttonKoordinaten [0] = 4;
			buttonKoordinaten [1] = 5;
			break;


		case "bF6":
			buttonKoordinaten [0] = 5;
			buttonKoordinaten [1] = 5;
			break;

		case "bF7":
			buttonKoordinaten [0] = 6;
			buttonKoordinaten [1] = 5;
			break;

		case "bF8":
			buttonKoordinaten [0] = 7;
			buttonKoordinaten [1] = 5;
			break;
			//---------------------------------------------------------------------------------

		case "bG1":
			buttonKoordinaten [0] = 0;
			buttonKoordinaten [1] = 6;
			break;

		case "bG2":
			buttonKoordinaten [0] = 1;
			buttonKoordinaten [1] = 6;
			break;

		case "bG3":
			buttonKoordinaten [0] = 2;
			buttonKoordinaten [1] = 6;
			break;

		case "bG4":
			buttonKoordinaten [0] = 3;
			buttonKoordinaten [1] = 6;
			break;

		case "bG5":
			buttonKoordinaten [0] = 4;
			buttonKoordinaten [1] = 6;
			break;


		case "bG6":
			buttonKoordinaten [0] = 5;
			buttonKoordinaten [1] = 6;
			break;

		case "bG7":
			buttonKoordinaten [0] = 6;
			buttonKoordinaten [1] = 6;
			break;

		case "bG8":
			buttonKoordinaten [0] = 7;
			buttonKoordinaten [1] = 6;
			break;
			//---------------------------------------------------------------------------------

		case "bH1":
			buttonKoordinaten [0] = 0;
			buttonKoordinaten [1] = 7;
			break;

		case "bH2":
			buttonKoordinaten [0] = 1;
			buttonKoordinaten [1] = 7;
			break;

		case "bH3":
			buttonKoordinaten [0] = 2;
			buttonKoordinaten [1] = 7;
			break;

		case "bH4":
			buttonKoordinaten [0] = 3;
			buttonKoordinaten [1] = 7;
			break;

		case "bH5":
			buttonKoordinaten [0] = 4;
			buttonKoordinaten [1] = 7;
			break;


		case "bH6":
			buttonKoordinaten [0] = 5;
			buttonKoordinaten [1] = 7;
			break;

		case "bH7":
			buttonKoordinaten [0] = 6;
			buttonKoordinaten [1] = 7;
			break;

		case "bH8":
			buttonKoordinaten [0] = 7;
			buttonKoordinaten [1] = 7;
			break;
			//---------------------------------------------------------------------------------	
			
		default:
			break;
			
		}
		
		return buttonKoordinaten; 
		
		
	}

	
	
	//Classenaufrufe der verschiedenen Klassen für die jeweiligen Bewegungsmuster----------------------------------------------------------------------------
	
public void rufeBewegungsMusterKlassen(String arraySpielfeld [][], String spieler, String button) {
		
		int x = gibButtonKoordinaten(button)[0];
		int y = gibButtonKoordinaten(button)[1];
		
		if(spieler.equals("gold")){
			
			  switch (arraySpielfeld[x][y]) {
			  
			  case "tuGold":
				  
				  	derTurm.turmClicked(button, arraySpielfeld);
				  	dieBewegungsmuster.dieGui.istAmZug= true;
				  	break;
				
			  case "pfGold":
				  dasPferd.pferdClicked(button, arraySpielfeld);
				  dieBewegungsmuster.dieGui.istAmZug= true;
					break;
					
			  case "laGold":
				  
				  	derLaeufer.laeuferClicked(button, arraySpielfeld);
				  	dieBewegungsmuster.dieGui.istAmZug= true;
					break;
					
			  case "daGold":
				  
					dieDame.clicked(button,arraySpielfeld);
					dieBewegungsmuster.dieGui.istAmZug= true;
					break;
					
			  case "koGold":
				  
				  	derKoenig.clicked(button,arraySpielfeld);
				  	dieBewegungsmuster.dieGui.istAmZug= true;
					break;
					
			  case "baGold":
				  	derBauer.bauerClicked(button, arraySpielfeld);
				  	dieBewegungsmuster.dieGui.istAmZug= true;
					break;

			  default:
				  
				break;
			  
				  }
			
				
		}else if(spieler.equals("silber")){ 
			
			
				switch (arraySpielfeld[x][y]) {
				
				  case "tuSilber":
					 
					  	derTurm.turmClicked(button, arraySpielfeld);
					  	dieBewegungsmuster.dieGui.istAmZug= true;
					  	break;
					
				  case "pfSilber":
					   dasPferd.pferdClicked(button, arraySpielfeld);
					   dieBewegungsmuster.dieGui.istAmZug= true;
						break;
						
				  case "laSilber":
					 
					  	derLaeufer.laeuferClicked(button, arraySpielfeld);
					  	dieBewegungsmuster.dieGui.istAmZug= true;
						break;
						
				  case "daSilber":
					  
						dieDame.clicked(button,arraySpielfeld);
						dieBewegungsmuster.dieGui.istAmZug= true;
						break;
						
				  case "koSilber":
					  
					  	derKoenig.clicked(button,arraySpielfeld);
					  	dieBewegungsmuster.dieGui.istAmZug= true;
						break;
						
				  case "baSilber":
					  derBauer.bauerClicked(button,arraySpielfeld);
					  dieBewegungsmuster.dieGui.istAmZug= true;
						break;

				  default:
					  
					  
					break;
				
				}
		
		
			}
	
			
	   }
	
	
	
	/**
	 * Methode, um die Stelle eines bestimmten Strings im arraySpielfeld zu finden
	 * @param arraySpielfeld
	 * @param figur
	 * @return
	 */
	public int [] gibStrinStelle(String arraySpielfeld[][], String figur){
		
		int buttonKoordinaten [] = new int [2];
		
		for (int i = 0; i < arraySpielfeld.length; i++) {
			
			for (int j = 0; j < arraySpielfeld.length; j++) {
				
				if(arraySpielfeld[j][i]==figur){
					
					buttonKoordinaten[0] = j;
					buttonKoordinaten[1] = i;
					
					return buttonKoordinaten;
					
					
				}
				
			}
			
		}
		
		return null;
		
	}
	
	//Algorithmus für das Drehen des Spielfeldes:
	
	public String [][] dreheSpielfeld(String [][] arraySpielfeld) {
		
		String speichereFigur;
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < arraySpielfeld.length; j++) {
				
				speichereFigur = arraySpielfeld[j][i];
				
				arraySpielfeld[j][i] = arraySpielfeld [7-j][7-i];
				
				arraySpielfeld [7-j][7-i] = speichereFigur;
				
				
			}
			
		}
		
		
		return arraySpielfeld;
	}
	
	//Bewegen einer Schachfigur
	
	
	public void bewegen(int buttonKoordinaten[], String button){
		
		
		int xFigurAmZug = buttonKoordinaten[0];
		int yFigurAmZug = buttonKoordinaten[1];
		
		int xFigurAufFeld = gibButtonKoordinaten(button)[0];
		int yFigurAufFeld = gibButtonKoordinaten(button)[1];
		
		if (dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "blau") {
			
			         
			
			dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld] = dieBewegungsmuster.dieGui.figurAmZug; 
			
			dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAmZug][yFigurAmZug] = ""; 
			
			deleteFarbe();
			
			dieBewegungsmuster.dieGui.überschreibeButtons(dieBewegungsmuster.dieGui.arraySpielfeld);
			
			dieBewegungsmuster.dieGui.istAmZug = false;
			
			if (dieBewegungsmuster.dieGui.spieler.equals("gold")) {
				
				dieBewegungsmuster.dieGui.spieler = "silber";
				dieBewegungsmuster.dieGui.lZugAnzeige.setText(dieBewegungsmuster.dieGui.silbernerSpielerAmZug);
				
				
			} else {
				
				dieBewegungsmuster.dieGui.spieler = "gold";
				dieBewegungsmuster.dieGui.lZugAnzeige.setText(dieBewegungsmuster.dieGui.goldenerSpielerAmZug);

			}
			
			
		} else if(dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "tuGoldRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "pfGoldRH" ||
				  dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "laGoldRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "daGoldRH" ||
				  dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "koGoldRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "baGoldRH" ||
				  dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "tuSilberRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "pfSilberRH" ||
				  dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "laSilberRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "daSilberRH" ||
				  dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "koSilberRH" || dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]== "baSilberRH" ){

			labelbesetztung(xFigurAufFeld, yFigurAufFeld);
			
			dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld] = dieBewegungsmuster.dieGui.figurAmZug; 
			
			dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAmZug][yFigurAmZug] = ""; 
			
			deleteFarbe();
			
			dieBewegungsmuster.dieGui.überschreibeButtons(dieBewegungsmuster.dieGui.arraySpielfeld);
			
			dieBewegungsmuster.dieGui.istAmZug = false;
			
			if (dieBewegungsmuster.dieGui.spieler.equals("gold")) {
				
				dieBewegungsmuster.dieGui.spieler = "silber";
				dieBewegungsmuster.dieGui.lZugAnzeige.setText(dieBewegungsmuster.dieGui.silbernerSpielerAmZug);
				
			} else {
				
				dieBewegungsmuster.dieGui.spieler = "gold";
				dieBewegungsmuster.dieGui.lZugAnzeige.setText(dieBewegungsmuster.dieGui.goldenerSpielerAmZug);

			}
			
			
		} else {
			
			dieBewegungsmuster.dieGui.arraySpielfeld [xFigurAmZug][yFigurAmZug] = dieBewegungsmuster.dieGui.figurAmZug;
			
			deleteFarbe();
			
			dieBewegungsmuster.dieGui.überschreibeButtons(dieBewegungsmuster.dieGui.arraySpielfeld);
			
			dieBewegungsmuster.dieGui.istAmZug = false;
			
		}
	
		
	}
	
	
	public void deleteFarbe () {
		
		for (int i = 0; i < dieBewegungsmuster.dieGui.arraySpielfeld.length; i++) {
			
			for (int j = 0; j < dieBewegungsmuster.dieGui.arraySpielfeld.length; j++) {
				
				switch (dieBewegungsmuster.dieGui.arraySpielfeld[j][i]) {
				case "tuGoldRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="tuGold";
					break;
				case "pfGoldRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="pfGold";
					break;
				case "laGoldRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="laGold";
					break;
				case "daGoldRH": 
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="daGold";
					break;
				case "koGoldRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="koGold";
					break;
				case "baGoldRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="baGold";
					break;
					
/////////////////////////////////////////////////////////////					
					
				case "tuSilberRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="tuSilber";
					break;
				case "pfSilberRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="pfSilber";
					break;
				case "laSilberRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="laSilber";
					break;
				case "daSilberRH": 
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="laSilber";
					break;
				case "koSilberRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="koSilber";
					break;
				case "baSilberRH":
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="baSilber";
					break;	
					
					
				case "blau":
					
					dieBewegungsmuster.dieGui.arraySpielfeld[j][i]="";
					
					break;	
					
				default:
					break;
				}
				
				
			}
			
		}
		
		
	}
	
	//Beschreiben der Label links und rechts vom Spielfeld
	
	public void labelbesetztung(int xFigurAufFeld, int yFigurAufFeld) {
		
		switch (dieBewegungsmuster.dieGui.arraySpielfeld[xFigurAufFeld][yFigurAufFeld]) {
		//cases für gold
		case "tuGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur2.setIcon(dieBewegungsmuster.dieGui.iGoldenerTurmWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl2.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl2.getText()));
			break;
			
		case "pfGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur3.setIcon(dieBewegungsmuster.dieGui.iGoldenesPferdWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl3.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl3.getText()));
			break;
			
		case "laGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur4.setIcon(dieBewegungsmuster.dieGui.iGoldenerLaeuferWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl4.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl4.getText()));
			break;
			
		case "daGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur5.setIcon(dieBewegungsmuster.dieGui.iGoldeneDameWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl5.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl5.getText()));
			break;
			
		case "koGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur6.setIcon(dieBewegungsmuster.dieGui.iGoldenerKoenigWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl6.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl6.getText()));
			break;
			
		case "baGoldRH":
			dieBewegungsmuster.dieGui.lRechtsFigur1.setIcon(dieBewegungsmuster.dieGui.iGoldenerBauerWH);
			dieBewegungsmuster.dieGui.lRechtsAnzahl1.setText(labelerhoehung(dieBewegungsmuster.dieGui.lRechtsAnzahl1.getText()));
			break;
			
		//cases für silber	
			
		case "tuSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur2.setIcon(dieBewegungsmuster.dieGui.iSilbernerTurmWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl2.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl2.getText()));
			break;
			
		case "pfSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur3.setIcon(dieBewegungsmuster.dieGui.iSilbernesPferdWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl3.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl3.getText()));
			break;
			
		case "laSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur4.setIcon(dieBewegungsmuster.dieGui.iSilbernerLaeuferWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl4.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl4.getText()));
			break;
			
		case "daSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur5.setIcon(dieBewegungsmuster.dieGui.iSilberneDameWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl5.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl5.getText()));
			break;
			
		case "koSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur6.setIcon(dieBewegungsmuster.dieGui.iSilbernerKoenigWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl6.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl6.getText()));
			break;
			
		case "baSilberRH":
			dieBewegungsmuster.dieGui.lLinksFigur1.setIcon(dieBewegungsmuster.dieGui.iSilbernerBauerWH);
			dieBewegungsmuster.dieGui.lLinksAnzahl1.setText(labelerhoehung(dieBewegungsmuster.dieGui.lLinksAnzahl1.getText()));
			break;

		default:
			break;
		}
		
	}
	
	public String labelerhoehung(String labelString) {
		
		if (labelString.equals("")) {
			
			labelString = "0";
			
		}
		
		int zahl;
		
		zahl = Integer.parseInt(labelString);
		zahl++;
		
		labelString = "" + zahl;
		
		return labelString;
	}
	
	
}
