import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        int zero_count=0;
        int prod=1;

        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            arr[i]=b;
            if(arr[i]!=0){
                prod*=arr[i];
            }
            else{
                zero_count++;
            }
        }
        for(int i=0;i<n;i++){
            if(zero_count>1){
                System.out.println(0+" ");
            }
            else if(zero_count==1){
              if(arr[i]==0){
                System.out.println(prod + " ");
              }
                else{
                    System.out.println(0+ " ");
                }
        
            }
                
            else{
                System.out.println((prod/arr[i])+" "); 
            }
        }
        sc.close();
    }
}
