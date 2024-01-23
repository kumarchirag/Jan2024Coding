// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        printAllDivisors(25);
    }
    
    public static void printAllDivisors(int a){
        for(int i=1; i<= a/2; i++){
            if(a%i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print(a);
    }
}
