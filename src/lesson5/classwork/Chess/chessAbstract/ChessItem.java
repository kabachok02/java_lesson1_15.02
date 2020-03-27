package lesson5.classwork.Chess.chessAbstract;

public abstract class ChessItem {

    int x, y;
    int value;

    public int getValue() {
        return this.value;
    }

    public abstract void draw();
}
