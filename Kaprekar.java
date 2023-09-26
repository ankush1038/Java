public class Kaprekar {
    public static void main(Stringname[] args){
        int n=45;
        int m=n*n;
        int a;
        int b;
        int temp=0;
        for(int i=1;i<m;i=i*10){
            
            a=m/i;
            
            b=m%i;
            
            if(a+b==n){
                temp=1;
                break;
                 }
        }
        if(temp==1){
            System.out.println("Kaprekar number");
        }
        else{
            System.out.println("Not a Kaprekar number");
        }
        
    }
}
