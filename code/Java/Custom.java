import java.util.*;

public class Custom {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        System.out.print("Fibonacci of "+a+" is "+ fibonacci(a));
    }
    public static double fibonacci(int n){
        int f1 = 0, f2 = 1,temp = 0;
        boolean neg = false;
        double c = 0;
        if(n<f1){
            n = -(n);
            neg = true;
        }else if(n==f1){
            return 0;
        }else if(n==f2){
            return 1;
        }
        for(int i = 2;i<=n;i++){
            c = f1 + f2;
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        if(neg && n%2==0){
            c = -(c);
        }
        return c;
    }
}