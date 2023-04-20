package gui;

import java.util.Scanner;

public class Spiel {

	static String text = "-------------------------------------------------------------------";

	public static void main(String[] args) {

		String antwort = "";

		Spieler s1 = new Spieler(); // Spieler erstellen
		Raum r1 = new Raum(); // Raum erstellen
		Eingang e1 = new Eingang(); // Eingang erstellen
		Scanner sc1 = new Scanner(System.in);
		Erik er1 = new Erik();
		Story sto1 = new Story();
		Start start = new Start();

		sto1.titeln();
		System.out.println("Möchtest du das Spiel Starten? (j/n)");

		antwort = sc1.nextLine();

		if (antwort.equals("j")) {
			start.starten();
			s1.setName("Harry");
			r1.setRaum(1);
			s1.umsehen();

		}

		while (true) {

			gameloop();
		}
	}

	public static void gameloop() {

		Spieler spieler2 = new Spieler(); // Spieler erstellen
		Raum raum2 = new Raum(); // Raum erstellen
		Eingang eingang2 = new Eingang(); // Eingang erstellen
		Erik erik2 = new Erik();
		Antwort antwort1 = new Antwort(); //
		Story st1 = new Story();
		Truhe truhe1 = new Truhe();
		Folkvar folkvar = new Folkvar();

		// Spieler
		spieler2.setName("Bjorn");
		spieler2.setLeben(100);
		spieler2.setMana(100);
		spieler2.setStaerke(1);

		// Raum
		raum2.setRaum(1);

		// Eingang
		eingang2.setLevel("Level 0");

		System.out.println("Du bist in " + eingang2.getLevel());

		System.out.println("Welchen Eingang wählst du? (1,2,3)");
		Scanner sc2 = new Scanner(System.in);
		String input = sc2.nextLine();

		if (input.equals("exit")) {
			System.out.println(">Du verlässt den Raum und gehst zurück.");
			System.out.println(">Spiel beendet");
			System.exit(0);
		}

		if (input.equals("inv")) {
			
		}

		if (input.equals("1")) {
			eingang2.setEingang("Westen");
			eingang2.setLevel("Level 1");
			eingang2.setLevelEntered(true);
			st1.storyWesten();

			if (eingang2.getLevelEntered() == true) {
				System.out.println(text);
				erik2.mitErikReden();
				System.out.println(text);
			}

			input = sc2.nextLine();

			if (input.equals("a")) {

				antwort1.aufErikAntwortenA();
				st1.storyNachErik();

				input = sc2.nextLine();

				if (input.equals("j")) {
					st1.storyNeuerRaum();
				}

			}

			if (input.equals("b")) {
				antwort1.aufErikAntwortenB();
			}

		}

		if (input.equals("2")) {
			eingang2.setEingang("Norden");
			eingang2.setLevel("Level 2");
			st1.storyNorden();

			input = sc2.nextLine();

			if (input.equals("1")) {
				System.out.println("Du wählst den Zabuer: " + spieler2.getWaffe1());
				antwort1.aufFrageAntworten1();
			}

			if (input.equals("2")) {
				System.out.println("Du wählst den Zauber: " + spieler2.getWaffe2());
				antwort1.aufFrageAntworten2();
			}

			if (input.equals("3")) {
				System.out.println(text);
				System.out.println("Du wählst den Zauber: " + spieler2.getWaffe3());

				folkvar.angreifen();
				System.out.println("Der Spieler hat viele Leben verloren, doch er überlebt");
				spieler2.folkvarAngreifen();

			}
		}

		if (input.equals("3")) {
			eingang2.setEingang("Osten");
			eingang2.setLevel("Level 3");
			input = sc2.nextLine();
		}

	}

}
