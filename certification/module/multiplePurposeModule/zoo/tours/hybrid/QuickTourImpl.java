package zoo.tours.hybrid;

import zoo.tours.api.*;

public class QuickTourImpl implements Tour {
	public String name() {
		return "Short tour";
	}

	public int length() {
		return 30;
	}

	public Souvenir getSouvenir() {
		Souvenir gift = new Souvenir();
		gift.setDescription("keychain");
		return gift;
	}
}