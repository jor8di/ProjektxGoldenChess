
public class Dame implements Figur {

	Bewegungsmuster dieBewegungsmuster;

	public Dame(Bewegungsmuster b) {
		
		dieBewegungsmuster = b;
	}

	//Dame geklickt

	/* (non-Javadoc)
	 * @see Figur#dameClicked(java.lang.String, java.lang.String[][])
	 */
	@Override
	public void clicked(String button, String arraySpielfeld [][]) {
	
		//Dame mit dunkelblauem Hintergrund hinterlegen:
		if (dieBewegungsmuster.getSpieler().equals("gold")) {
			
			dieBewegungsmuster.dieGui.figurAmZug = "daGold";
			
			  dieBewegungsmuster.setzteAktuelleFigur(button,"daGoldDBH");
			
		} else {
			
			dieBewegungsmuster.dieGui.figurAmZug = "daSilber";
			
		   	 dieBewegungsmuster.setzteAktuelleFigur(button,"daSilberDBH");

		}
	
		
		//-Methodenaufrufe aus der Klasse Bewegungsmuster-
		dieBewegungsmuster.hochfuellen(button, arraySpielfeld);
		dieBewegungsmuster.runterfuellen(button, arraySpielfeld);
		dieBewegungsmuster.rechtsfuellen(button, arraySpielfeld);
		dieBewegungsmuster.linksfuellen(button, arraySpielfeld);
		dieBewegungsmuster.diagonalObenRechtsfuellen(button, arraySpielfeld);
		dieBewegungsmuster.diagonalObenLinksfuellen(button, arraySpielfeld);
		dieBewegungsmuster.diagonalUntenRechtsfuellen(button, arraySpielfeld);
		dieBewegungsmuster.diagonalUntenLinksfuellen(button, arraySpielfeld);
	
	
			
	}

	
	
}



