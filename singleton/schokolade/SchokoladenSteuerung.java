package headfirst.singleton.schokolade;
 
public class SchokoladenSteuerung {
	public static void main(String args[]) {
		SchokoladenKocher kocher = SchokoladenKocher.getInstanz();
		kocher.f�llen();
		kocher.kochen();
		kocher.leeren();

		// liefert die vorhandene Instanz zur�ck
		SchokoladenKocher kocher2 = SchokoladenKocher.getInstanz();
	}
}
