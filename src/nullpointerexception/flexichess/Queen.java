package nullpointerexception.flexichess;

public class Queen extends ChessPiece {

    public Queen(ChessBoard board, Color color) {
        super(board, color);
        m_letter = 'Q';
    }

    public Queen(ChessBoard board, Color color, char column, int row) {
        super(board, color, column, row);
        m_letter = 'Q';
    }

    @Override
    public char letter() {
        return m_letter;
    }
    
}
