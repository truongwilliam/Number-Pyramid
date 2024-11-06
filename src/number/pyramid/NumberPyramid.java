import java.util.Scanner;  

package number.pyramid;

public class NumberPyramid {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Nhap so hang cua kim tu thap: ");  
        int n = scanner.nextInt();   
        for (int i = 1; i <= n; i++) {    
            for (int j = 1; j <= i; j++) {  
                System.out.print(j + " ");  
            }  
            System.out.println();  
        }  
        
        scanner.close();  

    }
    
}
