import java.util.Scanner;


public class taskThree {
    static void arrayInputReverse(int []array,int size){
        Scanner object=new Scanner(System.in);
        System.out.println("Type elements of you array:");
        for(int i=0;i<size;i++)
        {
           array[i]=object.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Array in reverse:");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer='Y';
        do {
            System.out.print("Enter the size of your integer array:");
            int sizeOfArray = object.nextInt();
            int[] simpleArray = new int[sizeOfArray];
            arrayInputReverse(simpleArray,sizeOfArray);
            System.out.println("Would you like to type again (Yes-y)(No-n)");
            answer = object.next().charAt(0);
        }while(answer=='Y'||(answer=='y'));

    }
}
