package ultimolabprogra;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
public class Interfaz1 extends javax.swing.JFrame {
    ArrayList<Informacion_relevante> info=new ArrayList();
    ArrayList <Informacion_relevante> filtrado=new ArrayList();
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
        grafico_torta = new javax.swing.JRadioButton();
        grafico_barras = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Genero");

        jLabel2.setText("Departamento");

        jLabel3.setText("Edades");

        jLabel4.setText("Estado");

        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Filtrar informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        grafico_torta.setText("Grafico de pastel");

        grafico_barras.setText("Grafico de barras");

        jButton2.setText("generar archivo CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edades, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grafico_barras)
                            .addComponent(grafico_torta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grafico_barras)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grafico_torta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String edad[]=new String[2];
        int cantidad_elecciones_todos=0;
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        if(sexos.getSelectedItem()=="todos")
        {
            cantidad_elecciones_todos++;
        }
        if(departamento.getSelectedItem()=="todos")
        {
            cantidad_elecciones_todos++;
        }
        if(edades.getSelectedItem()=="todos")
        {
            cantidad_elecciones_todos++;
        }
        if(estado.getSelectedItem()=="todos")
        {
            cantidad_elecciones_todos++;
        }
        if(grafico_barras.isSelected()||grafico_torta.isSelected())
        {
            switch(cantidad_elecciones_todos)
            {
                case 0:
                    edad=edades.getSelectedItem().toString().split(" a ");
                    for(int i=0;i<info.size();i++)
            {
                if(
                        (info.get(i).Departamento.equals(departamento.getSelectedItem()))&&
                        ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                        (info.get(i).estado.equals(estado.getSelectedItem()))&&
                        (info.get(i).genero.equals(sexos.getSelectedItem())))
                {
                    filtrado.add(info.get(i));
                }
            }
                    //se rellena la tabla
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //falta colocar la informacion para las graficas pero npi el orden
                    
                    
                    
                    
                    
                    
                    break;
                case 1:
                    if(sexos.getSelectedItem()=="todos")
        {
            edad=edades.getSelectedItem().toString().split(" a ");
            double Masculino=0,Femenino=0;
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
            //se llena la tabla
            
            vaciaTabla(modelo);
            agregar_filas(modelo, filtrado.size());
            rellenarTabla(filtrado);
            //se hace cuenta de cuantos son hombres y cuantos  mujeres
            for(int i=0;i<filtrado.size();i++)
           {
               if(filtrado.get(i).genero.equals("M"))
               {
                   Masculino++;
               }else
               {
                   Femenino++;
               }
           }
            double[] datos={Masculino,Femenino};
            String[] nombres={"Hombres","Mujeres"};
            String titulo="Casos de covid segun generos";
            //se llama el grafico segun corresponda
            generarGrafico(datos, nombres, titulo);
          }else if(departamento.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion que tenga los parametros 
              edad=edades.getSelectedItem().toString().split(" a ");
              String titulo="casos de covid-19 segun departamentos";
              for(int i=0;i<info.size();i++)
              {
              if(
                        (info.get(i).genero.equals(sexos.getSelectedItem()))&&
                        ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                        (info.get(i).estado.equals(estado.getSelectedItem())))
                {
                    filtrado.add(info.get(i));
                }
              }
              //se obtienen la cantidad de cada departamento
              double[] datos=new double[departamento.getItemCount()-1];
              String[] Dep=new String[departamento.getItemCount()-1];
              for(int i=0;i<datos.length;i++)
              {
                  int j=0;
                  datos[i]=j;
                  Dep[i]=departamento.getItemAt(i+1);
              }
              for(int i=0;i<filtrado.size();i++)
              {
                  for(int j=0;j<Dep.length;j++)
                  {
                      if(filtrado.get(i).Departamento.equals(Dep[j]))
                      {
                          datos[j]++;
                      }
                  }
              }
              //se llena la tabla con la informacion
              
              vaciaTabla(modelo);
              agregar_filas(modelo, filtrado.size());
              rellenarTabla(filtrado);
              //se genera el grafico
              generarGrafico(datos, Dep, titulo);
          }else if(edades.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion
              String titulo="casos de covid-19 segun rangos de edades";
              for(int i=0;i<info.size();i++)
              {
              if(
                        (info.get(i).genero.equals(sexos.getSelectedItem()))&&
                        (info.get(i).estado.equals(estado.getSelectedItem()))&&
                        (info.get(i).Departamento.equals(departamento.getSelectedItem())))
                {
                    filtrado.add(info.get(i));
                }
              }
              //se rellena la tabla
              
              vaciaTabla(modelo);
              agregar_filas(modelo, filtrado.size());
              rellenarTabla(filtrado);
              
              //se obtiene la informacion segun cada categoria de edades
              double[] datos=new double[edades.getItemCount()-1];
              String[] Rangos_edades=new String[edades.getItemCount()-1];
              for(int i=0;i<datos.length;i++)
              {
                  int j=0;
                  datos[i]=j;
                  Rangos_edades[i]=edades.getItemAt(i+1);
              }
              for(int i=0;i<filtrado.size();i++)
              {
                  for(int j=0;j<datos.length;j++)
                  {
                      edad=Rangos_edades[j].split(" a ");
                      if(
                        (Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))
                      {
                        datos[j]++;   
                      }   
                  }
              }
              generarGrafico(datos, Rangos_edades, titulo);      
          }else if(estado.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion
              edad=edades.getSelectedItem().toString().split(" a ");
              String titulo="casos de covid-19 segun estado";
              for(int i=0;i<info.size();i++)
              {
              if(
                        (info.get(i).genero.equals(sexos.getSelectedItem()))&&
                        ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                        (info.get(i).Departamento.equals(departamento.getSelectedItem())))
                {
                    filtrado.add(info.get(i));
                }
              }
              //se obtienen la cantidad de cada estado
              double[] datos=new double[estado.getItemCount()-1];
              String[] est=new String[estado.getItemCount()-1];
              for(int i=0;i<datos.length;i++)
              {
                  int j=0;
                  datos[i]=j;
                  est[i]=estado.getItemAt(i+1);
              }
              for(int i=0;i<filtrado.size();i++)
              {
                  for(int j=0;j<est.length;j++)
                  {
                      if(filtrado.get(i).estado.equals(est[j]))
                      {
                          datos[j]++;
                      }
                  }
              }
              //se llena la tabla con la informacion
              
              vaciaTabla(modelo);
              agregar_filas(modelo, filtrado.size());
              rellenarTabla(filtrado);
              //se genera el grafico
              generarGrafico(datos, est, titulo);
          }
                    break;
                case 2:
                    if(sexos.getSelectedItem().equals("todos")&&departamento.getSelectedItem().equals("todos"))
                    {
                    edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                              (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                              (info.get(i).estado.equals(estado.getSelectedItem()))
                            )
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                    
                        
                    }else if(sexos.getSelectedItem().equals("todos")&&edades.getSelectedItem().equals("todos"))
                    {
                        
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Departamento.equals(departamento.getSelectedItem())&&
                              (info.get(i).estado.equals(estado.getSelectedItem()))))
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                        
                        
                    }else if(sexos.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                       
                    edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                              (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                              (info.get(i).Departamento.equals(departamento.getSelectedItem()))
                            )
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                    }else if(departamento.getSelectedItem().equals("todos")&&edades.getSelectedItem().equals("todos"))
                    {
                        
                   String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).genero.equals(sexos.getSelectedItem())&&
                              (info.get(i).estado.equals(estado.getSelectedItem()))))
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                        
                        
                    }else if(departamento.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                        
                        
                        edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                              (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                              (info.get(i).genero.equals(sexos.getSelectedItem()))
                            )
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                    }else if(edades.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                        
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Departamento.equals(departamento.getSelectedItem())&&
                              (info.get(i).genero.equals(sexos.getSelectedItem()))))
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                    }
                    break;
                case 3:
                    if(
                            sexos.getSelectedItem().equals("todos")&&
                            departamento.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos"))
                    {
                        
                        
                        
                        
                        
                    String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).estado.equals(estado.getSelectedItem())))
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                    }else if(
                            sexos.getSelectedItem().equals("todos")&&
                            departamento.getSelectedItem().equals("todos")&&
                            estado.getSelectedItem().equals("todos")
                            )
                    {
                        
                        
                        
                        
                        
                        edad=edades.getSelectedItem().toString().split(" a ");
                        String titulo="";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                              (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1]))))
                      {
                          filtrado.add(info.get(i));
                      }
                    } 
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                        
                        
                    }else if(
                            sexos.getSelectedItem().equals("todos")&&
                            estado.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos")
                            )
                    {
                        
                        
                        
                        
                        String titulo="";
                        for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Departamento.equals(departamento.getSelectedItem())))
                      {
                          filtrado.add(info.get(i));
                      }
                    }
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                    }else if(
                            estado.getSelectedItem().equals("todos")&&
                            departamento.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos")
                            )
                    {
                        
                        
                        
                        String titulo="";
                        for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).genero.equals(sexos.getSelectedItem())))
                      {
                          filtrado.add(info.get(i));
                      }
                    }
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                        
                        
                        
                        
                        
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
            }
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(filtrado.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "no se ha hecho ningun filtro");
        }else
        {
            procesos escritura=new procesos();
            escritura.exportarDatos(filtrado);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
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
            rellenarTabla(info);
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
       ArrayList<String> Departamentos_completo=new ArrayList();
       Departamentos_completo.add("todos");
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
        Collections.sort(departamentos);
        Departamentos_completo.addAll(departamentos);
        for(int i=0;i<departamentos.size();i++)
       {
           departamento.addItem(Departamentos_completo.get(i));
       }  
    }
    public void comboboxestado()
    {
        boolean existe=false; //estado
       ArrayList<String> estado=new ArrayList();
       ArrayList<String> estado_completo=new ArrayList();
       estado_completo.add("todos");
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
       Collections.sort(estado);
       estado_completo.addAll(estado);
        for(int i=0;i<estado.size();i++)
       {
           this.estado.addItem(estado_completo.get(i));
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
    public void graficoDeBarras(double[] datos,String[] nombres,String titulo)
    {
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for(int i=0;i<datos.length;i++)
        {
            dataset.addValue(datos[i], nombres[i], titulo);
        }
        JFreeChart chart=ChartFactory.createBarChart(titulo, "", "cantidad", dataset);
        ChartPanel panelBar=new ChartPanel(chart);
        JFrame ventana = new JFrame("Grafico");
                ventana.setVisible(true);
                ventana.setSize(800, 600);
                ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventana.add(panelBar);
    }
    public void graficoDePie(double[] datos,String[] nombres,String titulo)
    {
        DefaultPieDataset data =new DefaultPieDataset();
        for(int i=0;i<datos.length;i++)
        {
            data.setValue(nombres[i], datos[i]);
        }
        JFreeChart chart =ChartFactory.createPieChart3D(titulo, data);
        ChartPanel panelPie=new ChartPanel(chart);
        JFrame ventana = new JFrame("Grafico");
                ventana.setVisible(true);
                ventana.setSize(800, 600);
                ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventana.add(panelPie);
    }
    public void rellenarTabla(ArrayList<Informacion_relevante> filtrado)
    {
        for(int i=0;i<filtrado.size();i++)
            {
                tabla.setValueAt(filtrado.get(i).Ciudad_de_Ubicacion, i, 0);
                tabla.setValueAt(filtrado.get(i).Departamento, i, 1);
                tabla.setValueAt(filtrado.get(i).edad, i, 2);
                tabla.setValueAt(filtrado.get(i).genero, i, 3);
                tabla.setValueAt(filtrado.get(i).estado, i, 4);
                tabla.setValueAt(filtrado.get(i).Pais_de_procedencia, i, 5);
            }
    }
   public void generarGrafico(double[] datos,String[] nombres,String titulo)
   {
       if(grafico_torta.isSelected())
            {
            graficoDePie(datos, nombres,titulo);
            }else if(grafico_barras.isSelected())
            {
                graficoDeBarras(datos, nombres, titulo);
            }
   }
   public void vaciaTabla(DefaultTableModel modelo)
   {
       for(int i=tabla.getRowCount()-1;i>=0;i--)
            {
                modelo.removeRow(i);
            }
   }
}
