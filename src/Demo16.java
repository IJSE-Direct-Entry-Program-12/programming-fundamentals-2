void main(){
    int x = 5;              // Local Variable Declaration Statement
    //x = x + 2;              // Assignment Expression Statement
    x += 2;
    System.out.println(x);  // 7 (Method Invocation Expression Statement)

    boolean flag = true;
    flag |= flag;           // flag = flag | flag
    System.out.println(flag);

    // Assignment operator can be used as a statement as well as within an expression
//    x++;                    // Postfix Increment Expression Statement
//    x--;                    // Postfix Decrement Expression Statement
//    ++x;                    // Prefix Increment Expression Statement
//    --x;                    // Prefix Decrement Expression Statement
//    System.out.println(8 + 2);
//    System.out.println(x = 8+ 2);
//    System.out.println(x);
}