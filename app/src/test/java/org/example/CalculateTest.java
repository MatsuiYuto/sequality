package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();

    assertEquals(2.5, calculate.average(5, 2), 0.0001);
    assertEquals(0.0, calculate.average(10, 0), 0.0001);
  }

  @Test
  public void testSumBetween() {
    Calculate calculate = new Calculate();

    assertEquals(55, calculate.sumBetween(1, 10));
    assertEquals(65, calculate.sumBetween(11, 2));
  }

  @Test
  public void testOddSumBetween() {
    Calculate calculate = new Calculate();

    assertEquals(25, calculate.oddSumBetween(1, 10));
    assertEquals(35, calculate.oddSumBetween(11, 2));
  }

  @Test
  public void testEvenSumBetween() {
    Calculate calculate = new Calculate();

    assertEquals(30, calculate.evenSumBetween(1, 10));
    assertEquals(30, calculate.evenSumBetween(11, 2));
  }
}
