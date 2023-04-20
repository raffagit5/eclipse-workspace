package gui;

public class Antwort {
	private String antwortA, antwortB, antwort1, antwort2;

	
	public void aufErikAntwortenA() {
		Erik er1 = new Erik();
		Antwort a1 = new Antwort();
		a1.setAntwortA("-------------------------------------------------------------------------"
				+ System.lineSeparator() + "Gut, wenn du nur vorbei willst, dann gehe vorbei."
				+ System.lineSeparator() + "Aber warte, du darfst noch diese Truhe hier öffnen."
				+ System.lineSeparator() + "-------------------------------------------------------------------------");
		er1.setChestDiscovered(true);

		System.out.println(a1.getAntwort());
	}

	public void aufErikAntwortenB() {
		Antwort a1 = new Antwort();

		a1.setAntwortB("---------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "Du wagst es doch nicht wirklich, mich zu bestehlen, oder? Ich gebe dir garnichts - Verschwinde von hier!"
				+ System.lineSeparator()
				+ "---------------------------------------------------------------------------");
		System.out.println(a1.getAntwortB());
	}

	public void aufFrageAntworten2() {
		Antwort a1 = new Antwort();
		a1.setAntwort2("---------------------------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "Der Zauber Amnesia lässt deine Gegner alles vergessen, als du den Zauber auf den Hund ausgeführt hast, "
				+ System.lineSeparator()
				+ "friert er kurz ein, dann macht er einen Schritt zurück und legt sich auf den Boden."
				+ System.lineSeparator() + "Nun kannst du vorsichtig an ihm vorbei gehen." + System.lineSeparator()
				+ "---------------------------------------------------------------------------------------------");
		System.out.println(a1.getAntwort2());
	}
	
	public void aufFrageAntworten1() {
		Antwort a1 = new Antwort();
		a1.setAntwort1("---------------------------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "Der Zauber Diffindo setzt deine Gegner in Flammen, als du den Zauber auf den Hund ausgeführt hast, "
				+ System.lineSeparator()
				+ "bleibt er kurz stehen, dann fängt er an zu brennen und schlägt wild um sich. Seine Pfote erwischt dein Kopf und du bist tot."
				+ System.lineSeparator() + "Versuche es noch eimmal!" + System.lineSeparator()
				+ "---------------------------------------------------------------------------------------------");
		System.out.println(a1.getAntwort1());
	}
	
	public void aufFrageAntworten3() {
		
	}
	
	
	public String getAntwort() {
		return antwortA;
	}

	public void setAntwortA(String pAntwort) {
		antwortA = pAntwort;
	}

	public String getAntwortB() {
		return antwortB;
	}

	public void setAntwortB(String antwortB) {
		this.antwortB = antwortB;
	}

	public String getAntwort1() {
		return antwort1;
	}

	public void setAntwort1(String antwort1) {
		this.antwort1 = antwort1;
	}

	public String getAntwort2() {
		return antwort2;
	}

	public void setAntwort2(String antwort2) {
		this.antwort2 = antwort2;
	}


}
