public class interfaace {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(int 4 dir)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagon by one step");
    }
}
