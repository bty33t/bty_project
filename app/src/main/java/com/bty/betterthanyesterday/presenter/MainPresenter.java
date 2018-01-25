package com.bty.betterthanyesterday.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.bty.betterthanyesterday.R;
import com.bty.betterthanyesterday.presenter.interfaces.MainView;

/**
 * Created by vilkov on 25.01.2018.
 */

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {
    public MainPresenter() {
        getViewState().showMessage(R.string.app_name);
    }
}
