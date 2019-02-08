package headfirst.singleton.klassisch;

// HINWEIS: Das ist nicht threadsicher!

public class Singleton {
	private static Singleton einzigeInstanz;
 
	// andere n�tzliche Instanzvariablen
 
	private Singleton() {}
 
	public static Singleton getInstanz() {
		if (einzigeInstanz == null) {
			einzigeInstanz = new Singleton();
		}
		return einzigeInstanz;
	}
 
	// andere n�tzliche Methode
}
