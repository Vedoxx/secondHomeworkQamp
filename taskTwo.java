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
            if ((sizeOfArray > 15) || (sizeOfArray < 1)) {
                System.out.println("ERROR");
            }
            int[] simpleArray = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                simpleArray[i] = object.nextInt();
            }
            int j = 0;
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.println(stringArray[j] + " in array:" + simpleArray[i]);
                j++;
            }
            System.out.println("Would you like to type again (Yes-y)(No-y)");
            System.out.print("Answer:");
            answer = object.next().charAt(0);
        }while(answer=='Y'||(answer=='y'));
    }
}
