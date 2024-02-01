void main(){
    int x = 2, y = 3;

    System.out.println(x++ > (--y -1) ? false ? (x+y) : (x * y) : (x + y > 3) ? (x++ + y) : (y++ + x));

    System.out.println("x=" + x);
    System.out.println("y=" + y);
}