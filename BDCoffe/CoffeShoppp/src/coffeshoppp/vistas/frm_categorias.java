/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeshoppp.vistas;

    import coffeshoppp.modelo.Conexion;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel; 
/**
 *
 * @author MINEDUCYT
 */
public class frm_categorias extends javax.swing.JFrame {

    /**
     * Creates new form frm_categorias
     */
    public frm_categorias() {
        initComponents();
        
         updateCategoriatTable();
         btn_eliminar_producto.setVisible(false);
         btn_modificar_producto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_categorias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre_categoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion_categoria = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo_categoria = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JButton();
        btn_insertar_productos = new javax.swing.JButton();
        btn_modificar_producto = new javax.swing.JButton();
        btn_eliminar_producto = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tabla_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_categoria", "Nombre", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_categorias.getTableHeader().setReorderingAllowed(false);
        tabla_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_categoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_categorias);
        if (tabla_categorias.getColumnModel().getColumnCount() > 0) {
            tabla_categorias.getColumnModel().getColumn(0).setResizable(false);
            tabla_categorias.getColumnModel().getColumn(1).setResizable(false);
            tabla_categorias.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setText("Nombre*");

        jLabel2.setText("Descripción*");

        txt_descripcion_categoria.setColumns(20);
        txt_descripcion_categoria.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion_categoria);

        jLabel3.setText("Código*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel2)
                        .addComponent(txt_nombre_categoria))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_codigo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(txt_nombre_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_PNG64/arrows_square_left.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_insertar_productos.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        btn_insertar_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_PNG64/arrows_circle_plus.png"))); // NOI18N
        btn_insertar_productos.setText("Agregar");
        btn_insertar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertar_productosActionPerformed(evt);
            }
        });

        btn_modificar_producto.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        btn_modificar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/software_pencil.png"))); // NOI18N
        btn_modificar_producto.setText("Editar");
        btn_modificar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_productoActionPerformed(evt);
            }
        });

        btn_eliminar_producto.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        btn_eliminar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_PNG 64/basic_trashcan.png"))); // NOI18N
        btn_eliminar_producto.setText("Elminar");
        btn_eliminar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_productoActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_PNG64/arrows_rotate.png"))); // NOI18N
        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_insertar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insertar_productos)
                    .addComponent(btn_modificar_producto)
                    .addComponent(btn_eliminar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        frm_inicio frm_inicio = new frm_inicio();
        frm_inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_insertar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertar_productosActionPerformed
        // TODO add your handling code here:
        String nombreCategoria = txt_nombre_categoria.getText();
        String descripcion = txt_descripcion_categoria.getText();
        Conexion conexion = null;

        if (nombreCategoria.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
        } else {
            try {

                // Conectando a la base de datos
                conexion = new Conexion("sa", "uma", "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;");
                conexion.conectar();

                // Insertando a la BD
                String insertQuery = "INSERT INTO categoria (nombre_categoria, descripcion) VALUES (?, ?)";
                try (PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, nombreCategoria);
                    preparedStatement.setString(2, descripcion);


                    int affectedRows = preparedStatement.executeUpdate();
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Categoria agregado correctamente.");
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al agregar categoria.");
                    }
                }

                // Actualizando la Jtable
                updateCategoriatTable();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
              conexion.desconectar();
            }
        }
        }
    
        private void limpiarCampos() {
        txt_nombre_categoria.setText("");
        txt_descripcion_categoria.setText("");
        txt_codigo_categoria.setText("");

        }

        // metodo para actualizar la tabla
        private void updateCategoriatTable() {
            Conexion conexion = null;
            try {
                conexion = new Conexion("sa", "uma", "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;");
                conexion.conectar();

                String query = "SELECT id_categoria, nombre_categoria, descripcion FROM categoria";
                try (ResultSet resultSet = conexion.getStatement().executeQuery(query)) {
                    // llenando la jtable
                    DefaultTableModel model = (DefaultTableModel) tabla_categorias.getModel();
                    model.setRowCount(0);

                    while (resultSet.next()) {
                        Object[] row = {
                            resultSet.getString("id_categoria"),
                            resultSet.getString("nombre_categoria"),
                            resultSet.getString("descripcion")
                        };
                        model.addRow(row);
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                if(conexion != null) {
                    conexion.desconectar();
                }
            }
    }//GEN-LAST:event_btn_insertar_productosActionPerformed

    private void btn_modificar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_productoActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txt_codigo_categoria.getText());
        String nombreCategoria = txt_nombre_categoria.getText();
        String descripcion = txt_descripcion_categoria.getText();

        Conexion conexion = null;

        if (nombreCategoria.isEmpty() || descripcion.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son requerido");
        } else {
            try {

                // coonectando a la base de datos
                conexion = new Conexion("sa", "uma", "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;");
                conexion.conectar();

                // insertando a la BD
                String updateQuery = "UPDATE categoria SET nombre_categoria = ?, descripcion = ? WHERE id_categoria="+codigo+"";
                try (PreparedStatement preparedStatement = conexion.prepareStatement(updateQuery)) {
                    preparedStatement.setString(1, nombreCategoria); // Aquí obtienes el id_categoria correspondiente al nombre de la categoría
                    preparedStatement.setString(2, descripcion);

                    int affectedRows = preparedStatement.executeUpdate();
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Categoria actualizada correctamente.");
                        btn_modificar_producto.setVisible(false);
                        btn_eliminar_producto.setVisible(false);
                        limpiarCampos();
                        btn_insertar_productos.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar categoria.");
                    }
                }

                // Actuallizando la Jtable
                updateCategoriatTable();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                conexion.desconectar();
            }
        }

    }//GEN-LAST:event_btn_modificar_productoActionPerformed

    private void btn_eliminar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_productoActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(txt_codigo_categoria.getText());

        Conexion conexion = new Conexion("sa", "uma", "jdbc:sqlserver://localhost:1433;databaseName=CoffeShop;encrypt=false;trustServerCertificate=true;");
        conexion.conectar();

        String deleteQuery = "DELETE FROM categoria WHERE id_categoria = "+codigo+";";

        try {
            PreparedStatement preparedStatement = conexion.prepareStatement(deleteQuery);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");

            limpiarCampos();
            updateCategoriatTable();
            btn_modificar_producto.setVisible(false);
            btn_eliminar_producto.setVisible(false);
            btn_insertar_productos.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(frm_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_eliminar_productoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        btn_modificar_producto.setVisible(false);
        btn_eliminar_producto.setVisible(false);
        btn_insertar_productos.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabla_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_categoriasMouseClicked
        // TODO add your handling code here:
    int filaSeleccionada = tabla_categorias.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        String codigoStr = tabla_categorias.getValueAt(filaSeleccionada, 0).toString();

        try {
            int codigo = Integer.parseInt(codigoStr);
            var nombreCategoria = (String) tabla_categorias.getValueAt(filaSeleccionada, 1);
            var descripcion = (String) tabla_categorias.getValueAt(filaSeleccionada, 2);

            // Llenar los campos con los datos de la fila seleccionada
            txt_codigo_categoria.setText(String.valueOf(codigo));
            txt_nombre_categoria.setText(nombreCategoria);
            txt_descripcion_categoria.setText(descripcion);

            btn_insertar_productos.setVisible(false);
            btn_modificar_producto.setVisible(true);
            btn_eliminar_producto.setVisible(true);
            txt_codigo_categoria.setEditable(false);
        } catch (NumberFormatException e) {
            // Manejar la excepción si no se puede convertir a entero
            JOptionPane.showMessageDialog(null, "Error al convertir a entero: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_tabla_categoriasMouseClicked

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
            java.util.logging.Logger.getLogger(frm_categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_categorias().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar_producto;
    private javax.swing.JButton btn_insertar_productos;
    private javax.swing.JButton btn_modificar_producto;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_categorias;
    private javax.swing.JTextField txt_codigo_categoria;
    private javax.swing.JTextArea txt_descripcion_categoria;
    private javax.swing.JTextField txt_nombre_categoria;
    // End of variables declaration//GEN-END:variables
}
