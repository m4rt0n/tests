package test_package;

import java.util.ArrayList;
import java.util.List;


public class AnimalsMethods {
	
	public AnimalsMethods() {
		
		List<String> mammalList=new ArrayList<String>();
		mammalList.add("dog");
		mammalList.add("cat");
		mammalList.add("pig");
		
		List<String> reptileList=new ArrayList<String>();
		reptileList.add("snake");
		reptileList.add("turtle");
		reptileList.add("lizard");
		
		Animals a = new Animals();
		a.setMammals(mammalList);
		a.setReptiles(reptileList);
	}
	
	
}

