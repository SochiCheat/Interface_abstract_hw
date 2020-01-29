package ValidationOfThings;


public abstract class Thing implements Validable{
	public String name;
	  public Thing(String name){
		  this.name = name;
	    }
	  public String toString() {
		  return "Name is: " + name;
	  }
}
