
package Colegio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TextManager {
    private ArrayList<Curso> cursos;

    public TextManager() {
        cursos=new ArrayList<>();
        cargarArchivo();
    }
    
    public void listarCursos(){
        for (Curso p : cursos) {
            System.out.println(p.getIdCurso()+" "+p.getNombreCurso());
        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    // M�todos para manipular el archivo de texto
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        while ((linea = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            crearCurso(st);
        }
        br.close();
    }

    // M�todo que a�adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void crearCurso(StringTokenizer st){
        String idCurso = st.nextToken().trim();       
        String nombre = st.nextToken().trim();       

        Curso curso = new Curso(idCurso, nombre, 0);
        cursos.add(curso);
    }

    // M�todos para manipular el archivo de texto
    private void cargarArchivo() {
        try {
            File file = new File("./src/main/java/cursosAlumnos.txt");
            Class<TextManager> clazz = TextManager.class;
            InputStream inputStream = clazz.getResourceAsStream("/cursosAlumnos.txt");
            if (file.exists()) {
                readFromInputStream(inputStream);
            } else
                JOptionPane.showMessageDialog(null,
                        "El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
    
}
