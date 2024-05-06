package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    private Piece[] pieces = new Piece[0];

    public Maison() {}

    public Maison(Piece[] pieces) {
        this.pieces = pieces;
    }

    private boolean isPieceValid(Piece piece){
        if(piece.equals(null))
            return false;
        
        if(piece.getEtage() < 0 || piece.getSuperficie() < 0)
            return false;
        
        return true;
    }

    public void ajouterPiece(Piece piece){
        if(!isPieceValid(piece))
            return;
        
        pieces = Arrays.copyOf(pieces, pieces.length + 1);

        pieces[pieces.length - 1] = piece;
    }

    private double getSuperficieFromPieces(Piece[] pieces){
        double total = 0;

        for (Piece piece : pieces) {
            total += piece.getSuperficie();
        }

        return total;
    }

    public double getSuperficieTotale(){
        return getSuperficieFromPieces(pieces);
    }
    public double getSuperficieParEtage(int etage){
        Piece[] piecesFromEtage = new Piece[0];
        for (Piece piece : pieces) {
            if(piece.getEtage() == etage){
                piecesFromEtage = Arrays.copyOf(piecesFromEtage, piecesFromEtage.length + 1);
                piecesFromEtage[piecesFromEtage.length-1] = piece;
            }
        }
        return getSuperficieFromPieces(piecesFromEtage);
    }

    public Piece[] getPieceFromClass(Class<? extends Piece> askedClass){
        Piece[] piecesFromClass = new Piece[0];
        for (Piece piece : pieces) {
            if(piece.getClass() == askedClass){
                piecesFromClass = Arrays.copyOf(piecesFromClass, piecesFromClass.length + 1);
                piecesFromClass[piecesFromClass.length-1] = piece;
            }
        }
        return piecesFromClass;
    }

    public double getSuperficieParTypePiece(Class<? extends Piece> askedClass){
        return getSuperficieFromPieces(getPieceFromClass(askedClass));
    }

    public int getNbPiecesParTypePiece(Class<? extends Piece> askedClass){
        return getPieceFromClass(askedClass).length;
    }
}
