import java.util.Scanner;

public class P4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int studentScore = 0;

        System.out.println("Enter the number of students: ");
        int num = input.nextInt();


        int[] scores = new int[num];
        char[] grade = new char[num];

        System.out.println("Enter the "+num+" scores:");

        for (int i = 0; i < num; i++) {
            
            scores[i] = input.nextInt();
            if (scores[i] > studentScore) {
                studentScore = scores[i];
            }
            
        
        }
        for (int i = 0; i < num; i++) {
            if (scores[i] >= (studentScore - 10)) {
                grade[i] = 'A';
                
            }
            else if (scores[i] >= studentScore - 20) {
                grade[i] = 'B';
            }
            else if (scores[i] >= studentScore - 30) {
                grade[i] = 'C';
            }
            else if (scores[i] >= studentScore - 40) {
                grade[i] = 'D';
            }
            else {
                grade[i] = 'F';
            }
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println("Student "+(i+1)+" score is "+scores[i]+" and grade is "+grade[i]);
            
        }
    }
}
