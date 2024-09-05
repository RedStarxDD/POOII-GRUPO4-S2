
package Colegio;
import java.util.Random;

public class Docente extends Persona{
    private String cursoDocente;
    private String facultadDocente;

    public Docente(String cursoDocente, String facultadDocente, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }
    
    public int calificarCurso(Curso curso){
        Random rand=new Random();
        int nota = rand.nextInt(21);
        return nota;
    }

    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
    }

}
