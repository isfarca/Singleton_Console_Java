package headfirst.singleton.unterklasse;

public class Singleton {
	protected static Singleton einzigeInstanz;
 
	// andere n�tzliche Instanzvariablen
 
	protected Singleton() {}
 
	public static synchronized Singleton getInstanz() {
		if (einzigeInstanz == null) {
			einzigeInstanz = new Singleton();
		}
		return einzigeInstanz;
	}
 
	// andere n�tzliche Methoden
}
