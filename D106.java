import java.io.IOException;

public class D106 {

    private static int obtNum() throws IOException{
        int num = 0, input;
        while ((input = System.in.read()) != '\n' && input != '\r') {
            num = num * 10 + (input - '0');
        }
        return num;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int tipoCodigo, digitoControl, digitoActual, suma;
        int numero;
        String salida, digitos;

        while (true) {
            suma = 0;
            numero = obtNum();

            if (numero == 0) break;

            digitos = String.valueOf(numero);

            if (digitos.length() <= 8) {
                if (digitos.length() < 8) {
                    for (int i = digitos.length(); i < 8; i++) {
                        digitos = "0" + digitos;
                    }
                }
            } else {
                if (digitos.length() < 13) {
                    for (int i = digitos.length(); i < 13; i++) {
                        digitos = "0" + digitos;
                    }
                }
            }
            
            tipoCodigo = digitos.length();

            digitoControl = digitos.charAt(digitos.length() - 1) - '0';
            for (int i = 1; i < tipoCodigo; i++) {
                digitoActual = digitos.charAt(digitos.length() - 1 - i) - '0';
                suma += i % 2 == 0 ? digitoActual : digitoActual * 3;
            }

            suma += digitoControl;

            if (suma % 10 == 0) {
                salida = "SI";
                if (tipoCodigo == 13) {
                    if (digitos.startsWith("0")) 
                        salida += " EEUU";
                     else if (digitos.startsWith("380")) 
                        salida += " Bulgaria";
                     else if (digitos.startsWith("50")) 
                        salida += " Inglaterra";
                     else if (digitos.startsWith("539")) 
                        salida += " Irlanda";
                     else if (digitos.startsWith("560")) 
                        salida += " Portugal";
                     else if (digitos.startsWith("70")) 
                        salida += " Noruega";
                     else if (digitos.startsWith("759")) 
                        salida += " Venezuela";
                     else if (digitos.startsWith("850")) 
                        salida += " Cuba";
                     else if (digitos.startsWith("890")) 
                        salida += " India";
                     else 
                        salida += " Desconocido";
                }
            } else {
                salida = "NO";
            }

            System.out.println(salida);
        }
    }


}