import java.lang.Thread;

class ThreadQ extends Thread {
    int sum;
    public void run(){
        for(int i=1;i<=10;i++){
            sum+=i;
            System.out.println(sum);
            
        }
    }
}
public class Main{
    public static void main(String[] args) {
        ThreadQ t1= new ThreadQ();
        t1.start();
        int num=0;
        for(int i=0;i<=10;i++){
            num+=i;
            System.out.println(num);
            System.out.println("Hello World");
        }
        
    }

}