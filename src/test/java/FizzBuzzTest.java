import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzbuzz;

	@Before
	public void setUp() throws Exception {
		fizzbuzz=new FizzBuzz();
	}

	@Test
	public void testFizz() {
		assertThat(fizzbuzz.FizzBuzz(3), is("fizz"));
	}
	@Test
	public void testBuzz() {
		assertThat(fizzbuzz.FizzBuzz(5), is("buzz"));
	}
	@Test
	public void testFizzBuzz() {
		assertThat(fizzbuzz.FizzBuzz(15), is("fizzbuzz"));
	}
	@Test
	public void testWhenZero() {
		assertThat(fizzbuzz.FizzBuzz(7), is("7"));
		}
	}
	
	


