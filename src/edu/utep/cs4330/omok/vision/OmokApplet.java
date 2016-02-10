/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.vision;

import java.lang.reflect.InvocationTargetException;
import javax.swing.JApplet;

/**
 *
 * @author Lucas Assis Rodrigues and John Ramirez
 */
public class OmokApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private MainJPanel jPanelMain;

    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        try {
            javax.swing.SwingUtilities.invokeAndWait(() -> {
                createGUI();
            });
        } catch (InterruptedException | InvocationTargetException e) {
            System.err.println("createGUI didn't successfully complete");
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
    private void createGUI() {
        jPanelMain = new MainJPanel();
        add(jPanelMain);
    }
}
