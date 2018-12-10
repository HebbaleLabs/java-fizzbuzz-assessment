package com.talfinder.assessment;


import static org.hamcrest.core.Is.is;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hbhargav on 10/12/18.
 */
public class FizzBuzzTest {
  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void evaluateFizzBuzzForZero(){
    List<String> expected = fizzBuzz.evaluateFizzBuzz(0 ,0);
    Assert.assertEquals("FizzBuzz", expected.get(0));
  }

  @Test
  public void evaluateFizzForPositiveRange() {
    List<String> expected = fizzBuzz.evaluateFizzBuzz(1 ,100);
    List<String> fizz = expected.stream()
        .filter(value -> value.equalsIgnoreCase("Fizz"))
        .collect(Collectors.toList());
    Assert.assertThat(fizz.size(), is(27));
  }

  @Test
  public void evaluateBuzzForPositiveRange() {
    List<String> expected = fizzBuzz.evaluateFizzBuzz(1 ,100);
    List<String> buzz = expected.stream()
        .filter(value -> value.equalsIgnoreCase("Buzz"))
        .collect(Collectors.toList());
    Assert.assertThat(buzz.size(), is(14));
  }

  @Test
  public void evaluateFizzBuzzForPositiveRange() {
    List<String> expected = fizzBuzz.evaluateFizzBuzz(1 ,100);
    List<String> fizzBuzz = expected.stream()
        .filter(value -> value.equalsIgnoreCase("FizzBuzz"))
        .collect(Collectors.toList());
    Assert.assertThat(fizzBuzz.size(), is(6));
  }

  @Test
  public void evaluateFizzAndBuzzForNegativeRange() {
    List<String> actual = Arrays.asList("Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz","FizzBuzz","Fizz","Buzz","Fizz","Fizz","Buzz","Fizz");
    List<String> expected = fizzBuzz.evaluateFizzBuzz(-100 ,-1);
    List<String> fizzBuzz = expected.stream()
        .filter(value -> value.matches("FizzBuzz|Fizz|Buzz"))
        .collect(Collectors.toList());
    Assert.assertThat(actual, is(fizzBuzz));
  }

  @Test
  public void evaluateFizzAndBuzzForPositiveRange() {
    List<String> actual = Arrays.asList("Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz", "Fizz", "Buzz", "Fizz", "Fizz", "Buzz");
    List<String> expected = fizzBuzz.evaluateFizzBuzz(1 ,100);
    List<String> fizzBuzz = expected.stream()
        .filter(value -> value.matches("FizzBuzz|Fizz|Buzz"))
        .collect(Collectors.toList());
    Assert.assertThat(actual, is(fizzBuzz));
  }
}
