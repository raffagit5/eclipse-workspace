package gui;

public class Truhe {
	private int anzahlItems;
	private String 
	item1 = "Kaiserlicher Dolch", 
	item2 = "Thalmor Robe", 
	item3 = "Ebenerz-Schuhe", 
	item4 = "Goldener Ring der Zerstörung";
	private boolean truheOffen = false;
	

	public void oeffnen() {
		Erik er1 = new Erik();
		Truhe t1 = new Truhe();
		if(er1.getChestDiscovered() == true) {
			t1.getItem1();
		}
	}
	
	
	public int getAnzahlItems() {
		return anzahlItems;
	}

	public void setAnzahlItems(int anzahlItems) {
		this.anzahlItems = anzahlItems;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}


	public boolean isTruheOffen() {
		return truheOffen;
	}


	public void setTruheOffen(boolean truheOffen) {
		this.truheOffen = truheOffen;
	}
}
