package domain;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.model.Country;

public class goAwayTest {

	@Test
	public void testMultiplication() {
		Destination hundred = Destination.Italy(100);
		assertEquals(Destination.Italy(200), hundred.times(2));
	}
}

