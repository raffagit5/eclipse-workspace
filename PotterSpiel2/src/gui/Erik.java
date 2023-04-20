package gui;

public class Erik {
	private String dialog;
	private String antwort;
	private boolean chestDiscovered;

	public String getDialog() {
		return dialog;
	}

	public void setDialog(String pDialog) {
		dialog = pDialog;
	}

	public void mitErikReden() {
		Erik er1 = new Erik();
		er1.setDialog("Hallo, ich bin Erik. Ich passe auf diese heiligen Hallen auf und beschütze sie vor angreifern. "
				+ System.lineSeparator()
				+ "--------------------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "Mein Leben lang bin ich schon hier und noch nie habe ich irgendjemanden durchgelassen."
				+ System.lineSeparator() + "Rede, was willst du hier? Willst du mich bestehlen?"
				+ System.lineSeparator()
				+ "--------------------------------------------------------------------------------------"
				+ System.lineSeparator()
				+ "a) - Dich bestehlen? Nein. Ich möchte nur das Ende dieser Katakompten finden. -"
				+ System.lineSeparator()
				+ "--------------------------------------------------------------------------------------"
				+ System.lineSeparator() + "b) - Wenn du schon danach fragst, gib mir alles was du hast. Sofort! -"
				+ System.lineSeparator()
				+ "--------------------------------------------------------------------------------------");
		System.out.println(er1.getDialog());
	}

	public String getAntwort() {
		return antwort;
	}

	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}

	public boolean getChestDiscovered() {
		return chestDiscovered;
	}

	public void setChestDiscovered(boolean chestDiscovered) {
		this.chestDiscovered = chestDiscovered;
	}
	
	

}
