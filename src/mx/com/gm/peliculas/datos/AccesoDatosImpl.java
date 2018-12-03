/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author Windows 10
 */
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);
        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {

                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx{
        PrintWriter salida = null;

        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Pelicula se ha Escrito ok");

        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.println(pelicula.toString());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i = 0;
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " Encontrado en .." + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha Creado ok");
            try {
                throw new AccesoDatosEx("Ha Ocurrido un problema;");
            } catch (AccesoDatosEx ex) {

            }
        } catch (IOException ex) {

        } finally {
            salida.close();
        }
    }



@Override
        public void borrar(String nombreArchivo)throws AccesoDatosEx{
        File archivo = new File(nombreArchivo);
            archivo.delete();
            System.out.println("Se Borra Archivo ok");
        }

    }
