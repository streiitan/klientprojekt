package com.example.klientprojekt;

import java.io.Serializable;

/**
 * The class Represent a single piece.
 *
 * @author Ann Johansson & Jennifer Streit
 *
 */
public class Piece implements Serializable {

    private String color;
    private boolean isKing;
    private CellNode placed;

    public static final String DARK = "Dark";
    public static final String LIGHT = "Light";

    /**
     */
    public Piece(String color){
     /* TODO registrera vilken användares pjäs som ska hanteras samt den exakta. */
        this.color = color;
        this.isKing = false;
        this.placed = null;
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
        this.isKing = true;
    }
    /**
     *
     * @param CellNode is the place where the piece is to be set.
     */
    public void setCellNode(CellNode CellNode){
    this.placed = CellNode;
    }
    /**
     *
     * @return the CellNode where this piece is set.
     */
    public CellNode getCellNode(){
    return this.placed;
    }
    public static String getOpponentColor(String givenColor){
        if(givenColor.equals(Piece.DARK)){
            return Piece.LIGHT;
        }
        else if(givenColor.equals(Piece.LIGHT)){
            return Piece.DARK;
        }
        else{
            System.out.println("Given color is not valid. Given color: " + givenColor);
            return null;
        }
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Piece)){
            return false;
        }

        Piece givenPiece =  (Piece) obj;

        if(givenPiece.getColor().equals(this.color) && givenPiece.isKing() == this.isKing &&
                givenPiece.getCell().getX() == this.placedCell.getX() && givenPiece.getCell().getY() == this.placedCell.getY()){
            return true;
        }
        return false;
    }
}
