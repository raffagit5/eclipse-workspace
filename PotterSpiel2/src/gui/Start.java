package gui;

public class Start {
	private String spielGestartet;

	public String getSpielGestartet() {
		return spielGestartet;
	}

	public void setSpielGestartet(String spielGestartet) {
		this.spielGestartet = spielGestartet;
	}

	public void starten() {
		Start start = new Start();
		Spieler s1 = new Spieler();
		s1.setName("Bjorn");
		Raum r1 = new Raum();
		r1.setRaum(1);
		start.setSpielGestartet(
				"-------------------------------------------------------------------------------------------------------------------------"
						+ System.lineSeparator() + ">Dein Name ist " + s1.getName() + " und bist in Raum "
						+ r1.getRaum() + System.lineSeparator()
						+ "-------------------------------------------------------------------------------------------------------------------------"
						+ System.lineSeparator() + ">Du kommst aus dem weiten Süden und suchst rare Schaetze."
						+ System.lineSeparator()
						+ "-------------------------------------------------------------------------------------------------------------------------"
						+ System.lineSeparator() + System.lineSeparator()
						+ ">Du bist im ersten Raum und hast drei veschiedene Türen zur Auswahl, die dich in drei verschiedene Bereiche bringen."
						+ System.lineSeparator()
						+ "-------------------------------------------------------------------------------------------------------------------------");

		System.out.println(start.getSpielGestartet());
	}
}
