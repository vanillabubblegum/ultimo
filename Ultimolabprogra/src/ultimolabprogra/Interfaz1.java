package ultimolabprogra;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
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
    ArrayList<String> departamentos=new ArrayList();
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
        Ciudade_procedencia = new javax.swing.JComboBox<>();
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
        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Genero");

        jLabel2.setText("pais de procedencia");

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

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

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
                            .addComponent(Ciudade_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(Ciudade_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
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
        if(Ciudade_procedencia.getSelectedItem()=="todos")
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
                    filtrado.clear();
                    String titlo="grafica general";
                    for(int i=0;i<info.size();i++)
            {
                if(
                        (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem()))&&
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
                    GraficaPorDepartamentos(titlo);
                    break;
                case 1:
                    if(sexos.getSelectedItem()=="todos")
        {
            filtrado.clear();
            edad=edades.getSelectedItem().toString().split(" a ");
            double Masculino=0,Femenino=0;
            for(int i=0;i<info.size();i++)
            {
                if(
                        (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem()))&&
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
            if(filtrado.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "no hay datos de estas caracteristicas");
            }else
            {
                generarGrafico(datos, nombres, titulo);
            }
            
            
            
            
          }else if(Ciudade_procedencia.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion que tenga los parametros 
              filtrado.clear();
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
              double[] datos=new double[Ciudade_procedencia.getItemCount()-1];
              String[] Ciu=new String[Ciudade_procedencia.getItemCount()-1];
              for(int i=0;i<datos.length;i++)
              {
                  int j=0;
                  datos[i]=j;
                  Ciu[i]=Ciudade_procedencia.getItemAt(i+1);
              }
              for(int i=0;i<filtrado.size();i++)
              {
                  for(int j=0;j<Ciu.length;j++)
                  {
                      if(filtrado.get(i).Departamento.equals(Ciu[j]))
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
              if(filtrado.isEmpty())
              {
                  JOptionPane.showMessageDialog(null, "no hay datos de estas caracteristicas");
              }else
              {
                  generarGrafico(datos, Ciu, titulo);
              }
          }else if(edades.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion
              filtrado.clear();
              String titulo="casos de covid-19 segun rangos de edades";
              for(int i=0;i<info.size();i++)
              {
              if(
                        (info.get(i).genero.equals(sexos.getSelectedItem()))&&
                        (info.get(i).estado.equals(estado.getSelectedItem()))&&
                        (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem())))
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
              if(filtrado.isEmpty())
              {
                  JOptionPane.showMessageDialog(null, "no hay datos de estas caracteristicas");
              }else
              {
                  generarGrafico(datos, Rangos_edades, titulo);      
              }
              
          }else if(estado.getSelectedItem().equals("todos"))
          {
              //se filtra la informacion
              filtrado.clear();
              edad=edades.getSelectedItem().toString().split(" a ");
              String titulo="casos de covid-19 segun estado";
              for(int i=0;i<info.size();i++)
              {
              if(
                        (info.get(i).genero.equals(sexos.getSelectedItem()))&&
                        ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                        (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                        (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem())))
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
              if(filtrado.isEmpty())
              {
                  JOptionPane.showMessageDialog(null, "no hay datos de estas caracteristicas");
              }else
              {
                  generarGrafico(datos, est, titulo);
              }
          }
                    break;
                    case 2:
                    if(sexos.getSelectedItem().equals("todos")&&Ciudade_procedencia.getSelectedItem().equals("todos"))
                    {
                    edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="Grafico de estados y edades por departamento";
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
                    GraficaPorDepartamentos(titulo);
                    
                    
                    
                    
                        
                    }else if(sexos.getSelectedItem().equals("todos")&&edades.getSelectedItem().equals("todos"))
                    {
                        
                    String titulo="Grafico de Pais de procedencia y estado del paciente vs Departamento";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem())&&
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
                    GraficaPorDepartamentos(titulo);
                        
                        
                        
                        
                        
                    }else if(sexos.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                       
                    edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="Grafico de edades y paices de procedencia del paciente vs departamentos";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              ((Integer.parseInt(info.get(i).edad)>=Integer.parseInt(edad[0]))&&
                              (Integer.parseInt(info.get(i).edad)<=Integer.parseInt(edad[1])))&&
                              (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem()))
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
                    GraficaPorDepartamentos(titulo);
                        
                        
                        
                    }else if(Ciudade_procedencia.getSelectedItem().equals("todos")&&edades.getSelectedItem().equals("todos"))
                    {
                        
                   String titulo="Grafico de estados de los pacientes por generos vs departamentos";
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
                    GraficaPorDepartamentos(titulo);
                        
                        
                        
                        
                        
                    }else if(Ciudade_procedencia.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                        edad=edades.getSelectedItem().toString().split(" a ");
                    String titulo="Grafico de edades y generos vs departamentos";
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
                    GraficaPorDepartamentos(titulo);
                        
                        
                    }else if(edades.getSelectedItem().equals("todos")&&estado.getSelectedItem().equals("todos"))
                    {
                    String titulo="Grafico de Generos y paises de procedencia de los pacientes vs departamento";
                    for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem())&&
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
                    GraficaPorDepartamentos(titulo);  
                        
                    }
                    break;
                    case 3:
                    if(
                            sexos.getSelectedItem().equals("todos")&&
                            Ciudade_procedencia.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos"))
                    {

                    String titulo="Grafico estado de los pacientes vs departamentos";
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
                    GraficaPorDepartamentos(titulo);
                    }else if(
                            sexos.getSelectedItem().equals("todos")&&
                            Ciudade_procedencia.getSelectedItem().equals("todos")&&
                            estado.getSelectedItem().equals("todos")
                            )
                    {
                        edad=edades.getSelectedItem().toString().split(" a ");
                        String titulo="Grafico de edades 19 vs departamentos";
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
                    GraficaPorDepartamentos(titulo);    
                    }else if(
                            sexos.getSelectedItem().equals("todos")&&
                            estado.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos")
                            )
                    {
                        String titulo="grafico de paices de procedencia vs departamentos";
                        for(int i=0;i<info.size();i++)
                    {
                    if(
                              (info.get(i).Pais_de_procedencia.equals(Ciudade_procedencia.getSelectedItem())))
                      {
                          filtrado.add(info.get(i));
                      }
                    }
                    //se agregan los datos a la tabla 
                    vaciaTabla(modelo);
                    agregar_filas(modelo, filtrado.size());
                    rellenarTabla(filtrado);
                    //se genera el grafico
                    GraficaPorDepartamentos(titulo);     
                    }else if(
                            estado.getSelectedItem().equals("todos")&&
                            Ciudade_procedencia.getSelectedItem().equals("todos")&&
                            edades.getSelectedItem().equals("todos")
                            )
                    {
                        String titulo="Grafico de generos vs departamentos";
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
                    //generar grafica
                    GraficaPorDepartamentos(titulo);
                    }       
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
    private javax.swing.JComboBox<String> Ciudade_procedencia;
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
            comboboxCiudadeProcedencia();
            comboboxestado();
            Obtenerdepartamentos();
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
    public void comboboxCiudadeProcedencia()
    {
        boolean existe=false; 
       ArrayList<String> CiudadesProcedencia=new ArrayList();
       ArrayList<String> CiudadesProcedencia_completo=new ArrayList();
       CiudadesProcedencia_completo.add("todos");
       for(int i=0;i<info.size();i++)
       {
           existe=false;
           for(int j=0;j<CiudadesProcedencia.size();j++)
           {
               if(info.get(i).Pais_de_procedencia.equals(CiudadesProcedencia.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               CiudadesProcedencia.add(info.get(i).Pais_de_procedencia);
           }
       }
        Collections.sort(CiudadesProcedencia);
        CiudadesProcedencia_completo.addAll(CiudadesProcedencia);
        for(int i=0;i<CiudadesProcedencia.size();i++)
       {
           Ciudade_procedencia.addItem(CiudadesProcedencia_completo.get(i));
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
        top3barras();
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
   public void Obtenerdepartamentos()
   {
       boolean existe=false; 
       ArrayList<String> dep=new ArrayList();
       for(int i=0;i<info.size();i++)
       {
           existe=false;
           for(int j=0;j<dep.size();j++)
           {
               if(info.get(i).Departamento.equals(dep.get(j)))
               {
                   existe=true;
               }
           }
           if(existe!=true)
           {
               dep.add(info.get(i).Departamento);
           }
       }
       departamentos.addAll(dep);
   }
   public void GraficaPorDepartamentos(String titulo)
   {
        double[] dats=new double[departamentos.size()];
        String[] Dep=new String[departamentos.size()];

        for(int i=0;i<dats.length;i++)
        {
            int j=0;
            dats[i]=j;
            Dep[i]=departamentos.get(i);
        }
        for(int i=0;i<filtrado.size();i++)
        {
            for(int j=0;j<Dep.length;j++)
            {
                if(filtrado.get(i).Departamento.equals(Dep[j]))
                {
                    dats[j]++;
                }
            }
        }
        //se genenra la grafica
        generarGrafico(dats, Dep, titulo);       
   }
   public void top3barras()
   {
        int[] dats=new int[departamentos.size()];
        String[] Dep=new String[departamentos.size()];
        for(int i=0;i<dats.length;i++)
        {
            int j=0;
            dats[i]=j;
            Dep[i]=departamentos.get(i);
        }
        for(int i=0;i<filtrado.size();i++)
        {
            for(int j=0;j<Dep.length;j++)
            {
                if(filtrado.get(i).Departamento.equals(Dep[j]))
                {
                    dats[j]++;
                }
            }
        }
        int[] top={0,0,0};
        String[] topS={"","",""};
        for(int i=0;i<Dep.length;i++)
        {
            if(dats[i]>top[0])
            {
                top[2]=top[1];
                topS[2]=topS[1];
                
                top[1]=top[0];
                topS[1]=topS[0];
                
                top[0]=dats[i];
                topS[0]=Dep[i];
            }else if(dats[i]>top[1])
            {
                top[2]=top[1];
                topS[2]=topS[1];
                
                top[1]=dats[i];
                topS[1]=Dep[i];
            }else if(dats[i]>top[2])
            {
                top[2]=dats[i];
                topS[2]=Dep[i];
            }
        }
       DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        for(int i=0;i<top.length;i++)
        {
            dataset.addValue(top[i], topS[i], "");
        }
        JFreeChart chart=ChartFactory.createBarChart("Top 3 departamentos", "", "cantidad", dataset);
        ChartPanel panelBar=new ChartPanel(chart);
        panelGrafico.setLayout(new java.awt.BorderLayout());
        panelGrafico.add(panelBar);
        panelGrafico.validate();
   }
}