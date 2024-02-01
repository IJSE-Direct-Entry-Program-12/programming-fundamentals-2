void main (){
    int x = 5;
    System.out.println(x * 2);  // 10
    System.out.println(x);      // 5

    System.out.println(x * 5 / 2 * 2);
    System.out.println(25 / 2);
    System.out.println(25 / 2.);

    System.out.println(x++ * 2 / (x=--x) * x);

    System.out.println(10 % 3);
    System.out.println(10 % 7);

    x = 5;
    int y = 2;

    System.out.println(++x * -(y = y * (10 % 7)) + y + ++x / 2.);
}