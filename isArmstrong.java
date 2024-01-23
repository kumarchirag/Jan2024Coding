// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        isArmstrong(370);
    }
    
    public static void isArmstrong(int a){
        int result = 0;
        int copy = a;
        while(a>0){
            int c = a%10;
            result = result + (int)Math.pow(c,3);
            a /=10;
        }
        
        if(copy == result){
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}
