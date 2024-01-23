// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        isPalindrome(1);
    }
    
    public static void isPalindrome(int a){
        int copy =a;
        int result = 0;
        
        while(a>0){
            int c = a%10;
            result = result*10 +c;
            a /=10;
        }
        
        if(result == copy){
            System.out.println("True");
            return;
        }
        
        System.out.println("False"); 
    }
}
