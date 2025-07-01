package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int sum, int num) {
    if (num != 0) {
      return (double) sum / num;
    } else {
      return 0.0;
    }
  }

  public int sumBetween(int start, int end) {
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

  public int oddSumBetween(int start, int end) {
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

  public int evenSumBetween(int start, int end) {
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
