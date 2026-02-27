public class MathDemo {
    public static int min(int a, int b){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }
    
    public static int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static int sum(int [] args){
        int total = 0;
        for (int i = 0; i < args.length; i++){
            total += args[i];
        }
        return total;
    }

    public static float mean(int [] args){
        int total = sum(args);

        return (float) total / args.length;

    }
    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

     public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8};

        System.out.println("Min: " + MathDemo.min(5, 3));
        System.out.println("Max: " + MathDemo.max(5, 3));
        System.out.println("Sum: " + MathDemo.sum(numbers));
        System.out.println("Mean: " + MathDemo.mean(numbers));
        System.out.println("Factorial: " + MathDemo.factorial(5));
    }

}

