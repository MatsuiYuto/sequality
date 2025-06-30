package org.example;

public class Calculate {
  public int Sum(int x, int y) {
    return x + y;
  }

  public double Average(int sum, int num) {
    if (num != 0) {
      return (double) sum / num;
    } else {
      return 0.0;
    }
  }

  public int SumBetween(int start, int end) {
    if (start > end) {
      int tmp = start;
      start = end;
      end = tmp;
    }

    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public int OddSumBetween(int start, int end) {
    if (start > end) {
      int tmp = start;
      start = end;
      end = tmp;
    }

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }

  public int EvenSumBetween(int start, int end) {
    if (start > end) {
      int tmp = start;
      start = end;
      end = tmp;
    }

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
