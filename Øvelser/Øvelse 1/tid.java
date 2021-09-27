
import java.util.Scanner;
class tid {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = showConfirmDialog(null, "Plus?", "Calculator", YES_OPTION);
		long sekunder = scanner.nextInt();
		long timer = sekunder / 3600;
		long minutter = (sekunder - (timer*3600))/60;
		long restSekund = (sekunder -(timer*3600) - (minutter*60));
		System.out.println(sekunder + " sekunder er: " + timer + " timer " + minutter + " minutter og " + restSekund + " sekunder.");
	}

}