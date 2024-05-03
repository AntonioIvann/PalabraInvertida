import java.util.Scanner;
public class MainPalabra {

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("Dame una palabra ");
        String Palabra = p1.nextLine();
        StringBuilder palabrainvertida = new StringBuilder();
        for(int x = Palabra.length()-1;x>=0;x--){
            palabrainvertida.append(Palabra.charAt(x));
        }
        System.out.println("La palabra ivertida es: "+ palabrainvertida);
    }
}