import java.io.IOException;

public class DesencriptadorPorFuerzaBruta {

    Desencriptador desencriptador = new Desencriptador();
    //Metodo que toma varias claves para encontar el tipo correcto basado en palabras en español
    String desencriptadorPorFuerzaBruta(String archivoEncriptado) throws IOException {
        String archivoPosiblementeDesencriptado = "";
        int i;
        for (i = 1; i < 1000; i++) {
            archivoPosiblementeDesencriptado = desencriptador.desencriptarArchivos(archivoEncriptado, i);
            boolean contienePalabrasEnEspaniol = contieneAlgunaPalabraDeEstas(archivoPosiblementeDesencriptado);
            if (contienePalabrasEnEspaniol) {
                if (true);{
                    System.out.println("La Clave usada es: " + i);
                }break;
            }
        }
        return archivoPosiblementeDesencriptado;
    }
    //Metodo que busca las palabras en español dentro del texto
    boolean contieneAlgunaPalabraDeEstas(String texto){

        String [] palabrasEnEspaniol = new String[4];
        palabrasEnEspaniol[0]= " de ";
        palabrasEnEspaniol[1]= " la ";
        palabrasEnEspaniol[2]= " en ";
        palabrasEnEspaniol[3]= " con ";

        for (int i = 0; i < palabrasEnEspaniol.length; i++) {
            if (texto.contains(palabrasEnEspaniol[i])){
                return true;
            }
        }
        return false;
    }
}
