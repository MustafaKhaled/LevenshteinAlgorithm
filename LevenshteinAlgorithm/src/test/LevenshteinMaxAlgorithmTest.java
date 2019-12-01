package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.levenshteinalgorithm.src.LevenshteinMaxAlgorithm;;

public class LevenshteinMaxAlgorithmTest {

	@Test
	public void LevenshteinAlgorithmTest1(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Maus";
		int maxDistance = 2;
		int result = LevenshteinMaxAlgorithm.computeLevenshteinDistanceWithMax(lhs, rhs, maxDistance);
		assertEquals(1, result);
	}
	
	
	@Test
	public void LevenshteinAlgorithmTest2(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Mausi";
		int maxDistance = 2;
		int result = LevenshteinMaxAlgorithm.computeLevenshteinDistanceWithMax(lhs, rhs,maxDistance);
		assertEquals(2, result);
	}

	@Test
	public void LevenshteinAlgorithmTest3(){
		CharSequence lhs = "Haus";
		CharSequence rhs = "Häuser";
		int maxDistance = 2;
		int result = LevenshteinMaxAlgorithm.computeLevenshteinDistanceWithMax(lhs, rhs,maxDistance);
		assertEquals(3, result);
	}
	
	@Test
	public void LevenshteinAlgorithmTest4(){
		CharSequence lhs = "Kartoffelsalat";
		CharSequence rhs = "Runkelrüben";
		int maxDistance = 2;
		int result = LevenshteinMaxAlgorithm.computeLevenshteinDistanceWithMax(lhs, rhs,maxDistance);
		assertEquals(3, result);
	}

}
