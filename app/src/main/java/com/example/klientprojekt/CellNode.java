package com.example.klientprojekt;

import java.io.Serializable;

public class CellNode implements Serializable {

    private int x, y;
    private ButtonPiece placedPiece;

    public CellNode(int x, int y) {
        if((x < 0 || x > 7) || (y < 0 || y > 7)) {
            System.err.println("Koordinaterna för denna cell är out of range");
            return;
        }
        this.x = x;
        this.y = y;
        this.placedPiece = null;
    }

    public ButtonPiece getPiece() {
        return placedPiece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getCoordinates() {
        int[] coordinates = {x, y};
        return coordinates;
    }

    public void placePiece(ButtonPiece piece) {
        placedPiece = piece;
        if (piece != null) {
            piece.setCell(this);
            if (x == 0 && piece.getColor().equals(ButtonPiece.DARK)) {
                placedPiece.makeKing();
            } else if (x == 7 && piece.getColor().equals(ButtonPiece.LIGHT)) {
                placedPiece.makeKing();
            }
        }
    }

    public void movePiece(CellNode anotherCell) {
        try {
            anotherCell.placePiece(placedPiece);
            placedPiece.setCell(anotherCell);
            placedPiece = null;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


}