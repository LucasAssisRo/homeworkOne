/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.vision;

import javax.swing.JDialog;

/**
 *
 * @author lucasassisrodrigues
 */
public class OmokDialog extends JDialog {

    private OmokApplet omokApplet;

    /**
     *
     */
    public OmokDialog() {
        createGUI();
    }

    /**
     *
     * @param args String array of arguments
     */
    public static void main(String[] args) {
        OmokDialog omokDialog = new OmokDialog();
        omokDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        omokDialog.setSize(800, 800);
        omokDialog.setResizable(false);
        omokDialog.setVisible(true);
    }

    private void createGUI() {
        omokApplet = new OmokApplet();
        omokApplet.init();
        add(omokApplet);
    }
}
