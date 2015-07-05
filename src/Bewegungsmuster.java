
public class Bewegungsmuster {

	Gui dieGui;
	Steuerung dieSteuerung;
	
	String gegnerString;
	
	int x;
	int y;
	
	int buttonKoordinaten [] = new int [2];

	public Bewegungsmuster() {
		
		
	}
	
	// Hinterlegt ein aktuelles Feld mit dunkelblauem Hintergrund
	
	public void setzteAktuelleFigur (String button, String figur){ 
		
		dieGui.buttonKoordinaten =dieSteuerung.gibButtonKoordinaten(button);
		
		int x,y;
		x = dieSteuerung.gibButtonKoordinaten(button)[0];
		y = dieSteuerung.gibButtonKoordinaten(button)[1];
		
		dieGui.arraySpielfeld[x][y] = figur;
		
		dieGui.überschreibeButtons(dieGui.arraySpielfeld);
		
	}
	
	//Gibt aktuellen Spieler zurück
	
	public String getSpieler() {
		
		return dieGui.spieler;
	}
	
	
	//--------------------------------------------------------------------------------
	
	public void hochfuellen(String button, String arraySpielfeld [][]) {
		
		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
		
		x= buttonKoordinaten [0];
		y= buttonKoordinaten [1];
		
		//y-Achse hoch auffüllen
		
		
		for (int i = 1; i < arraySpielfeld.length; i++) {
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x, y-i)==true) {
					
					break;
					
				} else if(dieGui.pruefeObGegner(x, y-i)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x, y-i);
					
					dieGui.schreibeGegnerButton(x, y-i, gegnerString, button);
					
					break;

				}else{
					
					dieGui.setzteFeld(x,y-i,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
			} catch (Exception e) {
				
				break;
				
			}
			
		}
	}
	//--------------------------------------------------------------------------------
	
 	public void runterfuellen(String button, String arraySpielfeld [][]) {
	
 		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
 		
 		x= buttonKoordinaten [0];
 		y= buttonKoordinaten [1];
 		
	//y-Achse runter füllen
	
	for (int i = 1; i < arraySpielfeld.length; i++) {
		
		try {
			
			if (dieGui.pruefeObVerbuendeter(x, y+i)==true) {
				
				break;
				
			} else if(dieGui.pruefeObGegner(x,y+i)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x, y+i);
				
				dieGui.schreibeGegnerButton(x, y+i,gegnerString,button);
				
				break;

			}else{
				
				dieGui.setzteFeld(x,y+i,dieGui.iBlauesFeld,"blau");
				
			}
			
		} catch (Exception e) {
			break;
		}
		
	}
}
 	//--------------------------------------------------------------------------------
 	
 	public void rechtsfuellen(String button, String arraySpielfeld [][]) {
 		
 		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
 		
 		x= buttonKoordinaten [0];
 		y= buttonKoordinaten [1];
 		
		//x-Achse nach rechts füllen
		
		for (int i = 1; i < arraySpielfeld.length; i++) {
			 
			try {
				
				if (dieGui.pruefeObVerbuendeter(x+i, y)==true) {
					
					break;
					
				} else if(dieGui.pruefeObGegner(x+i,y)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+i, y);
					
					dieGui.schreibeGegnerButton(x+i, y, gegnerString, button);
					
					break;

				}else{
					
					dieGui.setzteFeld(x+i,y,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
			} catch (Exception e) {
				break;
			}
			
		}
		
 	}
 	//--------------------------------------------------------------------------------
 	
 	public void linksfuellen(String button, String arraySpielfeld [][]) {
 		
 		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
 		
 		x= buttonKoordinaten [0];
 		y= buttonKoordinaten [1];

		//x-Achse nach links füllen
		
		for (int i = 1; i < arraySpielfeld.length; i++) {
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x-i, y)==true) {
					
					break;
					
				} else if(dieGui.pruefeObGegner(x-i,y)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x-i, y);
					
					dieGui.schreibeGegnerButton(x-i, y, gegnerString, button);
					
					break;

				}else{
					
					dieGui.setzteFeld(x-i,y,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
			} catch (Exception e) {
				break;
			}
			
		}
		
		
 	}
 	//--------------------------------------------------------------------------------
 	
 	public void diagonalObenRechtsfuellen(String button, String arraySpielfeld [][]) {
 		
 		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
 		
 		x= buttonKoordinaten [0];
 		y= buttonKoordinaten [1];

 		//diagonal-Achse nach oben-rechts füllen
		
		for (int i = 1; i < arraySpielfeld.length; i++) {
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x+i, y-i)==true) {
					
					break;
					
				} else if(dieGui.pruefeObGegner(x+i,y-i)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+i, y-i);
					
					dieGui.schreibeGegnerButton(x+i, y-i, gegnerString, button);
					
					break;

				}else{
					
					dieGui.setzteFeld(x+i,y-i,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				
			} catch (Exception e) {
				break;
			}
			
		}
		
		
		
 	}
 	//--------------------------------------------------------------------------------
 	
 	public void diagonalObenLinksfuellen(String button, String arraySpielfeld [][]) {
	
 		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
 		
 		x= buttonKoordinaten [0];
 		y= buttonKoordinaten [1];

	//diagonal-Achse nach oben-links füllen
	
	for (int i = 1; i < arraySpielfeld.length; i++) {
		
		try {
			
			if (dieGui.pruefeObVerbuendeter(x-i, y-i)==true) {
				
				break;
				
			} else if(dieGui.pruefeObGegner(x-i,y-i)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x-i, y-i);
				
				dieGui.schreibeGegnerButton(x-i, y-i, gegnerString, button);
				
				break;

			}else{
				
				dieGui.setzteFeld(x-i,y-i,dieGui.iBlauesFeld,"blau");
				
			}
			
			
			
		} catch (Exception e) {
			break;
		}
		
	}
	
	
	}
 	//--------------------------------------------------------------------------------
 	
	public void diagonalUntenRechtsfuellen(String button, String arraySpielfeld [][]) {
	
		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
		
		x= buttonKoordinaten [0];
		y= buttonKoordinaten [1];	

	//diagonal-Achse nach unten-rechts füllen
	
	for (int i = 1; i < arraySpielfeld.length; i++) {
		
		try {
			
			if (dieGui.pruefeObVerbuendeter(x+i, y+i)==true) {
				
				break;
				
			} else if(dieGui.pruefeObGegner(x+i,y+i)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x+i, y+i);
				
				dieGui.schreibeGegnerButton(x+i, y+i, gegnerString, button);
				
				break;

			}else{
				
				dieGui.setzteFeld(x+i,y+i,dieGui.iBlauesFeld,"blau");
				
			}
			
			
			
		} catch (Exception e) {
			break;
		}
		
	}
	
	
	}
	//--------------------------------------------------------------------------------
	
	public void diagonalUntenLinksfuellen(String button, String arraySpielfeld [][]) {
	
		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
		
		x= buttonKoordinaten [0];
		y= buttonKoordinaten [1];
		
		//diagonal-Achse nach unten-links füllen
		
		for (int i = 1; i < arraySpielfeld.length; i++) {
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x-i, y+i)==true) {
					
					break;
					
				} else if(dieGui.pruefeObGegner(x-i,y+i)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x-i, y+i);
					
					dieGui.schreibeGegnerButton(x-i, y+i, gegnerString, button);
					
					break;

				}else{
					
					dieGui.setzteFeld(x-i,y+i,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
			} catch (Exception e) {
				break;
			
			
		}
		
		}
	
	}
	//--------------------------------------------------------------------------------
	
	public void alleRichtungenEinFeldFuellen(String button, String arraySpielfeld [][]) {
		
		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
		
		x= buttonKoordinaten [0];
		y= buttonKoordinaten [1];
		
		//oben----------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x, y-1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x,y-1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x, y-1);
					
					dieGui.schreibeGegnerButton(x, y-1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//unten---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x, y+1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x,y+1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x, y+1);
					
					dieGui.schreibeGegnerButton(x, y+1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			
			//rechts---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x+1, y)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x+1,y)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+1, y);
					
					dieGui.schreibeGegnerButton(x+1, y, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x+1,y,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//links---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x-1, y)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x-1,y)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x-1, y);
					
					dieGui.schreibeGegnerButton(x-1, y, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x-1,y,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//diagonal-oben-rechts---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x+1, y-1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+1, y-1);
					
					dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x+1,y-1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//diagonal-oben-links---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x-1, y-1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x-1, y-1);
					
					dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x-1,y-1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//diagonal-unten-rechts---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x+1, y+1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+1, y+1);
					
					dieGui.schreibeGegnerButton(x+1, y+1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x+1,y+1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
			//diagonal-unten-links---------------------------------------------------------------------
			
			try {
				
				if (dieGui.pruefeObVerbuendeter(x-1, y+1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x-1, y+1);
					
					dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x-1,y+1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				
			
			
				}
		
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//--------------------------------------------------------- (y==1 && x!=0 && x!=7) -------------------------------------------------------------------------------
	
	
	public void BauerFeldRunter(String button, String arraySpielfeld [][]) {
		
		buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
		
		x= buttonKoordinaten [0];
		y= buttonKoordinaten [1];
		
		if (y==1 && x!=0 && x!=7) { 	
			//für die Züge aus der Startposition und wo x != 0 bzw 7 ist, da man für x==0/7 es etwas neu definieren muss ,da er sich sonst nicht bewegen kann
			
			
		
				
				try {
				// FALL 1 : Verbündete oder Gegner vor Figur
					
				if (dieGui.pruefeObVerbuendeter(x, y+1)==true) { 
					//bauer kann keih feld nach vorne wenn verbündeter drauf ist ,aber Gegner diagonal schlagen
					gegnerString = dieGui.pruefeObGegner(x-1, y+1);
					dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
					gegnerString = dieGui.pruefeObGegner(x+1, y+1);
					dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
				
						
				}else if(dieGui.pruefeObVerbuendeter(x,y+2)==true){
				//	break;
						
				}else if(dieGui.pruefeObGegner(x, y+1)!="-1") {
					//bauer kann nicht feld nach vorne wenn gegner drauf ist		
					gegnerString = dieGui.pruefeObGegner(x-1, y+1);
					dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
					gegnerString = dieGui.pruefeObGegner(x+1, y+1);
					dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
					
				}else if(dieGui.pruefeObGegner(x, y+2)!="-1") {
					//bauer kann nur 1 feld vor wenn auf dem 2ziehfeld schon ein gegner drauf ist.		
					gegnerString = dieGui.pruefeObGegner(x-1, y+1);    
					//prüft ob gegner links diagonal vorm Bauern steht 
					dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
					gegnerString = dieGui.pruefeObGegner(x+1, y+1);    
					// prüft ob gegner rechts diagonal vorm bauern
					dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
					
				//=====================================================================================
						
				
				// Fall 2 : Diagonal Links oder Rechts gegner  sowie Leeres feld vor dem Bauern
						
				}else if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){
					//bauer kann 1-2 felder vor oder 1 feld diagonal links gegner schlagen
						gegnerString = dieGui.pruefeObGegner(x-1, y+1);
						dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
						
						dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					    dieGui.setzteFeld(x, y+2, dieGui.iBlauesFeld,"blau");
						
					

				}else if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){
					//bauer kann 1-2 felder vor oder 1 feld diagonal rechts gegner schlagen	
						gegnerString = dieGui.pruefeObGegner(x+1, y+1);
						dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
						
						dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					    dieGui.setzteFeld(x, y+2, dieGui.iBlauesFeld,"blau");	
						
				//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
						
				}else{
						dieGui.setzteFeld(x,y+2,dieGui.iBlauesFeld,"blau");     
						//funktioniert: bis zu 2 felder nach vorne ziehen
					}
						
				} catch (Exception e) {
					
				}
				
			//Schleife ende For
			
			//-----------------------------------------------------------------------------------
		}else { 
			//gilt für alle buttons außerhalb "k"= die Startposition der Bauer
			
									try {
										
									//FALL 3: Verbündeter vor Bauer , Gegner diagonal
										if (dieGui.pruefeObVerbuendeter(x, y+1)==true) {
											gegnerString = dieGui.pruefeObGegner(x-1, y+1);
											dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
											gegnerString = dieGui.pruefeObGegner(x+1, y+1);
											dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
											
											
									//FALL 4: Außerhalb Startposition: Gegner vor Bauer, sowie diagonal von ihm		
										}else if(dieGui.pruefeObGegner(x, y+1)!="-1") {
											//bauer kann nicht feld nach vorne wenn gegner drauf ist
											gegnerString = dieGui.pruefeObGegner(x, y+1);
										
											//Jemand steht vertikal vor bauer, sowie rechts bzw links diagonal vor ihm!
											if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){ 
												gegnerString = dieGui.pruefeObGegner(x+1, y+1);
												dieGui.schreibeGegnerButton(x+1, y+1, gegnerString, button);
											
												} //& knüft mit der anderen diagonalen an!
											if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){
												gegnerString = dieGui.pruefeObGegner(x-1, y+1);
												dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);
												}
					
										
					
										} else if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){
					
											gegnerString = dieGui.pruefeObGegner(x+1, y+1);
											dieGui.schreibeGegnerButton(x+1, y+1, gegnerString, button);
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");

										}else if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){
											gegnerString = dieGui.pruefeObGegner(x-1, y+1);
											dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					

										}else{
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
										}

									} catch (Exception e) {
				
									}
			
								} //Else (y==1 && x!=0 && x!=7) ende klammer
		
		//?????????????????????????????????????????????????????????(if y==1 && x== 0)////////////////////////////////////////////////////////////
		
		if (y==1 && x==0) { //für die Züge aus der Startposition
			//y-Achse runter füllen
			
			for (int i = 1; i < 3; i++) { 
				//i = 1 sonst wird die position des bauern mit "blau" markiert
				
				try {
					//Fall 5: x=0 : verbündeter vor bauer, gegner diagonal rechtsunten
				if (dieGui.pruefeObVerbuendeter(x, y+i)==true) { 
					//bauer kann keih feld nach vorne wenn verbündeter drauf ist, gegner diagonal
					gegnerString = dieGui.pruefeObGegner(x+1, y+1);
					dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
						break;
						
				}else if(dieGui.pruefeObGegner(x, y+i)!="-1") {
						//bauer kann nicht feld nach vorne wenn gegner drauf ist
						gegnerString = dieGui.pruefeObGegner(x+1, y+1);
						dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
						break;
				//----------------------------------------------------------------------
				//hier kann es bei x==0 kein "pruefeObGegner(x-1,y+1)" geben , 
				//da das Feld schon aufhört -> sonst kommt es dazu dass sich der bauer dort nicht bewegen kann
				
				}else if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){
						//bauer kann 1-2 felder vor oder 1 feld diagonal rechts gegner schlagen
						gegnerString = dieGui.pruefeObGegner(x+1, y+1);
						dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);				
						dieGui.setzteFeld(x,y+i,dieGui.iBlauesFeld,"blau");
					    
						break;
				//------------------------------------------------------------------------
						
				}else{
						dieGui.setzteFeld(x,y+i,dieGui.iBlauesFeld,"blau");     
						//funktioniert: bis zu 2 felder nach vorne ziehen
					}
					
					
				} catch (Exception e) {
					break;
				}
				
			}//Schleife ende For
			
			//-----------------------------------------------------------------------------------
		}else { 
			//gilt für alle buttons außerhalb "k"= die Startposition der Bauer	
							try {
				
								if (dieGui.pruefeObVerbuendeter(x, y+1)==true) {
									gegnerString = dieGui.pruefeObGegner(x+1, y+1);
									dieGui.schreibeGegnerButton(x+1, y+1,gegnerString,button);
									
								}else if(dieGui.pruefeObGegner(x, y+1)!="-1") {
											//bnauer kann nicht feld nach vorne wenn gegner drauf ist
											gegnerString = dieGui.pruefeObGegner(x, y+1);			
											//Jemand steht vertikal vor bauer, sowie rechts bzw links diagonal vor ihm!
											if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){ 
												gegnerString = dieGui.pruefeObGegner(x+1, y+1);
												dieGui.schreibeGegnerButton(x+1, y+1, gegnerString, button);	
													}
					
								} else if(dieGui.pruefeObGegner(x+1,y+1)!="-1"){
											gegnerString = dieGui.pruefeObGegner(x+1, y+1);
											dieGui.schreibeGegnerButton(x+1, y+1, gegnerString, button);
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");

								}else{
					
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					
										}
								} catch (Exception e) {
				
									}
			
								} //Else ende (if y==1 && x== 0) klammer
		
	//????????????????????????????????????????????????????(if y==1 && x== 7)//////////////////////////////////////////////////////////
		
		if (y==1 && x==7) { //für die Züge aus der Startposition
			//y-Achse runter füllen
			
			for (int i = 1; i < 3; i++) { 
				//i = 1 sonst wird die position des bauern mit "blau" markiert
				
				try {
					//FALL 6: x=7: Verbündeter vor Bauer ,diagonal linksunten Gegner
				if (dieGui.pruefeObVerbuendeter(x, y+i)==true) { 
					//bauer kann keih feld nach vorne wenn verbündeter drauf ist
					gegnerString = dieGui.pruefeObGegner(x-1, y+1);
					dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
						break;
						
				}else if(dieGui.pruefeObGegner(x, y+i)!="-1") {
				//bauer kann nicht feld nach vorne wenn gegner drauf ist,aber gegner diagonal links schalgen
						gegnerString = dieGui.pruefeObGegner(x-1, y+1);
						dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);
						break;
				//----------------------------------------------------------------------
				//hier kann es bei x==0 kein "pruefeObGegner(x+1,y+1)" geben ,
				//da das Feld schon aufhört -> sonst kommt es dazu dass sich der bauer dort nicht bewegen kann
				
				}else if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){						
					//bauer kann 1-2 felder vor oder 1 feld diagonal links gegner schlagen
						gegnerString = dieGui.pruefeObGegner(x-1, y+1);						
						dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);						
						dieGui.setzteFeld(x,y+i,dieGui.iBlauesFeld,"blau");
					   
						
						break;
				//------------------------------------------------------------------------
						
				}else{
						dieGui.setzteFeld(x,y+i,dieGui.iBlauesFeld,"blau");     
						//funktioniert: bis zu 2 felder nach vorne ziehen
					}

				} catch (Exception e) {
					break;
				}				
			}			//Schleife ende For //(if y==1 && x== 7)
			
			
		}else { //(if y==1 && x== 7)
			//gilt für alle buttons außerhalb "k"= die Startposition der Bauer
							try {
	
								if (dieGui.pruefeObVerbuendeter(x, y+1)==true) { 
									gegnerString = dieGui.pruefeObGegner(x-1, y+1);
									dieGui.schreibeGegnerButton(x-1, y+1,gegnerString,button);
											
								}else if(dieGui.pruefeObGegner(x, y+1)!="-1") { //(if y!=1 && x== 7)	
											//bauer kann nicht feld nach vorne wenn gegner drauf ist
											gegnerString = dieGui.pruefeObGegner(x, y+1);
											
											//Jemand steht vertikal vor bauer, sowie links diagonal vor ihm!
											if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){ 
												gegnerString = dieGui.pruefeObGegner(x-1, y+1);						
												dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);	
													}
											
								} else if(dieGui.pruefeObGegner(x-1,y+1)!="-1"){ //(if y==1 && x== 7)
											gegnerString = dieGui.pruefeObGegner(x-1, y+1);					
											dieGui.schreibeGegnerButton(x-1, y+1, gegnerString, button);					
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");

								}else{
											dieGui.setzteFeld(x,y+1,dieGui.iBlauesFeld,"blau");
					
										}

									} catch (Exception e) {
				
									}
			
								} //Else ende (if y==1 && x== 7) klammer
			}//Methodenende 
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////		
		
//----------------------------------------------------BAUER SILBER _---------IF(y==6 && x!=0 && x!= 7)-------------------------------------------------------------
		public void BauerFeldHoch(String button, String arraySpielfeld [][]) {
				
				buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
				
				x= buttonKoordinaten [0];
				y= buttonKoordinaten [1];
				
				if (y==6 && x!=0 && x!=7) { //für die Züge aus der Startposition und wo x != 0 bzw 7 ist, da man für x==0/7 es etwas neu definieren muss ,da er sich sonst nicht bewegen kann
					
					
					
						
						try {
						// FALL 1 : Verbündete oder Gegner vor Figur
							
						if (dieGui.pruefeObVerbuendeter(x, y-1)==true) { //bauer kann keih feld nach vorne wenn verbündeter drauf ist ,aber Gegner diagonal schlagen
							gegnerString = dieGui.pruefeObGegner(x-1, y-1);
							dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
							gegnerString = dieGui.pruefeObGegner(x+1, y-1);
							dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
						
								
						}else if(dieGui.pruefeObVerbuendeter(x,y-2)==true){
						//	break;
								
						}else if(dieGui.pruefeObGegner(x, y-1)!="-1") {//bauer kann nicht feld nach vorne wenn gegner drauf ist		
							gegnerString = dieGui.pruefeObGegner(x-1, y-1);
							dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
							gegnerString = dieGui.pruefeObGegner(x+1, y-1);
							dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
							
						}else if(dieGui.pruefeObGegner(x, y-2)!="-1") {//bauer kann nicht feld nach vorne wenn gegner drauf ist		
							gegnerString = dieGui.pruefeObGegner(x-1, y-1);
							dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
							gegnerString = dieGui.pruefeObGegner(x+1, y-1);
							dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
							
						//=====================================================================================
								
						
						// Fall 2 : Diagonal Links oder Rechts gegner  sowie Leeres feld vor dem Bauern
								
						}else if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){//bauer kann 1-2 felder vor oder 1 feld diagonal links gegner schlagen
								gegnerString = dieGui.pruefeObGegner(x-1, y-1);
								dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
								
								dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
							    dieGui.setzteFeld(x, y-2, dieGui.iBlauesFeld,"blau");
								
							

						}else if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){//bauer kann 1-2 felder vor oder 1 feld diagonal rechts gegner schlagen	
								gegnerString = dieGui.pruefeObGegner(x+1, y-1);
								dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
								
								dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
							    dieGui.setzteFeld(x, y-2, dieGui.iBlauesFeld,"blau");	
								
						//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
								
						}else{
								dieGui.setzteFeld(x,y-2,dieGui.iBlauesFeld,"blau");     //funktioniert: bis zu 2 felder nach vorne ziehen
							}
								
						} catch (Exception e) {
							
						}
						
					//Schleife ende For
					
					//-----------------------------------------------------------------------------------
				}else { 
					//gilt für alle buttons außerhalb "k"= die Startposition der Bauer
					
											try {
												
											//FALL 3: Verbündeter vor Bauer , Gegner diagonal
												if (dieGui.pruefeObVerbuendeter(x, y-1)==true) {
													gegnerString = dieGui.pruefeObGegner(x-1, y-1);
													dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
													gegnerString = dieGui.pruefeObGegner(x+1, y-1);
													dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
													
													
											//FALL 4: Außerhalb Startposition: Gegner vor Bauer, sowie diagonal von ihm		
												}else if(dieGui.pruefeObGegner(x, y-1)!="-1") {//bnauer kann nicht feld nach vorne wenn gegner drauf ist
													gegnerString = dieGui.pruefeObGegner(x, y-1);
												
													//Jemand steht vertikal vor bauer, sowie rechts bzw links diagonal vor ihm!
													if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){ 
														gegnerString = dieGui.pruefeObGegner(x+1, y-1);
														dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);
													
														} //& knüft mit der anderen diagonalen an!
													if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){
														gegnerString = dieGui.pruefeObGegner(x-1, y-1);
														dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);
														}
							
												
							
												} else if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){
							
													gegnerString = dieGui.pruefeObGegner(x+1, y-1);
													dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");

												}else if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){
													gegnerString = dieGui.pruefeObGegner(x-1, y-1);
													dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
							

												}else{
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
												}

											} catch (Exception e) {
						
											}
					
										} //Else (y==1 && x!=0 && x!=7) ende klammer
				
				//?????????????????????????????????????????????????????????(if y==6 && x== 0)////////////////////////////////////////////////////////////
				
				if (y==6 && x==0) { //für die Züge aus der Startposition
					//y-Achse runter füllen
					
					for (int i = 1; i < 3; i++) { //i = 1 sonst wird die position des bauern mit "blau" markiert
						
						try {
							//Fall 5: x=0 : verbündeter vor bauer, gegner diagonal rechtsunten
						if (dieGui.pruefeObVerbuendeter(x, y-i)==true) { //bauer kann keih feld nach vorne wenn verbündeter drauf ist, gegner diagonal
							gegnerString = dieGui.pruefeObGegner(x+1, y-1);
							dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
								break;
								
						}else if(dieGui.pruefeObGegner(x, y-i)!="-1") {
								//bauer kann nicht feld nach vorne wenn gegner drauf ist
								gegnerString = dieGui.pruefeObGegner(x+1, y-1);
								dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);
								break;
								
						//----------------------------------------------------------------------
						//hier kann es bei x==0 kein "pruefeObGegner(x-1,y-1)" geben , da das Feld schon aufhört -> sonst kommt es dazu dass sich der bauer dort nicht bewegen kann
						
						}else if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){
								//bauer kann 1-2 felder vor oder 1 feld diagonal rechts gegner schlagen
								gegnerString = dieGui.pruefeObGegner(x+1, y-1);
								dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);				
								dieGui.setzteFeld(x,y-i,dieGui.iBlauesFeld,"blau");
							    //dieGui.setzteFeld(x, y-2, dieGui.iBlauesFeld,"blau");
								break;
						//------------------------------------------------------------------------
								
						}else{
								dieGui.setzteFeld(x,y-i,dieGui.iBlauesFeld,"blau");     //funktioniert: bis zu 2 felder nach vorne ziehen
							}
							
							
						} catch (Exception e) {
							break;
						}
						
					}//Schleife ende For
					
					//-----------------------------------------------------------------------------------
				}else { 
					//gilt für alle buttons außerhalb "k"= die Startposition der Bauer	
									try {
						
										if (dieGui.pruefeObVerbuendeter(x, y-1)==true) {
											gegnerString = dieGui.pruefeObGegner(x+1, y-1);
											dieGui.schreibeGegnerButton(x+1, y-1,gegnerString,button);
											
										}else if(dieGui.pruefeObGegner(x, y-1)!="-1") {
													//bnauer kann nicht feld nach vorne wenn gegner drauf ist
													gegnerString = dieGui.pruefeObGegner(x, y-1);			
													//Jemand steht vertikal vor bauer, sowie rechts bzw links diagonal vor ihm!
													if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){ 
														gegnerString = dieGui.pruefeObGegner(x+1, y-1);
														dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);	
															}
							
										} else if(dieGui.pruefeObGegner(x+1,y-1)!="-1"){
													gegnerString = dieGui.pruefeObGegner(x+1, y-1);
													dieGui.schreibeGegnerButton(x+1, y-1, gegnerString, button);
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");

										}else{
							
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
							
												}
										} catch (Exception e) {
						
											}
					
										} //Else ende (if y==1 && x== 0) klammer
				
			//????????????????????????????????????????????????????(if y==1 && x== 7)//////////////////////////////////////////////////////////
				
				if (y==6 && x==7) { //für die Züge aus der Startposition
					//y-Achse runter füllen
					
					for (int i = 1; i < 3; i++) { //i = 1 sonst wird die position des bauern mit "blau" markiert
						
						try {
							//FALL 6: x=7: Verbündeter vor Bauer ,diagonal linksunten Gegner
						if (dieGui.pruefeObVerbuendeter(x, y-i)==true) { //bauer kann keih feld nach vorne wenn verbündeter drauf ist
							gegnerString = dieGui.pruefeObGegner(x-1, y-1);
							dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
								break;
								
						}else if(dieGui.pruefeObGegner(x, y-i)!="-1") {
								//bauer kann nicht feld nach vorne wenn gegner drauf ist
								gegnerString = dieGui.pruefeObGegner(x-1, y-1);
								dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);
								break;
						//----------------------------------------------------------------------
						//hier kann es bei x==0 kein "pruefeObGegner(x+1,y-1)" geben , da das Feld schon aufhört -> sonst kommt es dazu dass sich der bauer dort nicht bewegen kann
						
						}else if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){						//bauer kann 1-2 felder vor oder 1 feld diagonal links gegner schlagen
								gegnerString = dieGui.pruefeObGegner(x-1, y-1);						
								dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);						
								dieGui.setzteFeld(x,y-i,dieGui.iBlauesFeld,"blau");
							   
								
								break;
						//------------------------------------------------------------------------
								
						}else{
								dieGui.setzteFeld(x,y-i,dieGui.iBlauesFeld,"blau");     //funktioniert: bis zu 2 felder nach vorne ziehen
							}

						} catch (Exception e) {
							break;
						}				
					}			//Schleife ende For //(if y==1 && x== 7)
					
					
				}else { //(if y==6 && x== 7)
					//gilt für alle buttons außerhalb "k"= die Startposition der Bauer
									try {
			
										if (dieGui.pruefeObVerbuendeter(x, y-1)==true) { 
											gegnerString = dieGui.pruefeObGegner(x-1, y-1);
											dieGui.schreibeGegnerButton(x-1, y-1,gegnerString,button);
													
										}else if(dieGui.pruefeObGegner(x, y-1)!="-1") { //(if y!=1 && x== 7)	
													//bauer kann nicht feld nach vorne wenn gegner drauf ist
													gegnerString = dieGui.pruefeObGegner(x, y-1);
													
													//Jemand steht vertikal vor bauer, sowie links diagonal vor ihm!
													if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){ 
														gegnerString = dieGui.pruefeObGegner(x-1, y-1);						
														dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);	
															}
													
										} else if(dieGui.pruefeObGegner(x-1,y-1)!="-1"){ //(if y==1 && x== 7)
													gegnerString = dieGui.pruefeObGegner(x-1, y-1);					
													dieGui.schreibeGegnerButton(x-1, y-1, gegnerString, button);					
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");

										}else{
													dieGui.setzteFeld(x,y-1,dieGui.iBlauesFeld,"blau");
							
												}

											} catch (Exception e) {
						
											}
					
										} //Else ende (if y==1 && x== 7) klammer
					}//Methodenende 
			
		
		//---------------------------PFERDE MUSTER ------------------------------------------------------------------------

				public void PferdBewegungsmuster(String button, String arraySpielfeld [][]) {
				
				buttonKoordinaten = dieSteuerung.gibButtonKoordinaten(button);
				
				x= buttonKoordinaten [0];
				y= buttonKoordinaten [1];
				
				//----------------------------------------------------------------------
				// PFERD unten links
				
				try {
					
					if (dieGui.pruefeObVerbuendeter(x-2, y+1)==true) {
						/*Hier wird geprüft ob sich auf dem Feld ein Verbündeter
						 *befindet. Steht da keiner wird abgefragt ob sich ein 
						 *Gegner drauf befindet in der else-if-Abfrage*/
							
							
							
						} else if(dieGui.pruefeObGegner(x-2,y+1)!="-1"){
						/*Hier wird geprüft ob sich ein Gegner auf dem Feld befindet.
						 *Es wird dann „-1“ zurückgegeben,wenn sich kein Gegner drauf 				 
						 *befindet. Falls doch wird die Methode dieGui.schreibeGegnerButton() ausgeführt. 
						 *Es wird der GegnerString übergeben und die gegnerische Figur wird 
						 *durch die selbe Figur mit einem roten Hintergrund ersetzt.*/
							gegnerString = dieGui.pruefeObGegner(x-2, y+1);
						
						

					}else{
						
						dieGui.setzteFeld(x-2,y+1,dieGui.iBlauesFeld,"blau");
						
					}
					
					
					
					} catch (Exception e) {
					
				
				
					}
				
			//----------------------------------------------------------------------
			 //Unten rechts

			try {
				
				if (dieGui.pruefeObVerbuendeter(x+2, y+1)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x+2,y+1)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+2, y+1);
					
					dieGui.schreibeGegnerButton(x+2, y+1, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x+2,y+1,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				


				}

			//----------------------------------------------------------------------
			//oben links

			try {

			if (dieGui.pruefeObVerbuendeter(x-2, y-1)==true) {
				
				
				
			} else if(dieGui.pruefeObGegner(x-2,y-1)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x-2, y-1);
				
				dieGui.schreibeGegnerButton(x-2, y-1, gegnerString, button);
				
				

			}else{
				
				dieGui.setzteFeld(x-2,y-1,dieGui.iBlauesFeld,"blau");
				
			}



			} catch (Exception e) {



			}

			//----------------------------------------------------------------------
			//Oben rechts

			try {

			if (dieGui.pruefeObVerbuendeter(x+2, y-1)==true) {
				
				
				
			} else if(dieGui.pruefeObGegner(x+2,y-1)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x+2, y-1);
				
				dieGui.schreibeGegnerButton(x+2, y-1, gegnerString, button);
				
				

			}else{
				
				dieGui.setzteFeld(x+2,y-1,dieGui.iBlauesFeld,"blau");
				
			}



			} catch (Exception e) {



			}

					
			
			//----------------------------------------------------------------------
				// PFERD unten links
				
				try {
					
					if (dieGui.pruefeObVerbuendeter(x-1, y+2)==true) {
						
						
						
					} else if(dieGui.pruefeObGegner(x-1,y+2)!="-1"){
						
						gegnerString = dieGui.pruefeObGegner(x-1, y+2);
						
						dieGui.schreibeGegnerButton(x-1, y+2, gegnerString, button);
						
						

					}else{
						
						dieGui.setzteFeld(x-1,y+2,dieGui.iBlauesFeld,"blau");
						
					}
					
					
					
					} catch (Exception e) {
					
				
				
					}
				
			//----------------------------------------------------------------------
			 //Unten rechts

			try {
				
				if (dieGui.pruefeObVerbuendeter(x+1, y+2)==true) {
					
					
					
				} else if(dieGui.pruefeObGegner(x+1,y+2)!="-1"){
					
					gegnerString = dieGui.pruefeObGegner(x+1, y+2);
					
					dieGui.schreibeGegnerButton(x+1, y+2, gegnerString, button);
					
					

				}else{
					
					dieGui.setzteFeld(x+1,y+2,dieGui.iBlauesFeld,"blau");
					
				}
				
				
				
				} catch (Exception e) {
				


				}

			//----------------------------------------------------------------------
			//oben links

			try {

			if (dieGui.pruefeObVerbuendeter(x-1, y-2)==true) {
				
				
				
			} else if(dieGui.pruefeObGegner(x-1,y-2)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x-1, y-2);
				
				dieGui.schreibeGegnerButton(x-1, y-2, gegnerString, button);
				
				

			}else{
				
				dieGui.setzteFeld(x-1,y-2,dieGui.iBlauesFeld,"blau");
				
			}



			} catch (Exception e) {



			}

			//----------------------------------------------------------------------
			//Oben rechts

			try {

			if (dieGui.pruefeObVerbuendeter(x+1, y-2)==true) {
				
				
				
			} else if(dieGui.pruefeObGegner(x+1,y-2)!="-1"){
				
				gegnerString = dieGui.pruefeObGegner(x+1, y-2);
				
				dieGui.schreibeGegnerButton(x+1, y-2, gegnerString, button);
				
				

			}else{
				
				dieGui.setzteFeld(x+1,y-2,dieGui.iBlauesFeld,"blau");
				
			}



			} catch (Exception e) {



			}

					
				} //Klammer ende Pferd bewegungsmustermethode
		
	
	
//-------------------------------------------------------------------------------------------------------------------
	
	// Assoziation mit Gui:
	
	public void linkGui(Gui g) {
		
		dieGui = g;
		
	}
	
	// Assoziation mit Steuerung:
	
		public void linkSteuerung(Steuerung s) {
			
			dieSteuerung = s;
			
		}
	
}
