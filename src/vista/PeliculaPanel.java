/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.PeliculaJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.Pelicula;

/**
 *
 * @author USUARIO
 */
public class PeliculaPanel extends javax.swing.JPanel {

    private Pelicula p;
    private PeliculaJpaController peliculaJPAController;
    private EntityManagerFactory emf;
    /**
     * Creates new form PeliculaPanel
     */
    public PeliculaPanel() {
        initComponents();
        p = new Pelicula();
        emf = Persistence.createEntityManagerFactory("UNCincoPU");
        peliculaJPAController = new PeliculaJpaController(emf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idPeliculaJTF = new javax.swing.JTextField();
        nombreJTF = new javax.swing.JTextField();
        edadMinimaJTF = new javax.swing.JTextField();
        formatoJTF = new javax.swing.JTextField();
        duracionJTF = new javax.swing.JTextField();
        crearJBtn = new javax.swing.JButton();
        editarJBtn = new javax.swing.JButton();
        buscarJBtn = new javax.swing.JButton();
        eliminarJBtn = new javax.swing.JButton();
        categoriaJCmBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionJTArea = new javax.swing.JTextArea();

        jLabel1.setText("Id Pelicula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Categoria");

        jLabel4.setText("Edad Minima");

        jLabel5.setText("Formato");

        jLabel6.setText("Duracion");

        jLabel7.setText("Descripcion");

        idPeliculaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPeliculaJTFActionPerformed(evt);
            }
        });

        crearJBtn.setText("Crear");
        crearJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJBtnActionPerformed(evt);
            }
        });

        editarJBtn.setText("Editar");
        editarJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarJBtnActionPerformed(evt);
            }
        });

        buscarJBtn.setText("Buscar");
        buscarJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarJBtnActionPerformed(evt);
            }
        });

        eliminarJBtn.setText("Eliminar");
        eliminarJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJBtnActionPerformed(evt);
            }
        });

        categoriaJCmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Acción", "Aventura", "Suspenso", "Terror", "CineArte", "Animada", "Documental", " " }));

        descripcionJTArea.setColumns(20);
        descripcionJTArea.setRows(5);
        jScrollPane1.setViewportView(descripcionJTArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearJBtn)
                        .addGap(55, 55, 55)
                        .addComponent(editarJBtn)
                        .addGap(71, 71, 71)
                        .addComponent(buscarJBtn)
                        .addGap(85, 85, 85)
                        .addComponent(eliminarJBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriaJCmBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idPeliculaJTF)
                            .addComponent(nombreJTF)
                            .addComponent(edadMinimaJTF)
                            .addComponent(formatoJTF)
                            .addComponent(duracionJTF)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idPeliculaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoriaJCmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edadMinimaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addComponent(formatoJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(duracionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearJBtn)
                    .addComponent(editarJBtn)
                    .addComponent(buscarJBtn)
                    .addComponent(eliminarJBtn))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idPeliculaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPeliculaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPeliculaJTFActionPerformed

    private void crearJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJBtnActionPerformed
        p.setIdPelicula(Integer.parseInt(idPeliculaJTF.getText()));
        p.setNombre(nombreJTF.getText());
        p.setCategoria(categoriaJCmBox.getSelectedItem().toString());
        p.setDuracion(Integer.parseInt(duracionJTF.getText()));
        p.setEdadMinima(Integer.parseInt(edadMinimaJTF.getText()));
        p.setFormato(formatoJTF.getText());
        p.setDescripcion(descripcionJTArea.getText());
        try{
            peliculaJPAController.create(p);
            JOptionPane.showMessageDialog(this, "La pelicula se creó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió la excepción "+ e);
        }
    }//GEN-LAST:event_crearJBtnActionPerformed

    private void editarJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarJBtnActionPerformed
        p.setIdPelicula(Integer.parseInt(idPeliculaJTF.getText()));
        p.setNombre(nombreJTF.getText());
        p.setCategoria(categoriaJCmBox.getSelectedItem().toString());
        p.setDuracion(Integer.parseInt(duracionJTF.getText()));
        p.setEdadMinima(Integer.parseInt(edadMinimaJTF.getText()));
        p.setFormato(formatoJTF.getText());
        p.setDescripcion(descripcionJTArea.getText());
        try{
            peliculaJPAController.edit(p);
            JOptionPane.showMessageDialog(this, "La pelicula se editó correctamente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió la excepción "+ e);
        }
    }//GEN-LAST:event_editarJBtnActionPerformed

    private void buscarJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarJBtnActionPerformed
        p=null;
        try{
            p=peliculaJPAController.findPelicula(Integer.parseInt(idPeliculaJTF.getText()));
            if(p!=null){
                idPeliculaJTF.setText(p.getIdPelicula().toString());
                idPeliculaJTF.setEnabled(false);
                nombreJTF.setText(p.getNombre());
                categoriaJCmBox.setSelectedItem(p.getCategoria());
                formatoJTF.setText(p.getFormato());
                duracionJTF.setText(p.getDuracion().toString());
                edadMinimaJTF.setText(p.getEdadMinima().toString());
                descripcionJTArea.setText(p.getDescripcion());
                        
            }else{
                JOptionPane.showConfirmDialog(this,"No se encontró la película");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió la excepción "+ e);
        }
    }//GEN-LAST:event_buscarJBtnActionPerformed

    private void eliminarJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJBtnActionPerformed
        buscarJBtnActionPerformed(evt);
        if(p!=null){
            if(JOptionPane.showConfirmDialog(this, "Está seguro que desea borrar la pelicula" + p.getNombre())==0){
                try{
                    peliculaJPAController.destroy(Integer.parseInt(idPeliculaJTF.getText()));
                    JOptionPane.showMessageDialog(this, "La película se eliminó correctamente");
                    limpiarCampos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ocurrió la excepción "+ e);
                }
            }
        }
    }//GEN-LAST:event_eliminarJBtnActionPerformed

public void limpiarCampos(){
    idPeliculaJTF.setText("");
    idPeliculaJTF.setEnabled(true);
    nombreJTF.setText("");
    categoriaJCmBox.setSelectedItem("");
    formatoJTF.setText("");
    duracionJTF.setText("");
    edadMinimaJTF.setText("");
    descripcionJTArea.setText("");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarJBtn;
    private javax.swing.JComboBox<String> categoriaJCmBox;
    private javax.swing.JButton crearJBtn;
    private javax.swing.JTextArea descripcionJTArea;
    private javax.swing.JTextField duracionJTF;
    private javax.swing.JTextField edadMinimaJTF;
    private javax.swing.JButton editarJBtn;
    private javax.swing.JButton eliminarJBtn;
    private javax.swing.JTextField formatoJTF;
    private javax.swing.JTextField idPeliculaJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreJTF;
    // End of variables declaration//GEN-END:variables
}
