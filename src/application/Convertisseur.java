package application;

public class Convertisseur {
	
	
	public static void txtsplit(String remplirconv) {
		String[] parts = remplirconv.split("/"); // split couple
		int i=0;
		while (estpasvide(parts[i]))
		{
		// split lettre - morse
		String[] separ = parts[i].split("#"); // split lettre et morse
		Listelettre listedelettre = new Listelettre();
		listedelettre.lettre = separ[0].charAt(0);
		listedelettre.morse = separ[1];
		i++;
		}
	}
	
	public static boolean estpasvide(String tabl) {
		if (tabl == "") return false;
		else return true;
	}
	
	
	// recuperer txt mis par l'utilisateur en lettre pour convertir vers morse
	public Listelettre resmorse(String txt) {
		String convmorse = "";
		for (char letter: txt.toCharArray()) {
			convmorse = convmorse.concact(Listelettre.searchCode(letter)+'/');
		}
		return convmorse;
	}
	
}
