import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribe el Nombre de tu película Favorita.");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de Lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Por último dinos que nota le pondrías");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);
    }

    }

