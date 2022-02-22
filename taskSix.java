import java.util.Arrays;
import java.util.Scanner;


public class taskSix {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.print("Enter the size of your first integer array:");
        int sizeOfFirstArray = object.nextInt();
        int[] simpleFirstArray = new int[sizeOfFirstArray];
        System.out.print("Enter the size of your second integer array:");
        int sizeOfSecondArray = object.nextInt();
        int[] simpleSecondArray = new int[sizeOfSecondArray];
        arrayInput(simpleFirstArray,simpleSecondArray);
        ArrayOutput(simpleFirstArray,simpleSecondArray);
        newArray(simpleFirstArray,simpleSecondArray);
    }
    static void arrayInput(int[]array,int[]arraysecond){
        Scanner object=new Scanner(System.in);
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
    }
    static void ArrayOutput(int[] array,int[]arraysecond)
    {
        System.out.println();
        System.out.println("First array:");
        for (int k : array) {
            System.out.print("[" + k + "]");
        }
        System.out.println();
        System.out.println("Second array:");
        for (int j : arraysecond) {
            System.out.print("[" + j + "]");
        }
    }
    static void newArray(int []array,int []arraysecond){
        int[] result=new int[array.length+arraysecond.length];
        System.out.println("First array:");
        for (int j : array) {
            System.out.print("[" + j + "]");
        }
        System.out.println();
        System.out.println("Second array:");
        for (int j : arraysecond) {
            System.out.print("[" + j + "]");
        }
        System.out.println();
        System.arraycopy(array, 0, result, 0, array.length);
        System.arraycopy(arraysecond, 0, result, array.length, arraysecond.length);
        System.out.println("Combined array:"+Arrays.toString(result));
    }
}

