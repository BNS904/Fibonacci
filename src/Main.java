import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the Fibonacci program.");
        System.out.println("Please enter the sequence number of your desired fibonacci number if not already entered.");


        if (args.length > 0) {
            try {
                input = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Input must be an integer, please try again");
                System.exit(1);
            }
        }
        else {
            input = scanner.nextInt();
        }
        
        System.out.println("The " + input + " number of the fibonacci sequence is " + fibonacciFinder(input));

    }
    public static  int fibonacciFinder(int sequenceNum) {
        int f0 = 0;
        int f1 = 1;
        int fn;

        if (sequenceNum == 0) {
            return f0;
        }

        for (int i = 2; i <= sequenceNum; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;

        }
        return f1;
    }
}