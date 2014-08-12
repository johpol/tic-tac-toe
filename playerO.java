public class playerO {
    //int total[][] = new int[2][2];
    int total[] = new int[9];
    int count = 0;
    boolean turn;
    
    public playerO(boolean turn) {
        this.turn = turn;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    
    public void addCount(int num, int id) {
        total[id-1] = num;
        //for(int i=0; i<total.length; i++)
        //    System.out.print(total[i]+" "+i);
    }
    
    public boolean checkWinner() {
        int frow = 0, srow = 0, trow = 0, fcol = 0, scol = 0, tcol = 0, d = 0;
        
        for(int i=0; i<3; i++)
            frow += total[i];
        for(int i=3; i<6; i++)
            srow += total[i];
        for(int i=6; i<9; i++)
            trow += total[i];
        for(int i=0; i<9; i+=3)
            fcol += total[i];
        for(int i=1; i<9; i+=3)
            scol += total[i];
        for(int i=2; i<9; i+=3)
            tcol += total[i];
        for(int i=0; i<9; i+=4)
            d += total[i];
        
        return frow == 15 || srow == 15 || trow == 15 ||
            fcol == 15 || scol == 15 || tcol == 15 || d == 15;
    }
    
}
