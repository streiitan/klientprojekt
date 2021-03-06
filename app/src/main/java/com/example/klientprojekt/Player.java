package com.example.klientprojekt;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {
    private String color;

    public Player(String givenColor) throws IllegalArgumentException {
        if ((givenColor == Piece.LIGHT) || (givenColor == Piece.DARK)) {
            this.color = givenColor;
        } else {
            throw new IllegalArgumentException("Given color for the player is not valid. Given color: " + givenColor);
        }
    }
    public String getColor(){
        return this.color;
    }
    public boolean hasMoves(GameBoard board){
        ArrayList<Piece> pieces = GameBoard.getPieces(this.color);
        if(pieces.size() > 0){
            for(Piece piece: pieces){
                if(GameBoard.possibleMoves(piece).size() > 0){
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public boolean equals(Object obj){
        if(! (obj instanceof Player)){
            return false;
        }

        Player givenPlayer = (Player) obj;

        if(givenPlayer.getColor().equals(this.color)){
            return true;
        }

        return false;
    }

}

