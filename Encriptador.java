import java.io.IOException;
import java.util.Scanner;

public class Encriptador {
    //Metodo para encriptar textos
    String encriptarTextos(String textoOriginal, int clave) {
        StringBuilder integradorDeCadenas = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char textoParaModificar = (char) (textoOriginal.charAt(i) + clave);
            char textoModificado = (textoParaModificar);
            integradorDeCadenas.append(textoModificado);
        }
        String textoEncriptado = integradorDeCadenas.toString();
        return textoEncriptado;
    }

    //Metodo que toma el texto encriptado que contiene el archivo seleccionado
    String encriptarArchivos(String archivoOriginal, Scanner clave) throws IOException {

        String archivoParaModificar = archivoOriginal;
        String archivoEncriptado = encriptarTextos(archivoParaModificar.toString(), clave.nextInt());
        return archivoEncriptado;
    }

}
