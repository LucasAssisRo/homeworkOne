/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.model;

/**
 *
 * @author lucasassisrodrigues
 */
public class Player {


    private String name;
    private boolean playerOne;
    private ConnectFiveGame connectFiveGame;

    /**
     *
     * @param connectFiveGame The instance of the game the player is playing
     * @param one Flag that indicates if the player one or two
     */
    public Player(ConnectFiveGame connectFiveGame, boolean one) {
        this.connectFiveGame = connectFiveGame;
        playerOne = one;
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

    /**
     *
     * @return Returns the players name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Sets the players name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Returns if is player one
     */
    public boolean isPlayerOne() {
        return playerOne;
    }

    /**
     *
     * @param playerOne Sets if is player one
     */
    public void setPlayerOne(boolean playerOne) {
        this.playerOne = playerOne;
    }

}
