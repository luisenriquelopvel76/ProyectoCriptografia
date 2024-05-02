import java.io.IOException;

public class Desencriptador {
    //Metodo que descodifica el texto encriptado
    String desencriptarTextos(String textoCodificado, int clave) {
        int claveNegativa = clave;
        StringBuilder integradorDeCadenas = new StringBuilder();
        for (int i = 0; i < textoCodificado.length(); i++) {
            char textoParaModificar = (char) (textoCodificado.charAt(i) - claveNegativa);
            char textoModificado = (textoParaModificar);
            integradorDeCadenas.append(textoModificado);
        }
        String textoDesencriptado = integradorDeCadenas.toString();
        return textoDesencriptado;
    }
    //Metodo que toma el texto del archivo para descodificar
    String desencriptarArchivos(String archivoEncriptado, int clave) throws IOException {
        String archivoParaModificar = archivoEncriptado;
        String archivoDesencriptado = desencriptarTextos(archivoParaModificar.toString(), clave);
        return archivoDesencriptado;
    }

}
