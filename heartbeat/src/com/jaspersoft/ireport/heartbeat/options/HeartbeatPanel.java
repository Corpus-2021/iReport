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
package com.jaspersoft.ireport.heartbeat.options;

import com.jaspersoft.ireport.designer.IReportManager;

final class HeartbeatPanel extends javax.swing.JPanel {

    private final HeartbeatOptionsPanelController controller;

    HeartbeatPanel(HeartbeatOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    private boolean init = false;

    public boolean setInit(boolean b)
    {
        boolean old = init;
        init =b;
        return old;
    }

    public boolean isInit()
    {
        return init;
    }

    /**
     * Notify a change in the UI.
     */
    public void notifyChange()
    {
        if (this.controller != null && !isInit())
        {
            controller.changed();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxShowDialog = new javax.swing.JCheckBox();
        jCheckBoxDisableVersionChecking = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxShowDialog, org.openide.util.NbBundle.getMessage(HeartbeatPanel.class, "HeartbeatPanel.jCheckBoxShowDialog.text")); // NOI18N
        jCheckBoxShowDialog.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxDisableVersionChecking, org.openide.util.NbBundle.getMessage(HeartbeatPanel.class, "HeartbeatPanel.jCheckBoxDisableVersionChecking.text")); // NOI18N
        jCheckBoxDisableVersionChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDisableVersionCheckingActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jCheckBoxShowDialog, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
            .add(jCheckBoxDisableVersionChecking, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jCheckBoxDisableVersionChecking)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBoxShowDialog)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxDisableVersionCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDisableVersionCheckingActionPerformed
        jCheckBoxShowDialog.setEnabled(!jCheckBoxDisableVersionChecking.isSelected());
    }//GEN-LAST:event_jCheckBoxDisableVersionCheckingActionPerformed

    void load() {
        setInit(true);
        //jCheckBoxJS30Compatibility.setSelected(IReportManager.getPreferences().getBoolean("use_jrxml_DTD", false));
        jCheckBoxDisableVersionChecking.setSelected(IReportManager.getPreferences().getBoolean("disable_heartbeat", false));
        jCheckBoxShowDialog.setSelected(IReportManager.getPreferences().getBoolean("show_update_dialog", true));

        jCheckBoxShowDialog.setEnabled(!jCheckBoxDisableVersionChecking.isSelected());
        setInit(false);
    }

    void store() {
        //IReportManager.getPreferences().putBoolean("use_jrxml_DTD", jCheckBoxJS30Compatibility.isSelected());
        IReportManager.getPreferences().putBoolean("disable_heartbeat", jCheckBoxDisableVersionChecking.isSelected());
        IReportManager.getPreferences().putBoolean("show_update_dialog", jCheckBoxShowDialog.isSelected());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxDisableVersionChecking;
    private javax.swing.JCheckBox jCheckBoxShowDialog;
    // End of variables declaration//GEN-END:variables
}
