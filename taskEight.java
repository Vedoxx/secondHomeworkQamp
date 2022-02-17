import java.util.Scanner;



public class taskEight {
    static void stringArray(String[] array)
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your string array:");
        for(int i=0;i<array.length;i++)
        {
            array[i]= object.nextLine();
        }
        System.out.println("Strings removed from array:");
        int f=0;
        for(int i=0;i< array.length;i++) {
            if (array[i].contains("A") || array[i].contains("E") || array[i].contains("I") || array[i].contains("O") || array[i].contains("U") || array[i].contains("i") || array[i].contains("o") || array[i].contains("u") || array[i].contains("a") || array[i].contains("e")) {
                System.out.print(array[i] + ",");
                f++;
            }
        }

    }
    public static void main(String[] args){
        System.out.print("Enter the size of string array:");
        Scanner object=new Scanner(System.in);
        int sizeString= object.nextInt();
        String[] stringArray= new String[sizeString];
        stringArray(stringArray);

    }
}
