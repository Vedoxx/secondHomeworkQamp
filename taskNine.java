
import java.util.Scanner;

public class taskNine {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the size of your first integer array:");
        int sizeOfFirstArray = object.nextInt();
        System.out.print("Enter the size of your second integer array:");
        int sizeOfSecondArray = object.nextInt();
        int[] simpleFirstArray = new int[sizeOfFirstArray];
        int[] simpleSecondArray = new int[sizeOfSecondArray];
        arrayInput(simpleFirstArray, simpleSecondArray);
        int result=sum(simpleFirstArray,simpleSecondArray);
        System.out.println("Total:"+result);
    }
    static void arrayInput(int[] array, int[] arraysecond) {
        Scanner object = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter integer elements of your first array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = object.nextInt();
        }
        System.out.println("Enter integer elements of your second array:");
        for (int i = 0; i < arraysecond.length; i++) {
            arraysecond[i] = object.nextInt();
        }
    }
    static int sum(int[]array,int[]arraysecond)
    {
        int sum=0;
        for(int j=0;j<arraysecond.length;j++)
        {
            for(int i=0;i<array.length;i++) {

                sum = sum + array[i] + arraysecond[j];
            }
        }
        return sum;
    }
}

