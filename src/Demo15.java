void main() {
    int a = 5, b = 2;
    System.out.println((a + b > ++b * 3 % a && b++ + ++a >= a-b ? a+b : a+++b > a ? b : a++) % b);

    // via Concatenation
    System.out.println("a=" + a);
    System.out.println("b=" + b);

    // via TextInterpolation (Since Java 21)
    System.out.println(STR."a=\{a}");
    System.out.println(STR."b=\{b}");
}