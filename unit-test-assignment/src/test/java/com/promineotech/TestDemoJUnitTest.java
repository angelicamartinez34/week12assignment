package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class TestDemoJUnitTest {
	
	private TestDemo testDemo;
	

	@BeforeEach
	public void setUp()  {
		testDemo = new TestDemo();
		
		//this method runs before each test method and uses the testdemo class for each method
	}

	@ParameterizedTest
	@MethodSource("argumentsForAddPositive")

    public void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
	if(!expectException) {
		assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
	}
	else {
	
	assertThatThrownBy(() ->

    testDemo.addPositive(a, b))

        .isInstanceOf(IllegalArgumentException.class);
	}
	  
	}

	 static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments (2,4,6, false),
				arguments (5,5,10, false),
				arguments (260, 340,600, false)
			
				// this test method returns a stream of arguments withe some integers and the expected result
				
				);
		
	}

	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(10,5)).isEqualTo(15);
        assertThat(testDemo.addPositive(200,50)).isEqualTo(250);
        assertThat(testDemo.addPositive(46,65)).isEqualTo(111);
        assertThat(testDemo.addPositive(3,344)).isEqualTo(347);
	}
	// this test checks if the addPositive method adds the positive numbers correctly
	
	@Test 
	void testMultiplyNumbers() {
		assertThat(TestDemo.multiplyNumbers(5, 25)).isEqualTo(125);
		assertThat(TestDemo.multiplyNumbers(15, 2)).isEqualTo(30);
		assertThat(TestDemo.multiplyNumbers(6, 11)).isEqualTo(66);
		
		// this test will use the given numbers and make sure the outcome is correct
	}
	
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo testDemo = new TestDemo();
		TestDemo mockDemo = spy(testDemo);
		
		doReturn(5).when(mockDemo).getRandomInt();
		
		int fiveSquared = mockDemo.randomNumberSquared();
		
		assertThat(fiveSquared).isEqualTo(25);
	}
}
// this test cehcks that randomNumbersquared method from testDemo squares the random number correctly 
// and uses mockito to mock the getrandomInt method

