public class AutoPolicyTest{
	public static void policyInNoFaultState(AutoPolicy policy){
		System.out.printf("Account %d - Car %s - State %s%nCar %s in a no fault state", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	} // end 

	public static void main(String[] args){
		AutoPolicy policy1 = new AutoPolicy(11111, "Ferrari", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222, "Volkswagen", "ME");
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	} // end main
} // end class
