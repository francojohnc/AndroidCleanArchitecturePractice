package apkmarvel.cleanarchitecturesample.ui.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import apkmarvel.cleanarchitecturesample.R;
import apkmarvel.cleanarchitecturesample.presentation.presenter.MainPresenter;
import apkmarvel.cleanarchitecturesample.view.MainView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {


    @BindView(R.id.edt_search)
    EditText edt_search;

    @BindView(R.id.pv_artists)
    ProgressBar pv_artists;

    private MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter = new MainPresenter();
        mainPresenter.setView(this);
    }

    @Override
    public void showLoading() {
        pv_artists.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        pv_artists.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showResult(String result) {

    }
    @OnClick({R.id.btn_search})
    void submit(View v) {
        switch (v.getId()){
            case R.id.btn_search:
                mainPresenter.onSearch(edt_search.getText().toString());
                break;

        }
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
