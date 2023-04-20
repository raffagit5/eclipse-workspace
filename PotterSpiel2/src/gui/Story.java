package gui;

public class Story {

	private String story1, story2, story3, story4;
	private String titel;

	

	public void storyWesten() {
		Story st1 = new Story();
		st1.setStory1("------------------------------------------------------------------------------"
				+ System.lineSeparator() + "Du nimmst die Tür im Westen. " + System.lineSeparator()
				+ "------------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "Nachdem du durch die Tür gehst, hörst du, wie sie sich hinter dir schließt. "
				+ System.lineSeparator()
				+ "------------------------------------------------------------------------------"
				+ System.lineSeparator() + "Vor dir erkennst du ein Mann, der dir immer näher kommt."
				+ System.lineSeparator()
				+ "------------------------------------------------------------------------------"
				+ System.lineSeparator() + "Er beginnt zu reden: ");
		System.out.println(st1.getStory1());
	}

	public void storyNorden() {
		Spieler s1 = new Spieler();
		Story st2 = new Story();
		st2.setStory2(
				"Du nimmst die Tür im Norden und bist im 2. Level."
				+ System.lineSeparator() + "Das zweite Level ist nun schon etwas schwieriger als das Erste, also pass auf."
				+ System.lineSeparator() + "------------------------------------------------------------------------------"
				+ System.lineSeparator() + "Nachdem du die Tür durchquert hast, hörst du, wie sie sich automatisch hinter dir schließt."
				+ System.lineSeparator() + "Es gibt kein Zurück."
				+ System.lineSeparator() + "Langsam gehst du in den Raum. Sehen ist hier unmöglich, der Raum ist zu dunkel. "
				+ System.lineSeparator() + "Nach ein paar Schritten spürst du, wie du auf eine Druckplatte trittst. "
				+ System.lineSeparator() + "Im Kreis aktivieren sich auf einmal die Feuerständer und vor dir "
				+ System.lineSeparator() + "bäumt sich ein großer schwarzer Hund mit drei Köpfen auf. Du fällst auf den Boden."
				+ System.lineSeparator() + "Du öffnest dein Inventar und wählst deine Waffe: "
				+ System.lineSeparator() + "------------------------------------------------------------------------------" 
				+ System.lineSeparator() + "1) " + s1.getWaffe1()
				+ System.lineSeparator() + "2) " + s1.getWaffe2()
				+ System.lineSeparator() + "3) " + s1.getWaffe3()
				);
		System.out.println(st2.getStory2());
	}
	
	public void storyNachErik() {
		Story st3 = new Story();
		Spieler s1 = new Spieler();
		Erik er1 = new Erik();
		Truhe t1 = new Truhe();
			
		
		
		st3.setStory3("Du gehst zu der Truhe, auf die Erik gezeigt hat und öffnest sie."
				+ System.lineSeparator() + "Hier findest du: " + t1.getItem1()
				+ System.lineSeparator() + "Nachdem du die Truhe gelootet hast, gehst du zum nächsten Raum. Bereit? (j/n)");
		
		System.out.println(st3.getStory3());
	}
	
	public void storyNeuerRaum() {
		Story st4 = new Story();
		Spieler s1 = new Spieler();
		Raum r1 = new Raum();
		Eingang e1 = new Eingang();
		
		
		
		st4.setStory4("Im neuen Raum angelangt, erkennst du, dass es ein runder Raum ist, in dessen Mitte sich ein schwarzes Objekt befindet."
				+ System.lineSeparator() + "Du fühlst dich davon angezogen und gehst darauf zu. Langsam spührst du,"
				+ System.lineSeparator() + "");
		System.out.println(st4.getStory4());
	}
	
	

	public void titeln() {
		Story titel = new Story();
		titel.setTitel(					   "|------------------------------Welcome to------------------------------|"
				+ System.lineSeparator() + "|----------------------------The Old Scrolls---------------------------|"
				+ System.lineSeparator() + "|----------------------------------------------------------------------|");
		System.out.println(titel.getTitel());
	}
	
	public String getStory1() {
		return story1;
	}

	public void setStory1(String story1) {
		this.story1 = story1;
	}
	
	public String getStory2() {
		return story2;
	}

	public void setStory2(String story2) {
		this.story2 = story2;
	}
	
	

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getStory3() {
		return story3;
	}

	public void setStory3(String story3) {
		this.story3 = story3;
	}

	public String getStory4() {
		return story4;
	}

	public void setStory4(String story4) {
		this.story4 = story4;
	}
	
	

	

}
