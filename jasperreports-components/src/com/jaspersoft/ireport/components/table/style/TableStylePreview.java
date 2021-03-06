/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TableStylePreview.java
 *
 * Created on 7-apr-2010, 10.38.40
 */

package com.jaspersoft.ireport.components.table.style;

import com.jaspersoft.ireport.designer.utils.ColorSchemaGenerator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author gtoffoli
 */
public class TableStylePreview extends javax.swing.JPanel {

    /** Creates new form TableStylePreview */
    public TableStylePreview() {
        initComponents();
    }

    private Color color = Color.BLUE;
    private Color borderColor = Color.BLACK;
    private String variant = ColorSchemaGenerator.SCHEMA_SOFT;
    private int  borderType = 0;
    private boolean  zebra = false;


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 225, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 229, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        int y = 5;
        int x = 5;
        int w = getWidth()-10;
        int h = getHeight()-10;

        int rowHeight = h/7;

        Rectangle row_bounds = new Rectangle(x,y + rowHeight*2, w, rowHeight);

        g.setColor(Color.WHITE);
        ((Graphics2D)g).fill(row_bounds);


        Color c = null;

        row_bounds = new Rectangle(x,y + rowHeight*3, w, rowHeight);

        g.setColor(Color.WHITE);
        if (isZebra())
        {
            c = ColorSchemaGenerator.createColor(getColor(), 2, getVariant());
            c = ColorSchemaGenerator.overlayWhite(c);
            c = ColorSchemaGenerator.overlayWhite(c);
            g.setColor(c);
        }
        ((Graphics2D)g).fill(row_bounds);

        row_bounds = new Rectangle(x,y + rowHeight*4, w, rowHeight);

        g.setColor(Color.WHITE);
        ((Graphics2D)g).fill(row_bounds);

        // TABLE HEADER
        row_bounds = new Rectangle(x,y + rowHeight*0, w, rowHeight);
        c = ColorSchemaGenerator.createColor(getColor(), 3, getVariant());
        g.setColor(c);
        ((Graphics2D)g).fill(row_bounds);

        // TABLE FOOTER
        row_bounds = new Rectangle(x,y + rowHeight*6, w, rowHeight);
        g.setColor(c);
        ((Graphics2D)g).fill(row_bounds);


        // COLUMN HEADER
        row_bounds = new Rectangle(x,y + rowHeight*1, w, rowHeight);
        c = ColorSchemaGenerator.createColor(getColor(), 2, getVariant());
        g.setColor(c);
        ((Graphics2D)g).fill(row_bounds);

        // COLUMN FOOTER
        row_bounds = new Rectangle(x,y + rowHeight*5, w, rowHeight);
        g.setColor(c);
        ((Graphics2D)g).fill(row_bounds);


        g.setColor(getBorderColor());
        // Draw border...
        for (int i=0; i<8; ++i)
        {
            ((Graphics2D)g).drawLine(x, y+rowHeight*i, x+w, y+rowHeight*i);
        }

        h = rowHeight*7;
        if (getBorderType() == 0)
        {
            for (int i=0; i<3; ++i)
            {
                ((Graphics2D)g).drawLine(x+(i*(w/3)), y, x+(i*(w/3)), y+h);
            }
            ((Graphics2D)g).drawLine(x+w, y, x+w, y+h-1);
        }
        if (getBorderType() == 2)
        {
            ((Graphics2D)g).drawLine(x, y, x, y+h);
            ((Graphics2D)g).drawLine(x+w, y, x+w, y+h-1);
        }

    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    /**
     * @return the variant
     */
    public String getVariant() {
        return variant;
    }

    /**
     * @param variant the variant to set
     */
    public void setVariant(String variant) {
        this.variant = variant;
        repaint();
    }

    /**
     * @return the borderType
     */
    public int getBorderType() {
        return borderType;
    }

    /**
     * @param borderType the borderType to set
     */
    public void setBorderType(int borderType) {
        this.borderType = borderType;
        repaint();
    }

    /**
     * @return the zebra
     */
    public boolean isZebra() {
        return zebra;
    }

    /**
     * @param zebra the zebra to set
     */
    public void setZebra(boolean zebra) {
        repaint();
        this.zebra = zebra;
    }

    /**
     * @return the borderColor
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderColor the borderColor to set
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}
