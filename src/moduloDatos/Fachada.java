/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloDatos;

import java.sql.*;

/**
 *
 * @author jorgeaer
 */
public class Fachada {
    
    private String url;
    private String usuario;
    private String password;
    
    private Connection conexion;
    private Statement instruccion;
    private ResultSet tabla;
    
}
