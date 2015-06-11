
public class Pferd {

	Bewegungsmuster dieBewegungsmuster;
	
	public Pferd(Bewegungsmuster b){
		
		dieBewegungsmuster = b;
		
	}
	
	
//----------------------------------------------------------------------------

	public void pferdClicked(String button, String[][] arraySpielfeld) {
		// TODO Auto-generated method stub
if (dieBewegungsmuster.getSpieler().equals("gold")) {
			
			dieBewegungsmuster.dieGui.figurAmZug = "pfGold";
			
			  dieBewegungsmuster.setzteAktuelleFigur(button,"pfGoldDBH");
			 
			
		} else {
			
		   	 dieBewegungsmuster.setzteAktuelleFigur(button,"pfSilberDBH");

		   	dieBewegungsmuster.dieGui.figurAmZug = "pfSilber";
		   	 
		}
		
		dieBewegungsmuster.PferdBewegungsmuster(button, arraySpielfeld);
	}

}

