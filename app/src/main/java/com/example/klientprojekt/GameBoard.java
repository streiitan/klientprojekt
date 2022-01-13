package com.example.klientprojekt;

import java.io.Serializable;
import java.util.ArrayList;

public class GameBoard implements Serializable {

    private CellNode[][] board;
    private ArrayList<Piece> lightPieces, darkPieces;
    private final int BOARD_SIZE = 8;

    public GameBoard() {
        lightPieces = new ArrayList<>();
        darkPieces = new ArrayList<>();
        board = new CellNode[BOARD_SIZE][BOARD_SIZE];
    }

    public void initialBoardSetup() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = new CellNode(i, j);
            }
        }

        for (int x = 0; x < BOARD_SIZE; x += 2) {
            board[0][x].placePiece(new Piece(Piece.LIGHT));
            board[2][x].placePiece(new Piece(Piece.LIGHT));
            board[6][x].placePiece(new Piece(Piece.DARK));

            lightPieces.add(board[0][x].getPiece());
            lightPieces.add(board[2][x].getPiece());
            darkPieces.add(board[6][x].getPiece());
        }

        for (int x = 1; x < BOARD_SIZE; x += 2) {
            board[1][x].placePiece(new Piece(Piece.LIGHT));
            board[5][x].placePiece(new Piece(Piece.DARK));
            board[7][x].placePiece(new Piece(Piece.DARK));

            lightPieces.add(board[1][x].getPiece());
            darkPieces.add(board[5][x].getPiece());
            darkPieces.add(board[7][x].getPiece());
        }
    }

}
