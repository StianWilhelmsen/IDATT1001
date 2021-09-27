class Oppgave3 {
	public static void main(String[]args) {
		int a = 11;
		int b = 19;
		if (a>10) {
			int tall1 = 60;
			int tall2 = 50;
			System.out.println("1.tall1=" + tall1 + ", tall2= " + tall2);

		if (b<20) {
			int tall3 = 20;
			tall1 = 30;
			tall2 = 100;
			int tall4 = tall1 + tall2 + tall3;
			System.out.println("2.tall1= " + tall1 + ", tall2 = " + tall2);
			System.out.println("3.tall3 = " + tall3 + ",tall4 = " + tall4);
		} else {
			int tall3 = 65;
			System.out.println("4.tall3 = " + tall3);
		}
		System.out.println("5.tall1= " + tall1 + ", tall2 = " + tall2);
		
		}
	}
}