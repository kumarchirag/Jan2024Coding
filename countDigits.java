// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        countDigits(0);
    }
    
    public static void countDigits(int a){
        if(a==0){
            System.out.println("1");
            return;
        }
        int count =0;
        int num = a;
        while(num > 0){
            num /=10;
            count++;
        }
        System.out.println(count);
        
    }
}
