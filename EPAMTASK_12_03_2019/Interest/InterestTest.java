package Interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculator.Calculator;

class InterestTest {

	@Test
	public void test() {
		Interest test=new Interest();
		double output=test.simpleInterest(500,20, 10);
		assertEquals(1000,output);
				
	}

}
