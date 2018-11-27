/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

/**
 *
 * @author Windows 10
 */
public interface AccesoDatos {
    public abstract boolean existe(String nombreArchivo);
    public abstract List<Pelicula> listar (String nombre);
    public abstract void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar);
    public abstract String buscar (String nombreArchivo, String buscar);
    public abstract void crear (String nombreArchivo);
    public abstract void borra (String nombreArchivo);
    
}
