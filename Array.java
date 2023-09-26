import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    //int arr[]={5,2,1,4,3};
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        int b=sc.nextInt();
        arr[i]=b;
    }
    for(int i=0;i<n;i++){
        int prod=1;
        for(int j=0;j<n-1;j++){
            if(j!=i){
                prod*=arr[j];
            }
        }
        System.out.println(prod);
    }
    sc.close();
}
}
