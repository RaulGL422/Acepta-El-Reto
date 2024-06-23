import java.util.Scanner;

public class D675 {
	
	private static int contador;
	
	public static void main(String[] args) {
		String numero;
		Scanner sc = new Scanner(System.in);
		while (true) {
			numero = sc.next();
			
			if (numero.equals("0")) break;
			contador = 0;
			
			if (!numero.equals("1")) {
				String numeroRestado = restaRecursiva(numero);
				
				switch(Integer.parseInt(numeroRestado)) {
					case 2: contador += 1; break;
					case 3: contador += 2; break;
					case 4: contador += 3; break;
					case 5: contador += 4; break;
					case 6: contador += 4; break;
					case 7: contador += 6; break;
					case 8: contador += 5; break;
					case 9: contador += 5; break;
				}
			}
			System.out.println(contador);
		}
		
		sc.close();
	}
	
	private static String restaRecursiva(String numero) {
		int numeroBinario = Integer.parseInt(traducirNumero(numero));
		int numeroDecimal = Integer.parseInt(numero);
		int numeroFinal = numeroDecimal - numeroBinario;

		if (Integer.parseInt(numero) < 10 || numeroFinal == 0) 
			return numero;
		contador++;
		return restaRecursiva(String.valueOf(numeroFinal));
	}
	
	private static String traducirNumero(String numero) {
		StringBuilder numeroTraducido = new StringBuilder();
		
		for (int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			if (c != '0')
				numeroTraducido.append('1');
			else
				numeroTraducido.append(c);
		}
		
		return numeroTraducido.toString();
	}
}
