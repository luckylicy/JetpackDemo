package licy.demo.basketballscore;

/**
 * Scores
 * description: TODO
 *
 * @author : Licy
 * @date : 2021/1/10
 * email ：licy3051@qq.com
 */
public class Scores {

    /**
     * 1 主队
     * 2 客队
     */
    private int type;
    private int totalScore;
    private int lastScore;

    public Scores(int type, int totalScore, int lastScore) {
        this.type = type;
        this.totalScore = totalScore;
        this.lastScore = lastScore;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getLastScore() {
        return lastScore;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }
}
