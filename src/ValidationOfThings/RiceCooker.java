package ValidationOfThings;

public  class RiceCooker extends Thing {

	private int age;
	private int numberOfUse;
	
	public RiceCooker(String name, int age, int numberOfUse) {
		super(name);
		this.age = age;
		this.numberOfUse= numberOfUse;
	
	}
	
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		if(age < 5 && (numberOfUse < 500) ) {
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
