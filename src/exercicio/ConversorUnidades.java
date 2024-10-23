package exercicio;

public class ConversorUnidades {
	
    // metodo estatico que convertee o Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // metodo estatico que converte Quilômetros para Milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }

    // metodo estatico que converte Gramas para Libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.00220462;
    }
}

