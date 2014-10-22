/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author jorgeaer
 */
public class Usuario {
    
    private String nombreUno;
    private String nombreDos;
    private String apellidoUno;
    private String apellidoDos;
    private String username;
    private String password;
    private String tipoIdentificacion;
    private String identificacion;
    private boolean estado;
    private boolean empleo;

    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, 
            String tipo, String user, String pass, String id) {
        
        nombreUno = nombre1;
        nombreDos = nombre2;
        apellidoUno = apellido1;
        apellidoDos = apellido2;
        username = user;
        password = pass;
        tipoIdentificacion = tipo;
        identificacion = id;
        estado = false;
        empleo = true;
        
    }
    
    
    public void editarNombreUno (String nombre) {
        
        nombreUno = nombre;
        
    }
    
    public void editarNombreDos (String nombre) {
        
        nombreDos = nombre;
        
    }
    
    public void editarApellidoUno (String apellido) {
        
        apellidoUno = apellido;
        
    }
    
    public void editarApellidoDos (String apellido) {
        
        apellidoDos = apellido;
        
    }
    
    public void editarPassword (String contraseña) {
        
        password = contraseña;
        
    }    
    
    public void setEstado (boolean estado_sistema) {
        
        estado = estado_sistema;
        
    }
    
    public void setEmpleado (boolean estado_empleo) {
        
        empleo = estado_empleo;
        
    }
    
}
