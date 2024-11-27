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
    
        Map<String, Character> morseToAsciiMap = new HashMap<>();
        morseToAsciiMap.put(".-", 'A'); morseToAsciiMap.put("-...", 'B'); morseToAsciiMap.put("-.-.", 'C');
        morseToAsciiMap.put("-..", 'D'); morseToAsciiMap.put(".", 'E'); morseToAsciiMap.put("..-.", 'F');
        morseToAsciiMap.put("--.", 'G'); morseToAsciiMap.put("....", 'H'); morseToAsciiMap.put("..", 'I');
        morseToAsciiMap.put(".---", 'J'); morseToAsciiMap.put("-.-", 'K'); morseToAsciiMap.put(".-..", 'L');
        morseToAsciiMap.put("--", 'M'); morseToAsciiMap.put("-.", 'N'); morseToAsciiMap.put("---", 'O');
        morseToAsciiMap.put(".--.", 'P'); morseToAsciiMap.put("--.-", 'Q'); morseToAsciiMap.put(".-.", 'R');
        morseToAsciiMap.put("...", 'S'); morseToAsciiMap.put("-", 'T'); morseToAsciiMap.put("..-", 'U');
        morseToAsciiMap.put("...-", 'V'); morseToAsciiMap.put(".--", 'W'); morseToAsciiMap.put("-..-", 'X');
        morseToAsciiMap.put("-.--", 'Y'); morseToAsciiMap.put("--..", 'Z');


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el mensaje en código Morse (usa espacios entre letras y tres espacios entre palabras):");
        String morseCode = scanner.nextLine();
        scanner.close();

        StringBuilder asciiMessage = new StringBuilder();
        String[] words = morseCode.split("   ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                asciiMessage.append(morseToAsciiMap.getOrDefault(letter, '?'));
            }
            asciiMessage.append(" ");
        }

        System.out.println("Mensaje en ASCII: " + asciiMessage.toString().trim());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el texto a convertir en código morse: ");
        String input = scanner.nextLine();

        String morseCode = convertirAMorse(input);
        System.out.println("Código Morse: " + morseCode);
    }
}
