package regularPolygon;

public abstract class Refactoring implements RegularPolygon{
  int getSideLength;
  public Refactoring( int getSideLength) {
	  this.getSideLength = getSideLength;
  }
	@Override
	public int getSideLength() {
		
		return getSideLength;
	}
  
}
