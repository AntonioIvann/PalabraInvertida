import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainPalabra { // Declara una clase pública llamada MainPalabra
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner p1 = new Scanner(System.in); // Crea un objeto Scanner llamado p1 para leer la entrada del usuario

        System.out.println("Dame una palabra "); // Solicita al usuario que ingrese una palabra
        String Palabra = p1.nextLine(); // Lee la palabra proporcionada por el usuario

        StringBuilder palabrainvertida = new StringBuilder(); // Crea un objeto StringBuilder para almacenar la palabra invertida

        // Itera sobre la palabra en orden inverso y agrega cada carácter al StringBuilder
        for(int x = Palabra.length()-1; x >= 0; x--) {
            palabrainvertida.append(Palabra.charAt(x));
        }

        // Imprime la palabra invertida
        System.out.println("La palabra invertida es: " + palabrainvertida);
    }
}
