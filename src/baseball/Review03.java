package baseball;

public class Review03 {

   public static void main(String[] args) {

       BaseBallTeam bbt01= new BaseBallTeam();
       bbt01.setName("東京ヤクルトスワローズ");
       String bbt01Name = bbt01.getName();
       bbt01.setWin(80);
       int bbt01Win = bbt01.getWin();
       bbt01.setLose(59);
       int bbt01Lose = bbt01.getLose();
       bbt01.setDraw(4);
       int bbt01Draw = bbt01.getDraw();
       bbt01.report();

       BaseBallTeam bbt02= new BaseBallTeam();
       bbt02.setName("横浜DeNAベイスターズ");
       String bbt02Name = bbt02.getName();
       bbt02.setWin(73);
       int bbt02Win = bbt02.getWin();
       bbt02.setLose(68);
       int bbt02Lose = bbt02.getLose();
       bbt02.setDraw(2);
       int bbt02Draw = bbt02.getDraw();
       bbt02.report();

       BaseBallTeam bbt03= new BaseBallTeam();
       bbt03.setName("阪神タイガース");
       String bbt03Name = bbt03.getName();
       bbt03.setWin(68);
       int bbt03Win = bbt03.getWin();
       bbt03.setLose(71);
       int bbt03Lose = bbt03.getLose();
       bbt03.setDraw(4);
       int bbt03Draw = bbt03.getDraw();
       bbt03.report();

       BaseBallTeam bbt04= new BaseBallTeam();
       bbt04.setName("読売ジャイアンツ");
       String bbt04Name = bbt03.getName();
       bbt04.setWin(68);
       int bbt04Win = bbt04.getWin();
       bbt04.setLose(72);
       int bbt04Lose = bbt04.getLose();
       bbt04.setDraw(3);
       int bbt04Draw = bbt04.getDraw();
       bbt04.report();

       BaseBallTeam bbt05= new BaseBallTeam();
       bbt05.setName("広島東洋カープ");
       String bbt05Name = bbt03.getName();
       bbt05.setWin(66);
       int bbt05Win = bbt05.getWin();
       bbt05.setLose(74);
       int bbt05Lose = bbt05.getLose();
       bbt05.setDraw(3);
       int bbt05Draw = bbt05.getDraw();
       bbt05.report();

       BaseBallTeam bbt06= new BaseBallTeam();
       bbt06.setName("中日ドラゴンズ");
       String bbt06Name = bbt06.getName();
       bbt06.setWin(66);
       int bbt06Win = bbt06.getWin();
       bbt06.setLose(75);
       int bbt06Lose = bbt06.getLose();
       bbt06.setDraw(2);
       int bbt06Draw = bbt06.getDraw();
       bbt06.report();
   }
}
