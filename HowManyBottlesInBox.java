package Projects1;
public class Main {
    public static void main(String[] args) {
        
        //Berechnung: Flaeche der Box
		float breite_box = 12, laenge_box = 5;
		float flaeche_box = breite_box * laenge_box;
		
		//Berechnung: Grundflaeche der Flasche;
		float radius_flasche = 2.5f;
		float grundflaeche_flasche = (float) (Math.PI * Math.pow(radius_flasche, 2));  
		
		int flaschen_anzahl = 10;

		//Wie viele Flaschen in eine Box
		int a_flaschen_in_eine_box = (int) (flaeche_box / grundflaeche_flasche); 
		System.out.println("Azahl Flaschein in einer Box: " + a_flaschen_in_eine_box);
		
		//Wie viele Boxen brauchen wir? wenn alle Perfekt gefüllt werden können
		if (flaschen_anzahl % a_flaschen_in_eine_box == 0) 
		{
			System.out.println("Es bleiben keine Flaschen übrig.");
			int anzahl_boxen = flaschen_anzahl / a_flaschen_in_eine_box;
			System.out.println("Sie brauchen " + anzahl_boxen + " Boxen");
		} 
		else //Wie viele Flaschen bleiben Übrig, wenn die Boxen nicht Perfekt gefüllt werden können?
		{
			int rest_flaschen = flaschen_anzahl % a_flaschen_in_eine_box;
			int anzahl_boxen = flaschen_anzahl / a_flaschen_in_eine_box;
			System.out.println("Sie brauchen " + anzahl_boxen + " Boxen");
			System.out.println("Es bleibt/en " + rest_flaschen + " Flaschen übrig.");
		}
    }
}
