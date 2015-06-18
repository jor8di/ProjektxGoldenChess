
public class Bauer {

	Bewegungsmuster dieBewegungsmuster;
	
	public Bauer(Bewegungsmuster b){
		
		dieBewegungsmuster = b;
		
	}


	
	//feld mit bauer wurde geklickt-------------------------
	public void bauerGoldClicked(String button, String[][] arraySpielfeld) {
		
		if (dieBewegungsmuster.getSpieler().equals("gold")) {
			
			dieBewegungsmuster.dieGui.figurAmZug = "baGold";
			
			  dieBewegungsmuster.setzteAktuelleFigur(button,"baGoldDBH");
			 
			
	}  else{
			
		   	 dieBewegungsmuster.setzteAktuelleFigur(button,"baSilberDBH");

		   	dieBewegungsmuster.dieGui.figurAmZug = "baSilber";
		   	 
		}
		
		if (dieBewegungsmuster.dieGui.goldOben ) {
			dieBewegungsmuster.BauerGoldFeldRunter(button, arraySpielfeld);
		}else{
			dieBewegungsmuster.BauerSilberFeldHoch(button, arraySpielfeld);
		}
		
		
	}
	
	
	

	public void bauerSilberClicked(String button, String[][] arraySpielfeld) {
	
		if (dieBewegungsmuster.getSpieler().equals("silber")) {
			
			dieBewegungsmuster.dieGui.figurAmZug = "baSilber";
			
			  dieBewegungsmuster.setzteAktuelleFigur(button,"baSilberDBH");
			 
			
		} 
		
		dieBewegungsmuster.BauerSilberFeldHoch(button, arraySpielfeld);
	
		
	}
	
}
	

 
