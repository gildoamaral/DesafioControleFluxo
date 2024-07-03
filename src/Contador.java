import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO INTEIRO");
        x = scanner.nextInt();

        System.out.println("DIGITE OUTRO NUMERO INTEIRO");
        y = scanner.nextInt();

         
        
        try {            
            contar(x, y);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        scanner.close();
    }

    public static void contar (int x, int y) throws ParametrosInvalidosException {
        
        if ( y < x )
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int z = y - x;

        for (int i = 1; i <= z; i++) {
            System.out.println("Impriminto o número " + i);
        }
    }
}
