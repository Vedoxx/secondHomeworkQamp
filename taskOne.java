import java.util.Scanner;


public class taskOne {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer='Y';
        do {
            System.out.print("Enter the size of your integer array:");
            int sizeOfArray = object.nextInt();
            int[] simpleArray = new int[sizeOfArray];
            arrayInput(simpleArray);
            arrayCheck(simpleArray);
            System.out.println("Would you like to type again (Yes-y)(No-y)");
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
     static void arrayCheck(int[]array)
     {
         int counter = 0;
        for(int i=0;i<array.length;i++)
        {
            counter++;
            if((array[i]%2==0)&&(array[i]>10))
            System.out.println(counter+" -> "+ array[i]+ "  is divisible by 2 and  larger than 10");
            else if ((array[i]%2==0)&&(array[i]<10)) {
                System.out.println(counter+" -> "+ array[i]+ "  is divisible by 2 and  smaller than 10");
            }
            else if ((array[i]%2!=0)&&(array[i]<10)) {
                System.out.println(counter+" -> "+ array[i]+ " is not divisible by 2 and  smaller than 10");
            }
            else if ((array[i]%2!=0)&&(array[i]>10)) {
                System.out.println(counter + " -> " + array[i] + " is  not divisible by 2 and  larger than 10");
            }
        }
    }
}

