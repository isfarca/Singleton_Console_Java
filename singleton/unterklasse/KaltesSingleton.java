package headfirst.singleton.unterklasse;

public class KaltesSingleton extends Singleton {
	// n�tzliche Instanzvariablen
	protected static Singleton einzigeInstanz;
 
	private KaltesSingleton() {
		super();
	}
 
	// n�tzliche Instanzmethoden
}
