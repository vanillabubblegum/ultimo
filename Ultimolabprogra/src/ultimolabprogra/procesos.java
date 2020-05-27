package ultimolabprogra;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class procesos {
    public void exportarDatos(ArrayList<Informacion_relevante> filtrado)
    {
        FileWriter writer = null;
    try {
        writer = new FileWriter("curso.csv");
    } catch (IOException ex) {
        Logger.getLogger(Interfaz1.class.getName()).log(Level.SEVERE, null, ex);
    }
                for(int i=0; i < filtrado.size();i++){
                    String str=filtrado.get(i).Ciudad_de_Ubicacion;
                    str=str+","+filtrado.get(i).Departamento;
                    str=str+","+filtrado.get(i).edad;
                    str=str+","+filtrado.get(i).genero;
                    str=str+","+filtrado.get(i).estado;
                    str=str+","+filtrado.get(i).Pais_de_procedencia;
                    str=str+"\n";
            try {
                writer.write(str);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz1.class.getName()).log(Level.SEVERE, null, ex);
            }
                  }
    try {
        writer.close();
    } catch (IOException ex) {
        Logger.getLogger(Interfaz1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    
    
    
    
}
