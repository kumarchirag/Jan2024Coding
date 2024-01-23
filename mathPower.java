// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        mathPower(2,10);
    }
    
    public static void mathPower(int a, int b){
        int result = 1;
        for(int i=1; i<=b; i++){
            result *= a;;
            }
            
        System.out.println(result);
    }
}
