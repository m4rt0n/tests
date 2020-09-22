package test_package;

import java.util.ArrayList;
import java.util.List;

public class Animals {

	private List<String> mammals;
	private List<String> reptiles;

	public Animals() {

	}

	public Animals(List<String> mammals, List<String> reptiles) {

		this.mammals = mammals;
		this.reptiles = reptiles;

	}

	public List<String> getMammals() {
		return mammals;
	}

	public void setMammals(List<String> mammals) {
		this.mammals = mammals;
	}

	public List<String> getReptiles() {
		return reptiles;
	}

	public void setReptiles(List<String> reptiles) {
		this.reptiles = reptiles;
	}
}
