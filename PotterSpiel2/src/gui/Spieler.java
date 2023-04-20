package gui;

public class Spieler {
	private String name;
	private int leben;
	private int mana;
	private int staerke;
	private String umgesehen;
	private String waffe1 = "Daedrischer Zweihänder";
	private String waffe2 = "Zwergischer Dolch";
	private String waffe3 = "Jagdbogen";
	private String inventar;
	
	
	
	public void umsehen() {
		Spieler s1 = new Spieler();
		s1.setUmgesehen("Du siehst dich um und siehst : " + System.lineSeparator() + "eine Tür im Westen"
				+ System.lineSeparator() + "eine Tür im Norden" + System.lineSeparator() + "eine Tür im Osten");
		System.out.println(s1.getUmgesehen());
	}

	public void folkvarAngreifen() {
		Folkvar folkvar = new Folkvar();
		folkvar.setLeben(0);
		folkvar.setTot(true);
		System.out.println("Bjorn hat angegriffen und hat den Gegner getötet");

	}

	public void waffeWaehlen() {
		Spieler s1 = new Spieler();
		System.out.println(s1.getWaffe1());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	public String getUmgesehen() {
		return umgesehen;
	}

	public void setUmgesehen(String umgesehen) {
		this.umgesehen = umgesehen;
	}

	public String getWaffe1() {
		return waffe1;
	}

	public void setWaffe1(String waffe) {
		this.waffe1 = waffe;
	}

	public String getWaffe2() {
		return waffe2;
	}

	public void setWaffe2(String waffe2) {
		this.waffe2 = waffe2;
	}

	public String getWaffe3() {
		return waffe3;
	}

	public void setWaffe3(String waffe3) {
		this.waffe3 = waffe3;
	}

	public String getInventar() {
		return inventar;
	}

	public void setInventar(String inventar) {
		this.inventar = inventar;
	}

}