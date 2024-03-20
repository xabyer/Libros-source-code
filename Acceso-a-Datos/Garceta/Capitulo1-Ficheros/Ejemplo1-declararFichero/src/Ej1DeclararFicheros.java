import java.io.File;
import java.io.IOException;

public class Ej1DeclararFicheros {
    public static void main(String[] args) {
        //Formas de declarar un fichero:
        //1.-Con la ruta completa como string, ruta absoluta + nombre de fichero
        File fichero1 = new File("D:\\Programar\\Libros-source-code\\Acceso-a-Datos\\Garceta\\ejemplo1.txt" );
        try {
            fichero1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //2º.-Con la ruta absoluta de tipo String como primer argumento y el nombre del fichero en un String también.
        File fichero2 = new File("D:\\Programar\\Libros-source-code\\Acceso-a-Datos\\Garceta\\", "ejemplo2.txt");
        try {
            fichero2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3º.-Con un directorio de tipo File y el nombre del archivo de tipo String:
        File directorio = new File("D:\\Programar\\Libros-source-code\\Acceso-a-Datos\\Garceta\\");
        File fichero3 = new File(directorio, "ejemplo3.txt");

        try {
            fichero3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (fichero3.isFile())
            System.out.println("Mi ruta es: " + fichero3.getAbsolutePath());
        else
            System.out.println("No soy un fichero");


        if (fichero1.exists()) {
            System.out.println(fichero1.getAbsolutePath());
        } else {
            System.out.println("No existo.");
        }
    }
}
