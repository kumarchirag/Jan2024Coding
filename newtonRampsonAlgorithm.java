// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        double numRes = newtonRampson(25);
        System.out.printf("%.3f%n",numRes);
    }
    
    public static double newtonRampson(int a){
        double toll = 0.0001;
        double root;
        double X =a;
        while(true){
            root = 0.5 *(X+(a/X));
            double ans = X-root;
            if(ans < toll){
                break;
            }
            X = root;
        }
        return root;
    }
}
