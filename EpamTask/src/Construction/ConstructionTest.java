package Construction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Interest.Interest;

class ConstructionTest {

	@Test
	public void test() {
		HouseConstructionCost test=new HouseConstructionCost();
		double output=test.constructionCost("ST",500,false);
		assertEquals(1000,output);
		
	}

}
