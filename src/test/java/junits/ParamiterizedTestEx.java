package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamiterizedTestEx {
	
	@ValueSource(strings = {"radar","acca","abba"})
	@ParameterizedTest
	public void junit(String arg1) {
		
		assertTrue(StringFunctions.isPlaindrome(arg1));
	}
	
	
	@EnumSource(Month.class)
	@ParameterizedTest
	public void junit2(Month month) {
		
		System.out.println(month.getValue());
		
		 int monthNumber = month.getValue();
		 assertTrue(monthNumber >= 1 && monthNumber <= 12);
		
	}
	
	@EnumSource(value = Month.class, names = {"FEBRUARY"})
	@ParameterizedTest
	public void junit3(Month month) {
		
		assertEquals(month.length(false),28);
	}
	
	
	@CsvSource(value = {"test:Test:TEST"}, delimiter = ':')
	@ParameterizedTest
	public void junit4(String Exp, String Act, String description) {
		
		assertEquals(Exp,Act);
	}
	
	
	@MethodSource("DPMethod")
	@ParameterizedTest
	public void junit5(String arg1) {
		
		assertTrue(StringFunctions.isPlaindrome(arg1));
	}
	
	
	static Stream<String> DPMethod(){
		
		return Stream.of("racecar", "radar", "mom", "dad");
		
	}

}
