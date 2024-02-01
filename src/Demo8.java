void main() {
    int x, y;

    x = 2; y = 3;
    System.out.println(x++ + ++x + y + --y + ++x + x + ++y + y);

    x = 2; y =3;
    System.out.println(x * --y + ++x * 2 * y++ % 7 - (x = ++y + -x) + x++);
}