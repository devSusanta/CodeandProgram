import java.util.*;
class StringPalindrome{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the Word : ");
        String str1 = sc.next();
        String str2 =  "";
        for(int i = (str1.length() -1);i>=0;i--){
            str2 = str2 + str1.charAt(i);
        }
        if(str1.compareTo(str2) == 0){
            System.out.print(str1 + " is a Palindrome String.");
        }else{
            System.out.print(str1 + " is not a Palindrome String");
        }
    }
}