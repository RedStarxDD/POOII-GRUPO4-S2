/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colegio;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        TextManager txt=new TextManager();
        ArrayList<Curso> cursos=txt.getCursos();

        txt.listarCursos();
        String[] cursosMatri;
        Alumno alumno=new Alumno("001", cursos, cursosMatri=new String[]{"3","5"}, "Qantu", "Quispe", "75940342");
        System.out.println(alumno.toString());
        alumno.listarCursos();
    }
}
