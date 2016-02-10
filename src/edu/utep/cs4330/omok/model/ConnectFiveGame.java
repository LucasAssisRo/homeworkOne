/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.model;

/**
 *
 * @author Lucas Assis Rodrigues and John Ramirez
 */
public class ConnectFiveGame {

    private Player[] players;
    private Board board;
    private boolean playerOneTurn;
    private boolean gameStarted;

    /**
     *
     */
    public ConnectFiveGame() {
        players = new Player[2];
        players[0] = new Player(this, true);
        players[0].setName("Player 1");
        players[1] = new Player(this, false);
        players[1].setName("Player 2");
        playerOneTurn = true;
        gameStarted = false;
        board = new Board();
    }

    /**
     * Creates a new board -
     * Sets the turn as black -
     * Starts the game
     */
    public void startNewGame() {
        board = new Board();
        gameStarted = true;
        playerOneTurn = true;
    }

    /**
     *
     * @return Returns an array with booth players
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     *
     * @param players Sets an array with booth players
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     *
     * @return Returns the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     *
     * @param board Sets the board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     *
     * @return Returns if is the players one turn
     */
    public boolean isPlayerOneTurn() {
        return playerOneTurn;
    }

    /**
     *
     * @param playerOneTurn Sets if it is players one turn
     */
    public void setPlayerOneTurn(boolean playerOneTurn) {
        this.playerOneTurn = playerOneTurn;
    }

    /**
     *
     * @return Returns if the game started
     */
    public boolean isGameStarted() {
        return gameStarted;
    }

    /**
     *
     * @param gameStarted Sets if the game started
     */
    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

}
