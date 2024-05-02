import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Criptoanalizador {

    public static void main(String[] args) throws IOException {
        //Opciones para el usuario
        System.out.println("Seleccione una opcion");

        System.out.println("1 Encriptar archivo");

        System.out.println("2 Desencriptar archivo");

        System.out.println("3 Salir");

        //Ingreso por teclado de la opcion del usuario
        Scanner seleccionDeUsuario = new Scanner(System.in);
        int claveSeleccionadaPorElUsuario = seleccionDeUsuario.nextInt();

        Scanner claveEncriptado = new Scanner(System.in);
        if (claveSeleccionadaPorElUsuario == 1) {
            System.out.println("Escriba clave para encriptado");
        }

        //Clase switch donde se determina que accion realizara el programa de acuerdo a la opcion registrada por el usuario
        switch (claveSeleccionadaPorElUsuario) {
            case 1:
                Encriptador encriptar = new Encriptador();
                String archivoEncriptado = encriptar.encriptarArchivos(Files.readString(Path.of("texto.txt")), claveEncriptado);
                System.out.println(archivoEncriptado);
                String path = "Archivo Encriptado.txt";
                Files.write(Paths.get(path), archivoEncriptado.getBytes(StandardCharsets.UTF_8));
                break;
            case 2:
                try {
                    DesencriptadorPorFuerzaBruta desencriptador = new DesencriptadorPorFuerzaBruta();
                    String archivoDesencriptado = desencriptador.desencriptadorPorFuerzaBruta(Files.readString(Path.of("Archivo Encriptado.txt")));
                    System.out.println(archivoDesencriptado);
                    path = "Nuevo Archivo desencriptado.txt";
                    Files.write(Paths.get(path),archivoDesencriptado.getBytes(StandardCharsets.UTF_8));

                } catch (IOException e) {
                    System.out.println("El Archivo no existe " + e);
                }
                break;
        }

    }
}
