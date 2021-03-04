package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInterface {

	
	@Test
	default void testPlaindrome(){
		
		
		assertTrue(StringFunctions.isPlaindrome("radar"));
		assertFalse(StringFunctions.isPlaindrome("sadasdas34"));
		
		System.out.println("Inside Interface");
	}
}
