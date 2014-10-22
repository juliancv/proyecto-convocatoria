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
    private String identificacion;
    private boolean estado;
    private boolean empleo;

    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, 
            String user, String pass, String id) {
        
        nombreUno = nombre1;
        nombreDos = nombre2;
        apellidoUno = apellido1;
        apellidoDos = apellido2;
        username = user;
        password = pass;
        identificacion = id;
        estado = false;
        empleo = true;
        
    }
    
    
    public void editarNombreUno (String nombre) {
        
        nombreUno = nombre;
        
    }
    
}
