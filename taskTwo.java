import java.util.Scanner;


public class taskTwo {
  public  static void main(String[] args){
        Scanner object=new Scanner(System.in);
        char answer='Y';
        String[] stringArray= new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
        System.out.println();
        do {
            System.out.print("Enter the size of your integer array (MAX 15):");
            int sizeOfArray = object.nextInt();
            if(ArrayCheck(sizeOfArray)){
                System.out.println("ERROR");
            }
            else {
                int[] simpleArray = new int[sizeOfArray];
                ArrayInput(simpleArray);
                ArrayOutput(simpleArray, stringArray);
                System.out.println("Would you like to type again (Yes-y)(No-y)");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            }
        }while(answer=='Y'||(answer=='y'));
   }
   static boolean ArrayCheck(int size){
       return (size > 15) || (size < 1);
   }
   static void ArrayInput(int[]simpleArray){
        Scanner object=new Scanner(System.in);
        for (int i = 0; i < simpleArray.length; i++) {
            simpleArray[i] = object.nextInt();
        }
    }
    static void ArrayOutput(int[] array,String[] arraysecond)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(arraysecond[i] + " in array:" + array[i]);
        }
    }
}
