/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import GUI.jfRegistrodeProducto;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        TextManager txtManager=new TextManager();
        txtManager.listarProductos();
        //txtManager.agregarTexto();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfRegistrodeProducto(txtManager).setVisible(true);
            }
        });        
    }
}
