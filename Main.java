import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Character, String> mapaAsciiAMorse = new HashMap<>();
    static {
        mapaAsciiAMorse.put('a', ".-");
        mapaAsciiAMorse.put('b', "-...");
        mapaAsciiAMorse.put('c', "-.-.");
        mapaAsciiAMorse.put('d', "-..");
        mapaAsciiAMorse.put('e', ".");
        mapaAsciiAMorse.put('f', "..-.");
        mapaAsciiAMorse.put('g', "--.");
        mapaAsciiAMorse.put('h', "....");
        mapaAsciiAMorse.put('i', "..");
        mapaAsciiAMorse.put('j', ".---");
        mapaAsciiAMorse.put('k', "-.-");
        mapaAsciiAMorse.put('l', ".-..");
        mapaAsciiAMorse.put('m', "--");
        mapaAsciiAMorse.put('n', "-.");
        mapaAsciiAMorse.put('ñ',"-. -. --");
        mapaAsciiAMorse.put('o', "---");
        mapaAsciiAMorse.put('p', ".--.");
        mapaAsciiAMorse.put('q', "--.-");
        mapaAsciiAMorse.put('r', ".-.");
        mapaAsciiAMorse.put('s', "...");
        mapaAsciiAMorse.put('t', "-");
        mapaAsciiAMorse.put('u', "..-");
        mapaAsciiAMorse.put('v', "...-");
        mapaAsciiAMorse.put('w', ".--");
        mapaAsciiAMorse.put('x', "-..-");
        mapaAsciiAMorse.put('y', "-.--");
        mapaAsciiAMorse.put('z', "--..");
    }
    public static String convertirAMorse(String frase) {
        StringBuilder morse = new StringBuilder();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            String pal = palabra;
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                String letraEnMorse = mapaAsciiAMorse.get(letra);
                if (letraEnMorse != null) {
                    morse.append(letraEnMorse);
                }
                if (i < palabra.length() - 1) {
                    morse.append(" ");
                }
            }
            if (pal.length() < palabras.length - 1) {
                morse.append("  ");
            }
        }
        return morse.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el texto a convertir en código morse: ");
        String input = scanner.nextLine();

        String morseCode = convertirAMorse(input);
        System.out.println("Código Morse: " + morseCode);
    }
}
