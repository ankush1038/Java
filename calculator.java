import java.util.*;

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();


class Add extends Thread{
    public static void main(String[] args) {
        return a+b;
    }
}
class Subtract extends Thread{
    public static void main(String[] args) {
        return a-b;
    }
} 
class Mul extends Thread{
    public static void main(String[] args) {
        return a*b;
    }
}
class Div extends Thread{
    public static void main(String[] args) {
        return a/b;
    }
}

class calculator implements Thread{
    
}