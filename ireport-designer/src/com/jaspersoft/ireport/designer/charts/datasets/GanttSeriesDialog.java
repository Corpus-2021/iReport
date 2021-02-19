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
package com.jaspersoft.ireport.designer.charts.datasets;

import com.jaspersoft.ireport.locale.I18n;
import com.jaspersoft.ireport.designer.editor.ExpressionContext;
import com.jaspersoft.ireport.designer.utils.Misc;
import net.sf.jasperreports.engine.JRHyperlink;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignHyperlink;

/**
 *
 * @author  Administrator
 */
public class GanttSeriesDialog extends javax.swing.JDialog {
    
    private JRDesignExpression seriesExpression = null;
    private JRDesignExpression taskExpression = null;
    private JRDesignExpression subtaskExpression = null;
    private JRDesignExpression startDateExpression = null;
    private JRDesignExpression endDateExpression = null;
    private JRDesignExpression percentExpression = null;
    
    private ExpressionContext expressionContext = null;

    private int dialogResult = javax.swing.JOptionPane.CANCEL_OPTION;
    
    /** Creates new form CategorySeriesDialog */
    public GanttSeriesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //applyI18n();
        
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        
        javax.swing.KeyStroke escape =  javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0, false);
        javax.swing.Action escapeAction = new javax.swing.AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jButtonCancelActionPerformed(e);
            }
        };
       
        getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, I18n.getString("Global.Pane.Escape"));
        getRootPane().getActionMap().put(I18n.getString("Global.Pane.Escape"), escapeAction);


        //to make the default button ...
        this.getRootPane().setDefaultButton(this.jButtonOK);

        jTabbedPane1.remove(1); // Remove the hyperlink panel...
    }
    
    /**
     * this method is used to pass the correct subdataset to the expression editor
     */
    public void setExpressionContext(ExpressionContext ec)
    {
        jRTextExpressionSubtask.setExpressionContext(ec);
        jRTextExpressionEndDate.setExpressionContext(ec);
        jRTextExpressionSeries.setExpressionContext(ec);
        jRTextExpressionTask.setExpressionContext(ec);
        jRTextExpressionStartDate.setExpressionContext(ec);
        jRTextExpressionPercent.setExpressionContext(ec);
//        sectionItemHyperlinkPanel1.setExpressionContext(ec);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelSeriesExpression = new javax.swing.JLabel();
        jLabelStartDateExpression = new javax.swing.JLabel();
        jLabelEndDateExpression = new javax.swing.JLabel();
        jLabelValueExpression = new javax.swing.JLabel();
        jLabelLabelExpression = new javax.swing.JLabel();
        jLabelLabelExpression1 = new javax.swing.JLabel();
        jRTextExpressionSeries = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        jRTextExpressionTask = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        jRTextExpressionSubtask = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        jRTextExpressionStartDate = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        jRTextExpressionEndDate = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        jRTextExpressionPercent = new com.jaspersoft.ireport.designer.editor.ExpressionEditorArea();
        sectionItemHyperlinkPanel1 = new com.jaspersoft.ireport.designer.tools.HyperlinkPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Time period series");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelSeriesExpression.setText("Series expression (required)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jLabelSeriesExpression, gridBagConstraints);

        jLabelStartDateExpression.setText("Task expression (required)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jLabelStartDateExpression, gridBagConstraints);

        jLabelEndDateExpression.setText("Subtask expression (required)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jLabelEndDateExpression, gridBagConstraints);

        jLabelValueExpression.setText("Start date expression");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jLabelValueExpression, gridBagConstraints);

        jLabelLabelExpression.setText("End date expression");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jLabelLabelExpression, gridBagConstraints);

        jLabelLabelExpression1.setText("Percent expression");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jLabelLabelExpression1, gridBagConstraints);

        jRTextExpressionSeries.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionSeries.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionSeries.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionSeries, gridBagConstraints);

        jRTextExpressionTask.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionTask.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionTask.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionTask, gridBagConstraints);

        jRTextExpressionSubtask.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionSubtask.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionSubtask.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionSubtask, gridBagConstraints);

        jRTextExpressionStartDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionStartDate.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionStartDate.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionStartDate, gridBagConstraints);

        jRTextExpressionEndDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionEndDate.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionEndDate.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionEndDate, gridBagConstraints);

        jRTextExpressionPercent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionPercent.setMinimumSize(new java.awt.Dimension(10, 10));
        jRTextExpressionPercent.setPreferredSize(new java.awt.Dimension(10, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jRTextExpressionPercent, gridBagConstraints);

        jTabbedPane1.addTab("Data", jPanel1);
        jTabbedPane1.addTab("Item Hyperlink", sectionItemHyperlinkPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel6.add(jPanel7, gridBagConstraints);

        jButtonOK.setMnemonic('o');
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel6.add(jButtonOK, gridBagConstraints);

        jButtonCancel.setMnemonic('c');
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        jPanel6.add(jButtonCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel6, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //sectionItemHyperlinkPanel1.openExtraWindows();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed

        setSeriesExpression(Misc.createExpression(null, jRTextExpressionSeries.getText()));
        setTaskExpression(Misc.createExpression("java.lang.String", jRTextExpressionTask.getText()));
        setSubtaskExpression(Misc.createExpression("java.lang.String", jRTextExpressionSubtask.getText()));
        setStartDateExpression(Misc.createExpression("java.util.Date", jRTextExpressionStartDate.getText()));//NOI18N
        setEndDateExpression(Misc.createExpression("java.util.Date", jRTextExpressionEndDate.getText()));// NOI18N
        setPercentExpression(Misc.createExpression("java.lang.Number", jRTextExpressionPercent.getText()));

        java.text.MessageFormat formatter = new java.text.MessageFormat(  I18n.getString("GanttSeriesDialog.Message.Cannot_be_blank!"));

        if (getTaskExpression() == null) {
            
           javax.swing.JOptionPane.showMessageDialog(this, formatter.format(new Object[]{I18n.getString("GanttSeriesDialog.Pane.TaskExpression")}) ,I18n.getString("GanttSeriesDialog.Message.InvalidExpression"),javax.swing.JOptionPane.ERROR_MESSAGE);
           return;
        } 
        
        if (getSubtaskExpression() == null) {

           javax.swing.JOptionPane.showMessageDialog(this, formatter.format(new Object[]{I18n.getString("GanttSeriesDialog.Pane.SubtaskExpression")}) ,I18n.getString("GanttSeriesDialog.Message.InvalidExpression"),javax.swing.JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        this.setDialogResult(javax.swing.JOptionPane.OK_OPTION);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed
    
    public JRDesignExpression getSeriesExpression() {
        return seriesExpression;
    }

    public void setSeriesExpression(JRDesignExpression exp) {
        this.seriesExpression = null;
        if (exp != null)
        {
            try {
                this.seriesExpression = (JRDesignExpression)exp.clone();
            }  catch (Exception ex) { }
        }
        jRTextExpressionSeries.setText(Misc.getExpressionText(exp));
    }


    
    public void setSectionItemHyperlink(JRDesignHyperlink sectionItemHyperlink)
    {
        sectionItemHyperlinkPanel1.setHyperlink( sectionItemHyperlink );
    }
    
    public JRHyperlink getSectionItemHyperlink()
    {
        return sectionItemHyperlinkPanel1.getHyperlink();
    }

    public int getDialogResult() {
        return dialogResult;
    }

    public void setDialogResult(int dialogResult) {
        this.dialogResult = dialogResult;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabelEndDateExpression;
    private javax.swing.JLabel jLabelLabelExpression;
    private javax.swing.JLabel jLabelLabelExpression1;
    private javax.swing.JLabel jLabelSeriesExpression;
    private javax.swing.JLabel jLabelStartDateExpression;
    private javax.swing.JLabel jLabelValueExpression;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionEndDate;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionPercent;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionSeries;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionStartDate;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionSubtask;
    private com.jaspersoft.ireport.designer.editor.ExpressionEditorArea jRTextExpressionTask;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.jaspersoft.ireport.designer.tools.HyperlinkPanel sectionItemHyperlinkPanel1;
    // End of variables declaration//GEN-END:variables
    
    /*
        public void applyI18n()
        {
                // Start autogenerated code ----------------------
                // End autogenerated code ----------------------
            jButtonOK.setText( it.businesslogic.ireport.util.I18n.getString("ok","Ok"));
            jButtonCancel.setText( it.businesslogic.ireport.util.I18n.getString("cancel","Cancel"));
             
            jLabelStartDateExpression.setText( it.businesslogic.ireport.util.I18n.getString("charts.startDateExpression","Start date expression"));
            jLabelEndDateExpression.setText( it.businesslogic.ireport.util.I18n.getString("charts.endDateExpression","End date expression"));
            jLabelSeriesExpression.setText( it.businesslogic.ireport.util.I18n.getString("charts.seriesExpression","Series expression"));
            jLabelValueExpression.setText( it.businesslogic.ireport.util.I18n.getString("charts.valueExpression","Value expression"));
            jLabelLabelExpression.setText( it.businesslogic.ireport.util.I18n.getString("charts.labelExpression","Label expression"));
            
            jTabbedPane1.setTitleAt(0,I18n.getString("chartSeries.tab.Data","Data"));
            jTabbedPane1.setTitleAt(1,I18n.getString("chartSeries.tab.ItemHyperlink","Item hyperlink"));

            this.setTitle(it.businesslogic.ireport.util.I18n.getString("gui.ChartPropertiesDialog.title","Chart properties"));
            
            jButtonCancel.setMnemonic(I18n.getString("timePeriodSeriesDialog.buttonCancelMnemonic","c").charAt(0));
            jButtonOK.setMnemonic(I18n.getString("timePeriodSeriesDialog.buttonOKMnemonic","o").charAt(0));
            
            this.getRootPane().updateUI();
        }
   */
    public JRDesignExpression getStartDateExpression() {
        return startDateExpression;
    }

    public void setStartDateExpression(JRDesignExpression exp) {
        this.startDateExpression = null;
        if (exp != null)
        {
            try {
                this.startDateExpression = (JRDesignExpression)exp.clone();
            } catch (Exception ex) { }
        }
        jRTextExpressionStartDate.setText(Misc.getExpressionText(exp));
    }

    public JRDesignExpression getEndDateExpression() {
        return endDateExpression;
    }

    public void setEndDateExpression(JRDesignExpression exp) {
        this.endDateExpression = null;
        if (exp != null)
        {
            try {
                this.endDateExpression = (JRDesignExpression)exp.clone();
            }  catch (Exception ex) { }
        }
        jRTextExpressionEndDate.setText(Misc.getExpressionText(exp));
    }

   
    /**
     * @return the taskExpression
     */
    public JRDesignExpression getTaskExpression() {
        return taskExpression;
    }

    /**
     * @param taskExpression the taskExpression to set
     */
    public void setTaskExpression(JRDesignExpression exp) {
        this.taskExpression = null;
        if (exp != null)
        {
            try {
                this.taskExpression = (JRDesignExpression)exp.clone();
            }  catch (Exception ex) { }
        }
        jRTextExpressionTask.setText(Misc.getExpressionText(exp));
    }

    /**
     * @return the subtaskExpression
     */
    public JRDesignExpression getSubtaskExpression() {
        return subtaskExpression;
    }

    /**
     * @param subtaskExpression the subtaskExpression to set
     */
    public void setSubtaskExpression(JRDesignExpression exp) {
        this.subtaskExpression = null;
        if (exp != null)
        {
            try {
                this.subtaskExpression = (JRDesignExpression)exp.clone();
            }  catch (Exception ex) { }
        }
        jRTextExpressionSubtask.setText(Misc.getExpressionText(exp));
    }

    /**
     * @return the percentExpression
     */
    public JRDesignExpression getPercentExpression() {
        return percentExpression;
    }

    /**
     * @param percentExpression the percentExpression to set
     */
    public void setPercentExpression(JRDesignExpression exp) {
        this.percentExpression = null;
        if (exp != null)
        {
            try {
                this.percentExpression = (JRDesignExpression)exp.clone();
            }  catch (Exception ex) { }
        }
        jRTextExpressionPercent.setText(Misc.getExpressionText(exp));
    }
}