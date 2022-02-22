import java.util.Scanner;


public class taskFive {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer='Y';
        do{

        System.out.print("Enter lower number in range:");
        int lowerRange= object.nextInt();
        System.out.print("Enter larger number in range:");
        int upperRange= object.nextInt();
        int[] simpleArray = new int[upperRange];
        System.out.print("Even numbers from range "+lowerRange+ " to "+upperRange+":");
        for(int i=lowerRange+1;i<upperRange;i++)
        {
            if(i%2==0)
            {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        System.out.println("Would you like to type again (Yes-y)(No-y)");
        System.out.print("Answer:");
        answer = object.next().charAt(0);
    }while(answer=='Y'||(answer=='y'));
    }
}
