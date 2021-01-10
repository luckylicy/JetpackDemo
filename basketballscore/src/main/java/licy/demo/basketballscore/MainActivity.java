package licy.demo.basketballscore;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import licy.demo.basketballscore.databinding.ActivityMainBinding;

/**
 * @author hasee
 */
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    ScoreViewModel mScoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mScoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        mBinding.setData(mScoreViewModel);
        mBinding.setLifecycleOwner(this);
    }
}