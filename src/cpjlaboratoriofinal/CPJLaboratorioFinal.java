

package cpjlaboratoriofinal;

import java.util.Scanner;
        
public class CPJLaboratorioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int ingresado;
        
        while (!salir) {
        System.out.println("1.- Iniciar Catalogo de Peliculas");
        System.out.println("2.- Agregar Pelicula");
        System.out.println("3.- Listar Peliculas");
        System.out.println("4,. Buscar Pelicula");
        System.out.println("0.- Salir");
        
            try {
                System.out.println("Seleccione un Numero");
                ingresado = lector.nextInt();
                
                switch(ingresado){
                    
                    case 1:
                        System.out.println("Opcion 1 de usuario");
                        break;
                        
                    case 2:
                        System.out.println("Opcion 2 de usuario");
                        break;
                        
                    case 3:
                        System.out.println("Opcion 3 de usuario");
                        break;
                    
                    case 4:
                        System.out.println("Opcion 4 de usuario");
                        break;
                        
                    case 0:
                        salir=true;
                        break;
                        
                     default:
                         System.out.println("Opcion a Elegir entre 0 y 4");
                }
                
            } catch (Exception e) {
                System.out.println("Ingrese su Opción");
            }
            
            
        }
        
    }
    
}
