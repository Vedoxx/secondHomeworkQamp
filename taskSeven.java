import java.util.Scanner;


public class taskSeven {
    static void arrayInputOutput(int sizeOne, int[] array, int[] arraysecond, int sizeSecond) {
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

            int j=0;
        if(array.length==arraysecond.length)
            for(int i=0;i<array.length;i++)
            {
                System.out.print(array[i]+arraysecond[j]+",");
                j++;
            }

        if(array.length>arraysecond.length) {;
            int k=0;
            for(int i=0;i<arraysecond.length;i++)
            {
                System.out.print(array[i]+arraysecond[k]+",");
                k++;

            }
            for(int i=arraysecond.length;i<array.length;i++)
            {
                System.out.println(array[i]);
            }
        }
        if(array.length<arraysecond.length)
        {
            int k=0;
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]+arraysecond[k]+",");
                k++;
            }
            for(int i=array.length;i<arraysecond.length;i++)
            {
                System.out.println(arraysecond[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the size of your first integer array:");
        int sizeOfFirstArray = object.nextInt();
        System.out.print("Enter the size of your second integer array:");
        int sizeOfSecondArray = object.nextInt();
        int[] simpleFirstArray = new int[sizeOfFirstArray];
        int[] simpleSecondArray = new int[sizeOfSecondArray];
        arrayInputOutput(sizeOfFirstArray, simpleFirstArray, simpleSecondArray, sizeOfSecondArray);
    }
}
