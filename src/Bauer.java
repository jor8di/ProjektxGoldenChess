
public class Bauer {

	Bewegungsmuster dieBewegungsmuster;
	
	public Bauer(Bewegungsmuster b){
		
		dieBewegungsmuster = b;
		
	}


	
	//feld mit bauer wurde geklickt-------------------------
	public void bauerClicked(String button, String[][] arraySpielfeld) {
		
		if (dieBewegungsmuster.dieGui.goldOben == true) {
			
			if (dieBewegungsmuster.getSpieler().equals("gold")) {
				
				dieBewegungsmuster.dieGui.figurAmZug = "baGold";
				
				  dieBewegungsmuster.setzteAktuelleFigur(button,"baGoldDBH");	
				  
				  dieBewegungsmuster.BauerFeldRunter(button, arraySpielfeld);
				  
				  
		} 
			
		
		
			if (dieBewegungsmuster.getSpieler().equals("silber")) {
				
				dieBewegungsmuster.dieGui.figurAmZug = "baSilber";
				
				  dieBewegungsmuster.setzteAktuelleFigur(button,"baSilberDBH");
				  
				  dieBewegungsmuster.BauerFeldHoch(button, arraySpielfeld);
				  
			} 
			
			
			
			
			
		} else {
			
			
			if (dieBewegungsmuster.getSpieler().equals("gold")) {
				
				dieBewegungsmuster.dieGui.figurAmZug = "baGold";
				
				  dieBewegungsmuster.setzteAktuelleFigur(button,"baGoldDBH");	
				  
				  dieBewegungsmuster.BauerFeldHoch(button, arraySpielfeld);
				  
				  
		} 
			
		
		
			if (dieBewegungsmuster.getSpieler().equals("silber")) {
				
				dieBewegungsmuster.dieGui.figurAmZug = "baSilber";
				
				  dieBewegungsmuster.setzteAktuelleFigur(button,"baSilberDBH");
				  
				  dieBewegungsmuster.BauerFeldRunter(button, arraySpielfeld);
				  
			} 
			
			
			

		}
	
		
	}
	
}
	

 
