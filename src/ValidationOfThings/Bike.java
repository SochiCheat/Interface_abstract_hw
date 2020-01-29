package ValidationOfThings;

public class Bike extends Thing {
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;
	
	public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking) {
		super(name);
		this.age = age;
		this.isFrontBreakWorking= isFrontBreakWorking;
		this.isBackBreakWorking= isBackBreakWorking;
			
		}
	

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		if(age < 2 && (isFrontBreakWorking || isBackBreakWorking ) ) {
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public String toString() {
		String result;
		if(isValid()) {
			result = " valid";
		}else {
			result = " Not valid";
		}
		return super.toString() + result;
	}
	
}
