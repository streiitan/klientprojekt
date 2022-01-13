package com.example.klientprojekt;
/**
 * The class Represent a single piece.
 *
 * @author Ann Johansson & Jennifer Streit
 *
 */
public class ButtonPiece {
    private boolean isKing;


    public ButtonPiece(){
     /* TODO registrera vilken användares pjäs som ska hanteras samt den exakta. */
    }
    /**
    * Checks if the piece is a king or not.
    * @return returns true if the piece is a king or otherwise false.
    */
    public boolean isKing(){
        return this.isKing;
    }
    /**
     * Change the piece to be a king instead of a men.
     */
    public void makeKing(){
        //TODO Registrera pjäsen till en kung.
    }
}
