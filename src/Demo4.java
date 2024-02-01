void main(){
    int x = 10;
    System.out.println(+x); // 10
    System.out.println(-x); // -10  This does not change the variable value
    System.out.println(x);  // 10

    System.out.println(+5); // 5
    System.out.println(-5); // -5

    System.out.println(5 + +2); // 7
    System.out.println(5 + -2); // 3

    System.out.println(-(2 * -3));  // 6
    System.out.println(-(2 * -3) * -x);  // -60
}