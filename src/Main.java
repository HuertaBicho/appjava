//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String saludar = "Hola, Mundo!";

        System.out.println(saludar);
        System.out.println("saludar.tuUpperCase: " + saludar.toUpperCase());

        int numero = 86;

        boolean valor = true;

        if(valor){
            System.out.println("numero es igual:" + numero);
        }

        int numero2 = 32;

        String nombre = "";

        if(numero2 < 30){
            nombre= "Juan";
        }else{
            nombre = "Maria";
        }

        System.out.println(nombre);
    }
}