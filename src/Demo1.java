void main(){
    int x = 2;
    System.out.println(x);      // 2
    System.out.println(x++);    // 2
    System.out.println(x);      // 3

    System.out.println("-------------");

    double y = 2.3;
    System.out.println(y);      // 2.3
    System.out.println(y++);    // 2.3
    System.out.println(y);      // 3.3

    System.out.println("-------------");

    char c = 65;
    System.out.println(c);      // A
    System.out.println(c++);    // A    We can also use postfix operators with char data type
    System.out.println(c);      // B
}