public class HelloString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        str= 'Y' + str.substring(1);
        System.out.println(str);
        // str=str.substring(1,str.length()-1)+'w';
        str+='w';
        System.out.println(str);
        str = str.charAt(str.length()-1)+ str.substring(1, str.length()-1)+str.charAt(0);
        System.out.println(str);
        }
}

// Given a string we have to find out the character which is non-repeating from left to right.
