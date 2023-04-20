package gui;

public class Folkvar {
	private String name;
	private int leben = 100;
	private String waffe;
	private boolean tot = false;
	
	public void angreifen() {
		Spieler s1 = new Spieler();
		Folkvar folkvar = new Folkvar();
		folkvar.setWaffe("Knüppel");
		s1.setLeben(50);
		
		System.out.println("Der Folkvar hat angefriffen und hat das Leben des Spielers auf " + s1.getLeben() + " reduziert.");
		
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

	public boolean getTot() {
		return tot;
	}

	public void setTot(boolean tot) {
		this.tot = tot;
	}
	
	public String getWaffe() {
		return waffe;
	}
	
	public void setWaffe(String waffe) {
		this.waffe = waffe;
	}

}
