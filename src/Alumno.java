
package Colegio;

import java.util.ArrayList;
import java.util.List;

 public class Alumno extends Persona {
    private String codigoAlumno;
    private List<Curso> listaCursos;

    public Alumno(String codigoAlumno, List<Curso> cursos, String[] idCursos, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.codigoAlumno = codigoAlumno;
        this.listaCursos=new ArrayList<>();
        
        leeCursosAlumno(cursos, idCursos);
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    public void leeCursosAlumno(List<Curso> cursos, String[] idCursos){
        for (Curso c : cursos) {
            for (String id : idCursos) {
                if(c.getIdCurso().equals(id)){
                    listaCursos.add(c);
                }
            }
        }
    }
    
    public void listarCursos(){
        for (Curso c : listaCursos) {
            System.out.println(c.getNombreCurso());
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigoAlumno=" + codigoAlumno  + '}';
    }  
}
