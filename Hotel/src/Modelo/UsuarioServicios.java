package Modelo;

import java.sql.SQLException;
import java.sql.*;

public class UsuarioServicios {

    public void guardar(Connection conexion, Usuario usuario) throws SQLException {

        try {

            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (id, identificacion, nombre, edad)" + "VALUES(?,?,?,?)");
            consulta.setString(1, usuario.getId());
            consulta.setString(2, usuario.getIdentificacion());
            consulta.setString(3, usuario.getNombre());
            consulta.setInt(4, usuario.getEdad());
            consulta.executeUpdate();

        } catch (SQLException ex) {

            throw new SQLException(ex);

        }
    }
}
