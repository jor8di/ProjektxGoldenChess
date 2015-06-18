
public class Ausführung {

	public static void main(String[] args) {
		
		//String arraySpielfeld[][] = new String[8][8];
		Bewegungsmuster dieBewegungsmuster = new Bewegungsmuster();
		Actionlistener dieActionlistener = new Actionlistener();
		
		Gui startfenster = new Gui(dieBewegungsmuster,dieActionlistener);
		
		startfenster.setVisible(true);
		

	}

}
