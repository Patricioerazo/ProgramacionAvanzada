/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author Windows 10
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    private AccesoDatosImpl datos;
    

    @Override
    public void agregarPelicula(String nombreArchivo, String nombrePelicula) {
       
        
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
 
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso al Archivo");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula " + pelicula);
            }
            
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
       
        String resultado = null;
        resultado = datos.buscar(nombreArchivo, buscar);
        System.out.println("Resultado de Busqueda:" + resultado);   
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
     
        try {
            if (datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            }else {
                datos.crear(nombreArchivo);
                
                
            }   } catch (AccesoDatosEx ex) {
            System.out.println("Error al acceder a datos");
            ex.printStackTrace();
        }
    }

   
}
