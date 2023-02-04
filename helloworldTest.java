/**
 * 
 */
package helloworld;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author mannadurai1
 *
 */
@SuppressWarnings("unused")
class helloworldTest {



	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void test() {
		Test();
	}
	private void Test() {
		// TODO Auto-generated method stub
		int i = 2;
		helloworld sq = new helloworld();
		if(sq.square(i) == i*i)
			System.out.println("The square is correctly printed which is "+i*i);
		else
			System.out.println("The Code is incorrect");
	}

	
}
