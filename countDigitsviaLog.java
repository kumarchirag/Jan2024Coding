// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        countDigitsViaLog(14578);
    }
    
    public static void countDigitsViaLog(int a){
        if(a==0){
            System.out.println("1");
            return;
        }
        int count = (int)(Math.log(a)/Math.log(10)) +1;
        System.out.println(count);
        
    }
}
