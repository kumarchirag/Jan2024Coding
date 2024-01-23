// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        convertToDecimal(n);
        
    }
    
    public static void convertToDecimal(int a, int b){
        int nums = a;
        int base = b
        int sum = 0;
        int pw = 0; 
        
        while(nums !=0){
            int rem = nums%10;
            sum += (rem*(int)Math.pow(base,pw));
            nums /= 10;
            pw++;
            }
        System.out.println(sum);
    }
}
