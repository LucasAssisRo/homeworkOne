/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utep.cs4330.omok.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john
 */


//Junit Testing of Omok Game
//
//Method tested: placeToken()
//
//To generate a complete set of test data we used various x and y coordinates to simulate tokens placed horizontally, vertically, and diagonally.
//Horizontal: The x coordinate was incremented up to five times while the y coordinate was constant to test if five tokens placed in a row would trigger a victory.
//Vertical: The x coordinate was constant while the y coordinate was incremented up to five times to test if five tokens placed in a column would trigger a victory.
//Diagonal: The x and y coordinates were incremented up to five times to test if five tokens placed diagonally would trigger a victory.


public class BoardTest {
    
    public BoardTest() {
    }

    /**
     * Test of placeToken method, of class Board.
     */
    @Test
    public void testPlaceTokenHorizontally() {
 
        System.out.println("placeTokenHorizontally");
        Player player = new Player(new ConnectFiveGame(), true);
        int xCor = 1;
        int yCor = 0;
        Board instance = new Board();
        boolean expResult = true;
        
        boolean result = instance.placeToken(player, xCor, yCor);
        while(xCor < 5){
            xCor++;
            result = instance.placeToken(player, xCor, yCor);
        }
        assertEquals(expResult, result);
    }
    
    /**
     * Test of placeToken method, of class Board.
     */
    @Test
    public void testPlaceTokenVertically() {
 
        System.out.println("placeTokenVertically");
        Player player = new Player(new ConnectFiveGame(), true);
        int xCor = 0;
        int yCor = 1;
        Board instance = new Board();
        boolean expResult = true;
        
        boolean result = instance.placeToken(player, xCor, yCor);
        while(yCor < 5){
            yCor++;
            result = instance.placeToken(player, xCor, yCor);
        }
        assertEquals(expResult, result);
    }
    
    /**
     * Test of placeToken method, of class Board.
     */
    @Test
    public void testPlaceTokenDiagonally() {
 
        System.out.println("placeTokenDiagonally");
        Player player = new Player(new ConnectFiveGame(), true);
        int xCor = 0;
        int yCor = 1;
        Board instance = new Board();
        boolean expResult = true;
        
        boolean result = instance.placeToken(player, xCor, yCor);
        while(xCor < 5 && yCor < 5){
            xCor++; yCor++;
            result = instance.placeToken(player, xCor, yCor);
        }
        assertEquals(expResult, result);
    }
}
