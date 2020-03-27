package lesson5.classwork.Chess.chessAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ChessItem> items = new ArrayList<>();

        items.add(new Queen());
        items.add(new King());




    }

    public static void drawChessItem(ChessItem item) {
        item.draw();
    }
}
