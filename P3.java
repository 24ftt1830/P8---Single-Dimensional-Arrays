import java.util.Scanner;

public class P3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num[] = {1,2,3,4,5,6,7,8,9};
        int chance = 10;
        

        for (int i = (num.length - 1); i > 0; i--) {

            int index = (int)(Math.random()* (i + 1));

            int temp = num[i];
            num[i] = num[index];
            num[index] = temp;
            
        }
        while (chance > 0) {

            System.out.println("Guess 4 numbers (no duplicates): ");
        int[] guess = new int[4];

        for (int i = 0; i < 4; i++) {
            
            guess[i] = input.nextInt();
        }
        int correct = 0;
        for (int i = 0; i < 4; i++) {
            if (guess[i] == num[i]) {
                correct++;
            }

            
            
        }
        chance--;  
        System.out.println("You have score "+correct+" out of 4 numbers. You have "+chance+" chances left.");
        
        
        if (correct==4) {

            System.out.println("You Won! You got the actual number!");
            
        }
        else if (chance==0) {

            System.out.print("The actual number is ");
            
            for (int i = 0; i < 4; i++) {

                System.out.print(num[i]+" ");
                
            }
            System.out.print(". You Lose");
            
        }
    }
        
    }
}
