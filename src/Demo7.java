void main (){
    int x = 10;
//    String str = "abc" + (x + 5);
//    String str = "abc" + x * 5;
//    String str = "abc" + x - 5;
//    String str = "abc" + x + 5;   // abc105
    String str = x + 5 + "abc";     // 15abc
    System.out.println(str);
}