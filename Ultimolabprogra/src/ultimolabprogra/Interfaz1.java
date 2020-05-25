package ultimolabprogra;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Interfaz1 extends javax.swing.JFrame {
    ArrayList<Informacion_relevante> info=new ArrayList();
    public Interfaz1() {
        initComponents();
        leerArchivo();
        grupo_de_botones.add(grafico_barras);
        grupo_de_botones.add(grafico_torta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_de_botones = new javax.swing.ButtonGroup();
        sexos = new javax.swing.JComboBox<>();
        departamento = new javax.swing.JComboBox<>();
        edades = new javax.swing.JComboBox<>();
        estado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        panelGrafico = new javax.swing.JPanel();
        grafico_torta = new javax.swing.JRadioButton();
        grafico_barras = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("genero");

        jLabel2.setText("departamento");

        jLabel3.setText("edades");

        jLabel4.setText("estado");

        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Filtrar informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        grafico_torta.setText("Grafico de pastel");

        grafico_barras.setText("grafico de barras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafico_barras)
                .addGap(28, 28, 28)
                .addComponent(grafico_torta)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sexos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(edades, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grafico_barras)
                    .addComponent(grafico_torta))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String edad[]=new String[2];
        ArrayList <Informacion_relevante> filtrado=new ArrayList();
        if(sexos.getSelectedItem()=="todos")
        {
            edad=edades.getSelectedItem().toString().split(" a ");
            double M=0,F=0;
            for(int i=0;i<info.size();i++)
            {
                if(
                        (info.get(i).Departamento.equals(departamento.getSelectedItem()))&&
                        ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                        (info.get(i).estado.equals(estado.getSelectedItem())))
                {
                    filtrado.add(info.get(i));
                }
                
                
                
                
                
                
            }
           
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JComboBox<String> edades;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JRadioButton grafico_barras;
    private javax.swing.JRadioButton grafico_torta;
    private javax.swing.ButtonGroup grupo_de_botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JComboBox<String> sexos;
    private javax.swing.JTable tabla;
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
            //se asignan los datos a los combo box
            datos_edades();
            comboboxgenero();
            comboboxdepartamentos();
            comboboxestado(); 
            //se establece la tabla  y se llena la tabla con todos los datos 
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
             agregarcolumnas(modelo);
             agregar_filas(modelo, info.size());
            for(int i=0;i<info.size();i++)
            {
                tabla.setValueAt(info.get(i).Ciudad_de_Ubicacion,i, 0 );
                tabla.setValueAt(info.get(i).Departamento, i, 1);
                tabla.setValueAt(info.get(i).edad, i, 2);        
                tabla.setValueAt(info.get(i).genero, i, 3);        
                tabla.setValueAt(info.get(i).estado, i, 4);
                tabla.setValueAt(info.get(i).Pais_de_procedencia, i, 5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
  }
    public void agregarcolumnas(DefaultTableModel a)
    {
       a.addColumn("Ciudad");
       a.addColumn("Departamento");
       a.addColumn("Edad");
       a.addColumn("Genero");
       a.addColumn("Estado");
       a.addColumn("procedencia");
    }
    public void agregar_filas(DefaultTableModel modelo,int filas)
    {
       String rows[]=new String[6];
       for(int i=0;i<filas;i++)
       {
           modelo.addRow(rows);
       }
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
       for(int i=0;i<Generos.size();i++)
       {
           sexos.addItem(Generos.get(i));
       }   
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
               if(info.get(i).Departamento.equals(departamentos.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               departamentos.add(info.get(i).Departamento);
           }
       }
        for(int i=0;i<departamentos.size();i++)
       {
           departamento.addItem(departamentos.get(i));
       }  
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
               if(info.get(i).estado.equals(estado.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               estado.add(info.get(i).estado);
           }
       }
        for(int i=0;i<estado.size();i++)
       {
           this.estado.addItem(estado.get(i));
       }    
    }
    public void datos_edades()
    {
        ArrayList<String> RangosEdades=new ArrayList();
        int edades=0;
        RangosEdades.add("todos");
        for(int i=1;i<22;i++)
        {
            RangosEdades.add(Integer.toString(edades)+" a ");
            edades=edades+5;
            RangosEdades.set(i, RangosEdades.get(i)+Integer.toString(edades));
        } 
        for(int i=0;i<RangosEdades.size();i++)
       {
           this.edades.addItem(RangosEdades.get(i));
       }  
    }
    public void graficoDeBarras()
    {
        
        
    }
    public void graficoDePie(double a,double b)
    {
        DefaultPieDataset data =new DefaultPieDataset();
        data.setValue("hombres", a);
        data.setValue("mujeres", b);
        JFreeChart chart =ChartFactory.createPieChart3D("generos", data);
        
    }

    
}
