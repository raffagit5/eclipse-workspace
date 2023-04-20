package gui;

public class Eingang {
	private String eingang, ausgang, level;
	private boolean offen, geschlossen;
	private boolean levelEntered = false;
	

	public String getEingang() {
		return eingang;
	}

	public void setEingang(String eingang) {
		this.eingang = eingang;
	}

	public String getAusgang() {
		return ausgang;
	}

	public void setAusgang(String ausgang) {
		this.ausgang = ausgang;
	}

	public boolean getOffen() {
		return offen;
	}

	public void setOffen(boolean offen) {
		this.offen = offen;
	}

	public boolean getGeschlossen() {
		return geschlossen;
	}

	public void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public boolean getLevelEntered() {
		return levelEntered;
	}

	public void setLevelEntered(boolean levelEntered) {
		this.levelEntered = levelEntered;
	}
	
	
}
