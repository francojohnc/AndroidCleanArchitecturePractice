package apkmarvel.cleanarchitecturesample.presentation.login;


import apkmarvel.cleanarchitecturesample.presentation.base.view.LoadingView;

public interface LoginView extends LoadingView {
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
