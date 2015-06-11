
public class Laeufer {

	Bewegungsmuster dieBewegungsmuster;
	
	public Laeufer(Bewegungsmuster b) {
		
		dieBewegungsmuster = b;
		
	}
	
	
	//Laeufer geklickt

	public void laeuferClicked(String button, String arraySpielfeld [][]) {
		
		//Laeufer mit dunkelblauem Hintergrund hinterlegen:
				if (dieBewegungsmuster.getSpieler().equals("gold")) {
					
					dieBewegungsmuster.dieGui.figurAmZug = "laGold";
					
					  dieBewegungsmuster.setzteAktuelleFigur(button,"laGoldDBH");
					
				} else {
					
					dieBewegungsmuster.dieGui.figurAmZug = "laSilber";
					
				   	 dieBewegungsmuster.setzteAktuelleFigur(button,"laSilberDBH");

				}
		
		
		
		//-Methodenaufrufe aus der Klasse Bewegungsmuster-
				
				dieBewegungsmuster.diagonalObenRechtsfuellen(button, arraySpielfeld);
				dieBewegungsmuster.diagonalObenLinksfuellen(button, arraySpielfeld);
				dieBewegungsmuster.diagonalUntenRechtsfuellen(button, arraySpielfeld);
				dieBewegungsmuster.diagonalUntenLinksfuellen(button, arraySpielfeld);
		
		
	}
	
	
}
