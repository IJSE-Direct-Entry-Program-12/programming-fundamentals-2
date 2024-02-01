void main(){
    int x = 3, y = 2;
    int a = (x + (y*= 2)) <= 51 % 43 || x++ + ++y < x + (y += 5) ? x + y : x - y;
    a -= a += x + (y += (x + 2));
    System.out.println(STR."a=\{a}, x=\{x}, y=\{y}");
}