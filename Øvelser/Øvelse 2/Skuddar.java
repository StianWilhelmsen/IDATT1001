import java.util.Scanner;
class Skuddar {
	public static void main(String [] args) {
		System.out.println("Velkommen til Skuddårs-kalkulatoren. Skriv inn et årstall:");
		Scanner scanTall = new Scanner(System.in);
		int arstall = scanTall.nextInt();
		if (arstall % 4 == 0) {
			if (arstall % 100 == 0) {
				if (arstall % 400 == 0) {
					System.out.println("Årstallet " + arstall + " er et skuddår!");
				}
				else {
					System.out.println("Årstallet " + arstall + " er ikke et skuddår!");
				}
			}
			else {
				System.out.println("Årstallet " + arstall + " er et skuddår!");
			}
		}
		else {
			System.out.println("Årstallet " + arstall + " er ikke et skuddår!");
		}
	}
}

