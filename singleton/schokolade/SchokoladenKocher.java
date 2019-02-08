package headfirst.singleton.schokolade;
 
public class SchokoladenKocher {
	private boolean leer;
	private boolean gekocht;
	private static SchokoladenKocher einzigeInstanz;
  
	private SchokoladenKocher() {
		leer = true;
		gekocht = false;
	}
  
	public static SchokoladenKocher getInstanz() {
		if (einzigeInstanz == null) {
			System.out.println("Erstelle einzige Instanz von SchokoladenKocher");
			einzigeInstanz = new SchokoladenKocher();
		}
		System.out.println("Liefere Instanz von SchokoladenKocher zur�ck");
		return einzigeInstanz;
	}

	public void f�llen() {
		if (isLeer()) {
			leer = false;
			gekocht = false;
			// Den Kocher mit Milch/Schokoladen-Mischung f�llen
		}
	}
 
	public void leeren() {
		if (!isLeer() && isGekocht()) {
			// Gekochte Milch/Schokolade-Mischung ausleeren
			leer = true;
		}
	}
 
	public void kochen() {
		if (!isLeer() && !isGekocht()) {
			// Den Inhalt zum Kochen bringen
			gekocht = true;
		}
	}
  
	public boolean isLeer() {
		return leer;
	}
 
	public boolean isGekocht() {
		return gekocht;
	}
}
