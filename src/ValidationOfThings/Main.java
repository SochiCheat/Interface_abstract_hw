package ValidationOfThings;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		allThings.add(new Bike("Gient",1,false,true));
		allThings.add(new Bike("Gient1",3,true,false));
		
		allThings.add(new RiceCooker("RiceCookerOne",3,100));
		allThings.add(new RiceCooker("RiceCookerTwo",6,700));
	
		allThings.add(new ITTeacher("Lavy",6,false));
		allThings.add(new ITTeacher("Tanghuot",1,true));
        for( int i = 0; i < allThings.size(); i++) {
        	System.out.println(allThings.get(i));
        }
	}

}

