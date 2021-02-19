/*
 * iReport - Visual Designer for JasperReports.
 * Copyright (C) 2002 - 2013 Jaspersoft Corporation. All rights reserved.
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
package com.jaspersoft.ireport.jasperserver.ui.wizards;

import com.jaspersoft.ireport.jasperserver.JServer;
import com.jaspersoft.ireport.jasperserver.JasperServerManager;
import com.jaspersoft.ireport.jasperserver.ui.ValidationUtils;
import javax.swing.JPanel;

public final class ReportUnitVisualPanel1 extends JPanel {

    private ReportUnitWizardPanel1 wizardPanel = null;
    
    public ReportUnitWizardPanel1 getWizardPanel() {
        return wizardPanel;
    }

    public void setWizardPanel(ReportUnitWizardPanel1 wizardPanel) {
        this.wizardPanel = wizardPanel;
    }
    
    /** Creates new form ReportUnitVisualPanel2 */
    public ReportUnitVisualPanel1(ReportUnitWizardPanel1 wizardPanel) {
        initComponents();
        this.wizardPanel = wizardPanel;
        
        jTextFieldUriString.setText(getParentFolder());
                
                
        javax.swing.event.DocumentListener dl = new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent evt) {
                if (getWizardPanel() != null) getWizardPanel().fireChangeEvent();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent evt) {
                if (getWizardPanel() != null) getWizardPanel().fireChangeEvent();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent evt) {
                if (getWizardPanel() != null) getWizardPanel().fireChangeEvent();
            }
        };
        
        this.jTextFieldLabel.getDocument().addDocumentListener( dl);
        this.jTextFieldName.getDocument().addDocumentListener(dl);
        this.jEditorPaneDescription.getDocument().addDocumentListener(dl);
    }
    
    public JServer getServer()
    {
        return getWizardPanel().getWizardDescriptor().getServer();
    }
    
    public String getParentFolder()
    {
        return getWizardPanel().getWizardDescriptor().getParentFolder();
    }

    @Override
    public String getName() {
        return JasperServerManager.getString("newReportUnitWizard.step.naming","Naming");
    }

    public void validateForm() throws Exception
    {
        ValidationUtils.validateName( jTextFieldName.getText() );
        ValidationUtils.validateLabel( jTextFieldLabel.getText() );
        ValidationUtils.validateDesc( jEditorPaneDescription.getText() );
    }

    void storeSettings(ReportUnitWizardDescriptor wizardDescriptor) {
        wizardDescriptor.putProperty("uri", jTextFieldUriString.getText());
        wizardDescriptor.putProperty("name", jTextFieldName.getText());
        wizardDescriptor.putProperty("label", jTextFieldLabel.getText());
        wizardDescriptor.putProperty("description", jEditorPaneDescription.getText());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel0 = new javax.swing.JPanel();
        jLabelUriString = new javax.swing.JLabel();
        jTextFieldUriString = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelLabel = new javax.swing.JLabel();
        jTextFieldLabel = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneDescription = new javax.swing.JEditorPane();
        jLabelError = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPanel0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel0PropertyChange(evt);
            }
        });
        jPanel0.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabelUriString, "Parent folder");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel0.add(jLabelUriString, gridBagConstraints);

        jTextFieldUriString.setEditable(false);
        jTextFieldUriString.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldUriString.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel0.add(jTextFieldUriString, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabelName, "ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel0.add(jLabelName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel0.add(jTextFieldName, gridBagConstraints);

        jSeparator2.setMinimumSize(new java.awt.Dimension(0, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 6, 4);
        jPanel0.add(jSeparator2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabelLabel, "Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel0.add(jLabelLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel0.add(jTextFieldLabel, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabelDescription, "Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        jPanel0.add(jLabelDescription, gridBagConstraints);

        jScrollPane1.setViewportView(jEditorPaneDescription);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel0.add(jScrollPane1, gridBagConstraints);

        jLabelError.setForeground(new java.awt.Color(204, 0, 51));
        org.openide.awt.Mnemonics.setLocalizedText(jLabelError, " ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel0.add(jLabelError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel0, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel0PropertyChange
        
    }//GEN-LAST:event_jPanel0PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPaneDescription;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelLabel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUriString;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldLabel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUriString;
    // End of variables declaration//GEN-END:variables

    
}

