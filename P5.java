import java.util.Scanner;

public class P5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] != 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == numbers[i]) {
                        numbers[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
                
            }
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i]+" ");
            }
        }
        

        
        
    }
}
