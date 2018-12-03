/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

/**
 *
 * @author Windows 10
 */
public interface CatalogoPeliculas {
    public void agregarPelicula(String nombreArchivo, String nombrePelicula);
    public void listarPeliculas (String nombreArchivo);
    public void buscarPelicula (String nombreArchivo, String buscar);
    public void iniciarArchivo (String nombreArchivo);
}
