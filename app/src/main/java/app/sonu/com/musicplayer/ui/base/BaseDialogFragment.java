package app.sonu.com.musicplayer.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Created by sonu on 29/6/17.
 * base fragment
 */

public abstract class BaseDialogFragment<MvpPresenter extends BaseMvpPresenter> extends DialogFragment
        implements BaseMvpView {

    @Inject
    protected MvpPresenter mPresenter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // there is a warning because the compiler does not already know if
        // BaseMvpView's child implemented by this class is same as BaseMvpView's
        // child given to Presenter
        mPresenter.onAttach(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        mPresenter.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }
}
