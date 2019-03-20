package com.talfinder.assessment;


import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by hbhargav on 10/12/18.
 */
@RunWith(Parameterized.class)
public class FizzBuzzTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {0, 0, new ArrayList<>(Arrays.asList("FizzBuzz"))},
        {1, 10, new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"))},
        {-10, 10, new ArrayList<>(Arrays.asList("Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1", "FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"))},
        {1, 100, new ArrayList<>(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"))},
        {-50, 0, new ArrayList<>(Arrays.asList("Buzz", "-49", "Fizz", "-47", "-46", "FizzBuzz", "-44", "-43", "Fizz", "-41", "Buzz", "Fizz", "-38", "-37", "Fizz", "Buzz", "-34", "Fizz", "-32", "-31", "FizzBuzz", "-29", "-28", "Fizz", "-26", "Buzz", "Fizz", "-23", "-22", "Fizz", "Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1", "FizzBuzz"))}
    });
  }

  int minValue;
  int maxValue;
  List<String> expectedValue;

  public FizzBuzzTest(int minValue, int maxValue, List<String> expectedValue) {
    this.minValue = minValue;
    this.maxValue = maxValue;
    this.expectedValue = expectedValue;
  }

  @Test
  public void evaluateFizzBuzzForZero(){
    Assert.assertEquals("input:Starting from '" + minValue +"' to '" + maxValue + "'" , expectedValue, FizzBuzz.evaluateFizzBuzz(minValue, maxValue));
  }
}
