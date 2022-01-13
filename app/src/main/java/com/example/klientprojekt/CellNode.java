package com.example.klientprojekt;

import java.io.Serializable;

public class CellNode implements Serializable {

    private int x, y;
    private ButtonPiece placedPiece;

    public CellNode(int x, int y) {
        if((x < 0 || x > 7) || (y < 0 || y > 7)) {
            System.err.println("Koordinaterna för denna cell är out of range");
        }
        this.x = x;
        this.y = y;
        this.placedPiece = null;
    }
}
