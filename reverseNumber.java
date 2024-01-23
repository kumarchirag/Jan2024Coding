// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        reverseNumber(987654321);
    }
    
    public static void reverseNumber(int a){
        int num = a;
        int result =0;
        while(num>0){
            int b = num%10;
            result *= 10;
            result +=b;
            num /=10;
        }
        System.out.println(result);
    }
}
