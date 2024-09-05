
package Colegio;

/**
 *
 * @author ASUS
 */
public class Curso {
    private String idCurso;
    private String nombreCurso;
    private int nota;

    public Curso(String idCurso, String nombreCurso, int nota) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
    
}