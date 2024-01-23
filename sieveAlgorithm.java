// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        sieveAlgorithm(100);
    }
    
    public static void sieveAlgorithm(int a){
        boolean[] arr = new boolean[a+1];
        Arrays.fill(arr,true);
        int count = 2;
        while(count<=a){
            
            if(arr[count]==true){
                for(int i=count+count; i<=a; i+=count){
                    arr[i]=false;
                }
                
                
            }
            count++;
        }
        
        for(int i=2; i<=a; i++ ){
            System.out.println(i+":"+arr[i]);
        }
        
        
    }
}
