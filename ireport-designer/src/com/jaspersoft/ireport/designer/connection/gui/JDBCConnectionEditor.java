/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of iReport.
 *
 * iReport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * iReport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with iReport. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.ireport.designer.connection.gui;

import com.jaspersoft.ireport.locale.I18n;
import com.jaspersoft.ireport.designer.IReportConnection;
import com.jaspersoft.ireport.designer.connection.JDBCConnection;
import com.jaspersoft.ireport.designer.IReportConnectionEditor;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author  gtoffoli
 */
public class JDBCConnectionEditor extends javax.swing.JPanel implements IReportConnectionEditor {
    
    private IReportConnection iReportConnection = null;

    public static JDBCDriverDefinition[] definitions = new JDBCDriverDefinition[]{
         	new JDBCDriverDefinition("Cloudscape","COM.cloudscape.JDBCDriver","jdbc:cloudscape:/{1}"),
                new JDBCDriverDefinition("IBM DB2","COM.ibm.db2.jdbc.app.DB2Driver","jdbc:db2:{0}/{1}"),
		new JDBCDriverDefinition("inetdae7","com.inet.tds.TdsDriver","jdbc:inetdae7:{0}:1433/{1}"),
                new JDBCDriverDefinition("Informix","com.informix.jdbc.IfxDriver","jdbc:informix-sqli://{0}:informixserver={1}"),
		new JDBCDriverDefinition("Ingres","com.ingres.jdbc.IngresDriver","jdbc:ingres://{0}:II7/{1}"),
                new JDBCDriverDefinition("HSQLDB (file)","org.hsqldb.jdbcDriver","jdbc:hsqldb:[PATH_TO_DB_FILES]/{1}"),
		new JDBCDriverDefinition("HSQLDB (server)","org.hsqldb.jdbcDriver","jdbc:hsqldb:hsql://{0}"),
                new JDBCDriverDefinition("JDBC-ODBC Bridge","sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:{1}","DSNAME"),
		new JDBCDriverDefinition("JDBC-ODBC Bridge","com.ms.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:{1}","DSNAME"),
		new JDBCDriverDefinition("MS SQLServer","com.internetcds.jdbc.tds.Driver","jdbc:freetds:sqlserver://{0}/{1}"),
		new JDBCDriverDefinition("MS SQLServer (2000)","com.microsoft.jdbc.sqlserver.SQLServerDriver","jdbc:microsoft:sqlserver://{0}:1433;DatabaseName={1}"),
		new JDBCDriverDefinition("MS SQLServer (2005)","com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://{0}:1433;databaseName={1}"),
		new JDBCDriverDefinition("MS SQLServer","net.sourceforge.jtds.jdbc.Driver","jdbc:jtds:sqlserver://{0}/{1}"),
                new JDBCDriverDefinition("MS SQLServer","com.merant.datadirect.jdbc.sqlserver.SQLServerDriver","jdbc:sqlserver://{0}:1433/{1}"),
                new JDBCDriverDefinition("MySQL","org.gjt.mm.mysql.Driver","jdbc:mysql://{0}/{1}"),
		new JDBCDriverDefinition("MySQL","com.mysql.jdbc.Driver","jdbc:mysql://{0}/{1}"),
		new JDBCDriverDefinition("Oracle","oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@{0}:1521:{1}"),
		new JDBCDriverDefinition("PostgreSQL","org.postgresql.Driver","jdbc:postgresql://{0}:5432/{1}"),
                new JDBCDriverDefinition("Sybase","com.sybase.jdbc2.jdbc.SybDriver","jdbc:sybase:Tds:{0}:2638/{1}"),
                new JDBCDriverDefinition("Vertica","com.vertica.Driver","jdbc:vertica://{0}:5433/{1}")
		};

    /** Creates new form JDBCConnectionEditor */
    public JDBCConnectionEditor() {
        initComponents();
        //applyI18n();

        
        //Arrays.sort(definitions);

         jComboBoxJDBCDriver.setRenderer(new JDBCDriverListRenderer());
         jComboBoxJDBCDriver.setModel(new DefaultComboBoxModel(definitions));
         // Select the first MySQL driver...

         jComboBoxJDBCDriver.setSelectedIndex(17);
         jLabel1.setText(I18n.getString("XMLADataSourceConnectionEditor.Label.Warning"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelJDBC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxJDBCDriver = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldJDBCUrl = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JPasswordField();
        jCheckBoxSavePassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabel2.setText(I18n.getString("JDBCConnectionEditor.Label.JDBC_Driver")); // NOI18N

        jComboBoxJDBCDriver.setEditable(true);
        jComboBoxJDBCDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJDBCDriverActionPerformed(evt);
            }
        });

        jLabel3.setText(I18n.getString("JDBCConnectionEditor.Label.JDBC_URL")); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Credentials"));
        jPanel3.setMinimumSize(new java.awt.Dimension(179, 70));

        jLabel6.setText(I18n.getString("Global.Label.Username")); // NOI18N

        jLabel7.setText(I18n.getString("Global.Label.Password")); // NOI18N

        jCheckBoxSavePassword.setText(I18n.getString("Global.CheckBox.Save_password")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jaspersoft/ireport/designer/connection/gui/warning.png"))); // NOI18N
        jLabel1.setText("Attention! Passwords are saved in clear text.");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jCheckBoxSavePassword)
                            .add(jTextFieldPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextFieldUsername, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                    .add(jLabel1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jTextFieldUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jTextFieldPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBoxSavePassword)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelJDBCLayout = new org.jdesktop.layout.GroupLayout(jPanelJDBC);
        jPanelJDBC.setLayout(jPanelJDBCLayout);
        jPanelJDBCLayout.setHorizontalGroup(
            jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelJDBCLayout.createSequentialGroup()
                .add(jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelJDBCLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextFieldJDBCUrl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .add(jComboBoxJDBCDriver, 0, 247, Short.MAX_VALUE)))
                    .add(jPanelJDBCLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelJDBCLayout.setVerticalGroup(
            jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelJDBCLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBoxJDBCDriver, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelJDBCLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextFieldJDBCUrl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelJDBC, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJDBCDriverActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Run the wizard to populate Connection URL
        jButtonWizardActionPerformed(null);
    }
    
    private void jButtonWizardActionPerformed(java.awt.event.ActionEvent evt) {                                              
          
        if (jComboBoxJDBCDriver.getSelectedIndex() < 0) return;
//
        if (jComboBoxJDBCDriver.getSelectedItem() instanceof JDBCDriverDefinition)
        {
            String server = "localhost"; //jTextFieldServerAddress.getText().trim();
            String databaseName = "DatabaseName";
//            if( server.length()==0 ) {
//                server = "localhost";
//            }
//            String databaseName = jTextFieldDBName.getText().trim();
            jTextFieldJDBCUrl.setText( ((JDBCDriverDefinition)jComboBoxJDBCDriver.getSelectedItem()).getUrl(server, databaseName) );
        }
        
    }
    
    public void setIReportConnection(IReportConnection c) {
        this.iReportConnection = c;
        
        if (iReportConnection instanceof JDBCConnection)
        {
            JDBCConnection con = (JDBCConnection)iReportConnection;
            // Find if the is a good definition..

            boolean found = false;
            for (int i=0; i<definitions.length; ++i)
            {
                if (definitions[i].getDriverName().equals(con.getJDBCDriver()))
                {
                    this.jComboBoxJDBCDriver.setSelectedItem(definitions[i]);
                    found = true;
                }
            }
            if (!found)
            {
                this.jComboBoxJDBCDriver.setSelectedItem(con.getJDBCDriver());
            }
            
            this.jTextFieldJDBCUrl.setText( con.getUrl());
            //this.jTextFieldServerAddress.setText( con.getServerAddress() );
            //this.jTextFieldDBName.setText( con.getDatabase() );
            this.jTextFieldUsername.setText( con.getUsername());
            if (con.isSavePassword())
                this.jTextFieldPassword.setText( con.getPassword());
            else 
                this.jTextFieldPassword.setText( "");
            this.jCheckBoxSavePassword.setSelected( con.isSavePassword());
        }
        
    }

    public IReportConnection getIReportConnection() {
        
        IReportConnection irConn = new JDBCConnection();
        //irConn.setName( this.jTextFieldName.getText().trim() );
//        ((JDBCConnection)irConn).setServerAddress( this.jTextFieldServerAddress.getText().trim() );
//        ((JDBCConnection)irConn).setDatabase( this.jTextFieldDBName.getText().trim() );
        ((JDBCConnection)irConn).setUsername( this.jTextFieldUsername.getText().trim() );
        if (jCheckBoxSavePassword.isSelected())
            ((JDBCConnection)irConn).setPassword( new String( this.jTextFieldPassword.getPassword() ) );
        else
            ((JDBCConnection)irConn).setPassword("");
        ((JDBCConnection)irConn).setSavePassword( jCheckBoxSavePassword.isSelected() );
        
        Object obj = jComboBoxJDBCDriver.getSelectedItem();
        String driver = obj+"";
        if (obj instanceof JDBCDriverDefinition)
        {
            driver = ((JDBCDriverDefinition)obj).getDriverName();
        }
        
        ((JDBCConnection)irConn).setJDBCDriver( driver.trim() );
        if (driver.trim().length() == 0 ||
            driver.indexOf(" ") >= 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    I18n.getString("JDBCConnectionEditor.Message.JDBCDriver"), //"messages.connectionDialog.jdbc.invalidDriver"
                    I18n.getString("JDBCConnectionEditor.Message.InvalidDriver"), //"messages.connectionDialog.jdbc.invalidDriverCaption"
                    javax.swing.JOptionPane.WARNING_MESSAGE );
            return null;
        }

        if (this.jTextFieldJDBCUrl.getText().trim().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    I18n.getString("JDBCConnectionEditor.Message.JDBCurl"), //"messages.connectionDialog.jdbc.invalidUrl"
                    I18n.getString("JDBCConnectionEditor.Message.InvalidUrl"), //"messages.connectionDialog.jdbc.invalidUrlCaption"
                    javax.swing.JOptionPane.WARNING_MESSAGE );
            return null;
        }
        ((JDBCConnection)irConn).setUrl(this.jTextFieldJDBCUrl.getText().trim());
            
        iReportConnection = irConn;
        return iReportConnection;
    }
    
    /*
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jCheckBoxSavePassword.setText(I18n.getString("connectionDialog.checkBoxSavePassword","Save password"));
                jButtonWizard.setText(I18n.getString("connectionDialog.buttonWizard","Wizard"));
                jLabel14.setText(I18n.getString("connectionDialog.label14","Server Address"));
                jLabel2.setText(I18n.getString("connectionDialog.label2","JDBC Driver"));
                jLabel3.setText(I18n.getString("connectionDialog.label3","JDBC URL"));
                jLabel5.setText(I18n.getString("connectionDialog.label5","Database"));
                jLabel6.setText(I18n.getString("connectionDialog.label6","Username"));
                jLabel7.setText(I18n.getString("connectionDialog.label7","Password"));
                
                ((javax.swing.border.TitledBorder)jPanel2.getBorder()).setTitle( it.businesslogic.ireport.util.I18n.getString("connectionDialog.panelBorder.jdbcUrlWizard","JDBC URL Wizard") );
                
                jLabel1.setText( "<html>" + I18n.getString("connectionDialog.textArea1","ATTENTION! Passwords are stored in clear text. If you dont specify a password now, iReport will ask you for one only when required and will not save it."));
                
    }
    */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxSavePassword;
    private javax.swing.JComboBox jComboBoxJDBCDriver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelJDBC;
    private javax.swing.JTextField jTextFieldJDBCUrl;
    private javax.swing.JPasswordField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
    
}
