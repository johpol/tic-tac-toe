public class magicSquare {
    int mConst, num=0;
    
    public magicSquare(int num) {
        this.num = num;
    }
    
    public int magicConst() {
        System.out.println(num);
        return (int) ((num*(Math.pow(num, 2) + 1) / 2) );
    }
    
    public int getMConst() {
        return mConst;
    }
}
