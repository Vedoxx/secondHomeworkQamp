import java.util.Scanner;


public class BonusBonusaTaskTen {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        char answer = 'Y';
        do {
            System.out.print("Enter lower number in range:");
            int lowerRange = object.nextInt();
            System.out.print("Enter larger number in range:");
            int upperRange = object.nextInt();
            int[] simpleArray = new int[upperRange];
            for(int i=lowerRange;i<=upperRange;i++){
                if((i%3==0)&&(i%5==0))
                {
                    System.out.println("Fizzbuzz");
                }
                else if(i%3==0)
                {
                    System.out.println("Fizz");
                }
                else if(i%5==0)
                {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Numbers not listed:");
            for(int i=lowerRange;i<=upperRange;i++)
            {
                if((i%3==0)||(i%5==0))
                {
                    System.out.println(i);
                }

            }
            System.out.println("Would you like to type again (Yes-y)(No-y)");
            System.out.print("Answer:");
            answer = object.next().charAt(0);
        } while (answer == 'Y' || (answer == 'y'));
    }
}
