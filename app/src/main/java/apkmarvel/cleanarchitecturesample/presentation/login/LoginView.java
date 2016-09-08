package apkmarvel.cleanarchitecturesample.presentation.login;


import apkmarvel.baseapp.presentation.view.LoadingView;

public interface LoginView extends LoadingView {
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
