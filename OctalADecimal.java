package Parcial;

public class OctalADecimal {

	public OctalADecimal() {
		// TODO Auto-generated constructor stub
	}
	
	// Conversión de Octal a decimal
    public static long convertOctalToDecimal(String octal) {
    	
    	//Inicialización de variables
        long decimal = 0;
        int potencia = 0;
        
        // Recorrido de número Octal
        for (int i = octal.length() - 1; i >= 0; i--) {
            int valorActual = Character.getNumericValue(octal.charAt(i));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            decimal += elevado;
            potencia++;
        }
        
        return decimal;
    }
}

