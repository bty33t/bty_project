package com.bty.betterthanyesterday.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.bty.betterthanyesterday.R;
import com.bty.betterthanyesterday.presenter.MainPresenter;
import com.bty.betterthanyesterday.presenter.interfaces.MainView;

public class MainActivity extends MvpAppCompatActivity
    implements MainView{

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMessage(int message) {
        Toast.makeText(this ,getString(message), Toast.LENGTH_SHORT).show();
    }
}
