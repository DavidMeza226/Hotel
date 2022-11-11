package Control;

import Modelo.Alquilar;
import Modelo.UsuarioServicios;
import Servicios.Conexion;

public class Servicios {

    public void Alquiler(Alquilar alquiler) {

        try {

            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario());
        } catch (Exception e) {

        }
    }
}
