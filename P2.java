import java.util.Scanner;

public class P2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int countNum = input.nextInt();

        int[] myList = new int[countNum];

        System.out.println("Enter the "+countNum+" numbers:");

        for (int i = 0; i < countNum; i++) {

            myList[i] = input.nextInt();
            
        }
        System.out.println("Enter the number of left shift:");
        int shift = input.nextInt();

        for (int numShift = 0; numShift < shift; numShift++) {

            int temp = myList[0];
            
        
        for (int i = 0; i < (myList.length - 1); i++) {
            
            myList[i] = myList[i + 1];
        }
        myList[myList.length - 1] = temp;
    }

    System.out.println("The shifted arrangement is:");
    for (int i = 0; i < myList.length; i++) {
        
        System.out.print(myList[i]+" ");
    }
       
    


    
        // int [] myList = {1,2,3,4,5,6,7,8,9,10};

        // for (int i = 0; i < myList.length; i++) {
            
        //     int index = (int) (Math.random()*myList.length);

        //     int temp = myList[i];
        //     myList[i] = myList[index];
        //     myList[index] = temp;

        // }
        // for (int i = 0; i < myList.length; i++) {
            
        // }
    }
}
