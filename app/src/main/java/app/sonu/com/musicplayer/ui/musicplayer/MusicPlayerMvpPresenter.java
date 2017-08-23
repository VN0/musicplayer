package app.sonu.com.musicplayer.ui.musicplayer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import app.sonu.com.musicplayer.base.ui.BaseMvpPresenter;

/**
 * Created by sonu on 4/7/17.
 */

public interface MusicPlayerMvpPresenter extends BaseMvpPresenter<MusicPlayerMvpView> {
    void playPauseButtonOnClick();
    void skipNextButtonOnClick();
    void skipPreviousButtonOnClick();
    void onCreate(FragmentActivity activity);
    void onCreateView();
    void onDestroy();
    void updateProgress();
    void onSeekbarStopTrackingTouch(int progress);
    void onCollapseIvClick();
    void onShuffleButtonClick();
    void onRepeatButtonClick();
}