package com.view;

import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Dimension;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class ZhuMainClass {
    boolean packFrame = false;

    /**
     * Construct and show the application.
     */
    public ZhuMainClass() {
        ZhuFrame frame = new ZhuFrame();
        // Validate frames that have preset sizes
        // Pack frames that have useful preferred size info, e.g. from their layout
        if (packFrame) {
            frame.pack();
        } else {
            frame.validate();
        }

        // Center the window
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        /*frame.setLocation((screenSize.width - frameSize.width) / 2,
                          (screenSize.height - frameSize.height) / 2);*/
        frame.setLocation(0,0);
        frame.setSize(screenSize.width,screenSize.height);
        frame.setVisible(true);
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Application entry point.
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                        /*UIManager.setLookAndFeel(
                                 new com.birosoft.liquid.LiquidLookAndFeel());*/
                         /** 通过皮肤类，包装窗体组件——通过substance.jar*/
                         UIManager.setLookAndFeel(
                          new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());

                } catch (Exception exception) {
                   exception.printStackTrace();
                }
                javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
                new ZhuMainClass();
            }
        });
    }

    private void jbInit() throws Exception {
    }
}
