//All operators in Java

import java.util.*;
class Operator{
    public static void main(String args[]){
        //new Declaration
        Scanner sc = new Scanner(System.in);
        
        //variable declaration
        int a,b,c,s,m,d,md,i,j,k;
        
        //arithmetic operator
        a = 2 + 2; //addition operator
        s = 2 - 2; //subtraction operator
        m = 2 * 2; //multiplication operator
        d = 2 / 2; //division operator
        md = 2 % 2; //module division operator 
        
        //printing statement
        System.out.println(a);
        System.out.println(s);
        System.out.println(m);
        System.out.println(d);
        System.out.println(md);
        
        //unary ooerator
        b = ++a; //Pre increment operator
        System.out.println(b);
        System.out.println(a);
        b = --a; //Pre decrement operator
        System.out.println(b);
        System.out.println(a);
        b = a++; //incrent operator/post increment operator
        System.out.println(b);
        System.out.println(a);
        b = a--; //decrement operator/post incrent operator
        System.out.println(b);
        System.out.println(a);
        
        //assignment operator
        b = a; //the value of a is assigned to b
        System.out.println(b);
        //assignment with arithmetic
        b += a; //it is the short writing method of b = b + a;
        System.out.println(b);
        // also with other operator
        b -= a;
        System.out.println(b);
        b *= a;
        System.out.println(b);
        b /= a;
        System.out.println(b);
        b %= a;
        System.out.println(b);
        
        //Conditional Operator
        // <, >, !, ==, <=, >=, !=, &&, ||
        
        
        //bitwise operator
        i = 4;
        j = 5;
        
        k = i & j; //and bit ooerator
        System.out.println(k);
        k = i | j; //or bit ooerator
        System.out.println(k);
        k = ~i; //not bit ooerator/compleament operator
        System.out.println(k);
        k = i >> 1; //right shift ooerator
        System.out.println(k);
        k = i << 1; //right shift ooerator
        System.out.println(k);
        
        //Get bit Method on Bit Manipulation
        i = 5;
        j = 1 << 3;
        boolean bool = (j & i) == 0;
        if(bool){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        
        //Set bit method on Bit Manipulation
        i = 5;
        j = 1 << 3;
        k =(j | i);
        System.out.println(k);
        
        //Clear bit method on Bit Manipulation
        i = 5;
        j = 1 << 0;
        k = ~j;
        k = (i & k);
        System.out.println(k);
        
        //Update Bit method on Bit Manipulation
        i = 5;
        j = 1 << 1;
        int op = sc.nextInt();
        if(op == 1){ //what to update on the position 1 
            k = (j | i);
        }else{
            k = ~j;
            k =(i & k);
        }
        System.out.println(k);
        
        //Invert Bit method on Bit Manipulation
        i = 5;
        j = 1 << 1;
        if((i & j)==0){ //checking bit on the position
            k = (j | i);
        }else{
            k = ~j;
            k =(i & k);
        }
        System.out.print(k);
        
    }
}