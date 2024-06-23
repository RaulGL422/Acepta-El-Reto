import java.io.IOException;
import java.util.Arrays;

public class D102 {

    private static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static String next() throws IOException, NullPointerException, NumberFormatException {
        StringBuilder palabra = new StringBuilder();
        int input;
        while((input = System.in.read()) != '\n') palabra.append((char) input);
        return palabra.toString();
    }

    public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
        StringBuilder result = new StringBuilder();
        while (true) {
            String palabra = next(); // Obtain the next Word
            int desplazamientos = 15 - Arrays.binarySearch(letters, palabra.charAt(0));
            StringBuilder nuevaPalabra = new StringBuilder();
            boolean mayus = false;
            for (int i = 1; i < palabra.length(); i++) {
                char c = palabra.charAt(i);
                if (!Character.isLetterOrDigit(c)) continue;
                if (Character.isUpperCase(c)) {
                    mayus = true;
                    c = Character.toLowerCase(c);
                }
                int desplazamiento = (Arrays.binarySearch(letters, c) + desplazamientos);
                char nuevoCaracter = desplazamiento >= letters.length ? letters[desplazamiento - letters.length] : desplazamiento < 0 ? letters[letters.length + desplazamiento]: letters[desplazamiento]; // Obtain the new character
                nuevaPalabra.append(mayus ? Character.toUpperCase(nuevoCaracter) : nuevoCaracter); 
                mayus = false;
            }
            String palabraNueva = nuevaPalabra.toString();
            if (palabraNueva.equals("FIN")) break;
            result.append(palabraNueva.replaceAll("[^aeiouAEIOU]", "").length()).append('\n'); // Replace the word by the vowels and count the vowels
        }
        System.out.print(result);
    }
}
