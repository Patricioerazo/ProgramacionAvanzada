/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;

/**
 *
 * @author Windows 10
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    public AccesoDatosImpl datos = new AccesoDatosImpl();
    

    @Override
    public void agregarPelicula(String nombreArchivo, String nombrePelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
