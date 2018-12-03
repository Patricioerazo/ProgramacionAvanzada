package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {

    /**
     * @param args the command line arguments
     */
        
    private static final Scanner lector = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\catalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPelis = new CatalogoPeliculasImpl();

    public static void main(String[] args) {

        while (opcion != 0) {

            try {
                System.out.println("Elige Opción:\n1.- Iniciar Catalogo \n"
                        + "2.- Agregar Pelicula \n"
                        + "3.- Listar Peliculas \n"
                        + "4.- Buscar Pelicula \n"
                        + "0.- Salir");

                opcion = Integer.parseInt(lector.nextLine());

                switch (opcion) {

                    case 1:
                        catalogoPelis.iniciarArchivo(nombreArchivo);
                        break;

                    case 2:
                        System.out.println("Ingresa Pelicula para Agregar");
                        String nombre = lector.nextLine();
                        catalogoPelis.agregarPelicula(nombre, nombreArchivo);
                        break;

                    case 3:
                        catalogoPelis.listarPeliculas(nombreArchivo);
                        break;
                        
                    case 4:
                        System.out.println("Pelicula a Buscar:");
                        String buscar = lector.nextLine();
                        catalogoPelis.buscarPelicula(nombreArchivo, buscar);
                        break;

                    case 0:
                        System.out.println("Gracias, Adios");
                        break;
                        
                    default:
                        System.out.println("Opcion no Conocida");
                        break;

                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Error");
            }

        }

    }

}
