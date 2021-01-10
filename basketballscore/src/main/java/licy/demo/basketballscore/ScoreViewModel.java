package licy.demo.basketballscore;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * ScoreViewModel
 * description: TODO
 *
 * @author : Licy
 * @date : 2021/1/10
 * email ：licy3051@qq.com
 */
public class ScoreViewModel extends ViewModel {

    private MutableLiveData<Scores> mainTeam;
    private MutableLiveData<Scores> visitTeam;

    public MutableLiveData<Scores> getMainTeam() {
        if (mainTeam == null) {
            mainTeam = new MutableLiveData<>();
            mainTeam.setValue(new Scores(1, 0, 0));
        }
        return mainTeam;
    }

    public MutableLiveData<Scores> getVisitTeam() {
        if (visitTeam == null) {
            visitTeam = new MutableLiveData<>();
            visitTeam.setValue(new Scores(2, 0, 0));
        }
        return visitTeam;
    }

    public void addMainTeam(int score) {
        addScore(mainTeam, score);
    }

    public void addVisitTeam(int score) {
        addScore(visitTeam, score);
    }

    public void addScore(MutableLiveData<Scores> team, int score) {
        Scores value = team.getValue();
        value.setLastScore(value.getTotalScore());
        value.setTotalScore(value.getTotalScore() + score);
        team.setValue(value);
    }

    public void reset() {
        mainTeam.setValue(new Scores(1, 0, 0));
        visitTeam.setValue(new Scores(2, 0, 0));
    }

    public void undo(){
        recovery(mainTeam);
        recovery(visitTeam);
    }

    public void recovery(MutableLiveData<Scores> team) {
        Scores value = team.getValue();
        int i = value.getTotalScore() - value.getLastScore();
        value.setTotalScore(value.getLastScore());
        if (value.getLastScore() - i < 0) {
            value.setLastScore(0);
        } else {
            value.setLastScore(value.getLastScore() - i);
        }
        team.setValue(value);
    }
}
