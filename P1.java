public class P1 {
    
    public static void main(String[] args) {
        
        String [] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l",
        "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 0, j = 25; i <= 25 || j >= 0; i++, j--) {

            if (i <= 25) {

                System.out.print(alphabets[i]+ " ");
                
            }
            if (j >= 0 && i != j) {

                System.out.print(alphabets[j]+" ");
                
            }
            
        }

        
    }
}
