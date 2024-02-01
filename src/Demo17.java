void main(){
    int x = 5, y = 2;
    x += x++ + ++y + x + y;
    System.out.println(x);

    x = 3; y = 2;
    int r = x++ + ++y;
    r += r > (x + y) ? x++: true ? !true ? x++ : x + y : y++ + x;
    System.out.println((r *= 2) + 5 + r + x - -y);
    System.out.println(STR."r=\{r}, x=\{x}, y=\{y}");
}