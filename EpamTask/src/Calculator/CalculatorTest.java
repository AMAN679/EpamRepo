package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int output=test.sumOfTwoNum(5, 60);
		assertEquals(65, output);
		output=test.divisonOfNum(25,5);
		assertEquals(5, output);
		output=test.multiplicationOfTwoNum(25,5);
		assertEquals(125, output);
	}

}
