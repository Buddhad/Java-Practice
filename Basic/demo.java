class demo {
  int d, e;

  void greater(int a, int b) {
    d = a;
    e = b;
    if (a >= b) {
      System.out.println(a + "is greater number:" + d);
    } else {
      System.out.println("is greater numer" + e);
    }
  }

  void factorial(int n) {
    d = n;
    int f = 1, i;
    for (i = 1; i <= n; i++) {
      f = f * i;
    }

    System.out.println("Factorial of " + n + "is:" + f);
  }

  public static void main(String[] args) {
    demo obj = new demo();
    obj.factorial(5);
    obj.greater(3, 5);
  }
}
