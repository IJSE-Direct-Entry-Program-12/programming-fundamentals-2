void main(){
    int x = 10;             // 0000_1010
    int y = 4;              // 0000_0100

    System.out.println(x & y);
    System.out.println(x | y);
    System.out.println(x ^ y);

    System.out.println(x++ > 5 & y++ <2);
    System.out.println(x);  // 11
    System.out.println(y);  // 5
}