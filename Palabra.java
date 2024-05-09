public class Palabra { // Declara una clase llamada Palabra

    private String Palabra; // Declara una variable de instancia privada de tipo String llamada Palabra
    int a; // Declara una variable de instancia de tipo entero llamada a

    // Método para mostrar la palabra almacenada en la variable de instancia Palabra
    public String mostrarPalabra() {
        return Palabra; // Devuelve el valor de la variable Palabra
    }

    // Método para mostrar el número almacenado en la variable de instancia a
    public int mostrarNumero() {
        return a; // Devuelve el valor de la variable a
    }

    // Método para establecer el valor de la variable Palabra
    public void mostrarPalabra(String Palabra) {
        this.Palabra = Palabra; // Asigna el valor proporcionado al parámetro Palabra a la variable de instancia Palabra
    }

    // Método para establecer el valor de la variable a
    public void mostrarNumero(int a) {
        this.a = a; // Asigna el valor proporcionado al parámetro a a la variable de instancia a
    }

    // Método para obtener el valor de la variable Palabra
    public String getPalabra() {
        return Palabra; // Devuelve el valor de la variable Palabra
    }

    // Método para establecer el valor de la variable Palabra mediante un setter
    public void setPalabra(String palabra) {
        Palabra = palabra; // Asigna el valor proporcionado al parámetro palabra a la variable de instancia Palabra
    }

    // Método para obtener el valor de la variable a
    public int getA() {
        return a; // Devuelve el valor de la variable a
    }

    // Método para establecer el valor de la variable a mediante un setter
    public void setA(int a) {
        this.a = a; // Asigna el valor proporcionado al parámetro a a la variable de instancia a
    }

    // Método para generar una representación de cadena de la clase
    @Override
    public String toString() {
        return "Palabra [Palabra=" + Palabra + ", a=" + a + "]"; // Devuelve una cadena que representa el estado actual de la clase
    }
}
