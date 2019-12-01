package test;
import static org.junit.Assert.*;
import com.levenshteinalgorithm.src.*;
import org.junit.Test;


public class LevenshteinAlgorithmTest {
	

	@Test
	public void LevenshteinAlgorithmTest1(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Maus";
		int result = LevenshteinAlgorithm.computeLevenshteinDistance(lhs, rhs);
		assertEquals(1, result);
	}
	
	
	@Test
	public void LevenshteinAlgorithmTest2(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Mausi";
		int result = LevenshteinAlgorithm.computeLevenshteinDistance(lhs, rhs);
		assertEquals(2, result);
	}

	@Test
	public void LevenshteinAlgorithmTest3(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Häuser";
		int result = LevenshteinAlgorithm.computeLevenshteinDistance(lhs, rhs);
		assertEquals(3, result);
	}
	
	@Test
	public void LevenshteinAlgorithmTest4(){
		CharSequence lhs = "Kartoffelsalat";
		CharSequence rhs = "Runkelrüben";
		int result = LevenshteinAlgorithm.computeLevenshteinDistance(lhs, rhs);
		assertEquals(12, result);
	}
}
