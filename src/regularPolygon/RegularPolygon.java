package regularPolygon;
import java.util.ArrayList;

public interface RegularPolygon {
	int getNumSides();
	int getSideLength();
	
	public static int getTotalSides(ArrayList< RegularPolygon> arraySide) {
		int countSide = 0;
	   for (RegularPolygon regularPolygon : arraySide) {
		countSide += regularPolygon.getNumSides();
	}	
	   return countSide;
	}
}
