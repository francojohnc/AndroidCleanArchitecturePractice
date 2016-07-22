package apkmarvel.cleanarchitecturesample.presentation.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import apkmarvel.cleanarchitecturesample.R;
import apkmarvel.cleanarchitecturesample.presentation.home.MainActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginView{
    private LoginPresenter presenter = new LoginPresenter();

    @BindView(R.id.edt_username)EditText edt_username;
    @BindView(R.id.edt_password)EditText edt_password;
    @BindView(R.id.progress)ProgressBar progress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter.bindView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onViewResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onViewPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onViewDestroy();
    }

    /*onclick*/
    public void login(View v){
        presenter.validateCredentials(edt_username.getText().toString(), edt_password.getText().toString());
    }


    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void showLoading() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progress.setVisibility(View.GONE);
    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public Context context() {
        return this;
    }
}
