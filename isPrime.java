// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        isPrime(48);
    }
    
    public static void isPrime(int a){
        for(int i=2; i*i<=a; i++){
            if(a % i ==0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
