
public class Koenig implements Figur {
	
	Bewegungsmuster dieBewegungsmuster;
	
	public Koenig(Bewegungsmuster b){
		
		dieBewegungsmuster = b;
		
	}
	
	
	//feld mit könig wurde geklickt-------------------------
	public void clicked(String button, String arraySpielfeld [][]){
		
		//König mit dunkelblauem Hintergrund hinterlegen:
				if (dieBewegungsmuster.getSpieler().equals("gold")) {
					
					dieBewegungsmuster.dieGui.figurAmZug = "koGold";
					
					  dieBewegungsmuster.setzteAktuelleFigur(button,"koGoldDBH");
					 
					
				} else {
					
				   	 dieBewegungsmuster.setzteAktuelleFigur(button,"koSilberDBH");

				   	dieBewegungsmuster.dieGui.figurAmZug = "koSilber";
				   	 
				}
		
		dieBewegungsmuster.alleRichtungenEinFeldFuellen(button, arraySpielfeld);
		
	}

	
	
}
