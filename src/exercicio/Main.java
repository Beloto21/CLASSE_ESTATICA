package exercicio;

// classe principal para poder testar as conversões
public class Main {
 public static void main(String[] args) {
	 
     // aqui esta tendo a conversão de Celcius para  Fahrenheit 
     double celsius = 25;
     double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
     System.out.println(celsius + "°C em Fahrenheit é: " + fahrenheit + "°F");

     // aqui esta tendo a conversão de Quilometors para Milhas
     double quilometros = 10;
     double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
     System.out.println(quilometros + " km em Milhas é: " + milhas + " mi");

     // aqui esta tendo a conversão de Gramas para Libras
     double gramas = 1000;
     double libras = ConversorUnidades.gramasParaLibras(gramas);
     System.out.println(gramas + " g em Libras é: " + libras + " lb");
 }
}

