public class AutoPolicy{
	int accountNumber;
	String makeAndModel;
	String state;

	public AutoPolicy(int accountNumber, String makeAndModel, String state){
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
		System.out.printf("%d is the new account number", accountNumber);
	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public void setState(String state){
		this.state = state;
		System.out.printf("%s is the new state", state);
	}

	public String getState(){
		return state;
	}

	public void setMakeAndModel(String mm){
		this.makeAndModel = mm;
	}

	public String getMakeAndModel(){
		return makeAndModel;
	}

	public boolean isNoFaultState(){
		boolean noFaultState = false;
		switch(getState()){
			case "MA":
			case "NJ":
			case "NY":
			case "PA":
				noFaultState = true;
				break;
		} // end switch
		return noFaultState;
	}
} // end class
