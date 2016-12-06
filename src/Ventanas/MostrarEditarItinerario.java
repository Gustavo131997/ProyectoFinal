/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import ChecksBus.Empresa;
import ChecksBus.Itinerario;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *
 * @author ChecksBus.org
 */
public class MostrarEditarItinerario extends MostrarItinerarioUsuario {

    /**
     * Creates new form MostrarEditarItinerario
     **/
            
    /**
     *
     */
    
    
    
    private boolean validar;//varialble que sirve para validar a que ventana tiene que volver
    //Si es verdadero retorna al menu del funcionario admin, si es falso, retrna al menu funcionario
    
    /**
     *Esta ventana muestra la tabla de itinerario y los campos para poder guardar, modificar y eliminar itinerario
     */
    public MostrarEditarItinerario() {
        initComponents();
        super.jAtras.setVisible(false);
        setTitle("Itinerarios");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jtxtHoraLlegada = new javax.swing.JLabel();
        txtHoraLlegada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBModifcar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        JbEliminar = new javax.swing.JButton();
        jAtras = new javax.swing.JButton();
        txtFecha = new org.freixas.jcalendar.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de Datos con Bloc de Notas .txt");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Codigo del Bus:");

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Origen:");

        txtOrigen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jtxtHoraLlegada.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtxtHoraLlegada.setText("Hora de llegada:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");

        txtEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jBGuardar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModifcar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBModifcar.setText("Modificar");
        jBModifcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifcarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Fecha:");

        txtDestino.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Destino:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hora Salida:");

        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        JbEliminar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JbEliminar.setText("Eliminar");
        JbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbEliminarActionPerformed(evt);
            }
        });

        jAtras.setText("Atras");
        jAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jBModifcar)
                .addGap(122, 122, 122)
                .addComponent(JbEliminar)
                .addGap(145, 145, 145)
                .addComponent(jBLimpiar)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtHoraLlegada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstado)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtHoraLlegada)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGuardar)
                        .addComponent(jBModifcar)
                        .addComponent(JbEliminar))
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(jAtras)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
    
        ingresarRegistro(leerCodigo(),leerOrigen(),leerDestino(), leerHoraLlegada(), leerHoraSalida(), leerFecha(),(String)leerEstado(),terminal.empresa);
        
        
    }//GEN-LAST:event_jBGuardarActionPerformed
     
    private void jBModifcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifcarActionPerformed
        if(leerCodigo() >0){
        super.itinerario.getArchivo().modificarRegistroItinerario(leerCodigo(),leerOrigen(),leerDestino(), leerHoraLlegada(), leerHoraSalida(), leerFecha(),(String)leerEstado(),terminal.empresa);
        super.listarRegistro();
        }else{mensaje("ingrese codigo");}
        
        
    }//GEN-LAST:event_jBModifcarActionPerformed

    private void JbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbEliminarActionPerformed

        super.itinerario.getArchivo().eliminarRegistroItinerario(leerCodigo(), terminal.empresa);
        super.listarRegistro();
        
        
    }//GEN-LAST:event_JbEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
      Limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtrasActionPerformed
        if (validar) {
            MenuFuncionarioAdmin as = new MenuFuncionarioAdmin();            
        as.setVisible(true);
        
        }else{
            MenuFuncionario ventanaAtras = new MenuFuncionario();
            ventanaAtras.setVisible(true);            
        }
        
        dispose();
        
    }//GEN-LAST:event_jAtrasActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
      
    }//GEN-LAST:event_txtFechaActionPerformed

    /**
     *
     * @param texto
     */
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    /**
     * Este 
     * 
     * @param codigo
     * @param origen
     * @param destino
     * @param horaLlegada
     * @param horaSalida
     * @param estado
     * @param fecha
     * @param rp
     **/
    private void ingresarRegistro(int codigo, String origen, String destino, String horaLlegada, String horaSalida,
            String fecha, String estado , Empresa empresa){
       
            if(codigo == -1 && codigo>0)mensaje("Ingresar codigo entero");
            else if(origen == null)mensaje("Ingresar Origen");
            else if(destino == null) mensaje("Ingresar Destino");
            else if(horaLlegada == null)mensaje("Ingresar Hora de Llegada");
            else if(horaSalida == null)mensaje("Ingresar Hora de Salida");
            else if(horaLlegada.equals(horaSalida)) mensaje("Hora salida no puede ser igual a la hora de llegada");
            else{
                System.out.println(""+codigo+""+origen+""+destino+""+ horaLlegada+""+ horaSalida+""+ fecha+""+ estado);
                empresa.itinerario = new Itinerario(codigo, origen, destino, horaLlegada, horaSalida, fecha, estado);
                if(empresa.buscaCodigoItinerario(empresa.getItinerario().getBus().getCodigo())!= -1)mensaje("Este codigo ya existe");
                else empresa.agregarRegistroItinerario(empresa.itinerario);
                super.itinerario.getArchivo().grabar_Itinerario_txt(empresa.itinerario,empresa);
                super.listarRegistro();
            }
            
    }
    
    /**
     *
     * @param opcion
     */
    public void obtenerPermiso(boolean opcion){//Metodo para valiar el tipo de funvcionario que ingresa a la ventana
        this.validar=opcion;
    }
            
    
    
    private int leerCodigo(){
        try{
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            return codigo;
        }catch(NumberFormatException ex){
            return -1;
        }
    }

    private String leerOrigen(){
        try{
            String nombre = txtOrigen.getText().trim();
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }
  
    private String leerHoraLlegada(){
        try{
            String hora= this.txtHoraLlegada.getText().trim();
            if(ValidarHora(hora)){
            return hora;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
    private String leerHoraSalida(){
        try{
            String hora = this.txtHoraSalida.getText().trim();
            if(ValidarHora(hora)){
            return hora;
            }else{
                return null;
            }
        }catch(Exception ex){
            return null;
        }
    }
    
    private String leerDestino(){
        try{
            String destino = txtDestino.getText().trim();
            return destino;
        }catch(Exception ex){
            return null;
        }
    }
    
    private Object leerEstado(){
        try{
            Object estado = txtEstado.getText().trim();
            return estado;
        }catch(Exception ex){
            return null;
        }
    }
    private String leerFecha(){
        String dia = Integer.toString(txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(txtFecha.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(txtFecha.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "/" + mes+ "/" + year);
       return fecha;
    }

    private boolean ValidarHora(String hora) {
        Pattern pat = Pattern.compile("(([01]\\d)|(2[0-3])):([0-5]\\d)");
        Matcher mac = pat.matcher(hora);
        return (mac.matches());
    }
    private void Limpiar(){
        txtOrigen.setText(null);
    txtCodigo.setText(null);
    txtDestino.setText(null);
    txtEstado.setText(null);
    txtHoraLlegada.setText(null);
    txtHoraSalida.setText(null);
    
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MostrarEditarItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarEditarItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarEditarItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarEditarItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MostrarEditarItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbEliminar;
    protected javax.swing.JButton jAtras;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModifcar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jtxtHoraLlegada;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDestino;
    public javax.swing.JTextField txtEstado;
    private org.freixas.jcalendar.JCalendarCombo txtFecha;
    public javax.swing.JTextField txtHoraLlegada;
    public javax.swing.JTextField txtHoraSalida;
    public javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
