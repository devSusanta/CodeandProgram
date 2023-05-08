import java.util.*;
class Substring{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter your String in one line :");
        String str1 = sc.nextLine();
        
        System.out.print("Enter FirstWord Space SecondWord which you want to substring : ");
        String str2 = sc.next();
        String str3 = sc.next();
        
        String str4 = str1.substring(str1.indexOf(str2),str1.indexOf(str3));
        
        System.out.print(str4);
    }
}