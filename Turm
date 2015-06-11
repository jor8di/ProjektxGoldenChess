
public class Turm {

	Bewegungsmuster dieBewegungsmuster;
	
	

	public Turm(Bewegungsmuster b) {
		
		dieBewegungsmuster = b;
	}

	
	//Turm geklickt

	public void turmClicked(String button, String arraySpielfeld [][]) {
	
		//Turm mit dunkelblauem Hintergrund hinterlegen:
				if (dieBewegungsmuster.getSpieler().equals("gold")) {
					
					dieBewegungsmuster.dieGui.figurAmZug = "tuGold";
					
					  dieBewegungsmuster.setzteAktuelleFigur(button,"tuGoldDBH");
					
				} else {
					
					dieBewegungsmuster.dieGui.figurAmZug = "tuSilber";
					
				   	 dieBewegungsmuster.setzteAktuelleFigur(button,"tuSilberDBH");

				}
		
		
		//-Methodenaufrufe aus der Klasse Bewegungsmuster-
		dieBewegungsmuster.hochfuellen(button, arraySpielfeld);
		dieBewegungsmuster.runterfuellen(button, arraySpielfeld);
		dieBewegungsmuster.rechtsfuellen(button, arraySpielfeld);
		dieBewegungsmuster.linksfuellen(button, arraySpielfeld);

			
	}

}
