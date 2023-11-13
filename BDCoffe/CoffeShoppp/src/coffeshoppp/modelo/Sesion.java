/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshoppp.modelo;

/**
 *
 * @author Jonathan's PC
 */
public class Sesion {
    private static String nombreUsuario;

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        Sesion.nombreUsuario = nombreUsuario;
    }

    public static void cerrarSesion() {
        nombreUsuario = null;
        // Otros datos de sesión a reiniciar si es necesario
    }
}

