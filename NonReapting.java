

// Given a string we have to find out the character which is non-repeating from left to right.

public class NonReapting {
    public static void main(String[] args) {
        String str= new String("abdxfxaab");
        for(int i=0;i<str.length();i++){
            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                    
                }
            }
            if(count==1){
                System.out.println(i);
            }
        }
           }
}

