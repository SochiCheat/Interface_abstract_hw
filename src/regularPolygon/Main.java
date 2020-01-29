package regularPolygon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<RegularPolygon> arraySide = new ArrayList<RegularPolygon>();

		Square squarA = new Square(4);
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);

		arraySide.add(squarA);
		arraySide.add(equilateralTriangle);
		System.out.println("NumSides of RegularPolygon is :" + RegularPolygon.getTotalSides(arraySide));
		
	}

}
