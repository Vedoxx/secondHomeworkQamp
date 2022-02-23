import java.util.Scanner;


public class taskSeven {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the size of your first integer array:");
        int sizeOfFirstArray = object.nextInt();
        System.out.print("Enter the size of your second integer array:");
        int sizeOfSecondArray = object.nextInt();
        int[] simpleFirstArray = new int[sizeOfFirstArray];
        int[] simpleSecondArray = new int[sizeOfSecondArray];
        arrayInput( simpleFirstArray, simpleSecondArray);
        arrayAdd(simpleFirstArray,simpleSecondArray);
    }
    static void arrayInput( int[] array, int[] arraysecond) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter integer elements of your first array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = object.nextInt();
        }
        System.out.println("Enter integer elements of your second array:");
        for (int i = 0; i < arraysecond.length; i++) {
            arraysecond[i] = object.nextInt();
        }
    }
    static void arrayOutput(int []array,int[] arraySecond)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + arraySecond[i] + ",");
        }
    }
    static void arrayAddAtEnd(int []array,int[]arraySecond)
    {
     for(int i=0;i<arraySecond.length;i++)
     {
         System.out.print(array[i]+arraySecond[i]+",");
     }
        for(int i=arraySecond.length;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
   static void arrayAdd(int[] array, int[] arraysecond) {

        if(array.length==arraysecond.length) {
           arrayOutput(array,arraysecond);
        }
        if(array.length>arraysecond.length) {
          arrayAddAtEnd(array,arraysecond);
        }
        if(array.length<arraysecond.length)
        {
            arrayAddAtEnd(arraysecond,array);
        }
    }
}
