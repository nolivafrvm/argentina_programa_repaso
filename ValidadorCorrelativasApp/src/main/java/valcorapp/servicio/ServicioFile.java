package valcorapp.servicio;

import valcorapp.entidades.Inscripcion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ServicioFile {

    private static final String absoluthPath = "/home/noliva/validaCorrelativas/" ; // Para linux
//    private static final String absoluthPath = "C:\\appTurnero\\" ; // Para windows

    private boolean escribirArchivo(String archivo, String textoAGrabar) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        try { // Estructura de control de excepciones
            Files.writeString(rutaArchivo, textoAGrabar + "\n", StandardOpenOption.APPEND);
            return true;
        } catch (IOException ioException) {
            System.out.println("Error al intentar escribir");
        }
        return false;
    }

    private List<String> leerArchivo(String archivo) throws IOException {
        Path rutaArchivo = Paths.get(absoluthPath + archivo + ".txt");
        try { // Estructura de control de excepciones
            List<String> textoLeido = Files.readAllLines(rutaArchivo);
            return textoLeido;
        } catch (IOException ioException) {
            System.out.println("Error al intentar leer el archivo" + archivo + ".txt -> Exception: " + ioException);
        }
        return null;
    }

    public boolean registrarInscripcion(Inscripcion inscripcion) throws IOException {
        return escribirArchivo("inscripcion", inscripcion.grabarInscripcionAArchivo());
    }

    public boolean verificarInscripcionPublic(Inscripcion inscripcion) {
        return verificarInscripcion(inscripcion);
    }

    private boolean verificarInscripcion(Inscripcion inscripcion) {
        // TODO logica necesaria para saber si existe la inscripcion
        // Leer archivo
        // verificar usuario
        // verificar materia a inscribir
        // si matchea return true, sino false

        return false;
    }

}
