package test;

import junit.framework.TestCase;
import main.ComplimentMachine;

public class ComplimentMachineTest extends TestCase {
	public void testGetCompliment() {
		String path = "src/kompliment.csv";
		ComplimentMachine machine = new ComplimentMachine(path);
		String compliment = machine.getCompliment();
		System.out.println(compliment);
		assertNotNull(compliment);
	}
}