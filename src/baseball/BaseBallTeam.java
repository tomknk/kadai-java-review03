package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;  //チーム
    private int win;      //勝利
    private int lose;     //敗北
    private int draw;     //引分

    //引数なしコンストラクタ
    public BaseBallTeam(){
    }   
    
    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    //勝率を計算する　「勝ち数/(勝ち数+負け数)」の計算
    public double getRate() {
        return (double)this.win /(this.win + this.lose);

    }
    // レポートソッド// ○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。
    public void report() {
        System.out.println(getName()+"の2022年の成績は"+getWin()+"勝"+getLose()+"敗"+getDraw()+"分、勝率は"+getRate()+"です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
  
}
