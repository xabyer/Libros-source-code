import java.io.File;

public class Ej2ListarFicheros {
    public static void main(String[] args) {
        String directorio = "."; //directorio actual
        File fichero = new File(directorio);
        String [] archivos = fichero.list();

        System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);

        for (String archivo : archivos) {
            File fichero2 = new File(fichero, archivo);

            System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b %n", archivo,
                    fichero2.isFile(), fichero2.isDirectory()
            );
        }
    }
}
