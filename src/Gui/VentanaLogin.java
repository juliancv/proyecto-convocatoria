/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author anderojas
 */
public class VentanaLogin extends JFrame {
    
    private JLabel lbtitulo;
    private JLabel lbusername;
    private JLabel lbpassword;
    
    private JTextField jtfusername;
    private JTextField jtfpassword;
    
    private JButton jbiniciar;
    
    private JPanel panel;
    
    private ManejaEventos driverEventos;
    
    
    public VentanaLogin () {       
        
        lbtitulo = new JLabel("Sistema de Convocatoria Docente");
        lbusername = new JLabel("Usuario");
        lbpassword = new JLabel("Contraseña");
        
        jtfpassword = new JTextField();
        jtfusername = new JTextField();
        
        jbiniciar = new JButton("Ingresar");
        
        panel = new JPanel();
        getContentPane().add(panel);
        
        driverEventos = new ManejaEventos();
        
        agregarComponentes();
        acomodarComponentes();
        
        setVisible(true);
        setSize(500, 330);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Sistema Convocatoria Docente");
        
        
    }
    
    
    public void agregarComponentes () {
        
        panel.add(lbtitulo);
        panel.add(lbusername);
        panel.add(lbpassword);
        panel.add(jtfusername);
        panel.add(jtfpassword);
        panel.add(jbiniciar);
        panel.setLayout(null);
        
    }
    
    
    public void acomodarComponentes () {
        
        lbtitulo.setBounds(100, 20, 300, 30);
        lbusername.setBounds(80, 100, 120, 30);
        jtfusername.setBounds(220, 100, 200, 30);
        lbpassword.setBounds(80, 150, 120, 30);
        jtfpassword.setBounds(220, 150, 200, 30);
        
        jbiniciar.setBounds(300, 220, 120, 30);
        
    }
    
    public void addEvents () {
        
        jbiniciar.addMouseListener(driverEventos);
        
    }
    
    
    public boolean validarCampos () {
        
        boolean flag = false;
        
        if (!jtfpassword.getText().equals("") && !jtfusername.getText().equalsIgnoreCase("")) {
            
            flag = true;
            
        }
        
        return flag;
        
    }
    
    
    private class ManejaEventos implements MouseListener {
        
        
        @Override
        public void mouseClicked (MouseEvent me) {
            
            if (validarCampos() == true) {
                
                System.out.println("click\n");
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
        
    }
    
}
