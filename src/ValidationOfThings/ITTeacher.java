package ValidationOfThings;


public  class ITTeacher extends Thing {
	
	private int yearsOfExperience;
	private boolean teaching;
	
	public ITTeacher(String name, int yearsOfExperience, boolean teaching ) {
		super(name);
		this.yearsOfExperience = yearsOfExperience;
		this.teaching= teaching;
		
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		if(yearsOfExperience > 2) {
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
