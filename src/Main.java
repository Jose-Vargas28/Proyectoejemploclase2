//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double edad;
        System.out.println("Ingrese su nombre y su edad: "); //sout+tab
        nombre = scanner.nextLine();
        edad = scanner.nextDouble();

        System.out.println(nombre + " " + edad);

        System.out.println("Hola mundo");
        System.out.println("Prueba de cambio");
        }
    }
