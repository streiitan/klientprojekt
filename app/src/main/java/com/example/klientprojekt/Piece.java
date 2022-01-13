package com.example.klientprojekt;

import java.io.Serializable;

/**
 * The class Represent a single piece.
 *
 * @author Ann Johansson & Jennifer Streit
 *
 */
public class Piece implements Serializable {
    private boolean isKing;
    private CellNode placed;
    private String color;

    public static final String DARK = "Dark";
    public static final String LIGHT = "Light";

    /**
     */
    public Piece(String color){
        if(!(color.equals(Piece.DARK) || color.equals(Piece.LIGHT))){
            throw new IllegalArgumentException("The provided color for piece is not valid. Provided color: " + color);
        }
        this.color = color;
        this.isKing = false;
        this.placed = null;
    }
    public String getColor(){
        return this.color;
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
                givenPiece.getCellNode().getX() == this.placed.getX() && givenPiece.getCellNode().getY() == this.placed.getY()){
            return true;
        }
        return false;
    }
}
