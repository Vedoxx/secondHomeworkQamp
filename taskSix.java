import java.util.Arrays;
import java.util.Scanner;


public class taskSix {
    static void arrayInputOutput(int sizeOne,int []array,int []arraysecond,int sizeSecond){
        Scanner object=new Scanner(System.in);
        int counter=0;
        System.out.println("Enter integer elements of your first array:");
        for(int i=0;i<array.length;i++)
        {
            array[i]=object.nextInt();
        }
        System.out.println("Enter integer elements of your second array:");
        for(int i=0;i<arraysecond.length;i++)
        {
            arraysecond[i]=object.nextInt();
        }
        int[] result=new int[sizeOne+sizeSecond];
        System.out.println("First array:");
        for(int i=0;i<sizeOne;i++)
        {
            System.out.print("["+array[i]+"]");
        }
        System.out.println();
        System.out.println("Second array:");
        for(int i=0;i<sizeSecond;i++)
        {
            System.out.print("["+arraysecond[i]+"]");
        }
        System.out.println();
        System.arraycopy(array, 0, result, 0, sizeOne);
        System.arraycopy(arraysecond, 0, result, sizeOne, sizeSecond);
        System.out.println("Combined array:"+Arrays.toString(result));
    }
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.print("Enter the size of your first integer array:");
        int sizeOfFirstArray = object.nextInt();
        System.out.print("Enter the size of your second integer array:");
        int sizeOfSecondArray = object.nextInt();

        int[] simpleFirstArray = new int[sizeOfFirstArray];
        int[] simpleSecondArray = new int[sizeOfSecondArray];
        arrayInputOutput(sizeOfFirstArray,simpleFirstArray,simpleSecondArray,sizeOfSecondArray);
    }
}
