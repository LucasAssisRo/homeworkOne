/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.vision;

import edu.utep.cs4330.omok.model.ConnectFiveGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author lucasassisrodrigues
 */
public class BoardPanel extends JPanel {
    
    private Color colorBoard;
    private Color colorLine;
    private ConnectFiveGame connectFiveGame;
    
    /**
     *
     */
    public BoardPanel() {
        colorBoard = new Color(218, 165, 32);
        colorLine = Color.BLACK;
        connectFiveGame = new ConnectFiveGame();
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                if (connectFiveGame.isGameStarted()) {
                    int x, y;
                    int playerIndex;
                    x = e.getX() / 40;
                    if (e.getX() % 40 > 20) {
                        x++;
                    }
                    y = e.getY() / 40;
                    if (e.getY() % 40 > 20) {
                        y++;
                    }
                    if (connectFiveGame.isPlayerOneTurn()) {
                        playerIndex = 0;
                    } else {
                        playerIndex = 1;
                    }
                    if (connectFiveGame.getBoard().getBoardMatrix()[x][y] == ' ') {
                        if (connectFiveGame.getBoard().placeToken(connectFiveGame.getPlayers()[playerIndex], x, y)) {
                            repaint();
                            JOptionPane.showMessageDialog(null, "Player "+(playerIndex + 1) + " won!!!!");
                            connectFiveGame.setGameStarted(false);
                        }
                        connectFiveGame.setPlayerOneTurn(!connectFiveGame.isPlayerOneTurn());
                        repaint();
                    }
                }
            }
        });
    }
    
    /**
     * Event function for starting a new game
     */
    public void newGame() {
        connectFiveGame.startNewGame();
        repaint();
    }
    
    /**
     *
     * @return Returns the color of the board
     */
    public Color getColorBoard() {
        return colorBoard;
    }
    
    /**
     *
     * @param colorBoard Sets the color of the board
     */
    public void setColorBoard(Color colorBoard) {
        this.colorBoard = colorBoard;
    }
    
    /**
     *
     * @return Returns the color of the lines of the board
     */
    public Color getColorLine() {
        return colorLine;
    }
    
    /**
     *
     * @param colorLine Sets the color of the lines of the board
     */
    public void setColorLine(Color colorLine) {
        this.colorLine = colorLine;
    }
    
    /**
     *
     * @return Returns the instance of the current game
     */
    public ConnectFiveGame getConnectFiveGame() {
        return connectFiveGame;
    }
    
    /**
     *
     * @param connectFiveGame Sets the instance of the current game
     */
    public void setConnectFiveGame(ConnectFiveGame connectFiveGame) {
        this.connectFiveGame = connectFiveGame;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        setBackground(colorBoard);
        g.setColor(colorLine);
        for (int i = 0; i <= getWidth(); i += getWidth() / 9) {
            g.drawLine(i, 0, i, getHeight());
        }
        for (int i = 0; i <= getHeight(); i += getHeight() / 9) {
            g.drawLine(0, i, getHeight(), i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                char c = connectFiveGame.getBoard().getBoardMatrix()[i][j];
                if (c == 'B') {
                    g.setColor(Color.BLACK);
                    g.fillOval(i * 40 - 10, j * 40 - 10, 20, 20);
                }
                if (c == 'W') {
                    g.setColor(Color.WHITE);
                    g.fillOval(i * 40 - 10, j * 40 - 10, 20, 20);
                }
                if (c == '!') {
                    g.setColor(Color.RED);
                    g.fillOval(i * 40 - 10, j * 40 - 10, 20, 20);
                }
            }
        }
        System.out.println("--------------------------");
        for (char[] c : connectFiveGame.getBoard().getBoardMatrix()) {
            System.out.println("");
            for (char d : c) {
                System.out.print("[" + d + "]");
            }
        }
        System.out.println("\n--------------------------");
        g.setColor(colorLine);
    }
}
