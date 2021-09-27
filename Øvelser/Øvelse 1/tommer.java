/* Fører inn antall tommer. 1 tomme er 2.54 centimeter. Hvis vi har 3 tommer, så må det ganges med 2.54 */
/* Printer så ut en setning som angir dine totale tommer i centimeter. */

class tommer {
	public static void main (String [] args) {
		double tommer = 3.0;
		double centimeter = tommer * 2.54;
		System.out.println("Dine "+ tommer + " tommer er " + centimeter + " centimeter");

	}

}
