package Parcial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número en base octal:");
        String octal = entrada.nextLine();
        
        long decimal = OctalADecimal.convertOctalToDecimal(octal);
        
        System.out.printf("El número %s en base octal es %d en base decimal.%n", octal, decimal);
        
        // Cerrar el Scanner
        entrada.close();
    }
}
	


