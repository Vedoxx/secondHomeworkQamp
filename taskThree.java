import java.util.Scanner;


public class taskThree {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer='Y';
        do {
            System.out.print("Enter the size of your integer array:");
            int sizeOfArray = object.nextInt();
            int[] simpleArray = new int[sizeOfArray];
            arrayInput(simpleArray);
            arrayInputReverse(simpleArray);
            System.out.println("Would you like to type again (Yes-y)(No-n)");
            System.out.print("Answer:");
            answer = object.next().charAt(0);
        }while(answer=='Y'||(answer=='y'));

    }
    static void arrayInput(int []array) {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter integer elements of your array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = object.nextInt();
        }
    }
    static void arrayInputReverse(int []array){
        Scanner object=new Scanner(System.in);
        System.out.println("Array in reverse:");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}
