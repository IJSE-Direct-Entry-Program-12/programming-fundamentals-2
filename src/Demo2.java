void main(){
    int x = 2;
    System.out.println(x);      // 2
    System.out.println(++x);    // 3
    System.out.println(x);      // 3

    System.out.println("------------");

    int y = 5;
    System.out.println(y);      // 5
    System.out.println(--y);    // 4
    System.out.println(y);      // 4

    System.out.println("------------");

    char c = 0;
    System.out.println(c);
    int charCode = c;
    System.out.println("CharCode: " + charCode);   // 0
    System.out.println(--c);
    charCode = c;
    System.out.println("CharCode: " + charCode);   // 1
    System.out.println(c);
}