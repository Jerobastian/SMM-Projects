package main;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author jcc
 */
public class VentanaPrincipal extends javax.swing.JFrame 
{
    public VentanaPrincipal()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tools = new javax.swing.ButtonGroup();
        topPanel = new javax.swing.JPanel();
        draw = new javax.swing.JToggleButton();
        line = new javax.swing.JToggleButton();
        rectangle = new javax.swing.JToggleButton();
        oval = new javax.swing.JToggleButton();
        bottomPanel = new javax.swing.JPanel();
        atributesPanel = new javax.swing.JPanel();
        colorsPanel = new javax.swing.JPanel();
        black = new javax.swing.JButton();
        red = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        white = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        green = new javax.swing.JButton();
        filledPanel = new javax.swing.JPanel();
        fill = new javax.swing.JCheckBox();
        statusPanel = new javax.swing.JPanel();
        toolLabel = new javax.swing.JLabel();
        tool = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        lienzo = new main.Lienzo();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        create = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));

        topPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        tools.add(draw);
        draw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Lapiz.gif"))); // NOI18N
        draw.setSelected(true);
        draw.setMinimumSize(new java.awt.Dimension(5, 5));
        draw.setPreferredSize(new java.awt.Dimension(30, 30));
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });
        topPanel.add(draw);

        tools.add(line);
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Linea.gif"))); // NOI18N
        line.setMinimumSize(new java.awt.Dimension(5, 5));
        line.setPreferredSize(new java.awt.Dimension(30, 30));
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });
        topPanel.add(line);

        tools.add(rectangle);
        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rectangulo.gif"))); // NOI18N
        rectangle.setMinimumSize(new java.awt.Dimension(5, 5));
        rectangle.setPreferredSize(new java.awt.Dimension(30, 30));
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        topPanel.add(rectangle);

        tools.add(oval);
        oval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ovalo.gif"))); // NOI18N
        oval.setMinimumSize(new java.awt.Dimension(5, 5));
        oval.setPreferredSize(new java.awt.Dimension(30, 30));
        oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalActionPerformed(evt);
            }
        });
        topPanel.add(oval);

        getContentPane().add(topPanel, java.awt.BorderLayout.PAGE_START);

        bottomPanel.setLayout(new java.awt.BorderLayout());

        atributesPanel.setLayout(new java.awt.GridLayout(1, 0));

        colorsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.setMinimumSize(new java.awt.Dimension(10, 10));
        black.setPreferredSize(new java.awt.Dimension(25, 25));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });
        colorsPanel.add(black);

        red.setBackground(new java.awt.Color(255, 0, 51));
        red.setPreferredSize(new java.awt.Dimension(25, 25));
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        colorsPanel.add(red);

        blue.setBackground(new java.awt.Color(0, 51, 255));
        blue.setPreferredSize(new java.awt.Dimension(25, 25));
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        colorsPanel.add(blue);

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setPreferredSize(new java.awt.Dimension(25, 25));
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        colorsPanel.add(white);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.setPreferredSize(new java.awt.Dimension(25, 25));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });
        colorsPanel.add(yellow);

        green.setBackground(new java.awt.Color(51, 255, 0));
        green.setPreferredSize(new java.awt.Dimension(25, 25));
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        colorsPanel.add(green);

        atributesPanel.add(colorsPanel);

        filledPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        fill.setText("Rellenar");
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });
        filledPanel.add(fill);

        atributesPanel.add(filledPanel);

        bottomPanel.add(atributesPanel, java.awt.BorderLayout.CENTER);

        statusPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        toolLabel.setText("Herramienta: ");
        statusPanel.add(toolLabel);

        tool.setText("Dibujo Libre");
        statusPanel.add(tool);

        colorLabel.setText("Color: ");
        statusPanel.add(colorLabel);

        color.setText("Negro");
        statusPanel.add(color);

        bottomPanel.add(statusPanel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });
        getContentPane().add(lienzo, java.awt.BorderLayout.CENTER);

        file.setText("File");

        create.setText("New...");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        file.add(create);

        open.setText("Open...");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        save.setText("Save...");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        menuBar.add(file);

        edit.setText("Edit");
        menuBar.add(edit);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        
        if( resp == JFileChooser.APPROVE_OPTION)
        {
            File f = dlg.getSelectedFile();
            Image image = new ImageIcon(f.getAbsolutePath()).getImage();
            this.lienzo.setImage(image);
            repaint();
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        
        if( resp == JFileChooser.APPROVE_OPTION)
        {
            File f = dlg.getSelectedFile();
            int w = this.lienzo.getWidth();
            int h = this.lienzo.getHeight();
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bi.createGraphics();
            this.lienzo.paint(g);
            try
            {
                ImageIO.write(bi, "png", f);
            }
            catch (IOException ex)
            {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        this.lienzo.setImage(null);
        this.lienzo.setOpaque(true);
        repaint();
    }//GEN-LAST:event_createActionPerformed

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        this.lienzo.setTool(Tool.DRAW);
        this.tool.setText("Dibujo Libre");
    }//GEN-LAST:event_drawActionPerformed

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
        this.lienzo.setTool(Tool.LINE);
        this.tool.setText("Línea");
    }//GEN-LAST:event_lineActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        this.lienzo.setTool(Tool.RECTANGLE);
        this.tool.setText("Rectángulo");
    }//GEN-LAST:event_rectangleActionPerformed

    private void ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalActionPerformed
        this.lienzo.setTool(Tool.OVAL);
        this.tool.setText("Óvalo");
    }//GEN-LAST:event_ovalActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        this.lienzo.setActiveColor(this.black.getBackground());
        this.color.setText("Negro");
    }//GEN-LAST:event_blackActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        this.lienzo.setActiveColor(this.red.getBackground());
        this.color.setText("Rojo");
    }//GEN-LAST:event_redActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        this.lienzo.setActiveColor(this.blue.getBackground());
        this.color.setText("Azul");
    }//GEN-LAST:event_blueActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        this.lienzo.setActiveColor(this.white.getBackground());
        this.color.setText("Blanco");
    }//GEN-LAST:event_whiteActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        this.lienzo.setActiveColor(this.yellow.getBackground());
        this.color.setText("Amarillo");
    }//GEN-LAST:event_yellowActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        this.lienzo.setActiveColor(this.green.getBackground());
        this.color.setText("Verde");
    }//GEN-LAST:event_greenActionPerformed

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
        this.lienzo.changeFill();
    }//GEN-LAST:event_fillActionPerformed

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        this.startPoint = evt.getPoint();
        
        this.lienzo.draw(this.startPoint, this.startPoint);
        
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        this.endPoint = evt.getPoint();
        
        this.lienzo.draw(this.startPoint, this.endPoint);
        
        //repaint();
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        this.endPoint = evt.getPoint();
        
        this.lienzo.draw(this.startPoint, this.endPoint);
        
        //repaint();
    }//GEN-LAST:event_lienzoMouseReleased

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        new VentanaPrincipal().setVisible(true);
    }

    private Point startPoint = new Point(0, 0);
    private Point endPoint = this.startPoint;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atributesPanel;
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel color;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JPanel colorsPanel;
    private javax.swing.JMenuItem create;
    private javax.swing.JToggleButton draw;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JCheckBox fill;
    private javax.swing.JPanel filledPanel;
    private javax.swing.JButton green;
    private main.Lienzo lienzo;
    private javax.swing.JToggleButton line;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem open;
    private javax.swing.JToggleButton oval;
    private javax.swing.JToggleButton rectangle;
    private javax.swing.JButton red;
    private javax.swing.JMenuItem save;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel tool;
    private javax.swing.JLabel toolLabel;
    private javax.swing.ButtonGroup tools;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton white;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}
