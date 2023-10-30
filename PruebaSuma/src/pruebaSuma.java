import java.util.Scanner;
public class pruebaSuma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		double numero1 = Double.parseDouble(scan.nextLine());
		System.out.print("Introduce el segundo número: ");
		double numero2 = Double.parseDouble(scan.nextLine());
		
		final double suma = numero1 + numero2;
		
		System.out.println("La suma de los 2 números es de: " + suma);
	}

}
