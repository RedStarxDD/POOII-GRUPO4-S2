/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TextManager {
    private ArrayList<Producto> productos;
    private File file;

    public TextManager() {
        productos=new ArrayList<>();
        cargarArchivo();
    }
    
    public void listarProductos(){
        for (Producto p : productos) {
            System.out.println(p.getNombreProducto()+" "+p.getCantidad());
        }
    }
    
    // M�todos para manipular el archivo de texto
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        while ((linea = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linea, ",");
            crearProducto(st);
        }
        br.close();
    }

    // M�todo que a�adir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void crearProducto(StringTokenizer st){
        String nombre = st.nextToken().trim();
        int cantidad = Integer.parseInt(st.nextToken().trim());
        Producto producto = new Producto(nombre, cantidad);
        productos.add(producto);
    }

    // M�todos para manipular el archivo de texto
    private void cargarArchivo() {
        try {
            file = new File("./src/stock.txt");
            Class<TextManager> clazz = TextManager.class;
            InputStream inputStream = clazz.getResourceAsStream("/stock.txt");
            if (file.exists()) {
                readFromInputStream(inputStream);
            } else
                JOptionPane.showMessageDialog(null,
                        "El archivo estudiantes.txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
    
    public void agregarTexto(String nombre, int cantidad){
        try {
            FileWriter fw=new FileWriter(file, true);
            PrintWriter pw=new PrintWriter(fw); 
            pw.println(nombre+", "+cantidad);
            pw.close();
            
            Producto producto=new Producto(nombre, cantidad);
            productos.add(producto);
            listarProductos();
            
        } catch (Exception e) {
            
        }
    }
}
