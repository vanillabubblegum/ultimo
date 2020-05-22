package ultimolabprogra;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {
    ArrayList<Informacion_relevante> info=new ArrayList();
    public Interfaz() {
        leerArchivo();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.JComboBox<>();
        departamento = new javax.swing.JComboBox<>();
        pais_de_procedencia = new javax.swing.JComboBox<>();
        estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pais_de_procedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(pais_de_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais_de_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(414, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JComboBox<String> pais_de_procedencia;
    private javax.swing.JComboBox<String> sexo;
    // End of variables declaration//GEN-END:variables

    private void leerArchivo() {
        try {
            JFileChooser seleccionar= new JFileChooser(); 
            seleccionar.showOpenDialog(null);
            File f = seleccionar.getSelectedFile();
            String pathName=f.getAbsolutePath(); //se obtiene la direccion
            File file=new File(pathName);
            ArrayList<String> LineasCompletas=new ArrayList();
            ArrayList<String[]> Separado=new ArrayList();
            Scanner lectura=new Scanner(new FileInputStream(file));
            while(lectura.hasNextLine())
            {
                String algo=lectura.nextLine();
                LineasCompletas.add(algo);
            }
            lectura.close();
            for(int i=0;i<LineasCompletas.size();i++)
            {
               Separado.add(LineasCompletas.get(i).split(","));
            }
            for(int i=1;i<Separado.size();i++)
            {
               Informacion_relevante persona=new Informacion_relevante();
               persona.Ciudad_de_Ubicacion=Separado.get(i)[3];
               persona.Departamento=Separado.get(i)[4];
               persona.edad=Separado.get(i)[6];
               persona.genero=Separado.get(i)[7];
               persona.estado=Separado.get(i)[9];
               persona.Pais_de_procedencia=Separado.get(i)[10];
               info.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       ArrayList<String[]> datosComboBox=new ArrayList();
       
       //se tiene que sacar la lsita de strings y luego agregar a la lista

       
       
       
       
        
        
        
        
        
    }
    public void comboboxgenero()
    {
        boolean existe=false; //generos
       ArrayList<String> Generos=new ArrayList();
       Generos.add("todos");
       for(int i=0;i<info.size();i++)
       {
           existe=false;
           for(int j=0;j<Generos.size();j++)
           {
               if(info.get(i).genero.equals(Generos.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               Generos.add(info.get(i).genero);
           }
       }
        String[] listaComboboxGenero=new String[Generos.size()];
        listaComboboxGenero=(String[]) Generos.toArray();
        //agregamos los datos al combobox
        
        
        
        
    }
    public void comboboxdepartamentos()
    {
        boolean existe=false; //departamentos
       ArrayList<String> departamentos=new ArrayList();
       departamentos.add("todos");
       for(int i=0;i<info.size();i++)
       {
           existe=false;
           for(int j=0;j<departamentos.size();j++)
           {
               if(info.get(i).genero.equals(departamentos.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               departamentos.add(info.get(i).genero);
           }
       }
        String[] listaComboboxdepartamentos=new String[departamentos.size()];
        listaComboboxdepartamentos=(String[]) departamentos.toArray();
        //agregamos los datos al combobox
        
        
        
        
    }
    public void comboboxestado()
    {
        boolean existe=false; //estado
       ArrayList<String> estado=new ArrayList();
       estado.add("todos");
       for(int i=0;i<info.size();i++)
       {
           existe=false;
           for(int j=0;j<estado.size();j++)
           {
               if(info.get(i).genero.equals(estado.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               estado.add(info.get(i).genero);
           }
       }
        String[] listaComboboxestado=new String[estado.size()];
        listaComboboxestado=(String[]) estado.toArray();
        //agregamos los datos al combobox
        
        
        
        
    }
    public void datos_edades()
    {
        String[] RangosEdades=new String[21];
        int edades=0;
        for(int i=0;i<21;i++)
        {
            RangosEdades[i]=Integer.toString(edades)+" a ";
            edades=edades+5;
            RangosEdades[i]=RangosEdades[i]+Integer.toString(edades);
            System.out.println(RangosEdades[i]);
        } 
    }
}
