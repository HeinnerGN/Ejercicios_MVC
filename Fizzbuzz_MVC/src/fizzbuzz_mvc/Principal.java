package fizzbuzz_mvc;

public class Principal {
    public static String [] resultado;

    public static void main(String[] args) {
        Principal.resultado = new String[100];
        Controlador controlador = new Controlador();
        controlador.empezar(Principal.resultado);
    }
    
}
